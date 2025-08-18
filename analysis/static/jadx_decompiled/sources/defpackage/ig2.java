package defpackage;

import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class ig2 extends pg2 {
    public final Parcelable b;
    public final String c;
    public final boolean d;

    public ig2(xw8 xw8Var, String str, boolean z) {
        this.b = xw8Var;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig2)) {
            return false;
        }
        ig2 ig2Var = (ig2) obj;
        return tpa.f(this.b, ig2Var.b) && tpa.f(this.c, ig2Var.c) && this.d == ig2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rh4.d(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenImageLegacy(message=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", isSingleAttach=");
        return au1.j(sb, this.d, ")");
    }
}
