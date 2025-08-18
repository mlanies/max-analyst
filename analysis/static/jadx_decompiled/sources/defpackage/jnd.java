package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class jnd extends ln3 {
    public final Uri a;

    public jnd(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnd) && tpa.f(this.a, ((jnd) obj).a);
    }

    public final int hashCode() {
        Uri uri = this.a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "ShowInviteDialog(qrCodeUri=" + this.a + ")";
    }
}
