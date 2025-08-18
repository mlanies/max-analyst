package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class soc implements yh1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.yh1
    public final void onRtcStats(c4c c4cVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yh1) it.next()).onRtcStats(c4cVar);
        }
    }
}
