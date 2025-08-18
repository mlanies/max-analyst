package ru.ok.android.externcalls.sdk.feedback;

import defpackage.u25;
import defpackage.v25;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "", "(Ljava/lang/String;I)V", "USER_CLICK", "GESTURES", "UNKNOWN", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ParticipantFeedbackSource {
    private static final /* synthetic */ u25 $ENTRIES;
    private static final /* synthetic */ ParticipantFeedbackSource[] $VALUES;
    public static final ParticipantFeedbackSource USER_CLICK = new ParticipantFeedbackSource("USER_CLICK", 0);
    public static final ParticipantFeedbackSource GESTURES = new ParticipantFeedbackSource("GESTURES", 1);
    public static final ParticipantFeedbackSource UNKNOWN = new ParticipantFeedbackSource("UNKNOWN", 2);

    private static final /* synthetic */ ParticipantFeedbackSource[] $values() {
        return new ParticipantFeedbackSource[]{USER_CLICK, GESTURES, UNKNOWN};
    }

    static {
        ParticipantFeedbackSource[] participantFeedbackSourceArr$values = $values();
        $VALUES = participantFeedbackSourceArr$values;
        $ENTRIES = new v25(participantFeedbackSourceArr$values);
    }

    private ParticipantFeedbackSource(String str, int i) {
    }

    public static u25 getEntries() {
        return $ENTRIES;
    }

    public static ParticipantFeedbackSource valueOf(String str) {
        return (ParticipantFeedbackSource) Enum.valueOf(ParticipantFeedbackSource.class, str);
    }

    public static ParticipantFeedbackSource[] values() {
        return (ParticipantFeedbackSource[]) $VALUES.clone();
    }
}
