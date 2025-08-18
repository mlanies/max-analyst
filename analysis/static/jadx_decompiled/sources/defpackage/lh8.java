package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public abstract class lh8 {
    public static final int a = dtb.mr_dynamic_dialog_icon_light;

    public static ContextThemeWrapper a(Context context, boolean z) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, h(context, !z ? vsb.dialogTheme : vsb.alertDialogTheme));
        return h(contextThemeWrapper, qsb.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, f(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int b(ContextThemeWrapper contextThemeWrapper) {
        int iH = h(contextThemeWrapper, qsb.mediaRouteTheme);
        return iH == 0 ? f(contextThemeWrapper) : iH;
    }

    public static int c(Context context) {
        return s63.d(-1, g(context, vsb.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static float d(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable e(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawableN = s36.n(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        if (i(context)) {
            aq4.g(drawableN, lt3.a(context, a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawableN;
    }

    public static int f(Context context) {
        return i(context) ? c(context) == -570425344 ? l2c.Theme_MediaRouter_Light : l2c.Theme_MediaRouter_Light_DarkControlPanel : c(context) == -570425344 ? l2c.Theme_MediaRouter_LightControlPanel : l2c.Theme_MediaRouter;
    }

    public static int g(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int h(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean i(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(vsb.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static void j(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(lt3.a(context, i(context) ? dtb.mr_cast_progressbar_progress_and_thumb_light : dtb.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }
}
