package defpackage;

import android.os.Bundle;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* loaded from: classes.dex */
public final class p41 implements k64 {
    public final /* synthetic */ Bundle a;

    public p41(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.k64
    public final Object a() {
        Bundle bundle = this.a;
        return new CallRateBottomSheet(i24.F("call_id", bundle), i24.A("is_video", bundle), bundle.containsKey("sdk_reasons") ? w9e.Q0(i24.F("sdk_reasons", bundle), new String[]{","}, true, 4) : null);
    }
}
