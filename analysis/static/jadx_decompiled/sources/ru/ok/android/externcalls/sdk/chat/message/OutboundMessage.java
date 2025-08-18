package ru.ok.android.externcalls.sdk.chat.message;

import defpackage.tpa;
import defpackage.z84;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;", "", "participantId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "text", "", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/String;)V", "getParticipantId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OutboundMessage {
    private final ParticipantId participantId;
    private final String text;

    public OutboundMessage(ParticipantId participantId, String str) {
        this.participantId = participantId;
        this.text = str;
    }

    public static /* synthetic */ OutboundMessage copy$default(OutboundMessage outboundMessage, ParticipantId participantId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = outboundMessage.participantId;
        }
        if ((i & 2) != 0) {
            str = outboundMessage.text;
        }
        return outboundMessage.copy(participantId, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final OutboundMessage copy(ParticipantId participantId, String text) {
        return new OutboundMessage(participantId, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutboundMessage)) {
            return false;
        }
        OutboundMessage outboundMessage = (OutboundMessage) other;
        return tpa.f(this.participantId, outboundMessage.participantId) && tpa.f(this.text, outboundMessage.text);
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        ParticipantId participantId = this.participantId;
        return this.text.hashCode() + ((participantId == null ? 0 : participantId.hashCode()) * 31);
    }

    public String toString() {
        return "OutboundMessage(participantId=" + this.participantId + ", text=" + this.text + ")";
    }

    public /* synthetic */ OutboundMessage(ParticipantId participantId, String str, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : participantId, str);
    }
}
