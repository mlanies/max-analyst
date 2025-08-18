package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class wwe implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ywe b;

    public /* synthetic */ wwe(ywe yweVar, int i) {
        this.a = i;
        this.b = yweVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                return e5f.a;
            default:
                ywe yweVar = this.b;
                return new twe(yweVar.X, yweVar.Y, yweVar.c);
        }
    }
}
