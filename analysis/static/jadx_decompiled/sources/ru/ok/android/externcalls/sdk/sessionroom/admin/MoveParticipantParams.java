package ru.ok.android.externcalls.sdk.sessionroom.admin;

import defpackage.z84;
import defpackage.zad;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000fB!\b\u0002\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "Lzad;", "toRoomId", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzad;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getParticipantId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lzad;", "getToRoomId", "()Lzad;", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MoveParticipantParams {
    private final ParticipantId participantId;
    private final zad toRoomId;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams$Builder;", "", "Lzad;", "toRoomId", "<init>", "(Lzad;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "setParticipantId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams$Builder;", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "build", "()Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "Lzad;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {
        private ParticipantId participantId;
        private final zad toRoomId;

        public Builder(zad zadVar) {
            this.toRoomId = zadVar;
        }

        public final MoveParticipantParams build() {
            return new MoveParticipantParams(this.participantId, this.toRoomId, null);
        }

        public final Builder setParticipantId(ParticipantId participantId) {
            this.participantId = participantId;
            return this;
        }
    }

    public /* synthetic */ MoveParticipantParams(ParticipantId participantId, zad zadVar, z84 z84Var) {
        this(participantId, zadVar);
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final zad getToRoomId() {
        return this.toRoomId;
    }

    private MoveParticipantParams(ParticipantId participantId, zad zadVar) {
        this.participantId = participantId;
        this.toRoomId = zadVar;
    }
}
