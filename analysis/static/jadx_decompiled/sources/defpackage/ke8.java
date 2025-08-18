package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class ke8 extends wm9 {
    public final Uri b;
    public final String c;

    public ke8(Uri uri, String str) {
        super(e5f.a);
        this.b = uri;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke8)) {
            return false;
        }
        ke8 ke8Var = (ke8) obj;
        return tpa.f(this.b, ke8Var.b) && tpa.f(this.c, ke8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenCropScreen(uri=" + this.b + ", path=" + this.c + ")";
    }
}
