package defpackage;

import androidx.work.OverwritingInputMerger;
import androidx.work.WorkRequest;

/* loaded from: classes.dex */
public final class qla extends WorkRequest.Builder {
    public qla(Class cls) {
        super(cls);
        getWorkSpec().d = OverwritingInputMerger.class.getName();
    }

    @Override // androidx.work.WorkRequest.Builder
    public final WorkRequest buildInternal$work_runtime_release() {
        if (getBackoffCriteriaSet() && getWorkSpec().j.c) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }
        return new rla(getId(), getWorkSpec(), getTags$work_runtime_release());
    }

    @Override // androidx.work.WorkRequest.Builder
    public final WorkRequest.Builder getThisObject$work_runtime_release() {
        return this;
    }
}
