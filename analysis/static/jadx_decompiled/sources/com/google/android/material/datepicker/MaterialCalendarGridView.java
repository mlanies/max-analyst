package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import defpackage.h18;
import defpackage.ivb;
import defpackage.jaf;
import defpackage.lc9;
import defpackage.tsb;
import defpackage.zmf;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        jaf.d(null);
        if (MaterialDatePicker.n1(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(ivb.cancel_button);
            setNextFocusRightId(ivb.confirm_button);
        }
        this.a = MaterialDatePicker.n1(getContext(), tsb.nestedScrollable);
        zmf.j(this, new h18(2));
    }

    public final lc9 a() {
        return (lc9) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (lc9) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((lc9) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        lc9 lc9Var = (lc9) super.getAdapter();
        lc9Var.getClass();
        int iMax = Math.max(lc9Var.a(), getFirstVisiblePosition());
        int iMin = Math.min(lc9Var.c(), getLastVisiblePosition());
        lc9Var.getItem(iMax);
        lc9Var.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((lc9) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((lc9) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((lc9) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((lc9) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.a) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((lc9) super.getAdapter()).a()) {
            super.setSelection(((lc9) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (lc9) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof lc9)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), lc9.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
