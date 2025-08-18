package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.ivb;
import defpackage.jaf;
import defpackage.kc9;
import defpackage.kp;
import defpackage.kq0;
import defpackage.l2a;
import defpackage.m2c;
import defpackage.mr0;
import defpackage.o9g;
import defpackage.oag;
import defpackage.omf;
import defpackage.q18;
import defpackage.s36;
import defpackage.stb;
import defpackage.sx0;
import defpackage.t27;
import defpackage.tsb;
import defpackage.tx0;
import defpackage.v34;
import defpackage.vyb;
import defpackage.wzb;
import defpackage.xx5;
import defpackage.y6g;
import defpackage.yub;
import defpackage.z2c;
import defpackage.z6g;
import defpackage.zmf;
import defpackage.zr6;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    public final LinkedHashSet B1;
    public final LinkedHashSet C1;
    public int D1;
    public PickerFragment E1;
    public tx0 F1;
    public MaterialCalendar G1;
    public int H1;
    public CharSequence I1;
    public boolean J1;
    public int K1;
    public int L1;
    public CharSequence M1;
    public int N1;
    public CharSequence O1;
    public int P1;
    public CharSequence Q1;
    public int R1;
    public CharSequence S1;
    public TextView T1;
    public CheckableImageButton U1;
    public q18 V1;
    public boolean W1;
    public CharSequence X1;
    public CharSequence Y1;

    public MaterialDatePicker() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.B1 = new LinkedHashSet();
        this.C1 = new LinkedHashSet();
    }

    public static int m1(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(stb.mtrl_calendar_content_padding);
        Calendar calendarC = jaf.c();
        calendarC.set(5, 1);
        Calendar calendarB = jaf.b(calendarC);
        calendarB.get(2);
        calendarB.get(1);
        int maximum = calendarB.getMaximum(7);
        calendarB.getActualMaximum(5);
        calendarB.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(stb.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(stb.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean n1(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(kq0.G(tsb.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.D1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        tx0 tx0Var = this.F1;
        sx0 sx0Var = new sx0();
        int i = sx0.b;
        int i2 = sx0.b;
        long j = tx0Var.a.Y;
        long j2 = tx0Var.b.Y;
        sx0Var.a = Long.valueOf(tx0Var.o.Y);
        MaterialCalendar materialCalendar = this.G1;
        kc9 kc9Var = materialCalendar == null ? null : materialCalendar.o1;
        if (kc9Var != null) {
            sx0Var.a = Long.valueOf(kc9Var.Y);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", tx0Var.c);
        kc9 kc9VarB = kc9.b(j);
        kc9 kc9VarB2 = kc9.b(j2);
        v34 v34Var = (v34) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = sx0Var.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new tx0(kc9VarB, kc9VarB2, v34Var, l == null ? null : kc9.b(l.longValue()), tx0Var.X));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.H1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.I1);
        bundle.putInt("INPUT_MODE_KEY", this.K1);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.L1);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.M1);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.N1);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.O1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.P1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.Q1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.R1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.S1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void M0() throws Resources.NotFoundException {
        y6g y6gVar;
        y6g y6gVar2;
        super.M0();
        Window window = i1().getWindow();
        if (this.J1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.V1);
            if (!this.W1) {
                View viewFindViewById = V0().findViewById(ivb.fullscreen_header);
                ColorStateList colorStateListR = oag.r(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListR != null ? Integer.valueOf(colorStateListR.getDefaultColor()) : null;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                int iX = mr0.x(R.attr.colorBackground, -16777216, window.getContext());
                if (z) {
                    numValueOf = Integer.valueOf(iX);
                }
                kp.A(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z2 = mr0.J(0) || mr0.J(numValueOf.intValue());
                o9g o9gVar = new o9g(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    z6g z6gVar = new z6g(window.getInsetsController(), o9gVar);
                    z6gVar.k = window;
                    y6gVar = z6gVar;
                } else {
                    y6gVar = new y6g(window, o9gVar);
                }
                y6gVar.v(z2);
                boolean z3 = mr0.J(0) || mr0.J(iX);
                o9g o9gVar2 = new o9g(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    z6g z6gVar2 = new z6g(window.getInsetsController(), o9gVar2);
                    z6gVar2.k = window;
                    y6gVar2 = z6gVar2;
                } else {
                    y6gVar2 = new y6g(window, o9gVar2);
                }
                y6gVar2.u(z3);
                l2a l2aVar = new l2a(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop(), 7);
                WeakHashMap weakHashMap = zmf.a;
                omf.u(viewFindViewById, l2aVar);
                this.W1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = g0().getDimensionPixelOffset(stb.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.V1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new t27(i1(), rect));
        }
        U0();
        int i = this.D1;
        if (i == 0) {
            l1();
            throw null;
        }
        l1();
        tx0 tx0Var = this.F1;
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", tx0Var);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", tx0Var.o);
        materialCalendar.X0(bundle);
        this.G1 = materialCalendar;
        PickerFragment pickerFragment = materialCalendar;
        if (this.K1 == 1) {
            l1();
            tx0 tx0Var2 = this.F1;
            PickerFragment materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", tx0Var2);
            materialTextInputPicker.X0(bundle2);
            pickerFragment = materialTextInputPicker;
        }
        this.E1 = pickerFragment;
        this.T1.setText((this.K1 == 1 && g0().getConfiguration().orientation == 2) ? this.Y1 : this.X1);
        l1();
        d0();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void N0() {
        this.E1.l1.clear();
        super.N0();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() {
        Context contextU0 = U0();
        U0();
        int i = this.D1;
        if (i == 0) {
            l1();
            throw null;
        }
        Dialog dialog = new Dialog(contextU0, i);
        Context context = dialog.getContext();
        this.J1 = n1(context, R.attr.windowFullscreen);
        this.V1 = new q18(context, null, tsb.materialCalendarStyle, m2c.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, z2c.MaterialCalendar, tsb.materialCalendarStyle, m2c.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(z2c.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.V1.j(context);
        this.V1.l(ColorStateList.valueOf(color));
        q18 q18Var = this.V1;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = zmf.a;
        q18Var.k(omf.i(decorView));
        return dialog;
    }

    public final void l1() {
        zr6.n(this.Z.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.B1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.C1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.U0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void v0(Bundle bundle) throws Resources.NotFoundException {
        super.v0(bundle);
        if (bundle == null) {
            bundle = this.Z;
        }
        this.D1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        zr6.n(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.F1 = (tx0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        zr6.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.H1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.I1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.K1 = bundle.getInt("INPUT_MODE_KEY");
        this.L1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.M1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.N1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.O1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.P1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Q1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.R1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.S1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.I1;
        if (text == null) {
            text = U0().getResources().getText(this.H1);
        }
        this.X1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.Y1 = text;
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.J1 ? vyb.mtrl_picker_fullscreen : vyb.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.J1) {
            viewInflate.findViewById(ivb.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m1(context), -2));
        } else {
            viewInflate.findViewById(ivb.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m1(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(ivb.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = zmf.a;
        textView.setAccessibilityLiveRegion(1);
        this.U1 = (CheckableImageButton) viewInflate.findViewById(ivb.mtrl_picker_header_toggle);
        this.T1 = (TextView) viewInflate.findViewById(ivb.mtrl_picker_title_text);
        this.U1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.U1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, s36.n(context, yub.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], s36.n(context, yub.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.U1.setChecked(this.K1 != 0);
        zmf.j(this.U1, null);
        CheckableImageButton checkableImageButton2 = this.U1;
        this.U1.setContentDescription(this.K1 == 1 ? checkableImageButton2.getContext().getString(wzb.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(wzb.mtrl_picker_toggle_to_text_input_mode));
        this.U1.setOnClickListener(new xx5(10, this));
        l1();
        throw null;
    }
}
