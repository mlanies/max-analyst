package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class s31 implements r31 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.r31
    public final void onDecorativeParticipantIdChanged(q31 q31Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r31) it.next()).onDecorativeParticipantIdChanged(q31Var);
        }
    }
}
