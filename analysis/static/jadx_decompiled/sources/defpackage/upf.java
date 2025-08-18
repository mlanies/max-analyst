package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class upf extends su3 {
    public final /* synthetic */ cd6 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ vpf c;
    public final /* synthetic */ View d;

    public upf(cd6 cd6Var, ViewTreeObserver viewTreeObserver, vpf vpfVar, View view) {
        this.a = cd6Var;
        this.b = viewTreeObserver;
        this.c = vpfVar;
        this.d = view;
    }

    @Override // defpackage.su3
    public final void s(uu3 uu3Var, View view) {
        Iterator it = ((ArrayList) this.a.c).iterator();
        while (it.hasNext()) {
            ((spf) it.next()).b();
        }
        uu3Var.removeLifecycleListener(this);
        cd6.a(this.c, this.d, this.b);
    }
}
