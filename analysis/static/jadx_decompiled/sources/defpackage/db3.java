package defpackage;

/* loaded from: classes.dex */
public final class db3 extends pa3 {
    public final f6 X;
    public final f6 Y;
    public final f6 Z;
    public final pa3 a;
    public final qj3 b;
    public final qj3 c;
    public final f6 o;

    public db3(pa3 pa3Var, qj3 qj3Var, f6 f6Var) {
        kj6 kj6Var = ft.e;
        r66 r66Var = ft.d;
        this.a = pa3Var;
        this.b = kj6Var;
        this.c = qj3Var;
        this.o = f6Var;
        this.X = r66Var;
        this.Y = r66Var;
        this.Z = r66Var;
    }

    @Override // defpackage.pa3
    public final void j(ab3 ab3Var) {
        this.a.i(new cb3(this, ab3Var));
    }
}
