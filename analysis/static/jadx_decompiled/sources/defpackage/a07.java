package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class a07 extends View.AccessibilityDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a07(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((b07) this.b).h.getEditText();
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    break;
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(View view, int i) {
        Object value;
        switch (this.a) {
            case 1:
                if (i == 8192) {
                    sv8 sv8Var = (sv8) this.b;
                    q0e q0eVar = sv8Var.L0;
                    do {
                        value = q0eVar.getValue();
                        ((Number) value).intValue();
                    } while (!q0eVar.c(value, Integer.valueOf(sv8Var.c.getSelectionEnd())));
                }
                break;
            default:
                super.sendAccessibilityEvent(view, i);
                break;
        }
    }
}
