package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
public final class eo9 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final ho9 a;

    public eo9(ho9 ho9Var) {
        this.a = ho9Var;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean z = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        ho9.g(z ? 10 : 5, this.a);
    }
}
