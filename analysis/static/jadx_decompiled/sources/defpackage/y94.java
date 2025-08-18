package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class y94 implements qr4 {
    public final kr4 a;
    public er4 b;
    public boolean c;
    public final /* synthetic */ aa4 o;

    public y94(aa4 aa4Var, kr4 kr4Var) {
        this.o = aa4Var;
        this.a = kr4Var;
    }

    @Override // defpackage.qr4, defpackage.rr4
    public final void release() {
        Handler handler = this.o.u;
        handler.getClass();
        maf.H(handler, new cu1(26, this));
    }
}
