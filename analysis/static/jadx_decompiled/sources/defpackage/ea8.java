package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ea8 implements fa8, hi8 {
    public final /* synthetic */ k3b a;

    public /* synthetic */ ea8(k3b k3bVar) {
        this.a = k3bVar;
    }

    @Override // defpackage.hi8
    public void a(nh8 nh8Var, int i) {
        nh8Var.h(i, this.a);
    }

    @Override // defpackage.fa8
    public void c(w98 w98Var) {
        boolean z;
        if (w98Var.isConnected()) {
            k3b k3bVar = w98Var.s;
            k3b k3bVar2 = this.a;
            if (oaf.a(k3bVar, k3bVar2)) {
                return;
            }
            w98Var.s = k3bVar2;
            k3b k3bVar3 = w98Var.t;
            w98Var.t = w98.i(w98Var.r, k3bVar2);
            if (!r3.equals(k3bVar3)) {
                ffc ffcVar = w98Var.p;
                ffc ffcVarA = c73.a(w98Var.o, w98Var.q, w98Var.t);
                w98Var.p = ffcVarA;
                z = !ffcVarA.equals(ffcVar);
                w98Var.h.f(13, new k98(w98Var, 19));
            } else {
                z = false;
            }
            if (z) {
                w98Var.a.o(new k98(w98Var, 0));
            }
        }
    }
}
