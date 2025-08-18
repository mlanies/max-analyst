package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class lkf implements ep1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.ep1
    public final void r(y8 y8Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ep1) it.next()).r(y8Var);
        }
    }
}
