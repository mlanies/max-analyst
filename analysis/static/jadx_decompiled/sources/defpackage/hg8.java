package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class hg8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg8 b;

    public /* synthetic */ hg8(pg8 pg8Var, int i) {
        this.a = i;
        this.b = pg8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                pg8 pg8Var = this.b;
                if (pg8Var.t0.g()) {
                    pg8Var.Y.getClass();
                    eh8.g(2);
                }
                pg8Var.dismiss();
                break;
        }
    }
}
