package defpackage;

/* loaded from: classes.dex */
public final class fh7 {
    public fg7 a;
    public ug7 b;

    public final void a(eh7 eh7Var, eg7 eg7Var) {
        fg7 fg7VarA = eg7Var.a();
        fg7 fg7Var = this.a;
        if (fg7VarA.compareTo(fg7Var) < 0) {
            fg7Var = fg7VarA;
        }
        this.a = fg7Var;
        this.b.m(eh7Var, eg7Var);
        this.a = fg7VarA;
    }
}
