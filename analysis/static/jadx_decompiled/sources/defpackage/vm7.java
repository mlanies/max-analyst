package defpackage;

/* loaded from: classes.dex */
public final class vm7 extends wm7 implements ug7 {
    public final eh7 X;
    public final /* synthetic */ xm7 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm7(xm7 xm7Var, eh7 eh7Var, g2a g2aVar) {
        super(xm7Var, g2aVar);
        this.Y = xm7Var;
        this.X = eh7Var;
    }

    @Override // defpackage.wm7
    public final void b() {
        this.X.Q().f(this);
    }

    @Override // defpackage.wm7
    public final boolean c(eh7 eh7Var) {
        return this.X == eh7Var;
    }

    @Override // defpackage.wm7
    public final boolean d() {
        return this.X.Q().d.a(fg7.o);
    }

    @Override // defpackage.ug7
    public final void m(eh7 eh7Var, eg7 eg7Var) {
        eh7 eh7Var2 = this.X;
        fg7 fg7Var = eh7Var2.Q().d;
        if (fg7Var == fg7.a) {
            this.Y.j(this.a);
            return;
        }
        fg7 fg7Var2 = null;
        while (fg7Var2 != fg7Var) {
            a(d());
            fg7Var2 = fg7Var;
            fg7Var = eh7Var2.Q().d;
        }
    }
}
