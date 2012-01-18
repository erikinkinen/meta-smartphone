require linux.inc
require linux-openmoko.inc

# Mark archs/machines that this kernel supports
COMPATIBLE_MACHINE = "om-gta02"

DEFAULT_PREFERENCE = "-3"

KERNEL_RELEASE = "3.3.0-rc0"
OLD_KERNEL_RELEASE = "3.2.99"
PV = "${OLD_KERNEL_RELEASE}+${KERNEL_RELEASE}+gitr${SRCPV}"

SRCREV = "7089727d63b17615fb0a652374d79cb7df0835ad"

SRC_URI = "\
  git://gitorious.org/shr/linux.git;protocol=git;branch=shr-master \
  file://defconfig \
"
S = "${WORKDIR}/git"

do_configure_prepend() {
#otherwise it gets extra '+' "2.6.37+"
#because:
#$ scripts/setlocalversion . => +
#$ make kernelversion => 2.6.37
#$ make kernelrelease => 2.6.37+
  rm -rf ${S}/.git
}
