package defpackage;

/* loaded from: classes2.dex */
public final class u8d extends f9d {
    public final /* synthetic */ int l;
    public final long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8d(long j, long j2, int i) {
        super(j);
        this.l = i;
        this.m = j2;
    }

    @Override // defpackage.f9d
    public final g9d a() {
        switch (this.l) {
            case 0:
                return new v8d(this.a, this.m);
            default:
                return new v8d(this);
        }
    }
}
