package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.b03;
import defpackage.fr0;
import defpackage.vsb;
import defpackage.zmf;

/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] u0 = {R.attr.state_checked};
    public boolean o;
    public boolean s0;
    public boolean t0;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, vsb.imageButtonStyle);
        this.s0 = true;
        this.t0 = true;
        zmf.j(this, new fr0(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.o;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.o ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), u0) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b03)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b03 b03Var = (b03) parcelable;
        super.onRestoreInstanceState(b03Var.a);
        setChecked(b03Var.c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b03 b03Var = new b03(super.onSaveInstanceState());
        b03Var.c = this.o;
        return b03Var;
    }

    public void setCheckable(boolean z) {
        if (this.s0 != z) {
            this.s0 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.s0 || this.o == z) {
            return;
        }
        this.o = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.t0 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.t0) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.o);
    }
}
