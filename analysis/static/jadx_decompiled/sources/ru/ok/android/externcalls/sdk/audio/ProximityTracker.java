package ru.ok.android.externcalls.sdk.audio;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "", "Le5f;", "stopTrackingProximity", "()V", "startTrackingProximity", "", "getCanUseSpeaker", "()Z", "canUseSpeaker", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface ProximityTracker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/ProximityTracker$Companion;", "", "()V", "NOOP", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "getNOOP$calls_audiomanager_release", "()Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ProximityTracker NOOP = new ProximityTracker() { // from class: ru.ok.android.externcalls.sdk.audio.ProximityTracker$Companion$NOOP$1
        };

        private Companion() {
        }

        public final ProximityTracker getNOOP$calls_audiomanager_release() {
            return NOOP;
        }
    }

    default boolean getCanUseSpeaker() {
        return true;
    }

    default void startTrackingProximity() {
    }

    default void stopTrackingProximity() {
    }
}
