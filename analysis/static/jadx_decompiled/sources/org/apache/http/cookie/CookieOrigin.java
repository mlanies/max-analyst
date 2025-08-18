package org.apache.http.cookie;

import defpackage.rh4;
import defpackage.zr6;
import java.util.Locale;

@Deprecated
/* loaded from: classes2.dex */
public final class CookieOrigin {
    private final String host;
    private final String path;
    private final int port;
    private final boolean secure;

    public CookieOrigin(String str, int i, String str2, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("Host of origin may not be null");
        }
        if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Host of origin may not be blank");
        }
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "Invalid port: "));
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Path of origin may not be null.");
        }
        this.host = str.toLowerCase(Locale.ENGLISH);
        this.port = i;
        if (str2.trim().length() != 0) {
            this.path = str2;
        } else {
            this.path = "/";
        }
        this.secure = z;
    }

    public String getHost() {
        return this.host;
    }

    public String getPath() {
        return this.path;
    }

    public int getPort() {
        return this.port;
    }

    public boolean isSecure() {
        return this.secure;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.secure) {
            sb.append("(secure)");
        }
        sb.append(this.host);
        sb.append(':');
        sb.append(Integer.toString(this.port));
        return rh4.m(sb, this.path, ']');
    }
}
