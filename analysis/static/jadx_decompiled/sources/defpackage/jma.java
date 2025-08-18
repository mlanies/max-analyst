package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class jma extends ka1 {
    public final Uri b;

    public jma(Uri uri) {
        super(8);
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jma) && tpa.f(this.b, ((jma) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenExternalLink(url=" + this.b + ")";
    }
}
