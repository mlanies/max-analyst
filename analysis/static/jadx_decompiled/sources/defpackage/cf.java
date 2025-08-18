package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class cf implements ww0 {
    public final ww0 a;
    public final int b;

    public cf(ww0 ww0Var, int i) {
        this.a = ww0Var;
        this.b = i;
    }

    @Override // defpackage.ww0
    public final boolean a(Uri uri) {
        return this.a.a(uri);
    }

    @Override // defpackage.ww0
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ww0
    public final String c() {
        return null;
    }

    @Override // defpackage.ww0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return this.b == cfVar.b && this.a.equals(cfVar.a);
    }

    @Override // defpackage.ww0
    public final int hashCode() {
        return (this.a.hashCode() * 1013) + this.b;
    }

    public final String toString() {
        nw4 nw4VarR0 = j47.r0(this);
        nw4VarR0.e(this.a, "imageCacheKey");
        nw4VarR0.a(this.b, "frameIndex");
        return nw4VarR0.toString();
    }
}
