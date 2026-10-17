SUMMARY = "Userspace hypervisor stack: QEMU, libvirt and VM networking tools"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "qemu libvirt bridge-utils iproute2"
