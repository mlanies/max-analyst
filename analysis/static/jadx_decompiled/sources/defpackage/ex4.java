package defpackage;

/* loaded from: classes2.dex */
public final class ex4 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex4)) {
            return false;
        }
        ((ex4) obj).getClass();
        int i = jpc.a;
        int i2 = jpc.a;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(jpc.r) + (Integer.hashCode(jpc.a0) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiFontLoadingNotificationTexts(downloadingTitle=");
        sb.append(jpc.a0);
        sb.append(", cancelButtonText=");
        return zr6.j(sb, jpc.r, ")");
    }
}
