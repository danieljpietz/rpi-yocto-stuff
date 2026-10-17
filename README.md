# rpi3-hypervisor

Yocto image for the Raspberry Pi 3 (64-bit) with a KVM/QEMU/libvirt hypervisor stack, built with [kas](https://kas.readthedocs.io/).

## Build

```sh
pip3 install kas
cd boards/rpi3
kas build rpi3.yaml
```

The image (`.wic.bz2`) lands in `boards/rpi3/build/tmp/deploy/images/raspberrypi3-64/`. Flash it to an SD card with `bzip2 -dc <image>.wic.bz2 | sudo dd of=/dev/sdX bs=4M status=progress conv=fsync`.

## Login

Connect over Ethernet (the Pi is at `192.168.109.1`) and SSH in as root with the dev key:

```sh
ssh -i layers/meta-user/recipes-core/user-ssh-keys/meta-user-devkey root@192.168.109.1
```
