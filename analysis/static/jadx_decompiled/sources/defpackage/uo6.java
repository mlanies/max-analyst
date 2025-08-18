package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class uo6 implements yud {
    public final t06 a;
    public boolean b;
    public final /* synthetic */ x8 c;

    public uo6(x8 x8Var) {
        this.c = x8Var;
        this.a = new t06(((fu0) x8Var.X).p());
    }

    @Override // defpackage.yud
    public long c(bt0 bt0Var, long j) throws IOException {
        x8 x8Var = this.c;
        try {
            return ((fu0) x8Var.X).c(bt0Var, j);
        } catch (IOException e) {
            ((f8c) x8Var.o).k();
            this.m();
            throw e;
        }
    }

    public final void m() {
        x8 x8Var = this.c;
        int i = x8Var.a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + x8Var.a);
        }
        t06 t06Var = this.a;
        oue oueVar = t06Var.e;
        t06Var.e = oue.d;
        oueVar.a();
        oueVar.b();
        x8Var.a = 6;
    }

    @Override // defpackage.yud, defpackage.ksd
    public final oue p() {
        return this.a;
    }
}
