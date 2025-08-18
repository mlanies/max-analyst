package defpackage;

import android.graphics.drawable.Animatable;

/* loaded from: classes2.dex */
public final class d53 extends ii0 {
    public final /* synthetic */ e53 b;
    public final /* synthetic */ a53 c;

    public d53(e53 e53Var, a53 a53Var) {
        this.b = e53Var;
        this.c = a53Var;
    }

    @Override // defpackage.ii0, defpackage.ev3
    public final void a(String str, ru6 ru6Var, Animatable animatable) {
        e53 e53Var = this.b;
        e53Var.b.postInvalidate();
        e53Var.g.invoke(this.c.i());
    }

    @Override // defpackage.ii0, defpackage.ev3
    public final void d(String str, Throwable th) {
        hm9.p("CollageImageAttachDraweeWrapper", "onFailure", th);
    }
}
