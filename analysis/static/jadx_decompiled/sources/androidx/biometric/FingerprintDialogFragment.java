package androidx.biometric;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.b;
import defpackage.a8g;
import defpackage.ay;
import defpackage.ci9;
import defpackage.f8;
import defpackage.g0c;
import defpackage.gn0;
import defpackage.nec;
import defpackage.oc;
import defpackage.qyb;
import defpackage.re;
import defpackage.sc;
import defpackage.tc;
import defpackage.uk5;
import defpackage.wk5;
import defpackage.xje;
import defpackage.xvb;

/* loaded from: classes.dex */
public class FingerprintDialogFragment extends DialogFragment {
    public final Handler B1 = new Handler(Looper.getMainLooper());
    public final re C1 = new re(20, this);
    public BiometricViewModel D1;
    public int E1;
    public int F1;
    public ImageView G1;
    public TextView H1;

    @Override // androidx.fragment.app.a
    public final void H0() {
        this.S0 = true;
        this.B1.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.a
    public final void K0() {
        this.S0 = true;
        BiometricViewModel biometricViewModel = this.D1;
        biometricViewModel.t = 0;
        biometricViewModel.h(1);
        this.D1.g(h0(g0c.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() {
        int i;
        sc scVar = new sc(U0());
        ay ayVar = this.D1.c;
        scVar.setTitle(ayVar != null ? (CharSequence) ayVar.o : null);
        View viewInflate = LayoutInflater.from(scVar.getContext()).inflate(qyb.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(xvb.fingerprint_subtitle);
        if (textView != null) {
            this.D1.getClass();
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(xvb.fingerprint_description);
        if (textView2 != null) {
            ay ayVar2 = this.D1.c;
            CharSequence charSequence = ayVar2 != null ? (CharSequence) ayVar2.X : null;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence);
            }
        }
        this.G1 = (ImageView) viewInflate.findViewById(xvb.fingerprint_icon);
        this.H1 = (TextView) viewInflate.findViewById(xvb.fingerprint_error);
        BiometricViewModel biometricViewModel = this.D1;
        ay ayVar3 = biometricViewModel.c;
        if (ayVar3 != null) {
            a8g a8gVar = biometricViewModel.d;
            i = ayVar3.c;
            if (i == 0) {
                i = a8gVar != null ? 15 : 255;
            }
        } else {
            i = 0;
        }
        CharSequence charSequenceH0 = f8.m(i) ? h0(g0c.confirm_device_credential_password) : this.D1.e();
        gn0 gn0Var = new gn0(this);
        oc ocVar = scVar.a;
        ocVar.i = charSequenceH0;
        ocVar.j = gn0Var;
        scVar.setView(viewInflate);
        tc tcVarCreate = scVar.create();
        tcVarCreate.setCanceledOnTouchOutside(false);
        return tcVarCreate;
    }

    public final int l1(int i) throws Resources.NotFoundException {
        Context contextD0 = d0();
        b bVarB0 = b0();
        if (contextD0 == null || bVarB0 == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextD0.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = bVarB0.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        BiometricViewModel biometricViewModel = this.D1;
        if (biometricViewModel.s == null) {
            biometricViewModel.s = new ci9();
        }
        BiometricViewModel.j(biometricViewModel.s, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        b bVarB0 = b0();
        if (bVarB0 != null) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) new xje(bVarB0).b(nec.a(BiometricViewModel.class));
            this.D1 = biometricViewModel;
            if (biometricViewModel.u == null) {
                biometricViewModel.u = new ci9();
            }
            biometricViewModel.u.e(this, new uk5(this, 0));
            BiometricViewModel biometricViewModel2 = this.D1;
            if (biometricViewModel2.v == null) {
                biometricViewModel2.v = new ci9();
            }
            biometricViewModel2.v.e(this, new uk5(this, 1));
        }
        this.E1 = l1(wk5.a());
        this.F1 = l1(R.attr.textColorSecondary);
    }
}
