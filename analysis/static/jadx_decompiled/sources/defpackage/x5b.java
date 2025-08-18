package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class x5b implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6b b;

    public /* synthetic */ x5b(f6b f6bVar, int i) {
        this.a = i;
        this.b = f6bVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                z5b z5bVar = this.b.a;
                if (z5bVar != null) {
                    z5bVar.k();
                }
                return e5f.a;
            case 1:
                z5b z5bVar2 = this.b.a;
                if (z5bVar2 != null) {
                    z5bVar2.h();
                }
                return e5f.a;
            case 2:
                return new w5b(this.b.a);
            default:
                z5b z5bVar3 = this.b.a;
                if (z5bVar3 != null) {
                    z5bVar3.k();
                }
                return e5f.a;
        }
    }
}
