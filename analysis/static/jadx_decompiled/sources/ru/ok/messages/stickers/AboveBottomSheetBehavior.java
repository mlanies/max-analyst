package ru.ok.messages.stickers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.Keep;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.bk4;
import defpackage.ow3;
import defpackage.rw3;

/* loaded from: classes2.dex */
public class AboveBottomSheetBehavior extends ow3 {
    @Keep
    public AboveBottomSheetBehavior() {
    }

    @Override // defpackage.ow3
    public final boolean f(View view, View view2) {
        return ((rw3) view2.getLayoutParams()).a instanceof BottomSheetBehavior;
    }

    @Override // defpackage.ow3
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            return false;
        }
        view2.getContext();
        bk4 bk4VarB = bk4.b();
        float y = view2.getY();
        if (1 == coordinatorLayout.getContext().getResources().getConfiguration().orientation) {
            View view3 = null;
            float f = 0.0f;
            float f2 = Float.MAX_VALUE;
            View view4 = null;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0 && !(childAt instanceof ProgressBar)) {
                    float y2 = childAt.getY();
                    float height = childAt.getHeight() + y2;
                    if (height > f) {
                        view3 = childAt;
                        f = height;
                    }
                    if (y2 < f2) {
                        view4 = childAt;
                        f2 = y2;
                    }
                }
            }
            if (view3 == null || view4 == null) {
                return false;
            }
            float f3 = bk4VarB.n;
            float f4 = f + f3;
            float f5 = (f - f2) + f3;
            if (y >= f4) {
                view.setTranslationY(0.0f);
            } else if (y < f5) {
                view.setTranslationY(f5 - f4);
            } else {
                view.setTranslationY(y - f4);
            }
        } else {
            int width = coordinatorLayout.getWidth();
            if (coordinatorLayout.getHeight() - y <= 0) {
                return false;
            }
            view.setTranslationX((float) ((-(width / 4.0f)) * Math.min(1.0d, 1.1d - ((y + r3) / r13))));
        }
        return true;
    }

    @Keep
    public AboveBottomSheetBehavior(Context context, AttributeSet attributeSet) {
    }
}
