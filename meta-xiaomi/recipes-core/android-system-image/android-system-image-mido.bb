require recipes-core/android-system-image/android-system-image.inc

COMPATIBLE_MACHINE = "mido"

PV = "20210506-2"

SRC_URI = "http://build.webos-ports.org/halium-luneos-9.0/halium-luneos-9.0-${PV}-${MACHINE}.tar.bz2"
SRC_URI[sha256sum] = "af9deead686663ceab1717fe3d76ade19207e91191761eb23778bee7107de994"

ANDROID_SYSTEM_IMAGE_DESTNAME = "android-rootfs.img"
