package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.hk0;
import defpackage.j4;
import defpackage.o84;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final o84 i;

    public BaseTransientBottomBar$Behavior() {
        o84 o84Var = new o84(7);
        this.f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.i = o84Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ow3
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.i.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (j4.b == null) {
                    j4.b = new j4();
                }
                synchronized (j4.b.a) {
                }
            }
        } else if (coordinatorLayout.h(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (j4.b == null) {
                j4.b = new j4();
            }
            synchronized (j4.b.a) {
            }
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean x(View view) {
        this.i.getClass();
        return view instanceof hk0;
    }
}
