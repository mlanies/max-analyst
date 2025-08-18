package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class lpe extends a4 {
    public final TextInputLayout d;

    public lpe(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // defpackage.a4
    public final void d(View view, l4 l4Var) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean z = !zIsEmpty;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(hint);
        boolean z4 = !textInputLayout.F1;
        boolean z5 = !TextUtils.isEmpty(error);
        if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
            z2 = false;
        }
        String string = z3 ? hint.toString() : "";
        myd mydVar = textInputLayout.b;
        AppCompatTextView appCompatTextView = mydVar.b;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(mydVar.o);
        }
        if (z) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setText(string);
            if (z4 && placeholderText != null) {
                accessibilityNodeInfo.setText(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (!z5) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.x0.y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.c.b().n(l4Var);
    }

    @Override // defpackage.a4
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.c.b().o(accessibilityEvent);
    }
}
