package ru.ok.android.externcalls.sdk.chat.message;

import defpackage.jz6;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/message/InboundMessageMapper;", "", "<init>", "()V", "Ljz6;", "inboundMessageInternal", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "Lru/ok/android/externcalls/sdk/chat/message/InboundMessage;", "fromInternal", "(Ljz6;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)Lru/ok/android/externcalls/sdk/chat/message/InboundMessage;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class InboundMessageMapper {
    public static final InboundMessageMapper INSTANCE = new InboundMessageMapper();

    private InboundMessageMapper() {
    }

    public final InboundMessage fromInternal(jz6 inboundMessageInternal, ParticipantStore participantStore) {
        ConversationParticipant byInternal = participantStore.getByInternal(inboundMessageInternal.a);
        return new InboundMessage(byInternal != null ? byInternal.getExternalId() : null, inboundMessageInternal.b, inboundMessageInternal.c);
    }
}
