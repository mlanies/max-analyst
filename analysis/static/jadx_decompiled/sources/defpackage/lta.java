package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class lta extends WorkRequest.Builder {
    public lta(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        h8g workSpec = getWorkSpec();
        long millis = timeUnit.toMillis(j);
        workSpec.getClass();
        String str = h8g.u;
        if (millis < 900000) {
            a14.u().R(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long jC = ote.c(millis, 900000L);
        long jC2 = ote.c(millis, 900000L);
        if (jC < 900000) {
            a14.u().R(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        workSpec.h = ote.c(jC, 900000L);
        if (jC2 < 300000) {
            a14.u().R(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (jC2 > workSpec.h) {
            a14.u().R(str, "Flex duration greater than interval duration; Changed to " + jC);
        }
        workSpec.i = ote.f(jC2, 300000L, workSpec.h);
    }

    @Override // androidx.work.WorkRequest.Builder
    public final WorkRequest buildInternal$work_runtime_release() {
        if (getBackoffCriteriaSet() && getWorkSpec().j.c) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }
        if (!getWorkSpec().q) {
            return new mta(getId(), getWorkSpec(), getTags$work_runtime_release());
        }
        throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
    }

    @Override // androidx.work.WorkRequest.Builder
    public final WorkRequest.Builder getThisObject$work_runtime_release() {
        return this;
    }
}
