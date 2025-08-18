package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class g8f {
    public final c7f a;
    public final q2e b;
    public final ztc c;
    public final rm4 d;

    public g8f(c7f c7fVar, q2e q2eVar, ztc ztcVar, rm4 rm4Var) {
        this.a = c7fVar;
        this.d = rm4Var;
        this.b = q2eVar;
        this.c = ztcVar;
    }

    public static d7f b(iy8 iy8Var) {
        gk8 gk8Var = new gk8();
        gk8Var.d = oag.t(iy8Var.f) ? iy8Var.a.c : iy8Var.f;
        gk8Var.c = iy8Var.b;
        gk8Var.b = iy8Var.d;
        gk8Var.a = iy8Var.c;
        return new d7f(gk8Var);
    }

    public final s1a a(iy8 iy8Var) {
        e0a e0aVar = new e0a(qy9.m(iy8Var).d(new f8f(this, 0)), new f8f(this, 1), 3);
        c7f c7fVar = this.a;
        Objects.requireNonNull(c7fVar);
        return new oz9(e0aVar.d(new x6f(c7fVar, 9)).d(new f8f(this, 3)), ft.e, new ypc(this, 15, iy8Var), ft.d).o(Long.MAX_VALUE, new f8f(this, 2)).r(this.c);
    }
}
