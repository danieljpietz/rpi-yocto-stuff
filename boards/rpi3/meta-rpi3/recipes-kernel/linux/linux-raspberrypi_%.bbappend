# Kernel config fragments required by meta-hypervisor
FILESEXTRAPATHS:prepend := "${HYPERVISOR_KERNEL_FILES}:"
SRC_URI:append = " ${HYPERVISOR_KERNEL_CFG}"
