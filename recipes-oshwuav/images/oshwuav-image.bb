require recipes-core/images/rpi-hwup-image.bb

IMAGE_INSTALL += " \
	kernel-modules \
	linux-firmware-ath9k \
	iw \
	wpa-supplicant \
	wpa-supplicant-passphrase \
	wpa-supplicant-cli \
	ardupilot \
	"
