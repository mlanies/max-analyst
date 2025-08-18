package defpackage;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public abstract class q2a {
    public final fc3 a;

    public q2a(fc3 fc3Var) {
        this.a = fc3Var;
    }

    public abstract uk a();

    public abstract r2a b();

    public abstract qpc c();

    public final fc3 d() {
        fc3 fc3Var = new fc3(4);
        fc3 fc3Var2 = this.a;
        fc3Var.a = (se3) fc3Var2.a;
        fc3Var.o = (hl) fc3Var2.o;
        fc3Var.b = (dwe) fc3Var2.b;
        fc3Var.c = (Provider) fc3Var2.c;
        fc3Var.Z = (nl) fc3Var2.Z;
        fc3Var.Y = (rl) fc3Var2.Y;
        fc3Var.X = (p31) fc3Var2.X;
        return fc3Var;
    }
}
