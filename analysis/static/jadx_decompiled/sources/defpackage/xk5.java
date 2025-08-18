package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class xk5 implements c71 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.c71
    public final void onCallParticipantFingerprint(fg1 fg1Var, long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c71) it.next()).onCallParticipantFingerprint(fg1Var, j);
        }
    }
}
