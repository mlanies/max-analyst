package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class omf {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(twb.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static x6g b(View view, x6g x6gVar, Rect rect) {
        WindowInsets windowInsetsE = x6gVar.e();
        if (windowInsetsE != null) {
            return x6g.f(view, view.computeSystemWindowInsets(windowInsetsE, rect));
        }
        rect.setEmpty();
        return x6gVar;
    }

    public static boolean c(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    public static boolean d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static x6g j(View view) throws IllegalAccessException, IllegalArgumentException {
        if (!l6g.d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = l6g.a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) l6g.b.get(obj);
            Rect rect2 = (Rect) l6g.c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            m6g n6gVar = Build.VERSION.SDK_INT >= 30 ? new n6g() : new m6g();
            n6gVar.i(v27.b(rect.left, rect.top, rect.right, rect.bottom));
            n6gVar.f(v27.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            x6g x6gVarB = n6gVar.b();
            x6gVarB.a.q(x6gVarB);
            x6gVarB.a.d(view.getRootView());
            return x6gVarB;
        } catch (IllegalAccessException e) {
            e.getMessage();
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f) {
        view.setElevation(f);
    }

    public static void t(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void u(View view, y2a y2aVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(twb.tag_on_apply_window_listener, y2aVar);
        }
        if (y2aVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(twb.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new nmf(view, y2aVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void x(View view, float f) {
        view.setZ(f);
    }

    public static boolean y(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
