package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class d82 implements sj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ d82(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.sj3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((u82) obj).l0 = this.b;
                break;
            default:
                ((e52) obj).b.i0 = this.b;
                break;
        }
    }
}
