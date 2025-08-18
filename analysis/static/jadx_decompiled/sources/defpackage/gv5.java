package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class gv5 extends hqd {
    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        w9f w9fVar = (w9f) ol7Var;
        v9f v9fVar = v9f.a;
        v9f v9fVar2 = w9fVar.b;
        View view = this.a;
        if (v9fVar2 == v9fVar) {
            ((TextView) view).setEnabled(false);
        }
        ((TextView) view).setText(w9fVar.c.a(this));
    }
}
