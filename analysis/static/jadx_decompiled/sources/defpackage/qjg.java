package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public abstract class qjg extends BasePendingResult {
    public abstract void T(ok okVar);

    public final void U(Status status) {
        fp3.g("Failed result must not be success", !(status.a <= 0));
        S(P(status));
    }
}
