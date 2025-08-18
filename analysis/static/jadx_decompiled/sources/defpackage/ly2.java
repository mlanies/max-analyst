package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ly2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kke b;

    public /* synthetic */ ly2(kke kkeVar, int i) {
        this.a = i;
        this.b = kkeVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return j1e.a(((w9a) this.b).b());
            default:
                return new be6(j1e.a(((w9a) this.b).a()));
        }
    }
}
