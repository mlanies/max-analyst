package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class agd extends bgd {
    public final Uri a;

    public agd(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agd) && tpa.f(this.a, ((agd) obj).a);
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
