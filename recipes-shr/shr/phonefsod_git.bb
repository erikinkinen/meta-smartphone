DESCRIPTION = "SHR Phone FSO Daemon"
HOMEPAGE = "http://shr-project.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
SECTION = "x11/applications"
DEPENDS += " libfso-glib libshr-glib sqlite3 shr-specs libfsoframework"
SRCREV = "666c07742b08c5c6624b4a485727543ff7a4eafd"
PV = "0.0.0+gitr${SRCPV}"
PR = "r5"

SRC_URI = "git://git.shr-project.org/repo/phonefsod.git;protocol=http;branch=glib-2.29"
S = "${WORKDIR}/git"

inherit autotools update-rc.d

INITSCRIPT_NAME = "phonefsod"
INITSCRIPT_PARAMS = "defaults 75"

CONFFILES_${PN} = "${sysconfdir}/phonefsod.conf"


