package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;

/* loaded from: classes.dex */
public final class fdg implements wsa {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ aab b;

    public fdg(aab aabVar, BasePendingResult basePendingResult) {
        this.b = aabVar;
        this.a = basePendingResult;
    }

    @Override // defpackage.wsa
    public final void a(Status status) {
        ((Map) this.b.a).remove(this.a);
    }
}
