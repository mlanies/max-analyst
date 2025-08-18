package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class ndg extends BroadcastReceiver {
    public Context a;
    public final djb b;

    public ndg(djb djbVar) {
        this.b = djbVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((gwe) this.b.c).getClass();
            throw null;
        }
    }
}
