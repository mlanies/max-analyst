package defpackage;

import java.util.Iterator;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* loaded from: classes.dex */
public final /* synthetic */ class nz0 implements ParticipantStatesManager.Listener {
    public final /* synthetic */ int a;
    public final /* synthetic */ um1 b;

    public /* synthetic */ nz0(um1 um1Var, int i) {
        this.a = i;
        this.b = um1Var;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
    public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        ConversationParticipant me2;
        switch (this.a) {
            case 0:
                yz0 yz0Var = (yz0) this.b;
                Conversation conversationA = yz0Var.d().a();
                Object obj = null;
                ParticipantId externalId = (conversationA == null || (me2 = conversationA.getMe()) == null) ? null : me2.getExternalId();
                Iterator<T> it = stateChangedEvent.getChanges().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (tpa.f(((ParticipantStatesManager.ParticipantStateChange) next).getParticipantId(), externalId)) {
                            obj = next;
                        }
                    }
                }
                ParticipantStatesManager.ParticipantStateChange participantStateChange = (ParticipantStatesManager.ParticipantStateChange) obj;
                if (participantStateChange != null && yz0Var.x0.compareAndSet(!participantStateChange.isOn(), participantStateChange.isOn())) {
                    yz0Var.C0.g(ta.a);
                    break;
                }
                break;
            default:
                ((cra) this.b).d();
                break;
        }
    }
}
