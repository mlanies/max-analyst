package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class ve6 extends BroadcastReceiver {
    public final /* synthetic */ we6 a;

    public ve6(we6 we6Var) {
        this.a = we6Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = extras != null ? (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
            we6 we6Var = this.a;
            if (status != null && status.a == 0) {
                j47.T(we6Var.d, null, null, new ue6(we6Var, extras, null), 3);
                return;
            }
            hm9.r(we6Var.e, new yx3("onMessageReceived: error; status = " + status + ", " + (extras != null ? extras.keySet() : null)), null, new Object[0]);
        }
    }
}
