package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class gba implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ gba(iba ibaVar, int i) {
        this.a = i;
        this.b = ibaVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.b;
            case 1:
                iba ibaVar = this.b;
                return new eba(new bkb(ibaVar.c, new gba(ibaVar, 0)));
            default:
                return this.b.c();
        }
    }
}
