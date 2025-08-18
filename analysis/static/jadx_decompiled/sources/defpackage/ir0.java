package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ir0 extends fn {
    public cjg A0;
    public final gr0 B0;
    public BottomSheetBehavior Y;
    public FrameLayout Z;
    public CoordinatorLayout s0;
    public FrameLayout t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public hr0 y0;
    public final boolean z0;

    public ir0(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(tsb.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : m2c.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.v0 = true;
        this.w0 = true;
        this.B0 = new gr0(0, this);
        d().f(1);
        this.z0 = getContext().getTheme().obtainStyledAttributes(new int[]{tsb.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        BottomSheetBehavior bottomSheetBehaviorH = h();
        if (!this.u0 || bottomSheetBehaviorH.L == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorH.K(5);
        }
    }

    public final void g() throws Resources.NotFoundException {
        if (this.Z == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), vyb.design_bottom_sheet_dialog, null);
            this.Z = frameLayout;
            this.s0 = (CoordinatorLayout) frameLayout.findViewById(ivb.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.Z.findViewById(ivb.design_bottom_sheet);
            this.t0 = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(frameLayout2);
            this.Y = bottomSheetBehaviorC;
            gr0 gr0Var = this.B0;
            ArrayList arrayList = bottomSheetBehaviorC.W;
            if (!arrayList.contains(gr0Var)) {
                arrayList.add(gr0Var);
            }
            this.Y.I(this.v0);
            BottomSheetBehavior bottomSheetBehavior = this.Y;
            FrameLayout frameLayout3 = this.t0;
            cjg cjgVar = new cjg();
            int i = Build.VERSION.SDK_INT;
            cjgVar.a = i >= 34 ? new z08() : i >= 33 ? new x08() : null;
            cjgVar.b = bottomSheetBehavior;
            cjgVar.c = frameLayout3;
            this.A0 = cjgVar;
        }
    }

    public final BottomSheetBehavior h() throws Resources.NotFoundException {
        if (this.Y == null) {
            g();
        }
        return this.Y;
    }

    public final FrameLayout i(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        int i2 = 0;
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.Z.findViewById(ivb.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.z0) {
            FrameLayout frameLayout = this.t0;
            bkg bkgVar = new bkg(4, this);
            WeakHashMap weakHashMap = zmf.a;
            omf.u(frameLayout, bkgVar);
        }
        this.t0.removeAllViews();
        if (layoutParams == null) {
            this.t0.addView(view);
        } else {
            this.t0.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(ivb.touch_outside).setOnClickListener(new e0d(3, this));
        zmf.j(this.t0, new fr0(i2, this));
        this.t0.setOnTouchListener(new qjf(2));
        return this.Z;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.z0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.Z;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.s0;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            kp.A(window, !z);
            hr0 hr0Var = this.y0;
            if (hr0Var != null) {
                hr0Var.e(window);
            }
        }
        cjg cjgVar = this.A0;
        if (cjgVar == null) {
            return;
        }
        boolean z2 = this.v0;
        View view = (View) cjgVar.c;
        x08 x08Var = (x08) cjgVar.a;
        if (z2) {
            if (x08Var != null) {
                x08Var.b((w08) cjgVar.b, view, false);
            }
        } else if (x08Var != null) {
            x08Var.c(view);
        }
    }

    @Override // defpackage.fn, defpackage.ac3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        x08 x08Var;
        hr0 hr0Var = this.y0;
        if (hr0Var != null) {
            hr0Var.e(null);
        }
        cjg cjgVar = this.A0;
        if (cjgVar == null || (x08Var = (x08) cjgVar.a) == null) {
            return;
        }
        x08Var.c((View) cjgVar.c);
    }

    @Override // defpackage.ac3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.Y;
        if (bottomSheetBehavior == null || bottomSheetBehavior.L != 5) {
            return;
        }
        bottomSheetBehavior.K(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) throws Resources.NotFoundException {
        cjg cjgVar;
        super.setCancelable(z);
        if (this.v0 != z) {
            this.v0 = z;
            BottomSheetBehavior bottomSheetBehavior = this.Y;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.I(z);
            }
            if (getWindow() == null || (cjgVar = this.A0) == null) {
                return;
            }
            boolean z2 = this.v0;
            View view = (View) cjgVar.c;
            x08 x08Var = (x08) cjgVar.a;
            if (z2) {
                if (x08Var != null) {
                    x08Var.b((w08) cjgVar.b, view, false);
                }
            } else if (x08Var != null) {
                x08Var.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.v0) {
            this.v0 = true;
        }
        this.w0 = z;
        this.x0 = true;
    }

    @Override // defpackage.fn, defpackage.ac3, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i(null, i, null));
    }

    @Override // defpackage.fn, defpackage.ac3, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // defpackage.fn, defpackage.ac3, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
