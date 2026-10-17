SUMMARY = "Confirm a successful boot so the bootloader stops counting towards rollback"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://ab-boot-confirm.sh \
    file://ab-boot-confirm.init \
    file://ab-boot-confirm.service \
    file://fw_env.config \
"

S = "${WORKDIR}"

inherit update-rc.d systemd

INITSCRIPT_NAME = "ab-boot-confirm"
INITSCRIPT_PARAMS = "defaults 99"
SYSTEMD_SERVICE:${PN} = "ab-boot-confirm.service"

do_install() {
    install -d ${D}${sbindir}
    install -m 0755 ${WORKDIR}/ab-boot-confirm.sh ${D}${sbindir}/ab-boot-confirm

    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/fw_env.config ${D}${sysconfdir}/fw_env.config

    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/ab-boot-confirm.init ${D}${sysconfdir}/init.d/ab-boot-confirm

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/ab-boot-confirm.service ${D}${systemd_system_unitdir}/
}

RDEPENDS:${PN} = "libubootenv-bin"
