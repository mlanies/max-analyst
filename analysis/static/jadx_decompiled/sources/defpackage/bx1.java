package defpackage;

import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class bx1 implements eh7 {
    public final /* synthetic */ int a;
    public final gh7 b;

    public bx1() {
        this.a = 0;
        gh7 gh7Var = new gh7(this);
        this.b = gh7Var;
        gh7Var.d(eg7.ON_CREATE);
    }

    @Override // defpackage.eh7
    public final gh7 Q() {
        switch (this.a) {
        }
        return this.b;
    }

    public bx1(Widget widget) {
        this.a = 1;
        this.b = new gh7(this);
        widget.addLifecycleListener(new ia3(1, this));
    }
}
