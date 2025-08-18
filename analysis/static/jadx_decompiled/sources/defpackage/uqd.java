package defpackage;

/* loaded from: classes.dex */
public final class uqd extends iqd {
    public final /* synthetic */ int a;
    public final iqd b;
    public final b66 c;

    public /* synthetic */ uqd(iqd iqdVar, b66 b66Var, int i) {
        this.a = i;
        this.c = b66Var;
        this.b = iqdVar;
    }

    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        switch (this.a) {
            case 0:
                this.b.k(new tqd(0, this.c, erdVar));
                break;
            case 1:
                this.b.k(new l7b(erdVar, this.c, false, 7));
                break;
            default:
                this.b.k(new tqd(1, this.c, erdVar));
                break;
        }
    }
}
