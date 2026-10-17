# OpenSSH server (sshd, systemd unit, host key generation) plus the
# preinstalled authorized key for root.
IMAGE_FEATURES += "ssh-server-openssh"
IMAGE_INSTALL:append = " user-ssh-keys"
