package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class qy4 implements TextWatcher {
    public final EditText a;
    public final boolean b;
    public oy4 c;
    public int o = Integer.MAX_VALUE;
    public int X = 0;
    public boolean Y = true;

    public qy4(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            vw4.a().h(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (editText.isInEditMode() || !this.Y) {
            return;
        }
        if ((this.b || vw4.p != null) && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iB = vw4.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    vw4.a().g(i, i + i3, (Spannable) charSequence, this.o, this.X);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            vw4 vw4VarA = vw4.a();
            if (this.c == null) {
                this.c = new oy4(editText);
            }
            vw4VarA.i(this.c);
        }
    }
}
