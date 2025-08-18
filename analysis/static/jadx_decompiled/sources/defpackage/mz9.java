package defpackage;

/* loaded from: classes.dex */
public final class mz9 extends w2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz9(r1a r1aVar, int i) {
        super(r1aVar);
        this.b = i;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        switch (this.b) {
            case 0:
                this.a.a(new lz9(f2aVar));
                break;
            default:
                this.a.a(new l0a(0, f2aVar));
                break;
        }
    }
}
