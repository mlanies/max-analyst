package defpackage;

/* loaded from: classes.dex */
public final class rjf implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q8b b;

    public /* synthetic */ rjf(q8b q8bVar, int i) {
        this.a = i;
        this.b = q8bVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.setVisibility(8);
                break;
            default:
                this.b.setVisibility(0);
                break;
        }
        return e5f.a;
    }
}
