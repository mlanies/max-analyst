package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class f0d implements View.OnKeyListener {
    public final /* synthetic */ o0d a;

    public f0d(o0d o0dVar) {
        this.a = o0dVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        o0d o0dVar = this.a;
        if (o0dVar.mSearchable == null) {
            return false;
        }
        if (o0dVar.mSearchSrcTextView.isPopupShowing() && o0dVar.mSearchSrcTextView.getListSelection() != -1) {
            return o0dVar.onSuggestionsKey(view, i, keyEvent);
        }
        if (TextUtils.getTrimmedLength(o0dVar.mSearchSrcTextView.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        o0dVar.launchQuerySearch(0, null, o0dVar.mSearchSrcTextView.getText().toString());
        return true;
    }
}
