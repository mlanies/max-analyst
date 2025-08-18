package ru.ok.android.externcalls.analytics.internal.event;

import defpackage.kb7;
import defpackage.t1;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.events.EventItemValue;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/event/EventSerializer;", "", "<init>", "()V", "Lkb7;", "writer", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "value", "Le5f;", "writeValue", "(Lkb7;Lru/ok/android/externcalls/analytics/events/EventItemValue;)V", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "event", "serialize", "(Lkb7;Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)V", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EventSerializer {
    public static final EventSerializer INSTANCE = new EventSerializer();

    private EventSerializer() {
    }

    private final void writeValue(kb7 writer, EventItemValue value) {
        if (value instanceof EventItemValue.FloatValue) {
            Float fValueOf = Float.valueOf(((EventItemValue.FloatValue) value).m54unboximpl());
            t1 t1Var = (t1) writer;
            t1Var.getClass();
            t1Var.d(fValueOf.doubleValue());
            return;
        }
        if (value instanceof EventItemValue.IntValue) {
            int iM61unboximpl = ((EventItemValue.IntValue) value).m61unboximpl();
            t1 t1Var2 = (t1) writer;
            t1Var2.getClass();
            t1Var2.a(Integer.toString(iM61unboximpl));
            return;
        }
        if (!(value instanceof EventItemValue.LongValue)) {
            if (value instanceof EventItemValue.StringValue) {
                writer.i(((EventItemValue.StringValue) value).m75unboximpl());
            }
        } else {
            long jM68unboximpl = ((EventItemValue.LongValue) value).m68unboximpl();
            t1 t1Var3 = (t1) writer;
            t1Var3.getClass();
            t1Var3.a(Long.toString(jM68unboximpl));
        }
    }

    public final void serialize(kb7 writer, CallAnalyticsEvent event) {
        writer.s();
        for (Map.Entry<String, EventItemValue> entry : event.getItems().entrySet()) {
            writer.g0(entry.getKey());
            writeValue(writer, entry.getValue());
        }
        writer.q();
    }
}
