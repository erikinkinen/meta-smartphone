require recipes-core/android-system-image/android-system-image.inc

COMPATIBLE_MACHINE = "sargo"

PV = "20211221-1"

SRC_URI = "file://./halium-luneos-9.0-${PV}-${MACHINE}.tar.bz2"
SRC_URI[md5sum] = "30cf703586e6e8161f57e055f3943255"
SRC_URI[sha256sum] = "75b2ee6dbe1102b9111220fd09321f27049fc4a88213ecb9e75eb0214bb3eba7"

ANDROID_SYSTEM_IMAGE_DESTNAME = "android-rootfs.img"
