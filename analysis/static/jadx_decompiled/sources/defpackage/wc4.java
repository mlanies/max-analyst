package defpackage;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class wc4 extends q2a {
    public final /* synthetic */ int b = 0;
    public final qpc c;
    public final uk d;
    public final r2a e;

    public wc4(m6b m6bVar) {
        super(m6bVar);
        this.e = new yxc(15);
        uk ukVar = m6bVar.w0;
        if (ukVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.d = ukVar;
        this.c = new qpc(ukVar);
    }

    @Override // defpackage.q2a
    public final uk a() {
        switch (this.b) {
            case 0:
                return (th4) this.d;
            case 1:
                return (th4) this.d;
            default:
                return this.d;
        }
    }

    @Override // defpackage.q2a
    public final r2a b() {
        switch (this.b) {
            case 0:
                return (vq7) this.e;
            case 1:
                return (glc) this.e;
            default:
                return (yxc) this.e;
        }
    }

    @Override // defpackage.q2a
    public final qpc c() {
        switch (this.b) {
        }
        return this.c;
    }

    public wc4(fc3 fc3Var, nl nlVar, rl rlVar, p31 p31Var) {
        super(fc3Var);
        ax axVar = new ax(nlVar, 2, p31Var);
        up6 up6Var = new up6(new xxc());
        up6Var.e = (hl) fc3Var.o;
        up6Var.b.b = new ev(new y8(axVar));
        th4 th4Var = new th4(up6Var, axVar, rlVar, (Provider) fc3Var.c);
        this.e = new vq7(axVar, th4Var, up6Var, 9);
        this.d = th4Var;
        this.c = new qpc(th4Var);
    }

    public wc4(fc3 fc3Var, se3 se3Var, dwe dweVar) {
        super(fc3Var);
        jt3 jt3Var = new jt3(se3Var);
        up6 up6Var = new up6(new xxc());
        up6Var.e = (hl) fc3Var.o;
        up6Var.b.b = new ev(new y8(jt3Var));
        th4 th4Var = new th4(up6Var, jt3Var, dweVar, (Provider) fc3Var.c);
        this.e = new glc(jt3Var, th4Var, up6Var, 5);
        this.d = th4Var;
        this.c = new qpc(th4Var);
    }
}
