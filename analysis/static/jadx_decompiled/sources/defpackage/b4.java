package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b4 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final q64 a;

    public b4(q64 q64Var) {
        this.a = q64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b4) {
            return this.a.equals(((b4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        qs4 qs4Var = (qs4) this.a.b;
        AutoCompleteTextView autoCompleteTextView = qs4Var.h;
        if (autoCompleteTextView == null || ft.n(autoCompleteTextView)) {
            return;
        }
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = zmf.a;
        qs4Var.d.setImportantForAccessibility(i);
    }
}
