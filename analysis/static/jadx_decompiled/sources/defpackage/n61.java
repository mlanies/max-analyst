package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes2.dex */
public final class n61 implements m61 {
    public static final List e = Collections.singletonList("rtt");
    public final CallAnalyticsSender a;
    public final vte b;
    public EventItemsMap c;
    public final ArrayList d = new ArrayList();

    public n61(CallAnalyticsSender callAnalyticsSender, wte wteVar) {
        this.a = callAnalyticsSender;
        this.b = wteVar;
    }

    public final void b(zag zagVar, EventItemsMap eventItemsMap) {
        long jLongValue;
        EventItemsMap eventItemsMap2 = zagVar.c;
        eventItemsMap2.addAll(eventItemsMap);
        Long l = zagVar.d;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            vte vteVar = this.b;
            Long lA = ((wte) vteVar).a();
            if (lA != null) {
                l = lA;
                jLongValue = l.longValue();
            } else {
                ((wte) vteVar).getClass();
                jLongValue = System.currentTimeMillis();
            }
        }
        this.a.send(new SdkMetricStatEvent.Builder(zagVar.a, zagVar.b).addAll(eventItemsMap2.getItems()).set("timestamp", Long.valueOf(jLongValue)).build());
    }

    public final void c(String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
        zag zagVar = new zag(str, eventItemValue, eventItemsMap, ((wte) this.b).a());
        EventItemsMap eventItemsMap2 = this.c;
        if (eventItemsMap2 == null) {
            this.d.add(zagVar);
        } else {
            b(zagVar, eventItemsMap2);
        }
    }
}
