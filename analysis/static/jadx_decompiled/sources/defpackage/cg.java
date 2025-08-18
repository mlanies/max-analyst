package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class cg implements ww0 {
    public final boolean a;
    public final String b;

    public cg(int i, boolean z) {
        this.a = z;
        this.b = zr6.h(i, "anim://");
    }

    @Override // defpackage.ww0
    public final boolean a(Uri uri) {
        return eae.o0(uri.toString(), this.b, false);
    }

    @Override // defpackage.ww0
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ww0
    public final String c() {
        return this.b;
    }

    @Override // defpackage.ww0
    public final boolean equals(Object obj) {
        if (!this.a) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !cg.class.equals(obj.getClass())) {
            return false;
        }
        return tpa.f(this.b, ((cg) obj).b);
    }

    @Override // defpackage.ww0
    public final int hashCode() {
        return !this.a ? super.hashCode() : this.b.hashCode();
    }
}
