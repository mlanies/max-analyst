package ru.ok.android.externcalls.sdk.asr_online;

import defpackage.bg1;
import defpackage.st;
import defpackage.tpa;
import defpackage.z84;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineChunk;", "", "participantId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "text", "", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/String;)V", "getParticipantId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AsrOnlineChunk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ParticipantId participantId;
    private final String text;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineChunk$Companion;", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lst;", "asrRecvDataPackage", "Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineChunk;", "chunkFromPackage$calls_sdk_release", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lst;)Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineChunk;", "chunkFromPackage", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        private Companion() {
        }

        public final AsrOnlineChunk chunkFromPackage$calls_sdk_release(ParticipantStore store, st asrRecvDataPackage) {
            bg1 bg1Var = asrRecvDataPackage.a;
            ConversationParticipant byInternal = bg1Var != null ? store.getByInternal(bg1Var) : null;
            return new AsrOnlineChunk(byInternal != null ? byInternal.getExternalId() : null, asrRecvDataPackage.b);
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public AsrOnlineChunk(ParticipantId participantId, String str) {
        this.participantId = participantId;
        this.text = str;
    }

    public static /* synthetic */ AsrOnlineChunk copy$default(AsrOnlineChunk asrOnlineChunk, ParticipantId participantId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = asrOnlineChunk.participantId;
        }
        if ((i & 2) != 0) {
            str = asrOnlineChunk.text;
        }
        return asrOnlineChunk.copy(participantId, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final AsrOnlineChunk copy(ParticipantId participantId, String text) {
        return new AsrOnlineChunk(participantId, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsrOnlineChunk)) {
            return false;
        }
        AsrOnlineChunk asrOnlineChunk = (AsrOnlineChunk) other;
        return tpa.f(this.participantId, asrOnlineChunk.participantId) && tpa.f(this.text, asrOnlineChunk.text);
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
        return "AsrOnlineChunk(participantId=" + this.participantId + ", text=" + this.text + ")";
    }
}
