package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class abb implements bbb {
    public final Uri a;

    public abb(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abb) && tpa.f(this.a, ((abb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShareImage(uri=" + this.a + ")";
    }
}
