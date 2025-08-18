package defpackage;

import java.time.Clock;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.log.stat.StatisticsManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class dw3 implements StatisticsManager.TimeProvider, ExtLogger.TimeProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Clock b;

    public /* synthetic */ dw3(Clock clock, int i) {
        this.a = i;
        this.b = clock;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.StatisticsManager.TimeProvider, ru.ok.android.externcalls.sdk.log.ExtLogger.TimeProvider
    public final long getCurrentTimeMillis() {
        int i = this.a;
        Clock clock = this.b;
        switch (i) {
        }
        return clock.millis();
    }
}
