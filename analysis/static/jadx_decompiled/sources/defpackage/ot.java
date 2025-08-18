package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class ot implements r01 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.r01
    public final void onAsrRecordStarted(p01 p01Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r01) it.next()).onAsrRecordStarted(p01Var);
        }
    }

    @Override // defpackage.r01
    public final void onAsrRecordStopped(q01 q01Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r01) it.next()).onAsrRecordStopped(q01Var);
        }
    }
}
