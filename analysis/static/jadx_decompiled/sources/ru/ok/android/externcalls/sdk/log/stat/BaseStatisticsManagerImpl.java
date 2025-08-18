package ru.ok.android.externcalls.sdk.log.stat;

import defpackage.au1;
import defpackage.b4a;
import defpackage.d4a;
import defpackage.e4a;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.ext.OneLogger;
import ru.ok.android.externcalls.sdk.log.stat.item.StatItem;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/BaseStatisticsManagerImpl;", "Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;", "S", "Lru/ok/android/externcalls/sdk/log/stat/StatisticsManager;", "<init>", "()V", "", "timestamp", "getTime", "(J)J", "statItem", "Le5f;", "sendStat", "(Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;)V", "Le4a;", "makeState", "(Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;)Le4a;", "Ld4a;", "builder", "setStat", "(Ld4a;Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;)Ld4a;", "", "", "custom", "setCustom", "(Ld4a;Ljava/util/Map;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class BaseStatisticsManagerImpl<S extends StatItem> implements StatisticsManager<S> {
    public BaseStatisticsManagerImpl() {
        try {
            OneLogger.ensureInitialized();
        } catch (NoClassDefFoundError unused) {
        }
    }

    public abstract long getTime(long timestamp);

    public e4a makeState(S statItem) {
        d4a d4aVar = new d4a();
        d4aVar.b();
        return setStat(d4aVar, statItem).a();
    }

    public void sendStat(S statItem) {
        makeState(statItem).getClass();
        Iterator it = b4a.a.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public void setCustom(d4a builder, Map<String, String> custom) {
        for (Map.Entry<String, String> entry : custom.entrySet()) {
            builder.c(entry.getKey(), entry.getValue());
        }
    }

    public d4a setStat(d4a builder, S statItem) {
        setCustom(builder, statItem.getCustom());
        builder.a = statItem.getCollector();
        builder.b = statItem.getType();
        builder.c = statItem.getOperation();
        builder.d(getTime(statItem.getTimestamp()));
        return builder;
    }
}
