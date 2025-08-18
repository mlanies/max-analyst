package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class sgd extends ka1 {
    public static final sgd e;
    public static final sgd f;
    public static final sgd g;
    public static final sgd h;
    public static final sgd i;
    public final jqe b;
    public final List c;
    public final Bundle d;

    static {
        eqe eqeVar = new eqe(gha.q);
        int i2 = gha.a;
        rgd rgdVar = new rgd(fha.s, new eqe(i2));
        int i3 = gha.g;
        rgd rgdVar2 = new rgd(fha.u, new eqe(i3));
        int i4 = gha.c;
        e = new sgd(eqeVar, y53.M(rgdVar, rgdVar2, new rgd(fha.t, new eqe(i4))));
        f = new sgd(new eqe(gha.n), y53.M(new rgd(fha.g, new eqe(i2)), new rgd(fha.i, new eqe(i3)), new rgd(fha.h, new eqe(i4))));
        g = new sgd(new eqe(gha.j), y53.M(new rgd(fha.a, new eqe(i2)), new rgd(fha.c, new eqe(i3)), new rgd(fha.b, new eqe(i4))));
        h = new sgd(new eqe(gha.y), y53.M(new rgd(fha.d, new eqe(i2)), new rgd(fha.f, new eqe(i3)), new rgd(fha.e, new eqe(gha.b))));
        i = new sgd(new eqe(gha.x), y53.M(new rgd(fha.v, new eqe(gha.d)), new rgd(fha.x, new eqe(gha.f)), new rgd(fha.w, new eqe(gha.e))));
    }

    public sgd(eqe eqeVar, List list) {
        super(13);
        this.b = eqeVar;
        this.c = list;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgd)) {
            return false;
        }
        sgd sgdVar = (sgd) obj;
        return tpa.f(this.b, sgdVar.b) && tpa.f(this.c, sgdVar.c) && tpa.f(this.d, sgdVar.d);
    }

    public final int hashCode() {
        int iG = k7d.g(this.c, this.b.hashCode() * 31, 31);
        Bundle bundle = this.d;
        return iG + (bundle == null ? 0 : bundle.hashCode());
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
