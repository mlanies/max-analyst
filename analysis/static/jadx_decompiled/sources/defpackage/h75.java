package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class h75 implements km7, jm7, pj3, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ h75(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.pj3
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((x4b) obj).L(this.b, this.c);
                break;
            case 4:
                ((x4b) obj).t0(this.b, this.c);
                break;
            default:
                j10 j10Var = (j10) obj;
                boolean zO = s5c.O(j10Var);
                if (j10Var.d != null || zO) {
                    int i = this.b;
                    int i2 = this.c;
                    if (!zO) {
                        h20 h20VarA = j10Var.c().a();
                        h20VarA.o = i;
                        h20VarA.p = i2;
                        j10Var.d = new k20(h20VarA);
                        break;
                    } else {
                        h20 h20VarA2 = j10Var.b().d.d.a();
                        h20VarA2.o = i;
                        h20VarA2.p = i2;
                        k20 k20Var = new k20(h20VarA2);
                        j10 j10VarJ = j10Var.b().d.j();
                        j10VarJ.d = k20Var;
                        l20 l20VarA = j10VarJ.a();
                        r10 r10VarA = j10Var.b().a();
                        r10VarA.e = l20VarA;
                        j10Var.r = new s10(r10VarA);
                        break;
                    }
                }
        }
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((n3b) obj).m(this.b, this.c);
                break;
            case 1:
                ((m3b) obj).m(this.b, this.c);
                break;
            default:
                ((n3b) obj).m(this.b, this.c);
                break;
        }
    }
}
