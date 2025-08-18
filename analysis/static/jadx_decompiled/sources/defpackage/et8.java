package defpackage;

import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class et8 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ht8 b;
    public final /* synthetic */ xs8 c;

    public /* synthetic */ et8(xs8 xs8Var, ht8 ht8Var) {
        this.c = xs8Var;
        this.b = ht8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xs8 xs8Var = this.c;
        ht8 ht8Var = this.b;
        switch (this.a) {
            case 0:
                long j = ht8Var.J0;
                b69 b69Var = (b69) xs8Var;
                b69Var.getClass();
                bc7[] bc7VarArr = MessagesListWidget.X0;
                b69Var.a.z0(j, ht8Var.I0);
                break;
            default:
                ht8Var.K(xs8Var, null);
                break;
        }
    }

    public /* synthetic */ et8(ht8 ht8Var, xs8 xs8Var) {
        this.b = ht8Var;
        this.c = xs8Var;
    }
}
