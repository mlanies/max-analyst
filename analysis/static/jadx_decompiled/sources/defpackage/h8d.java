package defpackage;

/* loaded from: classes2.dex */
public final class h8d extends f9d {
    public final /* synthetic */ int l;
    public final Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8d(long j, Object obj, int i) {
        super(j);
        this.l = i;
        this.m = obj;
    }

    @Override // defpackage.f9d
    public final g9d a() {
        switch (this.l) {
            case 0:
                return new i8d(this);
            case 1:
                return new i8d(this, (byte) 0);
            default:
                return new h9d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8d(es8 es8Var) {
        super(0L);
        this.l = 0;
        this.m = es8Var;
    }
}
