package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* loaded from: classes.dex */
public final class bo extends Spinner {
    public static final int[] w0 = {R.attr.spinnerMode};
    public final x8 a;
    public final Context b;
    public final rn c;
    public SpinnerAdapter o;
    public final boolean s0;
    public final ao t0;
    public int u0;
    public final Rect v0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bo(android.content.Context r11, android.util.AttributeSet r12) throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = defpackage.vsb.spinnerStyle
            r10.<init>(r11, r12, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.v0 = r1
            android.content.Context r1 = r10.getContext()
            defpackage.gse.a(r1, r10)
            int[] r1 = defpackage.p3c.Spinner
            r2 = 0
            k8g r1 = defpackage.k8g.x(r11, r12, r1, r0, r2)
            x8 r3 = new x8
            r3.<init>(r10)
            r10.a = r3
            int r3 = defpackage.p3c.Spinner_popupTheme
            java.lang.Object r4 = r1.b
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            int r3 = r4.getResourceId(r3, r2)
            if (r3 == 0) goto L35
            du3 r5 = new du3
            r5.<init>(r11, r3)
            r10.b = r5
            goto L37
        L35:
            r10.b = r11
        L37:
            r3 = -1
            r5 = 0
            int[] r6 = defpackage.bo.w0     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r12, r6, r0, r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            boolean r7 = r6.hasValue(r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L5b
            if (r7 == 0) goto L4d
            int r3 = r6.getInt(r2, r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L5b
            goto L4d
        L4a:
            r10 = move-exception
            r5 = r6
            goto L55
        L4d:
            r6.recycle()
            goto L5e
        L51:
            r10 = move-exception
            goto L55
        L53:
            r6 = r5
            goto L5b
        L55:
            if (r5 == 0) goto L5a
            r5.recycle()
        L5a:
            throw r10
        L5b:
            if (r6 == 0) goto L5e
            goto L4d
        L5e:
            r6 = 1
            if (r3 == 0) goto L9e
            if (r3 == r6) goto L64
            goto Lad
        L64:
            yn r3 = new yn
            android.content.Context r7 = r10.b
            r3.<init>(r10, r7, r12, r0)
            android.content.Context r7 = r10.b
            int[] r8 = defpackage.p3c.Spinner
            k8g r2 = defpackage.k8g.x(r7, r12, r8, r0, r2)
            int r7 = defpackage.p3c.Spinner_android_dropDownWidth
            java.lang.Object r8 = r2.b
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = -2
            int r7 = r8.getLayoutDimension(r7, r9)
            r10.u0 = r7
            int r7 = defpackage.p3c.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r7 = r2.n(r7)
            r3.i(r7)
            int r7 = defpackage.p3c.Spinner_android_prompt
            java.lang.String r7 = r4.getString(r7)
            r3.L0 = r7
            r2.z()
            r10.t0 = r3
            rn r2 = new rn
            r2.<init>(r10, r10, r3)
            r10.c = r2
            goto Lad
        L9e:
            un r2 = new un
            r2.<init>(r10)
            r10.t0 = r2
            int r3 = defpackage.p3c.Spinner_android_prompt
            java.lang.String r3 = r4.getString(r3)
            r2.c = r3
        Lad:
            int r2 = defpackage.p3c.Spinner_android_entries
            java.lang.CharSequence[] r2 = r4.getTextArray(r2)
            if (r2 == 0) goto Lc5
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r11, r4, r2)
            int r11 = defpackage.zyb.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r11)
            r10.setAdapter(r3)
        Lc5:
            r1.z()
            r10.s0 = r6
            android.widget.SpinnerAdapter r11 = r10.o
            if (r11 == 0) goto Ld3
            r10.setAdapter(r11)
            r10.o = r5
        Ld3:
            x8 r10 = r10.a
            r10.E(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.v0;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.i();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        ao aoVar = this.t0;
        return aoVar != null ? aoVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        ao aoVar = this.t0;
        return aoVar != null ? aoVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.t0 != null ? this.u0 : super.getDropDownWidth();
    }

    public final ao getInternalPopup() {
        return this.t0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        ao aoVar = this.t0;
        return aoVar != null ? aoVar.b() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        ao aoVar = this.t0;
        return aoVar != null ? aoVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        x8 x8Var = this.a;
        if (x8Var != null) {
            return x8Var.B();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x8 x8Var = this.a;
        if (x8Var != null) {
            return x8Var.C();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ao aoVar = this.t0;
        if (aoVar == null || !aoVar.a()) {
            return;
        }
        aoVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.t0 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        zn znVar = (zn) parcelable;
        super.onRestoreInstanceState(znVar.getSuperState());
        if (!znVar.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new sn(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        zn znVar = new zn(super.onSaveInstanceState());
        ao aoVar = this.t0;
        znVar.a = aoVar != null && aoVar.a();
        return znVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rn rnVar = this.c;
        if (rnVar == null || !rnVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        ao aoVar = this.t0;
        if (aoVar == null) {
            return super.performClick();
        }
        if (aoVar.a()) {
            return true;
        }
        this.t0.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.H();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.I(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        ao aoVar = this.t0;
        if (aoVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            aoVar.m(i);
            aoVar.d(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        ao aoVar = this.t0;
        if (aoVar != null) {
            aoVar.l(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.t0 != null) {
            this.u0 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        ao aoVar = this.t0;
        if (aoVar != null) {
            aoVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(s36.n(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        ao aoVar = this.t0;
        if (aoVar != null) {
            aoVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.O(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.P(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.s0) {
            this.o = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        ao aoVar = this.t0;
        if (aoVar != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            vn vnVar = new vn();
            vnVar.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                vnVar.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                tn.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            aoVar.p(vnVar);
        }
    }
}
