package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jx4 extends tw4 {
    public final WeakReference a;
    public final WeakReference b;

    public jx4(TextView textView, kx4 kx4Var) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(kx4Var);
    }

    @Override // defpackage.tw4
    public final void i() {
        InputFilter[] filters;
        CharSequence text;
        CharSequence charSequenceH;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (!textView.isAttachedToWindow() || text == (charSequenceH = vw4.a().h((text = textView.getText())))) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(charSequenceH);
                int selectionEnd = Selection.getSelectionEnd(charSequenceH);
                textView.setText(charSequenceH);
                if (charSequenceH instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequenceH;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                        return;
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                        return;
                    } else {
                        if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }
}
