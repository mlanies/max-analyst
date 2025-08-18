package defpackage;

import android.net.Uri;
import android.text.Layout;

/* loaded from: classes2.dex */
public final class xv8 implements zv8 {
    public final String a;
    public final int b;
    public final Layout c;
    public final Uri d;
    public final boolean e;

    public xv8(String str, int i, Layout layout, Uri uri, boolean z) {
        this.a = str;
        this.b = i;
        this.c = layout;
        this.d = uri;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv8)) {
            return false;
        }
        xv8 xv8Var = (xv8) obj;
        return tpa.f(this.a, xv8Var.a) && this.b == xv8Var.b && tpa.f(this.c, xv8Var.c) && tpa.f(this.d, xv8Var.d) && this.e == xv8Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.c.hashCode() + k7d.e(this.b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        Uri uri = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Media(url=");
        sb.append(this.a);
        sb.append(", attachCount=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", lowResPreviewUri=");
        sb.append(this.d);
        sb.append(", isRoundPreview=");
        return au1.j(sb, this.e, ")");
    }
}
