package defpackage;

/* loaded from: classes.dex */
public final class rqd extends iqd {
    public final /* synthetic */ int a;
    public final iqd b;
    public final qj3 c;

    public /* synthetic */ rqd(iqd iqdVar, qj3 qj3Var, int i) {
        this.a = i;
        this.b = iqdVar;
        this.c = qj3Var;
    }

    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        switch (this.a) {
            case 0:
                this.b.k(new cb3(erdVar, 6, this.c));
                break;
            case 1:
                this.b.k(new djb(this, 5, erdVar));
                break;
            default:
                this.b.k(new wva(this, erdVar, false, 7));
                break;
        }
    }
}
