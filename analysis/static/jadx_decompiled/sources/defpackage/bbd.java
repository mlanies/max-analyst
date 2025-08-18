package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class bbd implements ml1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.ml1
    public final void a(qz7 qz7Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ml1) it.next()).a(qz7Var);
        }
    }
}
