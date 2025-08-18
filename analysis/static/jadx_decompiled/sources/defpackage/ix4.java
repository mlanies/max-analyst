package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ix4 extends InputConnectionWrapper {
    public final TextView a;
    public final qx7 b;

    public ix4(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        qx7 qx7Var = new qx7(10);
        super(inputConnection, false);
        this.a = textView;
        this.b = qx7Var;
        if (vw4.p != null) {
            vw4 vw4VarA = vw4.a();
            if (vw4VarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            rw4 rw4Var = vw4VarA.e;
            rw4Var.getClass();
            Bundle bundle = editorInfo.extras;
            m99 m99Var = ((t99) rw4Var.c).a;
            int iA = m99Var.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) m99Var.o).getInt(iA + m99Var.a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", ((vw4) rw4Var.a).h);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return qx7.j(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return qx7.j(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
