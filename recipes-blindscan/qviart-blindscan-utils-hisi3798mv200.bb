require qviart-blindscan-utils.inc

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/qviart_blindscan_${SOC_FAMILY}" "${D}/${bindir}/qviart_blindscan"
}

FILES_qviart-blindscan-utils-${SOC_FAMILY} = " \
	${bindir}/qviart_blindscan \
"

SRC_URI[md5sum] = "89b5f9fdef0e832221594604ecd4e7f9"
SRC_URI[sha256sum] = "bc5557c3106e8bec5aa49f08970d276a904071bd5eeb327d174ac565962b8c46"
