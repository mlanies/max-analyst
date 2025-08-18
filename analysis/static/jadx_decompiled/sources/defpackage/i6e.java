package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class i6e extends hqd implements a1d {
    public y0d F0;

    public i6e(Context context) {
        super(new ufd(context, null));
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        if (ol7Var instanceof x0d) {
            this.F0 = (y0d) ol7Var;
            ((ufd) this.a).setModelItem(((x0d) ol7Var).a);
        }
    }

    @Override // defpackage.a1d
    public final void b(m6e m6eVar) {
        View view = this.a;
        if (m6eVar != null) {
            tu0.K(view, 300L, new v7d(this, 11, m6eVar));
        } else {
            ((ufd) view).setOnClickListener(null);
        }
    }
}
