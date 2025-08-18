package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public abstract class y18 {
    public static final int[] a = {R.attr.theme, tsb.theme};
    public static final int[] b = {tsb.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof du3) && ((du3) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        du3 du3Var = new du3(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            du3Var.getTheme().applyStyle(resourceId2, true);
        }
        return du3Var;
    }
}
