package ru.ok.android.externcalls.sdk.waiting_room;

import defpackage.z7b;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes2.dex */
public final class ConversationWaitingParticipantId {
    public final long addedTs;
    private final ParticipantId participantId;

    public ConversationWaitingParticipantId(ParticipantId participantId, long j) {
        this.participantId = participantId;
        this.addedTs = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConversationWaitingParticipantId.class != obj.getClass()) {
            return false;
        }
        ConversationWaitingParticipantId conversationWaitingParticipantId = (ConversationWaitingParticipantId) obj;
        return this.addedTs == conversationWaitingParticipantId.addedTs && this.participantId.equals(conversationWaitingParticipantId.participantId);
    }

    public long getAddedTs() {
        return this.addedTs;
    }

    public ParticipantId getParticipantId() {
        return this.participantId;
    }

    public int hashCode() {
        return Objects.hash(this.participantId, Long.valueOf(this.addedTs));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationWaitingParticipantId{participantId=");
        sb.append(this.participantId);
        sb.append(", addedTs=");
        return z7b.i(sb, this.addedTs, '}');
    }
}
