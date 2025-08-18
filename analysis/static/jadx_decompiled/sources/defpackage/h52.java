package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public abstract class h52 {
    public static final mg3 a = new mg3(p8a.R, new eqe(r8a.a), 2, false);
    public static final khe b = new khe(new dk1(27));

    public static gnd a(e52 e52Var) {
        int i = r8a.E;
        uj3 uj3VarL = e52Var.l();
        String strD = uj3VarL != null ? uj3VarL.d() : null;
        if (strD != null) {
            return new gnd(e52Var.a, new gqe(i, ys.m0(new Object[]{strD})), new eqe(jpc.P), y53.M(new mg3(p8a.Q, new eqe(r8a.A), 1, false), a));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static gnd b(long j) {
        return new gnd(j, new eqe(r8a.b), null, y53.M(new mg3(p8a.T, new eqe(r8a.B), 1, false), a));
    }

    public static gnd c(long j) {
        return new gnd(j, new eqe(r8a.j), null, y53.M(new mg3(p8a.T, new eqe(r8a.i), 1, false), a));
    }

    public static gnd d(e52 e52Var) {
        long j = e52Var.a;
        int i = r8a.d;
        e52Var.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52Var.u0})), new eqe(jpc.x), y53.M(new mg3(p8a.I, new eqe(r8a.f), 1, false), new mg3(p8a.B, new eqe(r8a.c), 1, false), a));
    }

    public static gnd e(e52 e52Var) {
        long j = e52Var.a;
        int i = r8a.m;
        e52Var.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52Var.u0})), null, y53.M(new mg3(p8a.S, new eqe(r8a.h), 1, false), a));
    }

    public static gnd f(e52 e52Var) {
        long j = e52Var.a;
        int i = r8a.m;
        e52Var.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52Var.u0})), new eqe(jpc.D), y53.M(new mg3(p8a.I, new eqe(r8a.r), 1, false), new mg3(p8a.C, new eqe(r8a.k), 1, false), a));
    }

    public static gnd g(e52 e52Var) {
        long j = e52Var.a;
        int i = r8a.K;
        e52Var.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52Var.u0})), new eqe(jpc.z), y53.M(new mg3(p8a.S, new eqe(r8a.l), 1, false), new mg3(p8a.T, new eqe(r8a.k), 1, false), a));
    }

    public static gnd h(e52 e52Var) {
        long j = e52Var.a;
        int i = r8a.e;
        e52Var.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52Var.u0})), null, y53.M(new mg3(p8a.U, new eqe(r8a.C), 1, false), a));
    }

    public static gnd i(e52 e52Var) {
        long j = e52Var.a;
        int i = r8a.e;
        e52Var.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52Var.u0})), null, y53.M(new mg3(p8a.I, new eqe(r8a.f), 1, false), a));
    }

    public static gnd j(e52 e52Var) {
        long j = e52Var.a;
        int i = r8a.o;
        e52Var.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52Var.u0})), null, y53.M(new mg3(p8a.U, new eqe(r8a.D), 1, false), (mg3) b.getValue()));
    }

    public static gnd k(e52 e52Var) {
        long j = e52Var.a;
        int i = r8a.o;
        e52Var.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52Var.u0})), null, y53.M(new mg3(p8a.I, new eqe(r8a.r), 1, false), (mg3) b.getValue()));
    }

    public static gnd l(e52 e52Var) {
        return new gnd(e52Var.a, new eqe(r8a.O), null, y53.M(new mg3(p8a.W, new eqe(r8a.M), 3, false), new mg3(p8a.X, new eqe(r8a.N), 3, false), new mg3(p8a.V, new eqe(r8a.L), 3, false), new mg3(p8a.Y, new eqe(r8a.P), 1, false), a));
    }

    public static gnd m() {
        return new gnd(Long.MAX_VALUE, new iqe("Действие находится в разработке!"), new iqe("Возвращайтесь позже :)"), Collections.singletonList(new mg3(Integer.MIN_VALUE, new iqe("Вернусь позже"), 3, false)));
    }
}
