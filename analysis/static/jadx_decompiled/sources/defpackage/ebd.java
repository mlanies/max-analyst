package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class ebd implements rl1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.rl1
    public final void onCurrentParticipantActiveRoomChanged(nl1 nl1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rl1) it.next()).onCurrentParticipantActiveRoomChanged(nl1Var);
        }
    }

    @Override // defpackage.rl1
    public final void onCurrentParticipantInvitedToRoom(ol1 ol1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rl1) it.next()).onCurrentParticipantInvitedToRoom(ol1Var);
        }
    }

    @Override // defpackage.rl1
    public final void onRoomRemoved(pl1 pl1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rl1) it.next()).onRoomRemoved(pl1Var);
        }
    }

    @Override // defpackage.rl1
    public final void onRoomUpdated(ql1 ql1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rl1) it.next()).onRoomUpdated(ql1Var);
        }
    }
}
