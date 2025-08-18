package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class pmf {
    public static x6g a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        x6g x6gVarF = x6g.f(null, rootWindowInsets);
        v6g v6gVar = x6gVarF.a;
        v6gVar.q(x6gVarF);
        v6gVar.d(view.getRootView());
        return x6gVarF;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
