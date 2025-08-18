package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final /* synthetic */ class smd implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        textView.clearFocus();
        return false;
    }
}
