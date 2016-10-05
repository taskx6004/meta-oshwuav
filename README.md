# meta-oshwuav
buildiing Open Souce Hardware UAV software/firmware by Yocto.

Bitbake layer for embedded Linux board flight control, ground station(later), toolkits(later).

Testing PXFmini for initial setup.

# You are warned!
**TESTING PHASE, NOT FOR FLIGHT!**

# How to use this (or any yocto) project
* familiar your self with Shell Scripting, Python3, start building sample image
* get Raspberry Pi with supported cape (pxfmini + rpi zero at the moment)
* update your yocto conf and re-run bitbake to get correct image
* flash the image file and run on hardware
* test binary and hardware

# How compile image file
TODO: add bblayers.conf and local.conf gist

1. clone poky:
2. clone meta-raspberrypi layers into poky folder
3. clone meta-oshwuav layer into poky folder
4. run `$source poky/oe-init-build-env`
5. edit generated ../build/conf/bblayers.conf and local.conf
6. go back to $build and run `bitbake oshwuav-image`

# Mile Stone(s):

 `Searchlight `

 GOALS:
* Board Support: Raspberry Pi Zero
* Cape Support: Erle Robotic PXF mini
* Flying Stack: ArduPilot

# Contributing
* Please contact taskx6004@gmail.com

# License
MIT
