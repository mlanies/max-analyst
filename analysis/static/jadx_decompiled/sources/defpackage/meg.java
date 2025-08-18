package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class meg extends BasePendingResult {
    public final rjc o;

    public meg(Status status) {
        super(null);
        this.o = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final rjc P(Status status) {
        return this.o;
    }
}
