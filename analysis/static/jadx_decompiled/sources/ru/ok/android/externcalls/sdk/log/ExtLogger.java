package ru.ok.android.externcalls.sdk.log;

import defpackage.au1;
import defpackage.b4a;
import defpackage.d4a;
import defpackage.d4c;
import defpackage.e0e;
import defpackage.e4a;
import java.util.Iterator;
import java.util.Map;
import ru.ok.android.ext.OneLogger;

/* loaded from: classes2.dex */
public class ExtLogger extends d4c {
    private static final String COLLECTOR = "ok.mobile.apps.video";
    private final String place;
    private final TimeProvider timeProvider;

    public interface TimeProvider {
        long getCurrentTimeMillis();
    }

    public ExtLogger(String str, TimeProvider timeProvider) {
        try {
            OneLogger.ensureInitialized();
        } catch (NoClassDefFoundError unused) {
        }
        this.place = str;
        this.timeProvider = timeProvider;
    }

    public static d4a simpleBuilder(e0e e0eVar) {
        d4a d4aVar = new d4a();
        d4aVar.b();
        d4aVar.a = COLLECTOR;
        d4aVar.b = 1;
        d4aVar.c = e0eVar != null ? e0eVar.a : null;
        d4aVar.d = 1;
        return d4aVar;
    }

    public static d4a simpleBuilderAny(String str) {
        d4a d4aVar = new d4a();
        d4aVar.b();
        d4aVar.a = COLLECTOR;
        d4aVar.b = 1;
        d4aVar.c = str;
        d4aVar.d = 1;
        return d4aVar;
    }

    public void log(e4a e4aVar) {
        e4aVar.getClass();
        Iterator it = b4a.a.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    @Override // defpackage.d4c
    public void logSimple(e0e e0eVar, String str, String str2) {
        d4a d4aVarSimpleBuilder = simpleBuilder(e0eVar);
        d4aVarSimpleBuilder.c("vcid", str);
        d4aVarSimpleBuilder.c("param", str2);
        d4aVarSimpleBuilder.d(this.timeProvider.getCurrentTimeMillis());
        log(d4aVarSimpleBuilder.a());
    }

    @Override // defpackage.d4c
    public long time() {
        return this.timeProvider.getCurrentTimeMillis();
    }

    public void log(e0e e0eVar, Map<String, String> map) {
        log(COLLECTOR, e0eVar.a, map);
    }

    @Override // defpackage.d4c
    public void log(String str, String str2, Map<String, String> map) {
        log(str, str2, map, null, null);
    }

    @Override // defpackage.d4c
    public void log(String str, long j, String str2, String str3) {
        d4a d4aVar = new d4a();
        d4aVar.b();
        d4aVar.a = COLLECTOR;
        d4aVar.b = 1;
        d4aVar.c = str;
        d4aVar.d = 1;
        d4aVar.d(j);
        if (str2 != null) {
            d4aVar.c("param", str2);
        }
        String str4 = this.place;
        if (str4 != null && "callStart".equals(str)) {
            d4aVar.c("place", str4);
        }
        if (str3 != null) {
            d4aVar.c("stat_type", str3);
        }
        log(d4aVar.a());
    }

    public void log(String str, String str2, Map<String, String> map, String str3, Long l) {
        d4a d4aVar = new d4a();
        d4aVar.b();
        d4aVar.a = str;
        d4aVar.b = 1;
        d4aVar.c = str2;
        d4aVar.d = 1;
        if (str3 != null) {
            d4aVar.f = str3;
            d4aVar.g = true;
        }
        if (l != null) {
            d4aVar.d(l.longValue());
        } else {
            d4aVar.d(this.timeProvider.getCurrentTimeMillis());
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            d4aVar.c(entry.getKey(), entry.getValue());
        }
        log(d4aVar.a());
    }
}
