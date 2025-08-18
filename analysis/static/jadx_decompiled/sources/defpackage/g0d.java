package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g0d implements TextView.OnEditorActionListener {
    public final /* synthetic */ o0d a;

    public g0d(o0d o0dVar) {
        this.a = o0dVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.onSubmitQuery();
        return true;
    }
}
