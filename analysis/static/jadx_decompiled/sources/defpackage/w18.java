package defpackage;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w18 extends v08 {
    public final float g;
    public final float h;
    public final float i;

    public w18(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(stb.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.h = resources.getDimension(stb.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(stb.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f, boolean z, int i) {
        float interpolation = this.a.getInterpolation(f);
        WeakHashMap weakHashMap = zmf.a;
        View view = this.b;
        boolean z2 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        boolean z3 = z == z2;
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.g / f2;
            float f5 = this.h / f2;
            float f6 = this.i / f3;
            if (z2) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z3) {
                f5 = -f4;
            }
            float fA = og.a(0.0f, f5, interpolation);
            float f7 = fA + 1.0f;
            view.setScaleX(f7);
            float fA2 = 1.0f - og.a(0.0f, f6, interpolation);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(z2 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z3 ? 1.0f - fA : 1.0f;
                    float f9 = fA2 != 0.0f ? (f7 / fA2) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }
}
