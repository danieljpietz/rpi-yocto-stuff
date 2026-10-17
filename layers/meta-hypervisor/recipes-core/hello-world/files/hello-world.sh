#!/bin/sh
echo "Hello, World! This is a Raspberry Pi 3 (64-bit) hypervisor host, built with Yocto + kas."
echo "KVM status:"
if [ -e /dev/kvm ]; then
    echo "  /dev/kvm present - hardware virtualization is available."
else
    echo "  /dev/kvm NOT present - check that CONFIG_KVM is enabled in the kernel."
fi
