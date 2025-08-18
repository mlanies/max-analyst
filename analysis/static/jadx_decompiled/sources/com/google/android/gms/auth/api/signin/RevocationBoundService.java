package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import defpackage.qkg;

/* loaded from: classes.dex */
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            if (Log.isLoggable("RevocationService", 2)) {
                String strValueOf = String.valueOf(intent.getAction());
                if (strValueOf.length() != 0) {
                    "RevocationBoundService handling ".concat(strValueOf);
                }
            }
            return new qkg(this);
        }
        String strValueOf2 = String.valueOf(intent.getAction());
        if (strValueOf2.length() == 0) {
            return null;
        }
        "Unknown action sent to RevocationBoundService: ".concat(strValueOf2);
        return null;
    }
}
