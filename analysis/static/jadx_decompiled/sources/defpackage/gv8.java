package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class gv8 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ gv8(int i, m56 m56Var) {
        this.a = i;
        this.b = m56Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                this.b.invoke(Boolean.valueOf(z));
                break;
            default:
                this.b.invoke(Boolean.valueOf(z));
                break;
        }
    }
}
