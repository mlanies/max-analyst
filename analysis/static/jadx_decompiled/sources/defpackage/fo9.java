package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
public final class fo9 extends PhoneStateListener {
    public final /* synthetic */ go9 a;

    public fo9(go9 go9Var) {
        this.a = go9Var;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        go9.b(this.a, overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        String string = serviceState == null ? "" : serviceState.toString();
        go9.b(this.a, string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
    }
}
