package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public final class yn extends wl7 implements ao {
    public CharSequence L0;
    public ListAdapter M0;
    public final Rect N0;
    public int O0;
    public final /* synthetic */ bo P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(bo boVar, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.P0 = boVar;
        this.N0 = new Rect();
        this.z0 = boVar;
        this.J0 = true;
        this.K0.setFocusable(true);
        this.A0 = new wn(0, this);
    }

    @Override // defpackage.ao
    public final CharSequence e() {
        return this.L0;
    }

    @Override // defpackage.ao
    public final void g(CharSequence charSequence) {
        this.L0 = charSequence;
    }

    @Override // defpackage.ao
    public final void m(int i) {
        this.O0 = i;
    }

    @Override // defpackage.ao
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        ln lnVar = this.K0;
        boolean zIsShowing = lnVar.isShowing();
        s();
        this.K0.setInputMethodMode(2);
        f();
        es4 es4Var = this.c;
        es4Var.setChoiceMode(1);
        es4Var.setTextDirection(i);
        es4Var.setTextAlignment(i2);
        bo boVar = this.P0;
        int selectedItemPosition = boVar.getSelectedItemPosition();
        es4 es4Var2 = this.c;
        if (lnVar.isShowing() && es4Var2 != null) {
            es4Var2.setListSelectionHidden(false);
            es4Var2.setSelection(selectedItemPosition);
            if (es4Var2.getChoiceMode() != 0) {
                es4Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = boVar.getViewTreeObserver()) == null) {
            return;
        }
        sn snVar = new sn(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(snVar);
        this.K0.setOnDismissListener(new xn(this, snVar));
    }

    @Override // defpackage.wl7, defpackage.ao
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.M0 = listAdapter;
    }

    public final void s() {
        int i;
        ln lnVar = this.K0;
        Drawable background = lnVar.getBackground();
        bo boVar = this.P0;
        if (background != null) {
            background.getPadding(boVar.v0);
            int layoutDirection = boVar.getLayoutDirection();
            Rect rect = boVar.v0;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = boVar.v0;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = boVar.getPaddingLeft();
        int paddingRight = boVar.getPaddingRight();
        int width = boVar.getWidth();
        int i2 = boVar.u0;
        if (i2 == -2) {
            int iA = boVar.a((SpinnerAdapter) this.M0, lnVar.getBackground());
            int i3 = boVar.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = boVar.v0;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (iA > i4) {
                iA = i4;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.Y = boVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.X) - this.O0) + i : paddingLeft + this.O0 + i;
    }
}
