package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class bt8 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ bt8(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        fka fkaVar = (fka) obj;
        switch (this.a) {
            case 0:
                return new dcf(0, this.b ? fkaVar.a().g().b.m : fkaVar.a().k().b.m);
            case 1:
                return new dcf(0, this.b ? fkaVar.a().g().b.o : fkaVar.a().k().b.o);
            default:
                return new dcf(0, this.b ? fkaVar.getIcon().a.e : fkaVar.a().s().g.a);
        }
    }
}
