package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.ac3;
import defpackage.br7;
import defpackage.eyb;
import defpackage.he0;
import defpackage.hj4;
import defpackage.ij4;
import defpackage.jj4;
import defpackage.l16;
import defpackage.re;
import defpackage.s5c;
import defpackage.uk5;
import defpackage.v06;
import defpackage.wmd;
import defpackage.zr6;

/* loaded from: classes.dex */
public class DialogFragment extends a implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler l1;
    public boolean u1;
    public Dialog w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;
    public final re m1 = new re(14, this);
    public final hj4 n1 = new hj4(this);
    public final ij4 o1 = new ij4(this);
    public int p1 = 0;
    public int q1 = 0;
    public boolean r1 = true;
    public boolean s1 = true;
    public int t1 = -1;
    public final uk5 v1 = new uk5(this, 2);
    public boolean A1 = false;

    @Override // androidx.fragment.app.a
    public final void A0() {
        this.S0 = true;
        if (!this.z1 && !this.y1) {
            this.y1 = true;
        }
        this.f1.j(this.v1);
    }

    @Override // androidx.fragment.app.a
    public final LayoutInflater C0(Bundle bundle) {
        LayoutInflater layoutInflaterC0 = super.C0(bundle);
        boolean z = this.s1;
        if (!z || this.u1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            return layoutInflaterC0;
        }
        if (z && !this.A1) {
            try {
                this.u1 = true;
                Dialog dialogH1 = h1();
                this.w1 = dialogH1;
                if (this.s1) {
                    j1(dialogH1, this.p1);
                    Context contextD0 = d0();
                    if (contextD0 instanceof Activity) {
                        this.w1.setOwnerActivity((Activity) contextD0);
                    }
                    this.w1.setCancelable(this.r1);
                    this.w1.setOnCancelListener(this.n1);
                    this.w1.setOnDismissListener(this.o1);
                    this.A1 = true;
                } else {
                    this.w1 = null;
                }
                this.u1 = false;
            } catch (Throwable th) {
                this.u1 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        Dialog dialog = this.w1;
        return dialog != null ? layoutInflaterC0.cloneInContext(dialog.getContext()) : layoutInflaterC0;
    }

    @Override // androidx.fragment.app.a
    public void L0(Bundle bundle) {
        Dialog dialog = this.w1;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.p1;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.q1;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.r1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.s1;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.t1;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.a
    public void M0() {
        this.S0 = true;
        Dialog dialog = this.w1;
        if (dialog != null) {
            this.x1 = false;
            dialog.show();
            View decorView = this.w1.getWindow().getDecorView();
            s5c.Z(decorView, this);
            decorView.setTag(eyb.view_tree_view_model_store_owner, this);
            wmd.G(decorView, this);
        }
    }

    @Override // androidx.fragment.app.a
    public void N0() {
        this.S0 = true;
        Dialog dialog = this.w1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.a
    public final void P0(Bundle bundle) {
        Bundle bundle2;
        this.S0 = true;
        if (this.w1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.w1.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.a
    public final void Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.Q0(layoutInflater, viewGroup, bundle);
        if (this.U0 != null || this.w1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.w1.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.a
    public final br7 V() {
        return new jj4(this, new v06(this));
    }

    public void e1() {
        f1(true, false);
    }

    public final void f1(boolean z, boolean z2) {
        if (this.y1) {
            return;
        }
        this.y1 = true;
        this.z1 = false;
        Dialog dialog = this.w1;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.w1.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.l1.getLooper()) {
                    onDismiss(this.w1);
                } else {
                    this.l1.post(this.m1);
                }
            }
        }
        this.x1 = true;
        if (this.t1 >= 0) {
            c cVarF0 = f0();
            int i = this.t1;
            if (i < 0) {
                throw new IllegalArgumentException(zr6.h(i, "Bad id: "));
            }
            cVarF0.y(new l16(cVarF0, i, 1), z);
            this.t1 = -1;
            return;
        }
        he0 he0Var = new he0(f0());
        he0Var.o = true;
        he0Var.h(this);
        if (z) {
            he0Var.d(true);
        } else {
            he0Var.d(false);
        }
    }

    public int g1() {
        return this.q1;
    }

    public Dialog h1() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        return new ac3(U0(), g1());
    }

    public final Dialog i1() {
        Dialog dialog = this.w1;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void j1(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void k1(c cVar, String str) {
        this.y1 = false;
        this.z1 = true;
        cVar.getClass();
        he0 he0Var = new he0(cVar);
        he0Var.o = true;
        he0Var.f(0, this, str, 1);
        he0Var.d(false);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.x1) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        f1(true, true);
    }

    @Override // androidx.fragment.app.a
    public final void r0(Bundle bundle) {
        this.S0 = true;
    }

    @Override // androidx.fragment.app.a
    public final void u0(Context context) {
        super.u0(context);
        this.f1.f(this.v1);
        if (this.z1) {
            return;
        }
        this.y1 = false;
    }

    @Override // androidx.fragment.app.a
    public void v0(Bundle bundle) {
        super.v0(bundle);
        this.l1 = new Handler();
        this.s1 = this.K0 == 0;
        if (bundle != null) {
            this.p1 = bundle.getInt("android:style", 0);
            this.q1 = bundle.getInt("android:theme", 0);
            this.r1 = bundle.getBoolean("android:cancelable", true);
            this.s1 = bundle.getBoolean("android:showsDialog", this.s1);
            this.t1 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.a
    public final void z0() {
        this.S0 = true;
        Dialog dialog = this.w1;
        if (dialog != null) {
            this.x1 = true;
            dialog.setOnDismissListener(null);
            this.w1.dismiss();
            if (!this.y1) {
                onDismiss(this.w1);
            }
            this.w1 = null;
            this.A1 = false;
        }
    }
}
