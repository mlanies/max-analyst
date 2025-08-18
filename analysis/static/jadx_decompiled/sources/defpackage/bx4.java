package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class bx4 {
    public final qz7 a;
    public int b = Integer.MAX_VALUE;
    public int c = 0;

    public bx4(EditText editText, boolean z) {
        c54.o(editText, "editText cannot be null");
        this.a = new qz7(editText, z);
    }

    public final ix4 a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        qz7 qz7Var = this.a;
        qz7Var.getClass();
        if (!(inputConnection instanceof ix4)) {
            inputConnection = new ix4((EditText) qz7Var.b, inputConnection, editorInfo);
        }
        return (ix4) inputConnection;
    }
}
