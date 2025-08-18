package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class n26 {
    public final Bitmap a;
    public final int b;
    public final int c;

    public n26(int i, int i2, Bitmap bitmap) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n26)) {
            return false;
        }
        n26 n26Var = (n26) obj;
        return tpa.f(this.a, n26Var.a) && this.b == n26Var.b && this.c == n26Var.c;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return Integer.hashCode(this.c) + k7d.e(this.b, (bitmap == null ? 0 : bitmap.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultFrame(bitmap=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return zr6.j(sb, this.c, ")");
    }
}
