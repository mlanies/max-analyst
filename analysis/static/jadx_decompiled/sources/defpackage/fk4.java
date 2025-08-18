package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public abstract class fk4 {
    public static final je7 a = tu0.r(2, new zf3(18));
    public static final je7 b = tu0.r(2, new zf3(19));
    public static final je7 c = tu0.r(2, new zf3(20));

    public static final int a(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static final int b(int i) {
        return tu0.G(i * d().getDisplayMetrics().density);
    }

    public static final float c() {
        return ((Number) c.getValue()).floatValue();
    }

    public static final Resources d() {
        return (Resources) a.getValue();
    }

    public static final float e(float f) {
        return TypedValue.applyDimension(2, f, d().getDisplayMetrics());
    }
}
