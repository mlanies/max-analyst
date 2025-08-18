package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class vad implements ll1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.ll1
    public final void a(ph4 ph4Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ll1) it.next()).a(ph4Var);
        }
    }
}
