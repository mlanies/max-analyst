package defpackage;

import android.view.ViewGroup;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* loaded from: classes.dex */
public final class rmc implements foc {
    public final /* synthetic */ RootController X;
    public final /* synthetic */ int a;
    public final znc b;
    public final znc c;
    public final int o;

    public rmc(RootController rootController, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.X = rootController;
                this.b = rootController.C();
                this.c = rootController.T();
                rootController.t0();
                ViewGroup.LayoutParams layoutParams = rootController.s0().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                this.o = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                break;
            default:
                this.X = rootController;
                this.b = rootController.C();
                this.c = rootController.T();
                rootController.t0();
                ViewGroup.LayoutParams layoutParams2 = rootController.s0().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                this.o = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
                break;
        }
    }

    @Override // defpackage.foc
    public final boolean B(boolean z) {
        switch (this.a) {
        }
        return this.X.B(z);
    }

    @Override // defpackage.foc
    public final znc C() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.foc
    public final boolean F() {
        switch (this.a) {
        }
        return this.X.F();
    }

    @Override // defpackage.foc
    public final znc T() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.foc
    public final boolean b(CallIndicatorWidget callIndicatorWidget, boolean z) {
        switch (this.a) {
        }
        return this.X.b(callIndicatorWidget, z);
    }

    @Override // defpackage.foc
    public final boolean l(CallIndicatorWidget callIndicatorWidget) {
        switch (this.a) {
        }
        return this.X.l(callIndicatorWidget);
    }

    @Override // defpackage.foc
    public final int s() {
        switch (this.a) {
        }
        return this.o;
    }
}
