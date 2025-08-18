package defpackage;

import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class tmf {
    public static void a(View view, ymf ymfVar) {
        qpd qpdVar = (qpd) view.getTag(twb.tag_unhandled_key_listeners);
        if (qpdVar == null) {
            qpdVar = new qpd();
            view.setTag(twb.tag_unhandled_key_listeners, qpdVar);
        }
        Objects.requireNonNull(ymfVar);
        View.OnUnhandledKeyEventListener smfVar = new smf();
        qpdVar.put(ymfVar, smfVar);
        view.addOnUnhandledKeyEventListener(smfVar);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, ymf ymfVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        qpd qpdVar = (qpd) view.getTag(twb.tag_unhandled_key_listeners);
        if (qpdVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) qpdVar.get(ymfVar)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, oc0 oc0Var) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
