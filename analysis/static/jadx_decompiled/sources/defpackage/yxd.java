package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class yxd extends gr8 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int G0 = zyb.abc_popup_menu_item_layout;
    public ViewTreeObserver A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public boolean F0;
    public final boolean X;
    public final int Y;
    public final int Z;
    public final Context b;
    public final wq8 c;
    public final tq8 o;
    public final int s0;
    public final mr8 t0;
    public PopupWindow.OnDismissListener w0;
    public View x0;
    public View y0;
    public nr8 z0;
    public final sn u0 = new sn(4, this);
    public final ck v0 = new ck(9, this);
    public int E0 = 0;

    public yxd(int i, int i2, wq8 wq8Var, Context context, View view, boolean z) {
        this.b = context;
        this.c = wq8Var;
        this.X = z;
        this.o = new tq8(wq8Var, LayoutInflater.from(context), z, G0);
        this.Z = i;
        this.s0 = i2;
        Resources resources = context.getResources();
        this.Y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(xtb.abc_config_prefDialogWidth));
        this.x0 = view;
        this.t0 = new mr8(context, null, i, i2);
        wq8Var.b(this, context);
    }

    @Override // defpackage.und
    public final boolean a() {
        return !this.B0 && this.t0.K0.isShowing();
    }

    @Override // defpackage.or8
    public final boolean b(qae qaeVar) {
        if (qaeVar.hasVisibleItems()) {
            View view = this.y0;
            ir8 ir8Var = new ir8(this.Z, this.s0, qaeVar, this.b, view, this.X);
            nr8 nr8Var = this.z0;
            ir8Var.i = nr8Var;
            gr8 gr8Var = ir8Var.j;
            if (gr8Var != null) {
                gr8Var.g(nr8Var);
            }
            boolean zU = gr8.u(qaeVar);
            ir8Var.h = zU;
            gr8 gr8Var2 = ir8Var.j;
            if (gr8Var2 != null) {
                gr8Var2.o(zU);
            }
            ir8Var.k = this.w0;
            this.w0 = null;
            this.c.c(false);
            mr8 mr8Var = this.t0;
            int width = mr8Var.Y;
            int iO = mr8Var.o();
            if ((Gravity.getAbsoluteGravity(this.E0, this.x0.getLayoutDirection()) & 7) == 5) {
                width += this.x0.getWidth();
            }
            if (!ir8Var.b()) {
                if (ir8Var.f != null) {
                    ir8Var.d(width, iO, true, true);
                }
            }
            nr8 nr8Var2 = this.z0;
            if (nr8Var2 != null) {
                nr8Var2.o(qaeVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.or8
    public final void c(wq8 wq8Var, boolean z) {
        if (wq8Var != this.c) {
            return;
        }
        dismiss();
        nr8 nr8Var = this.z0;
        if (nr8Var != null) {
            nr8Var.c(wq8Var, z);
        }
    }

    @Override // defpackage.or8
    public final boolean d() {
        return false;
    }

    @Override // defpackage.und
    public final void dismiss() {
        if (a()) {
            this.t0.dismiss();
        }
    }

    @Override // defpackage.und
    public final void f() {
        View view;
        if (a()) {
            return;
        }
        if (this.B0 || (view = this.x0) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.y0 = view;
        mr8 mr8Var = this.t0;
        mr8Var.K0.setOnDismissListener(this);
        mr8Var.A0 = this;
        mr8Var.J0 = true;
        mr8Var.K0.setFocusable(true);
        View view2 = this.y0;
        boolean z = this.A0 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A0 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.u0);
        }
        view2.addOnAttachStateChangeListener(this.v0);
        mr8Var.z0 = view2;
        mr8Var.w0 = this.E0;
        boolean z2 = this.C0;
        Context context = this.b;
        tq8 tq8Var = this.o;
        if (!z2) {
            this.D0 = gr8.m(tq8Var, context, this.Y);
            this.C0 = true;
        }
        mr8Var.r(this.D0);
        mr8Var.K0.setInputMethodMode(2);
        Rect rect = this.a;
        mr8Var.I0 = rect != null ? new Rect(rect) : null;
        mr8Var.f();
        es4 es4Var = mr8Var.c;
        es4Var.setOnKeyListener(this);
        if (this.F0) {
            wq8 wq8Var = this.c;
            if (wq8Var.x0 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(zyb.abc_popup_menu_header_item_layout, (ViewGroup) es4Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(wq8Var.x0);
                }
                frameLayout.setEnabled(false);
                es4Var.addHeaderView(frameLayout, null, false);
            }
        }
        mr8Var.p(tq8Var);
        mr8Var.f();
    }

    @Override // defpackage.or8
    public final void g(nr8 nr8Var) {
        this.z0 = nr8Var;
    }

    @Override // defpackage.or8
    public final void i() {
        this.C0 = false;
        tq8 tq8Var = this.o;
        if (tq8Var != null) {
            tq8Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.und
    public final es4 j() {
        return this.t0.c;
    }

    @Override // defpackage.gr8
    public final void l(wq8 wq8Var) {
    }

    @Override // defpackage.gr8
    public final void n(View view) {
        this.x0 = view;
    }

    @Override // defpackage.gr8
    public final void o(boolean z) {
        this.o.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.B0 = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.A0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A0 = this.y0.getViewTreeObserver();
            }
            this.A0.removeGlobalOnLayoutListener(this.u0);
            this.A0 = null;
        }
        this.y0.removeOnAttachStateChangeListener(this.v0);
        PopupWindow.OnDismissListener onDismissListener = this.w0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.gr8
    public final void p(int i) {
        this.E0 = i;
    }

    @Override // defpackage.gr8
    public final void q(int i) {
        this.t0.Y = i;
    }

    @Override // defpackage.gr8
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.w0 = onDismissListener;
    }

    @Override // defpackage.gr8
    public final void s(boolean z) {
        this.F0 = z;
    }

    @Override // defpackage.gr8
    public final void t(int i) {
        this.t0.l(i);
    }
}
