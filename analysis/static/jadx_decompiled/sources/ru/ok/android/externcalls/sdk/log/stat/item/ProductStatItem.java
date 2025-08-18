package ru.ok.android.externcalls.sdk.log.stat.item;

import defpackage.oz4;
import defpackage.z84;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.log.stat.item.StatItem;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0015B;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;", "Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;", "collector", "", "type", "", "operation", "timestamp", "", "custom", "", "(Ljava/lang/String;ILjava/lang/String;JLjava/util/Map;)V", "getCollector", "()Ljava/lang/String;", "getCustom", "()Ljava/util/Map;", "getOperation", "getTimestamp", "()J", "getType", "()I", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductStatItem implements StatItem {
    private final String collector;
    private final Map<String, String> custom;
    private final String operation;
    private final long timestamp;
    private final int type;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u001a\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem$Builder;", "Lru/ok/android/externcalls/sdk/log/stat/item/StatItem$Builder;", "()V", "collector", "", "custom", "", "operation", "timestamp", "", "type", "", "build", "Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;", "setCollector", "setCustom", "setOperation", "setTimestamp", "setType", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder implements StatItem.Builder {
        public static final String DEFAULT_COLLECTOR = "app.vchat.events.product";
        public static final int DEFAULT_TYPE = 1;
        public static final String EMPTY_OPERATION = "";
        public static final long EMPTY_TIMESTAMP = -1;
        private String collector = DEFAULT_COLLECTOR;
        private int type = 1;
        private String operation = "";
        private long timestamp = -1;
        private Map<String, String> custom = oz4.a;

        public final Builder setCollector(String collector) {
            this.collector = collector;
            return this;
        }

        public final Builder setCustom(Map<String, String> custom) {
            this.custom = custom;
            return this;
        }

        public final Builder setOperation(String operation) {
            this.operation = operation;
            return this;
        }

        public final Builder setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public final Builder setType(int type) {
            this.type = type;
            return this;
        }

        @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem.Builder
        public ProductStatItem build() {
            return new ProductStatItem(this.collector, this.type, this.operation, this.timestamp, this.custom, null);
        }
    }

    public /* synthetic */ ProductStatItem(String str, int i, String str2, long j, Map map, z84 z84Var) {
        this(str, i, str2, j, map);
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public String getCollector() {
        return this.collector;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public Map<String, String> getCustom() {
        return this.custom;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public String getOperation() {
        return this.operation;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public int getType() {
        return this.type;
    }

    private ProductStatItem(String str, int i, String str2, long j, Map<String, String> map) {
        this.collector = str;
        this.type = i;
        this.operation = str2;
        this.timestamp = j;
        this.custom = map;
    }
}
