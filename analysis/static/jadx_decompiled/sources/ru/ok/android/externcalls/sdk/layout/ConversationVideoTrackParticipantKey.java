package ru.ok.android.externcalls.sdk.layout;

import defpackage.cd9;
import defpackage.olf;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes2.dex */
public class ConversationVideoTrackParticipantKey {
    private final cd9 movieId;
    private final ParticipantId participantId;
    private final olf type;

    public static class Builder {
        private cd9 movieId;
        private ParticipantId participantId;
        private olf type = olf.a;

        public ConversationVideoTrackParticipantKey build() {
            Objects.requireNonNull(this.participantId);
            Objects.requireNonNull(this.type);
            return new ConversationVideoTrackParticipantKey(this, 0);
        }

        public Builder setMovieId(cd9 cd9Var) {
            this.movieId = cd9Var;
            return this;
        }

        public Builder setParticipantId(ParticipantId participantId) {
            this.participantId = participantId;
            return this;
        }

        public Builder setType(olf olfVar) {
            this.type = olfVar;
            return this;
        }
    }

    public /* synthetic */ ConversationVideoTrackParticipantKey(Builder builder, int i) {
        this(builder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = (ConversationVideoTrackParticipantKey) obj;
        return this.participantId.equals(conversationVideoTrackParticipantKey.participantId) && this.type == conversationVideoTrackParticipantKey.type && Objects.equals(this.movieId, conversationVideoTrackParticipantKey.movieId);
    }

    public cd9 getMovieId() {
        return this.movieId;
    }

    public ParticipantId getParticipantId() {
        return this.participantId;
    }

    public olf getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.participantId, this.type, this.movieId);
    }

    public String toString() {
        return "ConversationVideoTrackParticipantKey{participantId=" + this.participantId + ", type=" + this.type + ", movieId=" + this.movieId + '}';
    }

    private ConversationVideoTrackParticipantKey(Builder builder) {
        this.participantId = builder.participantId;
        this.type = builder.type;
        this.movieId = builder.movieId;
    }
}
