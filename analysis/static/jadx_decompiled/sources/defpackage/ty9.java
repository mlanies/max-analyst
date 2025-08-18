package defpackage;

/* loaded from: classes.dex */
public final class ty9 extends w2 {
    public final /* synthetic */ int b;
    public final b7b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ty9(r1a r1aVar, b7b b7bVar, int i) {
        super(r1aVar);
        this.b = i;
        this.c = b7bVar;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        switch (this.b) {
            case 0:
                this.a.a(new sy9(f2aVar, this.c, 0));
                break;
            case 1:
                this.a.a(new wz9(f2aVar, this.c, 0));
                break;
            case 2:
                this.a.a(new sy9(f2aVar, (aoe) this.c, 1));
                break;
            default:
                this.a.a(new sy9(f2aVar, (doe) this.c, 2));
                break;
        }
    }
}
