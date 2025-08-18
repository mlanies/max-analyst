package defpackage;

/* loaded from: classes.dex */
public abstract class qpa {
    public static final sy0 a = new sy0(new eqe(b8a.J), y7a.r, null, null, null, Integer.valueOf(x7a.K0), 0, false, 880);
    public static final sy0 b = new sy0(new eqe(b8a.I), y7a.G, null, null, null, Integer.valueOf(gpc.Q), 0, false, 880);
    public static final sy0 c;
    public static final sy0 d;
    public static final sy0 e;
    public static final sy0 f;
    public static final sy0 g;
    public static final sy0 h;
    public static final sy0 i;
    public static final sy0 j;
    public static final sy0 k;
    public static final sy0 l;
    public static final sy0 m;
    public static final sy0 n;

    static {
        long j2 = y7a.x;
        int i2 = b8a.O;
        eqe eqeVar = new eqe(i2);
        int i3 = x7a.r0;
        c = new sy0(eqeVar, j2, null, null, null, Integer.valueOf(i3), 0, false, 880);
        d = new sy0(new eqe(b8a.S), y7a.z, null, null, null, Integer.valueOf(i3), 0, false, 880);
        long j3 = y7a.y;
        eqe eqeVar2 = new eqe(i2);
        int i4 = x7a.m;
        jfd jfdVar = jfd.o;
        e = new sy0(eqeVar2, j3, jfdVar, new eqe(b8a.P), null, Integer.valueOf(i4), 0, false, 320);
        long j4 = y7a.s;
        int i5 = b8a.K;
        eqe eqeVar3 = new eqe(i5);
        int i6 = x7a.j0;
        int i7 = y7a.j0;
        f = new sy0(eqeVar3, j4, null, null, null, Integer.valueOf(i6), i7, false, 624);
        g = new sy0(new eqe(b8a.R), y7a.u, null, null, null, Integer.valueOf(x7a.w0), i7, false, 624);
        h = new sy0(new eqe(b8a.L), y7a.v, null, null, null, Integer.valueOf(x7a.i0), i7, true, 112);
        i = new sy0(new eqe(i5), y7a.t, jfdVar, new eqe(b8a.M), null, Integer.valueOf(i6), i7, false, 64);
        long j5 = y7a.b1;
        int i8 = b8a.g1;
        eqe eqeVar4 = new eqe(i8);
        int i9 = x7a.I;
        j = new sy0(eqeVar4, j5, null, null, null, Integer.valueOf(i9), 0, false, 880);
        k = new sy0(new eqe(i8), j5, jfdVar, null, null, Integer.valueOf(i9), 0, false, 352);
        long j6 = y7a.c1;
        int i10 = b8a.i1;
        eqe eqeVar5 = new eqe(i10);
        int i11 = b8a.h1;
        eqe eqeVar6 = new eqe(i11);
        int i12 = x7a.v0;
        l = new sy0(eqeVar5, j6, null, eqeVar6, null, Integer.valueOf(i12), 0, false, 848);
        m = new sy0(new eqe(i10), j6, jfdVar, new eqe(i11), null, Integer.valueOf(i12), 0, false, 320);
        n = new sy0(new eqe(b8a.N), y7a.w, null, null, cfd.a, Integer.valueOf(x7a.r), 0, false, 816);
    }

    public static void a(kl7 kl7Var, ak1 ak1Var) {
        if (!ak1Var.f && ak1Var.d) {
            kl7Var.add(e);
        } else if (ak1Var.a()) {
            kl7Var.add(d);
        } else {
            kl7Var.add(c);
        }
    }

    public static kl7 b(yj1 yj1Var) {
        kl7 kl7VarL = j1e.l();
        boolean z = yj1Var.a;
        boolean z2 = yj1Var.b;
        boolean z3 = yj1Var.c;
        if (z3 && ((!z || !z3) && !z2)) {
            kl7VarL.add(h);
        } else if (z3 && (z2 || z)) {
            kl7VarL.add(g);
        } else if (!yj1Var.e || z2) {
            kl7VarL.add(f);
        } else {
            kl7VarL.add(i);
        }
        return j1e.d(kl7VarL);
    }
}
