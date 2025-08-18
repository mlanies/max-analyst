package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class tpd implements ww0 {
    public final String a;

    public tpd(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.ww0
    public final boolean a(Uri uri) {
        return this.a.contains(uri.toString());
    }

    @Override // defpackage.ww0
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ww0
    public final String c() {
        return this.a;
    }

    @Override // defpackage.ww0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tpd) {
            return this.a.equals(((tpd) obj).a);
        }
        return false;
    }

    @Override // defpackage.ww0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
