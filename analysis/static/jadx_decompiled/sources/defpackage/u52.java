package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class u52 extends pnf {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final a8g t0;
    public vxd u0;
    public final ArrayList v0;
    public final s35 w0;

    public u52(long j) {
        xcb xcbVar = xcb.a;
        je7 je7VarC = xcbVar.c();
        je7 je7VarE = xcbVar.e();
        je7 je7VarF = xcbVar.f();
        je7 je7VarR = tu0.r(3, new m52(1));
        je7 je7VarG = xcbVar.g();
        je7 je7VarD = xcbVar.d();
        this.b = j;
        this.c = je7VarC;
        this.o = je7VarE;
        this.X = je7VarF;
        this.Y = je7VarR;
        this.Z = je7VarG;
        this.s0 = je7VarD;
        this.t0 = new a8g(5);
        this.v0 = new ArrayList();
        this.w0 = new s35(0);
    }

    public final e52 q() {
        return (e52) ((jz2) ((iy2) this.c.getValue())).m(this.b).a.getValue();
    }

    public final void r() {
        ArrayList arrayList = this.v0;
        List listD0 = x53.D0(arrayList);
        arrayList.clear();
        vxd vxdVar = this.u0;
        if ((vxdVar == null || !vxdVar.isActive()) && !listD0.isEmpty()) {
            this.u0 = pnf.n(this, ((w9a) ((kke) this.X.getValue())).b().plus(xq9.a), null, new t52(this, listD0, null), 2);
        }
    }
}
