package defpackage;

/* loaded from: classes.dex */
public final class cz9 extends w2 {
    public final int X;
    public final /* synthetic */ int b = 0;
    public final b66 c;
    public final int o;

    public cz9(r1a r1aVar, b66 b66Var, int i, int i2) {
        super(r1aVar);
        this.c = b66Var;
        this.o = i;
        this.X = i2;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        switch (this.b) {
            case 0:
                r1a r1aVar = this.a;
                b66 b66Var = this.c;
                if (!br7.a0(r1aVar, f2aVar, b66Var)) {
                    int i = this.o;
                    int i2 = this.X;
                    if (i2 != 1) {
                        r1aVar.a(new az9(f2aVar, b66Var, i, i2 == 3));
                        break;
                    } else {
                        r1aVar.a(new bz9(new y6d(f2aVar), b66Var, i));
                        break;
                    }
                }
                break;
            default:
                r1a r1aVar2 = this.a;
                b66 b66Var2 = this.c;
                if (!br7.a0(r1aVar2, f2aVar, b66Var2)) {
                    r1aVar2.a(new yz9(f2aVar, b66Var2, this.o, this.X));
                    break;
                }
                break;
        }
    }

    public cz9(qy9 qy9Var, b66 b66Var, int i, int i2) {
        super(qy9Var);
        this.c = b66Var;
        this.X = i2;
        this.o = Math.max(8, i);
    }
}
