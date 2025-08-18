package defpackage;

/* loaded from: classes2.dex */
public final class myc extends rd7 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bm7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myc(bm7 bm7Var, int i) {
        super(1);
        this.a = i;
        this.b = bm7Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.cancel(false);
                break;
            default:
                this.b.cancel(false);
                break;
        }
        return e5f.a;
    }
}
