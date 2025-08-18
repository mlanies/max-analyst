package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class mrf implements bq1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.bq1
    public final void onAttendee(mp1 mp1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bq1) it.next()).onAttendee(mp1Var);
        }
    }

    @Override // defpackage.bq1
    public final void onFeedback(np1 np1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bq1) it.next()).onFeedback(np1Var);
        }
    }

    @Override // defpackage.bq1
    public final void onHandUp(op1 op1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bq1) it.next()).onHandUp(op1Var);
        }
    }

    @Override // defpackage.bq1
    public final void onMeInWaitingRoomChanged(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bq1) it.next()).onMeInWaitingRoomChanged(z);
        }
    }

    @Override // defpackage.bq1
    public final void onPromotionUpdated(pp1 pp1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bq1) it.next()).onPromotionUpdated(pp1Var);
        }
    }
}
