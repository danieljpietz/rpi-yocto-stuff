SUMMARY = "Minimal hello-world image configured as a KVM hypervisor host"
LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL:append = " hello-world"
