package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class n6 extends kgb {
    public n6(Context context) {
        super(new ufd(context, null));
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        ((ufd) this.a).setModelItem(((x6) ol7Var).b);
    }

    @Override // defpackage.hqd
    public final void D() {
        View view = this.a;
        ((ufd) view).setOnClickListener(null);
        ((ufd) view).setOnSwitchListener(null);
    }
}
