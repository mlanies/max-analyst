package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class gqd extends zu3 implements View.OnAttachStateChangeListener {
    public final boolean X;
    public boolean Y;
    public ViewGroup Z;
    public boolean o;
    public xu3 s0;

    public gqd() {
        this(true);
    }

    @Override // defpackage.zu3
    public final void a() {
        xu3 xu3Var = this.s0;
        if (xu3Var != null) {
            xu3Var.q();
        }
        this.s0 = null;
        ViewGroup viewGroup = this.Z;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.Z = null;
    }

    @Override // defpackage.zu3
    public final zu3 b() {
        return new gqd(this.o);
    }

    @Override // defpackage.zu3
    public final boolean d() {
        return this.o;
    }

    @Override // defpackage.zu3
    public final boolean e() {
        return this.X;
    }

    @Override // defpackage.zu3
    public final void f(zu3 zu3Var, uu3 uu3Var) {
        this.Y = true;
    }

    @Override // defpackage.zu3
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, xu3 xu3Var) {
        if (this.Y) {
            return;
        }
        if (view != null && (!z || this.o)) {
            viewGroup.removeView(view);
        }
        if (view2 != null && view2.getParent() == null) {
            viewGroup.addView(view2);
        }
        if (viewGroup.getWindowToken() != null) {
            xu3Var.q();
            return;
        }
        this.s0 = xu3Var;
        this.Z = viewGroup;
        viewGroup.addOnAttachStateChangeListener(this);
    }

    @Override // defpackage.zu3
    public final void h(Bundle bundle) {
        this.o = bundle.getBoolean("SimpleSwapChangeHandler.removesFromViewOnPush");
    }

    @Override // defpackage.zu3
    public final void i(Bundle bundle) {
        bundle.putBoolean("SimpleSwapChangeHandler.removesFromViewOnPush", this.o);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        xu3 xu3Var = this.s0;
        if (xu3Var != null) {
            xu3Var.q();
        }
        this.s0 = null;
        ViewGroup viewGroup = this.Z;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.Z = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public gqd(boolean z) {
        this.o = z;
        this.X = true;
    }
}
