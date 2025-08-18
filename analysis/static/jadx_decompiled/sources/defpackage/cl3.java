package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class cl3 implements qj3, jm7, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ cl3(int i, boolean z) {
        this.a = 1;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                hl3 hl3Var = (hl3) obj;
                int i = hl3Var.m;
                boolean z = this.c;
                int i2 = this.b;
                hl3Var.m = z ? i2 | i : (~i2) & i;
                break;
            default:
                ((x4b) obj).H(this.b, this.c);
                break;
        }
    }

    @Override // defpackage.jm7, defpackage.km7
    public void invoke(Object obj) {
        ((m3b) obj).i(this.b, this.c);
    }

    public /* synthetic */ cl3(boolean z) {
        this.a = 0;
        this.c = z;
        this.b = 1;
    }

    public /* synthetic */ cl3(boolean z, int i) {
        this.a = 2;
        this.c = z;
        this.b = i;
    }
}
