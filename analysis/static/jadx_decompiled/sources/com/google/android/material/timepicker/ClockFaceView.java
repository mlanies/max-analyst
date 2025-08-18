package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import defpackage.dj3;
import defpackage.etb;
import defpackage.f43;
import defpackage.f4c;
import defpackage.ivb;
import defpackage.j4;
import defpackage.ju0;
import defpackage.m2c;
import defpackage.stb;
import defpackage.tsb;
import defpackage.vyb;
import defpackage.z2c;
import defpackage.z7;
import defpackage.zi3;
import defpackage.zmf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class ClockFaceView extends f4c implements f43 {
    public final ClockHandView J0;
    public final Rect K0;
    public final RectF L0;
    public final Rect M0;
    public final SparseArray N0;
    public final c O0;
    public final int[] P0;
    public final float[] Q0;
    public final int R0;
    public final int S0;
    public final int T0;
    public final int U0;
    public final String[] V0;
    public float W0;
    public final ColorStateList X0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ClockFaceView(Context context, AttributeSet attributeSet) {
        int i = tsb.materialClockStyle;
        super(context, attributeSet, i);
        this.K0 = new Rect();
        this.L0 = new RectF();
        this.M0 = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.N0 = sparseArray;
        this.Q0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.ClockFaceView, i, m2c.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListQ = ju0.q(context, typedArrayObtainStyledAttributes, z2c.ClockFaceView_clockNumberTextColor);
        this.X0 = colorStateListQ;
        LayoutInflater.from(context).inflate(vyb.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(ivb.material_clock_hand);
        this.J0 = clockHandView;
        this.R0 = resources.getDimensionPixelSize(stb.material_clock_hand_padding);
        int colorForState = colorStateListQ.getColorForState(new int[]{R.attr.state_selected}, colorStateListQ.getDefaultColor());
        this.P0 = new int[]{colorForState, colorForState, colorStateListQ.getDefaultColor()};
        clockHandView.c.add(this);
        int defaultColor = z7.n(context, etb.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListQ2 = ju0.q(context, typedArrayObtainStyledAttributes, z2c.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListQ2 != null ? colorStateListQ2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.O0 = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.V0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.V0.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.V0.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(vyb.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.V0[i2]);
                textView.setTag(ivb.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(ivb.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                zmf.j(textView, this.O0);
                textView.setTextColor(this.X0);
            }
        }
        ClockHandView clockHandView2 = this.J0;
        if (clockHandView2.b && !z) {
            clockHandView2.A0 = 1;
        }
        clockHandView2.b = z;
        clockHandView2.invalidate();
        this.S0 = resources.getDimensionPixelSize(stb.material_time_picker_minimum_screen_height);
        this.T0 = resources.getDimensionPixelSize(stb.material_time_picker_minimum_screen_width);
        this.U0 = resources.getDimensionPixelSize(stb.material_clock_size);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.a(1, this.V0.length, 1).a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.U0 / Math.max(Math.max(this.S0 / displayMetrics.heightPixels, this.T0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // defpackage.f4c
    public final void w() {
        dj3 dj3Var = new dj3();
        dj3Var.c(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != ivb.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(ivb.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.H0 * 0.66f) : this.H0;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                int i3 = ivb.circle_center;
                zi3 zi3Var = dj3Var.g(id).d;
                zi3Var.z = i3;
                zi3Var.A = iRound;
                zi3Var.B = size;
                size += 360.0f / list.size();
            }
        }
        dj3Var.a(this);
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.N0;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    public final void x() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.J0.u0;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.N0;
            int size = sparseArray.size();
            rectF = this.L0;
            rect = this.K0;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.M0);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.P0, this.Q0, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }
}
