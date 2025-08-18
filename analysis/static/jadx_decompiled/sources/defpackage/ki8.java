package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ki8 implements ri8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ si8 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ki8(si8 si8Var, long j, int i) {
        this.a = i;
        this.b = si8Var;
        this.c = j;
    }

    @Override // defpackage.ri8
    public final void b(oh8 oh8Var) {
        switch (this.a) {
            case 0:
                this.b.f.s.Z((int) this.c);
                break;
            default:
                this.b.f.s.seekTo(this.c);
                break;
        }
    }
}
