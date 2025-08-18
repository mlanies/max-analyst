package defpackage;

import android.text.Editable;

/* loaded from: classes.dex */
public final class k15 extends wqe {
    public final /* synthetic */ m15 a;

    public k15(m15 m15Var) {
        this.a = m15Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.b().a();
    }

    @Override // defpackage.wqe, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b().b();
    }
}
