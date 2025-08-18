package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class f07 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g07 b;

    public /* synthetic */ f07(g07 g07Var, int i) {
        this.a = i;
        this.b = g07Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.B0.g(hv3.a);
                break;
            default:
                this.b.B0.g(iv3.a);
                break;
        }
    }
}
