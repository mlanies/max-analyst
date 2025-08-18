package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class ot1 implements wu, u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ot1(Object obj, int i, int i2, int i3) {
        this.o = obj;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.wu
    public bm7 apply(Object obj) {
        u40 u40Var = ((st1) this.o).n;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        return kq0.r(new pu1(u40Var.e(i2, i3, i), (Executor) u40Var.g, i3));
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        qr6Var.A0(((w98) this.o).c, i, this.a, this.b, this.c);
    }
}
