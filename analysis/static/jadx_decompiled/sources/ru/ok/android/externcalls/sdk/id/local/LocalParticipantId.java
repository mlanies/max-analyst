package ru.ok.android.externcalls.sdk.id.local;

import defpackage.wg0;
import defpackage.z84;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "", "id", "", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LocalParticipantId {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicInteger sequence = new AtomicInteger(0);
    private final int id;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId$Companion;", "", "()V", "sequence", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextId", "Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final LocalParticipantId nextId() {
            return new LocalParticipantId(LocalParticipantId.sequence.getAndIncrement(), null);
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public /* synthetic */ LocalParticipantId(int i, z84 z84Var) {
        this(i);
    }

    public static /* synthetic */ LocalParticipantId copy$default(LocalParticipantId localParticipantId, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = localParticipantId.id;
        }
        return localParticipantId.copy(i);
    }

    public static final LocalParticipantId nextId() {
        return INSTANCE.nextId();
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final LocalParticipantId copy(int id) {
        return new LocalParticipantId(id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocalParticipantId) && this.id == ((LocalParticipantId) other).id;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return Integer.hashCode(this.id);
    }

    public String toString() {
        return wg0.g(this.id, "LocalParticipantId(id=", ")");
    }

    private LocalParticipantId(int i) {
        this.id = i;
    }
}
