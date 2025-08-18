package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public abstract class gv4 {
    public final sx3 a;
    public final q0e b;
    public final q0e c;
    public final kld d;
    public final kld e;
    public final mn5 f;
    public final je7 g;
    public final je7 h;
    public final q0e i;
    public final q0e j;
    public jv4 k;
    public final AtomicLong l;
    public final AtomicLong m;

    public gv4(sx3 sx3Var) {
        this.a = sx3Var;
        je7 je7VarD = neb.a.d();
        q0e q0eVarA = r0e.a(null);
        this.b = q0eVarA;
        q0e q0eVarA2 = r0e.a(nz4.a);
        this.c = q0eVarA2;
        this.d = lld.b(0, 0, 0, 7);
        this.e = lld.b(0, 0, 0, 7);
        this.f = od2.F(new j31(new t03(q0eVarA, 11), q0eVarA2, new xh0(3, (Continuation) null, 9), 4), ((w9a) ((kke) je7VarD.getValue())).a());
        this.g = tu0.r(3, new zf3(23));
        this.h = tu0.r(3, new zf3(24));
        this.i = r0e.a(null);
        q0e q0eVarA3 = r0e.a(null);
        this.j = q0eVarA3;
        this.l = new AtomicLong();
        this.m = new AtomicLong();
        od2.L(od2.F(new zn5(q0eVarA3, new ev4(this, null), 5), ((w9a) ((kke) je7VarD.getValue())).a()), sx3Var);
    }

    public abstract void a(int i);

    public abstract void b();

    public final iv4 c() {
        return (iv4) this.h.getValue();
    }

    public abstract boolean d();

    public abstract long e();

    public final zu4 f() {
        return (zu4) this.g.getValue();
    }

    public abstract void g(int i);

    public abstract Object h(String str, RectF rectF, Continuation continuation);

    public abstract e5f i();

    public abstract void j();

    public abstract void k();

    public abstract Object l(Continuation continuation);

    public abstract void m(int i, String str);
}
