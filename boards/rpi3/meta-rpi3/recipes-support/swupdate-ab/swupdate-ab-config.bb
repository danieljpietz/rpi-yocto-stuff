SUMMARY = "SWUpdate A/B slot selection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://10-ab-select"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/swupdate/conf.d
    install -m 0644 ${WORKDIR}/10-ab-select ${D}${sysconfdir}/swupdate/conf.d/10-ab-select
}

FILES:${PN} = "${sysconfdir}/swupdate/conf.d/10-ab-select"
RDEPENDS:${PN} = "swupdate"
