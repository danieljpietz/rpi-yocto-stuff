#!/bin/sh
# Mark the running slot good: stop the U-Boot rollback counter.
fw_setenv upgrade_available 0
fw_setenv bootcount 0
