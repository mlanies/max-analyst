package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class md2 implements a31 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.a31
    public final void onNewMessage(jz6 jz6Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a31) it.next()).onNewMessage(jz6Var);
        }
    }
}
