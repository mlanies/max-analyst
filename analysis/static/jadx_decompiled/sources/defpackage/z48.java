package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class z48 implements c58 {
    public final Uri a;

    public z48(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z48) && tpa.f(this.a, ((z48) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendFile(uri=" + this.a + ")";
    }
}
