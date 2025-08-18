package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class k24 implements c34 {
    public final pfa a;
    public final elc b;
    public final vlc c;
    public final glc d;
    public final wlc e;
    public final jmc f;
    public final hmc g;
    public final imc h;
    public final yef i;
    public final a9f j;
    public final py8 k;
    public final up4 l;
    public final dp3 m;
    public final nd2 n;
    public final hd1 o;
    public final c4e p;
    public final wc5 q;
    public final hc5 r;
    public final p9c s;
    public final ka4 t;
    public final gj u;

    public k24(pfa pfaVar, o45 o45Var, vxc vxcVar, q33 q33Var, je7 je7Var, pk pkVar, kke kkeVar, rj rjVar, je7 je7Var2) {
        this.a = pfaVar;
        this.b = new elc(pfaVar, je7Var2);
        this.c = new vlc(pfaVar, vxcVar, new v07(kkeVar), je7Var);
        this.d = new glc(pfaVar);
        this.e = new wlc(pfaVar);
        this.f = new jmc(pfaVar, o45Var);
        this.g = new hmc(kkeVar, pfaVar);
        this.h = new imc(pfaVar);
        py8 py8Var = new py8();
        py8Var.a = pfaVar;
        this.k = py8Var;
        this.l = new up4(pfaVar);
        this.j = new a9f(new khe(new es3(5, pfaVar)));
        this.i = new yef(pfaVar);
        this.m = new dp3();
        this.n = new nd2(0);
        this.o = new hd1(pfaVar);
        this.p = new c4e(pfaVar);
        this.q = new wc5(pfaVar);
        this.r = new hc5(pfaVar);
        this.s = new p9c(pfaVar, q33Var);
        this.t = new ka4(pfaVar);
        this.u = new gj(pkVar, pfaVar, q33Var, kkeVar, rjVar, o45Var);
    }

    public final void a() {
        ((OneMeRoomDatabase) this.a.m()).c();
    }

    public final void b() {
        ((OneMeRoomDatabase) this.a.m()).l();
    }

    public final void c() {
        ((OneMeRoomDatabase) this.a.m()).r();
    }
}
