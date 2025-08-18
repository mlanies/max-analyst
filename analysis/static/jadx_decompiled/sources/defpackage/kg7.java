package defpackage;

/* loaded from: classes.dex */
public final class kg7 {
    public final gh7 a;
    public final fg7 b;
    public final jl4 c;
    public final sb3 d;

    public kg7(gh7 gh7Var, fg7 fg7Var, jl4 jl4Var, x77 x77Var) {
        this.a = gh7Var;
        this.b = fg7Var;
        this.c = jl4Var;
        sb3 sb3Var = new sb3(this, 1, x77Var);
        this.d = sb3Var;
        if (gh7Var.d != fg7.a) {
            gh7Var.a(sb3Var);
        } else {
            x77Var.cancel(null);
            a();
        }
    }

    public final void a() {
        this.a.f(this.d);
        jl4 jl4Var = this.c;
        jl4Var.b = true;
        jl4Var.a();
    }
}
