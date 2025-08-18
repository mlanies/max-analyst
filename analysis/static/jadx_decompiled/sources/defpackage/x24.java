package defpackage;

/* loaded from: classes.dex */
public final class x24 implements ide {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x24(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ide
    public final Object get() {
        switch (this.a) {
            case 0:
                return ju0.x((Throwable) this.b);
            case 1:
                uk4 uk4Var = (uk4) this.b;
                uk4Var.j.getClass();
                return uk4Var.j.getApplicationContext().getCacheDir();
            case 2:
                return ((kk5) ((je7) this.b).getValue()).m();
            default:
                return this.b;
        }
    }

    public x24() {
        this.a = 0;
        this.b = n0.n;
    }
}
