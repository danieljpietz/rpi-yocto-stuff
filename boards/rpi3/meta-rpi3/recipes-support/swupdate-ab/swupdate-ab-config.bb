SUMMARY = "SWUpdate hardware revision for A/B bundles"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_install() {
    # Checked against hardware-compatibility in sw-description
    install -d ${D}${sysconfdir}
    echo "${MACHINE} 1.0" > ${D}${sysconfdir}/hwrevision
}

FILES:${PN} = "${sysconfdir}/hwrevision"
RDEPENDS:${PN} = "swupdate"
