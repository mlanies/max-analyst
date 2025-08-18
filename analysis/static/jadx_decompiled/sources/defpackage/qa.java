package defpackage;

import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes.dex */
public final class qa extends pnf {
    public final w7c X;
    public final qx7 b;
    public final je7 c;
    public final q0e o;

    public qa(je7 je7Var, je7 je7Var2, qx7 qx7Var) {
        this.b = qx7Var;
        this.c = je7Var;
        q0e q0eVarA = r0e.a(na.c);
        this.o = q0eVarA;
        this.X = new w7c(q0eVarA);
        od2.L(new zn5(((yz0) ((ez0) je7Var.getValue())).t0, new pa(je7Var2, this, null), 5), this.a);
    }

    public final void q(final boolean z) {
        final yz0 yz0Var = (yz0) ((ez0) this.c.getValue());
        ir6 ir6Var = hm9.m;
        if (ir6Var != null) {
            yz0Var.getClass();
            if (ir6Var.c()) {
                ir6Var.d(us7.X, "CallAdminSettingsController", ey8.j("Update users from waiting room for all with apply state=", z), null);
            }
        }
        if (z) {
            bt1 bt1Var = (bt1) yz0Var.X.getValue();
            bt1Var.getClass();
            bt1.c(bt1Var, "PROMOTE_JOIN_WAITING_ROOM", null, null, null, null, null, true, 54);
        } else {
            bt1 bt1Var2 = (bt1) yz0Var.X.getValue();
            bt1Var2.getClass();
            bt1.c(bt1Var2, "REJECT_JOIN_WAITING_ROOM", null, null, null, null, null, true, 54);
        }
        yz0Var.Z.updateAndGet(new UnaryOperator() { // from class: jz0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                boolean z2;
                xs xsVar = (xs) obj;
                xsVar.getClass();
                qs qsVar = new qs(xsVar);
                while (true) {
                    boolean zHasNext = qsVar.hasNext();
                    z2 = z;
                    if (!zHasNext) {
                        break;
                    }
                    ParticipantId participantIdC = mqa.c(((Number) qsVar.next()).longValue());
                    yz0 yz0Var2 = yz0Var;
                    if (z2) {
                        Conversation conversationA = yz0Var2.d().a();
                        if (conversationA != null) {
                            conversationA.promoteParticipant(participantIdC, true);
                        }
                    } else {
                        Conversation conversationA2 = yz0Var2.d().a();
                        if (conversationA2 != null) {
                            conversationA2.removeParticipant(participantIdC);
                        }
                    }
                }
                return z2 ? xsVar : new xs(0);
            }
        });
        if (z) {
            return;
        }
        yz0Var.l();
    }
}
