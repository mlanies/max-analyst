package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.au1;
import defpackage.ow3;
import defpackage.zmf;
import java.util.List;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends ow3 {
    public ExpandableBehavior() {
    }

    @Override // defpackage.ow3
    public abstract boolean f(View view, View view2);

    @Override // defpackage.ow3
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        au1.r(view2);
        throw null;
    }

    @Override // defpackage.ow3
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = zmf.a;
        if (!view.isLaidOut()) {
            List listD = coordinatorLayout.d(view);
            int size = listD.size();
            for (int i2 = 0; i2 < size; i2++) {
                f(view, (View) listD.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
