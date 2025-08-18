package com.my.tracker.campaign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.my.tracker.obfuscated.a0;
import com.my.tracker.obfuscated.h;
import com.my.tracker.obfuscated.y0;
import defpackage.cu1;
import defpackage.f5;

/* loaded from: classes.dex */
public final class CampaignService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        y0.a("CampaignService: onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        y0.a("CampaignService: onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        cu1 cu1Var = new cu1(6, this);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                h.a(new f5(this, stringExtra, cu1Var, 14));
                return super.onStartCommand(null, i, i2);
            }
        }
        h.a(cu1Var);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a0.a(str, this, runnable);
    }
}
