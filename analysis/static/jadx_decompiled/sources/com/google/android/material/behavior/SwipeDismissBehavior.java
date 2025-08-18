package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.dnf;
import defpackage.f4;
import defpackage.oge;
import defpackage.ow3;
import defpackage.wmc;
import defpackage.zmf;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends ow3 {
    public dnf a;
    public boolean b;
    public boolean c;
    public int d = 2;
    public final float e = 0.5f;
    public float f = 0.0f;
    public float g = 0.5f;
    public final oge h = new oge(this);

    @Override // defpackage.ow3
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zH = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zH = coordinatorLayout.h(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = zH;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (!zH) {
            return false;
        }
        if (this.a == null) {
            this.a = new dnf(coordinatorLayout.getContext(), coordinatorLayout, this.h);
        }
        return !this.c && this.a.o(motionEvent);
    }

    @Override // defpackage.ow3
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = zmf.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            zmf.h(view, 1048576);
            zmf.e(view, 0);
            if (x(view)) {
                zmf.i(view, f4.j, new wmc(this, false));
            }
        }
        return false;
    }

    @Override // defpackage.ow3
    public final boolean w(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.i(motionEvent);
        return true;
    }

    public boolean x(View view) {
        return true;
    }
}
