package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class ncc implements qh1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.qh1
    public final void onRecordStarted(oh1 oh1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qh1) it.next()).onRecordStarted(oh1Var);
        }
    }

    @Override // defpackage.qh1
    public final void onRecordStopped(ph1 ph1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qh1) it.next()).onRecordStopped(ph1Var);
        }
    }
}
