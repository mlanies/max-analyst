package defpackage;

/* loaded from: classes.dex */
public final class v35 extends x35 {
    public final ry1 c;
    public final /* synthetic */ z35 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v35(z35 z35Var, long j, ry1 ry1Var) {
        super(j);
        this.o = z35Var;
        this.c = ry1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b(this.o);
    }

    @Override // defpackage.x35
    public final String toString() {
        return super.toString() + this.c;
    }
}
