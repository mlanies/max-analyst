package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii8 b;
    public final /* synthetic */ oh8 c;

    public /* synthetic */ wg3(ii8 ii8Var, oh8 oh8Var, int i) {
        this.a = i;
        this.b = ii8Var;
        this.c = oh8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ii8 ii8Var = this.b;
                if (!ii8Var.i()) {
                    if (ii8Var.z) {
                        oh8 oh8Var = this.c;
                        if (!ii8.j(oh8Var)) {
                            if (ii8Var.h(oh8Var)) {
                                ii8Var.z = false;
                            }
                        }
                    }
                    ii8Var.e.getClass();
                    break;
                }
                break;
            case 1:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 12, sj8.N0(new wa8(20)));
                break;
            case 2:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 11, sj8.N0(new wa8(15)));
                break;
            case 3:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 3, sj8.N0(new wa8(27)));
                break;
            case 4:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 1, sj8.N0(new wa8(12)));
                break;
            case 5:
                sj8 sj8Var = this.b.g;
                sj8Var.getClass();
                oh8 oh8Var2 = this.c;
                sj8Var.L0(oh8Var2, Integer.MIN_VALUE, 1, sj8.N0(new y98(sj8Var, 6, oh8Var2)));
                break;
            case 6:
                sj8 sj8Var2 = this.b.g;
                sj8Var2.getClass();
                oh8 oh8Var3 = this.c;
                sj8Var2.L0(oh8Var3, Integer.MIN_VALUE, 1, sj8.N0(new y98(sj8Var2, 6, oh8Var3)));
                break;
            case 7:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 1, sj8.N0(new wa8(12)));
                break;
            case 8:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 9, sj8.N0(new wa8(21)));
                break;
            default:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 7, sj8.N0(new wa8(17)));
                break;
        }
    }
}
