package ru.ok.messages.views.fragments;

import defpackage.b56;
import defpackage.q5;
import defpackage.tsd;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes2.dex */
public abstract class FrgSlideOut extends FrgBase implements tsd {
    public boolean B1 = true;

    public boolean D() {
        return true;
    }

    public void M(int i) {
        if (g1() == null) {
            return;
        }
        b0().finish();
        b0().overridePendingTransition(0, 0);
    }

    public void O() {
        b56 b56VarR1 = r1();
        if (b56VarR1 == null) {
            return;
        }
        this.B1 = b56VarR1.f();
        b56VarR1.c(false, true, true);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public void m1(q5 q5Var) {
        this.n1 = false;
        if (!(q5Var instanceof b56)) {
            throw new RuntimeException("Parent activity must implement FrgSlideOut.Listener interface");
        }
    }

    @Override // defpackage.tsd
    public final void q() {
        b56 b56VarR1 = r1();
        if (b56VarR1 == null || !this.B1) {
            return;
        }
        b56VarR1.c(true, true, false);
    }

    public b56 r1() {
        if (g1() != null) {
            return (b56) g1();
        }
        return null;
    }
}
