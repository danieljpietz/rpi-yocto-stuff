#!/bin/sh
# Slot selection for A/B updates, so the user never has to pick one.
# swupdate calls shellscripts with "preinst" before writing images and "postinst" afterwards.

case "$(sed -n 's/.*root=\/dev\/mmcblk0p\([0-9]*\).*/\1/p' /proc/cmdline)" in
    3) inactive=2 ;;
    *) inactive=3 ;;
esac

case "$1" in
    preinst)
        ln -sf /dev/mmcblk0p${inactive} /dev/rootfs-inactive
        ;;
    postinst)
        fw_setenv rootpart ${inactive}
        ;;
esac
