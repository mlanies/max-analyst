package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class d0d implements View.OnFocusChangeListener {
    public final /* synthetic */ o0d a;

    public d0d(o0d o0dVar) {
        this.a = o0dVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        o0d o0dVar = this.a;
        View.OnFocusChangeListener onFocusChangeListener = o0dVar.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(o0dVar, z);
        }
    }
}
