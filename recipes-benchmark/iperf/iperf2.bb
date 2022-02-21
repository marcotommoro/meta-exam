DESCRIPTION = "Iperf is a tool to measure maximum TCP bandwidth, allowing the tuning of various parameters and UDP characteristics"
HOMEPAGE = "https://sourceforge.net/projects/iperf2/"
SECTION = "console/network"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=e136a7b2560d80bcbf0d9b3e1356ecff"
PV = "2.1.6"
SRC_URI = " http://downloads.sourceforge.net/iperf2/iperf-${PV}.tar.gz"

SRC_URI[md5sum] = "704725d4c806d1667baf36970151efdb"
SRC_URI[sha256sum] = "4a43e44439b95622aebeee55754a17d1c94076032e90620dfc1ab9908cb9e080"

S = "${WORKDIR}/iperf-${PV}"

inherit autotools pkgconfig

EXTRA_OECONF = "--exec-prefix=${STAGING_DIR_HOST}${layout_exec_prefix}"

PACKAGECONFIG ??= "${@bb.utils.contains('DISTRO_FEATURES', 'ipv6', 'ipv6', '', d)}"
PACKAGECONFIG[ipv6] = "--enable-ipv6,--disable-ipv6,"
