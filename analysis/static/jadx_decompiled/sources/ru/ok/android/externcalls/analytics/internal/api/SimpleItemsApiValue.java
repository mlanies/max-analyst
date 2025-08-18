package ru.ok.android.externcalls.analytics.internal.api;

import defpackage.kb7;
import defpackage.sr0;
import java.io.IOException;
import java.util.Iterator;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.event.EventSerializer;

/* loaded from: classes2.dex */
public class SimpleItemsApiValue extends sr0 {
    private final Iterable<CallAnalyticsEvent> items;

    public SimpleItemsApiValue(Iterable<CallAnalyticsEvent> iterable) {
        this.items = iterable;
    }

    @Override // defpackage.sr0
    public void write(kb7 kb7Var) throws JsonSerializeException, IOException {
        kb7Var.u();
        Iterator<CallAnalyticsEvent> it = this.items.iterator();
        while (it.hasNext()) {
            EventSerializer.INSTANCE.serialize(kb7Var, it.next());
        }
        kb7Var.t();
    }
}
