package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class xbb implements acb {
    public final Uri a;

    public xbb(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xbb) {
            return tpa.f(this.a, ((xbb) obj).a) && "image/*".equals("image/*");
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1911932022;
    }

    public final String toString() {
        return "ShareMedia(localUrl=" + this.a + ", mimetype=image/*)";
    }
}
