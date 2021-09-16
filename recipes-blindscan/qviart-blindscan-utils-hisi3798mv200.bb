require qviart-blindscan-utils.inc

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/qviart_blindscan_${SOC_FAMILY}" "${D}/${bindir}/qviart_blindscan"
}

FILES_qviart-blindscan-utils-${SOC_FAMILY} = " \
	${bindir}/qviart_blindscan \
"

SRC_URI[md5sum] = "621fd714404aa7c5cda6159c8acbbe1a"
SRC_URI[sha256sum] = "fb477bf2d5b021dbb0df7a3944b37bf3f6295a6d6a8a304d641cfc0b976cad5b"
