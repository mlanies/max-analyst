package ru.ok.android.externcalls.analytics.config;

import defpackage.k56;
import defpackage.rd7;
import defpackage.z84;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;", "", "Lkotlin/Function0;", "", "appName", "<init>", "(Lk56;)V", "Lk56;", "getAppName", "()Lk56;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EventMetaParamsConfig {
    private final k56 appName;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements k56 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.k56
        public final Void invoke() {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventMetaParamsConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final k56 getAppName() {
        return this.appName;
    }

    public EventMetaParamsConfig(k56 k56Var) {
        this.appName = k56Var;
    }

    public /* synthetic */ EventMetaParamsConfig(k56 k56Var, int i, z84 z84Var) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : k56Var);
    }
}
