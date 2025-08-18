package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* loaded from: classes.dex */
public final class g6g extends j6g {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final vb5 f = new vb5(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view, k6g k6gVar) {
        q42 q42VarJ = j(view);
        if (q42VarJ != null) {
            q42VarJ.b(k6gVar);
            if (q42VarJ.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), k6gVar);
            }
        }
    }

    public static void f(View view, k6g k6gVar, WindowInsets windowInsets, boolean z) {
        q42 q42VarJ = j(view);
        if (q42VarJ != null) {
            q42VarJ.b = windowInsets;
            if (!z) {
                q42VarJ.c(k6gVar);
                z = q42VarJ.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), k6gVar, windowInsets, z);
            }
        }
    }

    public static void g(View view, x6g x6gVar, List list) {
        q42 q42VarJ = j(view);
        if (q42VarJ != null) {
            x6gVar = q42VarJ.d(x6gVar, list);
            if (q42VarJ.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), x6gVar, list);
            }
        }
    }

    public static void h(View view, k6g k6gVar, l7b l7bVar) {
        q42 q42VarJ = j(view);
        if (q42VarJ != null) {
            q42VarJ.e(k6gVar, l7bVar);
            if (q42VarJ.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), k6gVar, l7bVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(twb.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static q42 j(View view) {
        Object tag = view.getTag(twb.tag_window_insets_animation_callback);
        if (tag instanceof f6g) {
            return ((f6g) tag).a;
        }
        return null;
    }
}
