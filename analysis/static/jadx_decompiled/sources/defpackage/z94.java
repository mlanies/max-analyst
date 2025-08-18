package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class z94 implements rr4 {
    public final lr4 a;
    public fr4 b;
    public boolean c;
    public final /* synthetic */ ba4 o;

    public z94(ba4 ba4Var, lr4 lr4Var) {
        this.o = ba4Var;
        this.a = lr4Var;
    }

    @Override // defpackage.rr4
    public final void release() {
        Handler handler = this.o.u;
        handler.getClass();
        oaf.W(handler, new cu1(27, this));
    }
}
