package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class l50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p50 b;
    public final /* synthetic */ k50 c;

    public /* synthetic */ l50(p50 p50Var, k50 k50Var, int i) {
        this.a = i;
        this.b = p50Var;
        this.c = k50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k50 k50Var = this.c;
                this.b.a.invoke(new b19(k50Var.b, k50Var));
                break;
            default:
                k50 k50Var2 = this.c;
                this.b.a.invoke(new b19(k50Var2.b, k50Var2));
                break;
        }
    }
}
