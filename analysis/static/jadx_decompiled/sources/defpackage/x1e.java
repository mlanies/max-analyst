package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class x1e implements wm1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.wm1
    public final void onMediaDataReceived(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wm1) it.next()).onMediaDataReceived(j);
        }
    }
}
