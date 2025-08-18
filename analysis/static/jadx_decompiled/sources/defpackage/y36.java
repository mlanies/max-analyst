package defpackage;

import android.graphics.drawable.Animatable;

/* loaded from: classes.dex */
public final class y36 implements ft7, ev3 {
    public final /* synthetic */ ii0 a = new ii0();
    public final xs b = ay7.d("WrappingUtils");
    public int c = 6;

    @Override // defpackage.ev3
    public final void a(String str, ru6 ru6Var, Animatable animatable) {
        this.a.getClass();
    }

    @Override // defpackage.ft7
    public final void b(String str) {
        new x36();
        if (x53.c0(this.b, str)) {
            return;
        }
        "Fresco:".concat(str);
    }

    @Override // defpackage.ft7
    public final void c(String str, String str2, Throwable th) {
        if (x53.c0(this.b, str)) {
            return;
        }
        hm9.m0("Fresco:".concat(str), str2 + (th instanceof x36 ? "" : xxc.m(th)), new Object[0]);
    }

    @Override // defpackage.ev3
    public final void d(String str, Throwable th) {
        hm9.p("Fresco:".concat("ControllerListener"), "onFailure " + str, th);
    }

    @Override // defpackage.ev3
    public final void e(Object obj, String str) {
        this.a.getClass();
    }

    @Override // defpackage.ft7
    public final void f(String str, String str2) {
        c(str, str2, new x36());
    }

    @Override // defpackage.ev3
    public final void g(String str) {
        this.a.getClass();
    }

    @Override // defpackage.ev3
    public final void h(String str, ru6 ru6Var) {
        this.a.getClass();
    }

    @Override // defpackage.ft7
    public final boolean i(int i) {
        return this.c <= i;
    }

    @Override // defpackage.ft7
    public final void j(int i) {
        this.c = i;
    }

    @Override // defpackage.ev3
    public final void k(String str, Throwable th) {
        hm9.p("Fresco:".concat("ControllerListener"), "onIntermediateImageFailed " + str, th);
    }

    @Override // defpackage.ft7
    public final void w(String str, String str2, Throwable th) {
        if (x53.c0(this.b, str)) {
            return;
        }
        hm9.m0("Fresco:".concat(str), str2 + (th instanceof x36 ? "" : xxc.m(th)), new Object[0]);
    }

    @Override // defpackage.ft7
    public final void e(String str, String str2, Throwable th) {
        if (x53.c0(this.b, str)) {
            return;
        }
        hm9.r("Fresco:".concat(str), th, str2, new Object[0]);
    }

    @Override // defpackage.ft7
    public final void d(String str, String str2, Throwable th) {
        if (x53.c0(this.b, str)) {
            return;
        }
        hm9.n("Fresco:".concat(str), str2 + (th instanceof x36 ? "" : xxc.m(th)));
    }

    @Override // defpackage.ft7
    public final void e(String str, String str2) {
        e(str, str2, new x36());
    }

    @Override // defpackage.ft7
    public final void w(String str, String str2) {
        w(str, str2, new x36());
    }

    @Override // defpackage.ft7
    public final void d(String str, String str2) {
        d(str, str2, new x36());
    }
}
