package ru.ok.android.externcalls.sdk.rate.internal;

import defpackage.f66;
import defpackage.m66;
import defpackage.p66;
import defpackage.tpa;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.rate.RateHint;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class RateManagerImpl$rttTrigger$1 implements RateHintCollection, m66 {
    final /* synthetic */ RateManagerImpl $tmp0;

    public RateManagerImpl$rttTrigger$1(RateManagerImpl rateManagerImpl) {
        this.$tmp0 = rateManagerImpl;
    }

    @Override // ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection
    public final void addRateHint(RateHint rateHint) {
        this.$tmp0.addRateHint(rateHint);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof RateHintCollection) && (obj instanceof m66)) {
            return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.m66
    public final f66 getFunctionDelegate() {
        return new p66(1, 0, RateManagerImpl.class, this.$tmp0, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
