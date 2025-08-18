package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z3 extends View.AccessibilityDelegate {
    public final a4 a;

    public z3(a4 a4Var) {
        this.a = a4Var;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        w4d w4dVarB = this.a.b(view);
        if (w4dVarB != null) {
            return (AccessibilityNodeProvider) w4dVarB.b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        l4 l4Var = new l4(accessibilityNodeInfo);
        WeakHashMap weakHashMap = zmf.a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(tmf.d(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(tmf.c(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(tmf.b(view));
        int i = twb.tag_state_description;
        if (Build.VERSION.SDK_INT >= 30) {
            tag = vmf.b(view);
        } else {
            tag = view.getTag(i);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (Build.VERSION.SDK_INT >= 30) {
            g4.c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.a.d(view, l4Var);
        accessibilityNodeInfo.getText();
        List listEmptyList = (List) view.getTag(twb.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < listEmptyList.size(); i2++) {
            l4Var.b((f4) listEmptyList.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.i(view, accessibilityEvent);
    }
}
