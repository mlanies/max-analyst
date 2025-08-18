package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class zmf {
    public static WeakHashMap a;
    public static final int[] b = {twb.accessibility_custom_action_0, twb.accessibility_custom_action_1, twb.accessibility_custom_action_2, twb.accessibility_custom_action_3, twb.accessibility_custom_action_4, twb.accessibility_custom_action_5, twb.accessibility_custom_action_6, twb.accessibility_custom_action_7, twb.accessibility_custom_action_8, twb.accessibility_custom_action_9, twb.accessibility_custom_action_10, twb.accessibility_custom_action_11, twb.accessibility_custom_action_12, twb.accessibility_custom_action_13, twb.accessibility_custom_action_14, twb.accessibility_custom_action_15, twb.accessibility_custom_action_16, twb.accessibility_custom_action_17, twb.accessibility_custom_action_18, twb.accessibility_custom_action_19, twb.accessibility_custom_action_20, twb.accessibility_custom_action_21, twb.accessibility_custom_action_22, twb.accessibility_custom_action_23, twb.accessibility_custom_action_24, twb.accessibility_custom_action_25, twb.accessibility_custom_action_26, twb.accessibility_custom_action_27, twb.accessibility_custom_action_28, twb.accessibility_custom_action_29, twb.accessibility_custom_action_30, twb.accessibility_custom_action_31};
    public static final jmf c = new jmf();
    public static final lmf d = new lmf();

    public static vof a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        vof vofVar = (vof) a.get(view);
        if (vofVar != null) {
            return vofVar;
        }
        vof vofVar2 = new vof(view);
        a.put(view, vofVar2);
        return vofVar2;
    }

    public static x6g b(View view, x6g x6gVar) {
        WindowInsets windowInsetsE = x6gVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = mmf.a(view, windowInsetsE);
            if (!windowInsetsA.equals(windowInsetsE)) {
                return x6g.f(view, windowInsetsA);
            }
        }
        return x6gVar;
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(twb.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(twb.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] d(View view) {
        return Build.VERSION.SDK_INT >= 31 ? wmf.a(view) : (String[]) view.getTag(twb.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = tmf.b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(tmf.b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(tmf.b(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static x6g f(View view, x6g x6gVar) {
        WindowInsets windowInsetsE = x6gVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsB = mmf.b(view, windowInsetsE);
            if (!windowInsetsB.equals(windowInsetsE)) {
                return x6g.f(view, windowInsetsB);
            }
        }
        return x6gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bt3 g(View view, bt3 bt3Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(bt3Var);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return wmf.b(view, bt3Var);
        }
        v3a v3aVar = (v3a) view.getTag(twb.tag_on_receive_content_listener);
        w3a w3aVar = c;
        if (v3aVar == null) {
            if (view instanceof w3a) {
                w3aVar = (w3a) view;
            }
            return w3aVar.b(bt3Var);
        }
        bt3 bt3VarA = v3aVar.a(view, bt3Var);
        if (bt3VarA == null) {
            return null;
        }
        if (view instanceof w3a) {
            w3aVar = (w3a) view;
        }
        return w3aVar.b(bt3VarA);
    }

    public static void h(View view, int i) {
        ArrayList arrayListC = c(view);
        for (int i2 = 0; i2 < arrayListC.size(); i2++) {
            if (((f4) arrayListC.get(i2)).a() == i) {
                arrayListC.remove(i2);
                return;
            }
        }
    }

    public static void i(View view, f4 f4Var, u4 u4Var) {
        if (u4Var == null) {
            h(view, f4Var.a());
            e(view, 0);
            return;
        }
        f4 f4Var2 = new f4(null, f4Var.b, null, u4Var, f4Var.c);
        View.AccessibilityDelegate accessibilityDelegateA = umf.a(view);
        a4 a4Var = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof z3 ? ((z3) accessibilityDelegateA).a : new a4(accessibilityDelegateA);
        if (a4Var == null) {
            a4Var = new a4();
        }
        j(view, a4Var);
        h(view, f4Var2.a());
        c(view).add(f4Var2);
        e(view, 0);
    }

    public static void j(View view, a4 a4Var) {
        if (a4Var == null && (umf.a(view) instanceof z3)) {
            a4Var = new a4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(a4Var == null ? null : a4Var.b);
    }

    public static void k(View view, CharSequence charSequence) {
        new kmf(twb.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).g(view, charSequence);
        lmf lmfVar = d;
        if (charSequence == null) {
            lmfVar.a.remove(view);
            view.removeOnAttachStateChangeListener(lmfVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(lmfVar);
        } else {
            lmfVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(lmfVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(lmfVar);
            }
        }
    }

    public static void l(View view, q42 q42Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(q42Var != null ? new h6g(q42Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = g6g.e;
        Object tag = view.getTag(twb.tag_on_apply_window_listener);
        if (q42Var == null) {
            view.setTag(twb.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener f6gVar = new f6g(view, q42Var);
        view.setTag(twb.tag_window_insets_animation_callback, f6gVar);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(f6gVar);
        }
    }
}
