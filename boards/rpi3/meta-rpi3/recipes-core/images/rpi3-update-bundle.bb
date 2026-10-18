SUMMARY = "SWUpdate bundle (.swu) containing the hello-hypervisor rootfs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit swupdate

SRC_URI = " \
    file://sw-description \
    file://ab-slot.sh \
"

# swuimage must wait for the image to be deployed
IMAGE_DEPENDS = "hello-hypervisor-image"
SWUPDATE_IMAGES = "hello-hypervisor-image"
# Deployed as <image>-<machine>.rootfs.ext4.gz, matching sw-description
SWUPDATE_IMAGES_FSTYPES[hello-hypervisor-image] = ".rootfs.ext4.gz"

COMPATIBLE_MACHINE = "raspberrypi3-64"
