package defpackage;

import java.util.Iterator;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class a1b {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public a1b(av0 av0Var, kke kkeVar) {
        this.b = j1e.a(((w9a) kkeVar).c());
        av0Var.d(this);
    }

    @uae
    public final void onEvent(vz2 vz2Var) {
        gi9 gi9Var = new gi9((Object) null);
        Iterator it = vz2Var.b.iterator();
        while (it.hasNext()) {
            gi9Var.a(((Number) it.next()).longValue());
        }
        j47.T(this.b, null, null, new z0b(this, new buc(), null), 3);
    }
}
