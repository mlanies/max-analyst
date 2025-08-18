package defpackage;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class kpe implements TextWatcher {
    public int a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ TextInputLayout c;

    public kpe(TextInputLayout textInputLayout, EditText editText) {
        this.c = textInputLayout;
        this.b = editText;
        this.a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
        TextInputLayout textInputLayout = this.c;
        textInputLayout.u(!textInputLayout.L1, false);
        if (textInputLayout.y0) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.G0) {
            textInputLayout.v(editable);
        }
        EditText editText = this.b;
        int lineCount = editText.getLineCount();
        int i = this.a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = zmf.a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.E1;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
