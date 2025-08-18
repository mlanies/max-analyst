package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.a14;
import defpackage.qla;
import defpackage.rla;
import defpackage.s7g;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = a14.O("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        a14 a14VarU = a14.u();
        String str = a;
        a14VarU.n(str, "Requesting diagnostics");
        try {
            s7g.d(context).a((rla) new qla(DiagnosticsWorker.class).build());
        } catch (IllegalStateException e) {
            a14.u().r(str, "WorkManager is not initialized", e);
        }
    }
}
