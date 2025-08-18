package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class yk9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl9 b;

    public /* synthetic */ yk9(dl9 dl9Var, int i) {
        this.a = i;
        this.b = dl9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.n(new fj0(28));
                break;
            default:
                this.b.n(new al9(1));
                break;
        }
    }
}
