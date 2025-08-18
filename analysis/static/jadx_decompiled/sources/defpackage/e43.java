package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e43 extends b9g {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final kue r;
    public c43 s;
    public ClippingMediaSource$IllegalClippingException t;
    public long u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e43(ej0 ej0Var, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(ej0Var);
        ej0Var.getClass();
        fm9.f(j >= 0);
        this.l = j;
        this.m = j2;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = new ArrayList();
        this.r = new kue();
    }

    @Override // defpackage.b9g
    public final void A(mue mueVar) {
        if (this.t != null) {
            return;
        }
        C(mueVar);
    }

    public final void C(mue mueVar) {
        long j;
        long j2;
        long j3;
        kue kueVar = this.r;
        mueVar.o(0, kueVar);
        long j4 = kueVar.p;
        c43 c43Var = this.s;
        ArrayList arrayList = this.q;
        long j5 = this.m;
        if (c43Var == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            long j6 = this.l;
            if (z) {
                long j7 = kueVar.l;
                j6 += j7;
                j = j7 + j5;
            } else {
                j = j5;
            }
            this.u = j4 + j6;
            this.v = j5 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a43 a43Var = (a43) arrayList.get(i);
                long j8 = this.u;
                long j9 = this.v;
                a43Var.X = j8;
                a43Var.Y = j9;
            }
            j2 = j6;
            j3 = j;
        } else {
            long j10 = this.u - j4;
            j3 = j5 != Long.MIN_VALUE ? this.v - j4 : Long.MIN_VALUE;
            j2 = j10;
        }
        try {
            c43 c43Var2 = new c43(mueVar, j2, j3);
            this.s = c43Var2;
            n(c43Var2);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.t = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((a43) arrayList.get(i2)).Z = this.t;
            }
        }
    }

    @Override // defpackage.ej0
    public final boolean a(tb8 tb8Var) {
        ej0 ej0Var = this.k;
        return ej0Var.i().e.equals(tb8Var.e) && ej0Var.a(tb8Var);
    }

    @Override // defpackage.ej0
    public final zd8 c(yj8 yj8Var, n64 n64Var, long j) {
        a43 a43Var = new a43(this.k.c(yj8Var, n64Var, j), this.n, this.u, this.v);
        this.q.add(a43Var);
        return a43Var;
    }

    @Override // defpackage.pc3, defpackage.ej0
    public final void k() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.t;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.k();
    }

    @Override // defpackage.ej0
    public final void o(zd8 zd8Var) {
        ArrayList arrayList = this.q;
        fm9.k(arrayList.remove(zd8Var));
        this.k.o(((a43) zd8Var).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        c43 c43Var = this.s;
        c43Var.getClass();
        C(c43Var.e);
    }

    @Override // defpackage.pc3, defpackage.ej0
    public final void q() {
        super.q();
        this.t = null;
        this.s = null;
    }
}
