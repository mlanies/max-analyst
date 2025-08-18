package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class yl8 implements am8 {
    public final Uri a;

    public yl8(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl8) && tpa.f(this.a, ((yl8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendFile(uri=" + this.a + ")";
    }
}
