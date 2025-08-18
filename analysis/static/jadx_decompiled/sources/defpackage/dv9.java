package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class dv9 {
    public final String a;
    public final boolean b;
    public final Uri c;

    public dv9(String str, boolean z, Uri uri) {
        this.a = str;
        this.b = z;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv9)) {
            return false;
        }
        dv9 dv9Var = (dv9) obj;
        return tpa.f(this.a, dv9Var.a) && this.b == dv9Var.b && tpa.f(this.c, dv9Var.c) && "image/*".equals("image/*");
    }

    public final int hashCode() {
        String str = this.a;
        return ((this.c.hashCode() + ms2.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31) + 1911932022;
    }

    public final String toString() {
        return "NotificationImage(prefetchUrl=" + this.a + ", canBeLoadedFromNetwork=" + this.b + ", notificationImageUri=" + this.c + ", notificationImageMimeType=image/*)";
    }
}
