package defpackage;

import android.view.View;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public abstract class vmf {
    public static int a(View view) {
        return view.getImportantForContentCapture();
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }

    public static a7g c(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new a7g(windowInsetsController);
        }
        return null;
    }

    public static boolean d(View view) {
        return view.isImportantForContentCapture();
    }

    public static void e(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    public static void f(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
