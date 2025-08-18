package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class ve5 implements b71 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.b71
    public final void onFeedback(a71 a71Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b71) it.next()).onFeedback(a71Var);
        }
    }
}
