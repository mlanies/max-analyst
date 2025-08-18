package ru.ok.android.externcalls.analytics.events;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005¨\u0006\u0006"}, d2 = {"toEventItemValue", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "", "", "", "", "calls-sdk-analytics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EventItemValueKt {
    public static final EventItemValue toEventItemValue(String str) {
        return EventItemValue.StringValue.m69boximpl(EventItemValue.StringValue.m70constructorimpl(str));
    }

    public static final EventItemValue toEventItemValue(int i) {
        return EventItemValue.IntValue.m55boximpl(EventItemValue.IntValue.m56constructorimpl(i));
    }

    public static final EventItemValue toEventItemValue(long j) {
        return EventItemValue.LongValue.m62boximpl(EventItemValue.LongValue.m63constructorimpl(j));
    }

    public static final EventItemValue toEventItemValue(float f) {
        return EventItemValue.FloatValue.m48boximpl(EventItemValue.FloatValue.m49constructorimpl(f));
    }
}
