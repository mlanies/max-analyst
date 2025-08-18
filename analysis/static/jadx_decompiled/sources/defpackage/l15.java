package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class l15 {
    public final /* synthetic */ m15 a;

    public l15(m15 m15Var) {
        this.a = m15Var;
    }

    public final void a(TextInputLayout textInputLayout) {
        m15 m15Var = this.a;
        if (m15Var.G0 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = m15Var.G0;
        k15 k15Var = m15Var.J0;
        if (editText != null) {
            editText.removeTextChangedListener(k15Var);
            if (m15Var.G0.getOnFocusChangeListener() == m15Var.b().e()) {
                m15Var.G0.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        m15Var.G0 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(k15Var);
        }
        m15Var.b().m(m15Var.G0);
        m15Var.j(m15Var.b());
    }
}
