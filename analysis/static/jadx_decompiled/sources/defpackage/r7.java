package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class r7 implements zy0 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.zy0
    public final void onActiveParticipantUpdated(yy0 yy0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zy0) it.next()).onActiveParticipantUpdated(yy0Var);
        }
    }

    @Override // defpackage.zy0
    public final void onActiveParticipantsAdded(uy0 uy0Var) {
        if (uy0Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zy0) it.next()).onActiveParticipantsAdded(uy0Var);
        }
    }

    @Override // defpackage.zy0
    public final void onActiveParticipantsChanged(vy0 vy0Var) {
        if (vy0Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zy0) it.next()).onActiveParticipantsChanged(vy0Var);
        }
    }

    @Override // defpackage.zy0
    public final void onActiveParticipantsDeAnonimized(wy0 wy0Var) {
        if (wy0Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zy0) it.next()).onActiveParticipantsDeAnonimized(wy0Var);
        }
    }

    @Override // defpackage.zy0
    public final void onActiveParticipantsRemoved(xy0 xy0Var) {
        if (xy0Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zy0) it.next()).onActiveParticipantsRemoved(xy0Var);
        }
    }
}
