

DESCRIPTION = "Judge and others"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://es.c \
		file://utils.h \
		file://utils.c"

UTILS_FILE = "file://utils.c"
APP_NAME := "petaloso"



S = "${WORKDIR}"

do_compile() {
	${CC} es.c utils.c ${LDFLAGS} -o ${APP_NAME}  -lpthread -w
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${APP_NAME} ${D}${bindir}
}
