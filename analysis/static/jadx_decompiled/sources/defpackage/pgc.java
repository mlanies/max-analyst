package defpackage;

/* loaded from: classes.dex */
public final class pgc implements ug7 {
    public final /* synthetic */ ry1 X;
    public final /* synthetic */ xi9 Y;
    public final /* synthetic */ a66 Z;
    public final /* synthetic */ eg7 a;
    public final /* synthetic */ mec b;
    public final /* synthetic */ sx3 c;
    public final /* synthetic */ eg7 o;

    public pgc(eg7 eg7Var, mec mecVar, sx3 sx3Var, eg7 eg7Var2, sy1 sy1Var, aj9 aj9Var, a66 a66Var) {
        this.a = eg7Var;
        this.b = mecVar;
        this.c = sx3Var;
        this.o = eg7Var2;
        this.X = sy1Var;
        this.Y = aj9Var;
        this.Z = a66Var;
    }

    @Override // defpackage.ug7
    public final void m(eh7 eh7Var, eg7 eg7Var) {
        eg7 eg7Var2 = this.a;
        mec mecVar = this.b;
        if (eg7Var == eg7Var2) {
            mecVar.a = j47.T(this.c, null, null, new ogc(this.Y, this.Z, null), 3);
            return;
        }
        if (eg7Var == this.o) {
            x77 x77Var = (x77) mecVar.a;
            if (x77Var != null) {
                x77Var.cancel(null);
            }
            mecVar.a = null;
        }
        if (eg7Var == eg7.ON_DESTROY) {
            this.X.resumeWith(e5f.a);
        }
    }
}
