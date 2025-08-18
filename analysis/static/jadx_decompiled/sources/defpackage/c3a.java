package defpackage;

/* loaded from: classes.dex */
public final class c3a extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3a(i3a i3aVar, int i) {
        super(0);
        this.a = i;
        this.b = i3aVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.c();
                break;
            default:
                this.b.d();
                break;
        }
        return e5f.a;
    }
}
