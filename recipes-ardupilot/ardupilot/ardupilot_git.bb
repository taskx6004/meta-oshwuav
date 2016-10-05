DESCRIPTION = "Ardupilot for Linux User mode flight controller program"
HOMEPAGE = "https://ardupilot.org"
#SECTION = ""
SRCNAME = "ARDUPILOT"

LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=d32239bcb673463ab874e80d47fae504"

# Erle Robotis branch
#SRCREV = "0161cae2765a87b94d89095a224f50934fdd6211"
#SRC_URI = "git://github.com/erlerobot/ardupilot.git;protocol=https"

# ArduPilot github
SRCREV = "60137e0f0bca5c823d86f8a914a2fa938d00dd95"
SRC_URI = "git://github.com/ArduPilot/ardupilot;protocol=https"

S = "${WORKDIR}/git"

do_compile() {
	cd ${S}/ArduCopter
	oe_runmake pxfmini
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/ArduCopter/ArduCopter.elf ${D}${bindir}/
}
