package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class zd1 extends hqd implements zbc {
    public final acc F0;

    public zd1(Context context, acc accVar) {
        ufd ufdVar = new ufd(context, null);
        super(ufdVar);
        this.F0 = accVar;
        ufdVar.setThemeDepended(pfd.b);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        this.F0.a.add(this);
        if (ol7Var instanceof sy0) {
            ((ufd) this.a).setModelItem((kfd) ol7Var);
        }
    }
}
