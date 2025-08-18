package defpackage;

import android.R;
import android.text.TextWatcher;

/* loaded from: classes2.dex */
public abstract class ax4 extends hi {
    public dz4 v0;

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        return i == 16908322 ? super.onTextContextMenuItem(R.id.pasteAsPlainText) : super.onTextContextMenuItem(i);
    }

    public void setReplaceTextSmiles(boolean z) {
        if (z) {
            if (this.v0 == null) {
                dz4 dz4Var = new dz4();
                this.v0 = dz4Var;
                addTextChangedListener(dz4Var);
                return;
            }
            return;
        }
        TextWatcher textWatcher = this.v0;
        if (textWatcher != null) {
            removeTextChangedListener(textWatcher);
            this.v0 = null;
        }
    }
}
