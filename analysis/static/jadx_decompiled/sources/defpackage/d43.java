package defpackage;

import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d43 extends oc3 {
    public final dj0 k;
    public final long m;
    public b43 q;
    public ClippingMediaSource$IllegalClippingException r;
    public long s;
    public long t;
    public final long l = 0;
    public final boolean n = true;
    public final ArrayList o = new ArrayList();
    public final jue p = new jue();

    public d43(znb znbVar, long j) {
        this.k = znbVar;
        this.m = j;
    }

    @Override // defpackage.dj0
    public final yd8 a(xj8 xj8Var, n64 n64Var, long j) {
        z33 z33Var = new z33(this.k.a(xj8Var, n64Var, j), this.n, this.s, this.t);
        this.o.add(z33Var);
        return z33Var;
    }

    @Override // defpackage.dj0
    public final rb8 f() {
        return this.k.f();
    }

    @Override // defpackage.oc3, defpackage.dj0
    public final void g() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.r;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.g();
    }

    @Override // defpackage.dj0
    public final void i(y0f y0fVar) {
        this.j = y0fVar;
        this.i = maf.m(null);
        r(null, this.k);
    }

    @Override // defpackage.dj0
    public final void k(yd8 yd8Var) {
        ArrayList arrayList = this.o;
        np8.f(arrayList.remove(yd8Var));
        this.k.k(((z33) yd8Var).a);
        if (arrayList.isEmpty()) {
            b43 b43Var = this.q;
            b43Var.getClass();
            s(b43Var.b);
        }
    }

    @Override // defpackage.oc3, defpackage.dj0
    public final void m() {
        super.m();
        this.r = null;
        this.q = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oc3
    public final void q(Integer num, dj0 dj0Var, lue lueVar) {
        if (this.r != null) {
            return;
        }
        s(lueVar);
    }

    public final void s(lue lueVar) {
        long j;
        jue jueVar = this.p;
        lueVar.o(0, jueVar);
        long j2 = jueVar.B0;
        b43 b43Var = this.q;
        ArrayList arrayList = this.o;
        long j3 = this.m;
        if (b43Var == null || arrayList.isEmpty()) {
            j = this.l;
            this.s = j2 + j;
            this.t = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                z33 z33Var = (z33) arrayList.get(i);
                long j4 = this.s;
                long j5 = this.t;
                z33Var.X = j4;
                z33Var.Y = j5;
            }
        } else {
            j = this.s - j2;
            j3 = j3 != Long.MIN_VALUE ? this.t - j2 : Long.MIN_VALUE;
        }
        try {
            b43 b43Var2 = new b43(lueVar, j, j3);
            this.q = b43Var2;
            j(b43Var2);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.r = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((z33) arrayList.get(i2)).Z = this.r;
            }
        }
    }
}
