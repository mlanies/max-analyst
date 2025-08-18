package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class d3a {
    public static final d3a a = new d3a();

    public final OnBackInvokedCallback a(k56 k56Var) {
        return new wm(2, k56Var);
    }

    public final void b(Object obj, int i, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
