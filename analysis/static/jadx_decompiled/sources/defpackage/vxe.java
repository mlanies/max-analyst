package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class vxe extends BroadcastReceiver {
    public wxe a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        wxe wxeVar = this.a;
        if (wxeVar == null) {
            return;
        }
        if (wxeVar.c()) {
            wxe wxeVar2 = this.a;
            ((uxe) wxeVar2.Y).f.schedule(wxeVar2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        }
    }
}
