package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class zyf implements kzf {
    public final Uri a;

    public zyf(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyf) && tpa.f(this.a, ((zyf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InternalNavigation(uri=" + this.a + ")";
    }
}
