package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class hqa implements jg1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.jg1
    public final void onStateChanged(bg1 bg1Var, dg1 dg1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jg1) it.next()).onStateChanged(bg1Var, dg1Var);
        }
    }
}
