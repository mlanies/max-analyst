package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class xm {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, dn dnVar) {
        Objects.requireNonNull(dnVar);
        wm wmVar = new wm(0, dnVar);
        e4.n(obj).registerOnBackInvokedCallback(1000000, wmVar);
        return wmVar;
    }

    public static void c(Object obj, Object obj2) {
        e4.n(obj).unregisterOnBackInvokedCallback(e4.j(obj2));
    }
}
