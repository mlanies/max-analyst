package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ow3;
import defpackage.rw3;
import defpackage.z2c;
import defpackage.zr6;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends ow3 {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // defpackage.ow3
    public final boolean e(View view) {
        zr6.o(view);
        throw null;
    }

    @Override // defpackage.ow3
    public final void g(rw3 rw3Var) {
        if (rw3Var.h == 0) {
            rw3Var.h = 80;
        }
    }

    @Override // defpackage.ow3
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        zr6.o(view);
        throw null;
    }

    @Override // defpackage.ow3
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        zr6.o(view);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.FloatingActionButton_Behavior_Layout);
        typedArrayObtainStyledAttributes.getBoolean(z2c.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
