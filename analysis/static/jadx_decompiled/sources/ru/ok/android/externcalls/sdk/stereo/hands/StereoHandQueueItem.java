package ru.ok.android.externcalls.sdk.stereo.hands;

import defpackage.tpa;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "", "participantId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "addedTs", "", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;J)V", "getAddedTs", "()J", "getParticipantId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StereoHandQueueItem {
    private final long addedTs;
    private final ParticipantId participantId;

    public StereoHandQueueItem(ParticipantId participantId, long j) {
        this.participantId = participantId;
        this.addedTs = j;
    }

    public static /* synthetic */ StereoHandQueueItem copy$default(StereoHandQueueItem stereoHandQueueItem, ParticipantId participantId, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = stereoHandQueueItem.participantId;
        }
        if ((i & 2) != 0) {
            j = stereoHandQueueItem.addedTs;
        }
        return stereoHandQueueItem.copy(participantId, j);
    }

    /* renamed from: component1, reason: from getter */
    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAddedTs() {
        return this.addedTs;
    }

    public final StereoHandQueueItem copy(ParticipantId participantId, long addedTs) {
        return new StereoHandQueueItem(participantId, addedTs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StereoHandQueueItem)) {
            return false;
        }
        StereoHandQueueItem stereoHandQueueItem = (StereoHandQueueItem) other;
        return tpa.f(this.participantId, stereoHandQueueItem.participantId) && this.addedTs == stereoHandQueueItem.addedTs;
    }

    public final long getAddedTs() {
        return this.addedTs;
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public int hashCode() {
        return Long.hashCode(this.addedTs) + (this.participantId.hashCode() * 31);
    }

    public String toString() {
        return "StereoHandQueueItem(participantId=" + this.participantId + ", addedTs=" + this.addedTs + ")";
    }
}
