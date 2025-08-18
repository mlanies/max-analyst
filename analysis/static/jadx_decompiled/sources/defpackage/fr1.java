package defpackage;

/* loaded from: classes.dex */
public final class fr1 implements fh3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh3 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fr1(gh3 gh3Var, Object obj, int i) {
        this.a = i;
        this.b = gh3Var;
        this.c = obj;
    }

    private final void c() {
    }

    @Override // defpackage.fh3
    public final void a() {
        switch (this.a) {
            case 0:
                break;
            default:
                gh3 gh3Var = this.b;
                if (gh3Var.f()) {
                    gh3Var.e(this);
                    ((ry1) this.c).resumeWith(e5f.a);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.fh3
    public final void b() {
        switch (this.a) {
            case 0:
                ((fab) ((iab) this.c)).n(this.b.d() ? u9f.a : u9f.b);
                break;
            default:
                gh3 gh3Var = this.b;
                if (gh3Var.f()) {
                    gh3Var.e(this);
                    ((ry1) this.c).resumeWith(e5f.a);
                    break;
                }
                break;
        }
    }
}
