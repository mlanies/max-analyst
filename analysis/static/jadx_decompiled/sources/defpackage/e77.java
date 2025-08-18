package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class e77 {
    public int a = -1;
    public final int b;
    public final int c;
    public static final c77 o = new c77(0);
    public static final c77 X = new c77(1);

    public e77(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    public static int b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static int c(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public void a(RecyclerView recyclerView, dec decVar) {
        View view = decVar.a;
        Object tag = view.getTag(evb.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = zmf.a;
            omf.s(view, fFloatValue);
        }
        view.setTag(evb.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public float d(float f) {
        return f;
    }

    public float e() {
        return 0.5f;
    }

    public final int f(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.a == -1) {
            this.a = recyclerView.getResources().getDimensionPixelSize(rtb.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (o.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (X.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.a)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public boolean g() {
        return true;
    }

    public void h(Canvas canvas, RecyclerView recyclerView, dec decVar, float f, float f2, int i, boolean z) {
        View view = decVar.a;
        if (z && view.getTag(evb.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = zmf.a;
            Float fValueOf = Float.valueOf(omf.i(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = zmf.a;
                    float fI = omf.i(childAt);
                    if (fI > f3) {
                        f3 = fI;
                    }
                }
            }
            omf.s(view, f3 + 1.0f);
            view.setTag(evb.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public abstract boolean i(dec decVar, dec decVar2);

    public void j(dec decVar, int i) {
    }
}
