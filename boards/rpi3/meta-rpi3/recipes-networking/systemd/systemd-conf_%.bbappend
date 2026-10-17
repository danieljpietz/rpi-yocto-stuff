# Static address on the onboard ethernet, applied by systemd-networkd.
FILESEXTRAPATHS:prepend := "${THISDIR}/systemd-conf:"
SRC_URI:append = " file://10-eth.network"

do_install:append() {
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/10-eth.network ${D}${sysconfdir}/systemd/network/10-eth.network
}

FILES:${PN} += "${sysconfdir}/systemd/network/10-eth.network"
