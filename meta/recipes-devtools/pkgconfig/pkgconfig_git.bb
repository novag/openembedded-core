require pkgconfig.inc

SRC_URI += " \
            file://pkg-config-native.in \
            file://fix-glib-configure-libtool-usage.patch \
            file://0001-gdate-Move-warning-pragma-outside-of-function.patch \
           "
