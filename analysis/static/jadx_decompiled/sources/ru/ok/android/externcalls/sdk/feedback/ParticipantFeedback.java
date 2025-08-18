package ru.ok.android.externcalls.sdk.feedback;

import defpackage.tpa;
import defpackage.z84;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "", "key", "", "finishTimeMs", "", "participantId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "source", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "(Ljava/lang/String;JLru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;)V", "getFinishTimeMs", "()J", "getKey", "()Ljava/lang/String;", "getParticipantId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getSource", "()Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "equals", "", "other", "hashCode", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ParticipantFeedback {
    private final long finishTimeMs;
    private final String key;
    private final ParticipantId participantId;
    private final ParticipantFeedbackSource source;

    public ParticipantFeedback(String str, long j, ParticipantId participantId, ParticipantFeedbackSource participantFeedbackSource) {
        this.key = str;
        this.finishTimeMs = j;
        this.participantId = participantId;
        this.source = participantFeedbackSource;
    }

    public boolean equals(Object other) {
        if (other instanceof ParticipantFeedback) {
            return tpa.f(this.participantId, ((ParticipantFeedback) other).participantId);
        }
        return false;
    }

    public final long getFinishTimeMs() {
        return this.finishTimeMs;
    }

    public final String getKey() {
        return this.key;
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final ParticipantFeedbackSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.participantId.hashCode();
    }

    public /* synthetic */ ParticipantFeedback(String str, long j, ParticipantId participantId, ParticipantFeedbackSource participantFeedbackSource, int i, z84 z84Var) {
        this(str, j, participantId, (i & 8) != 0 ? ParticipantFeedbackSource.UNKNOWN : participantFeedbackSource);
    }
}
