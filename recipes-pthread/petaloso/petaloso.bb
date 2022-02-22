

DESCRIPTION = "Judge and others"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

APP_FILE = "es.c"
UTILS_FILE = "utils.c"
SRC_URI = "file://${APP_FILE} \
		file://utils.h \
		file://${UTILS_FILE}"

APP_NAME := "petaloso"



S = "${WORKDIR}"

do_compile() {
	${CC} ${APP_FILE} ${UTILS_FILE} ${LDFLAGS} -o ${APP_NAME}  -lpthread -w
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${APP_NAME} ${D}${bindir}
}
