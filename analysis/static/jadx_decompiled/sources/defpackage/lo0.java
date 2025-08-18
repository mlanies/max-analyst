package defpackage;

import androidx.media3.common.util.GlUtil$GlException;

/* loaded from: classes.dex */
public final /* synthetic */ class lo0 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ no0 b;

    public /* synthetic */ lo0(no0 no0Var, int i) {
        this.a = i;
        this.b = no0Var;
    }

    @Override // defpackage.xff
    public final void run() throws GlUtil$GlException {
        switch (this.a) {
            case 0:
                no0 no0Var = this.b;
                if (!no0Var.o.isEmpty()) {
                    no0Var.u0 = true;
                    break;
                } else {
                    gd6 gd6Var = no0Var.Z;
                    gd6Var.getClass();
                    ((qi0) gd6Var).b();
                    d54.a();
                    break;
                }
            case 1:
                no0 no0Var2 = this.b;
                no0Var2.t0++;
                no0Var2.A();
                break;
            default:
                no0 no0Var3 = this.b;
                hd6 hd6Var = no0Var3.s0;
                if (hd6Var != null) {
                    hd6Var.a();
                }
                no0Var3.o.clear();
                break;
        }
    }
}
