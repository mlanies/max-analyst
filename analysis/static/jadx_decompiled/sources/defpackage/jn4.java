package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class jn4 implements kn4 {
    public final Uri a;
    public final en4 b;

    public jn4(Uri uri, en4 en4Var) {
        this.a = uri;
        this.b = en4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn4)) {
            return false;
        }
        jn4 jn4Var = (jn4) obj;
        return tpa.f(this.a, jn4Var.a) && this.b == jn4Var.b;
    }

    public final int hashCode() {
        Uri uri = this.a;
        return this.b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    public final String toString() {
        return "DownloadMediaCompleted(uri=" + this.a + ", cause=" + this.b + ")";
    }
}
