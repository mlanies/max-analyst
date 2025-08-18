package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class dj8 implements pj8, qj8 {
    public final /* synthetic */ sj8 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ dj8(sj8 sj8Var, int i, int i2) {
        this.a = sj8Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.qj8
    public void b(x4b x4bVar, oh8 oh8Var, List list) {
        int i = this.b;
        sj8 sj8Var = this.a;
        x4bVar.s0(list, sj8Var.J0(oh8Var, x4bVar, i), sj8Var.J0(oh8Var, x4bVar, this.c));
    }

    @Override // defpackage.pj8
    public void f(x4b x4bVar, oh8 oh8Var) {
        int i = this.b;
        sj8 sj8Var = this.a;
        x4bVar.U(sj8Var.J0(oh8Var, x4bVar, i), sj8Var.J0(oh8Var, x4bVar, this.c));
    }
}
