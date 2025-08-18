package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class yq7 {
    public static final yq7 b = new yq7(new zq7(xq7.a(new Locale[0])));
    public final zq7 a;

    public yq7(zq7 zq7Var) {
        this.a = zq7Var;
    }

    public static yq7 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = wq7.a(strArrSplit[i]);
        }
        return new yq7(new zq7(xq7.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yq7) {
            if (this.a.equals(((yq7) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
