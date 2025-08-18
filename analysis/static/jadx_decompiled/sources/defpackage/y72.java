package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class y72 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p82 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ y72(p82 p82Var, long j, long j2, int i) {
        this.a = i;
        this.b = p82Var;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.f6
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.i0(this.c, this.d);
                break;
            default:
                p82 p82Var = this.b;
                l92 l92VarA = p82Var.A(this.c);
                p82Var.j0(l92VarA.b, l92VarA.c, this.d);
                break;
        }
    }
}
