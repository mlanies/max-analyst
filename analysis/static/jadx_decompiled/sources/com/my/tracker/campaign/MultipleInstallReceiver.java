package com.my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.my.tracker.obfuscated.y0;
import defpackage.au1;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class MultipleInstallReceiver extends BroadcastReceiver {
    private static final String a = CampaignReceiver.class.getName();
    private static final String b = MultipleInstallReceiver.class.getName();
    private static final AtomicBoolean c = new AtomicBoolean();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            return;
        }
        if (!c.compareAndSet(false, true)) {
            y0.a("MultipleInstallReceiver: attempt to call, but it was called before");
            return;
        }
        y0.a("MultipleInstallReceiver called");
        CampaignReceiver.a(context, intent);
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER").setPackage(context.getPackageName()), 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null) {
                String str = activityInfo.name;
                if (!a.equals(str) && !b.equals(str)) {
                    y0.a("MultipleInstallReceiver: trigger onReceive class " + str);
                    try {
                        ((BroadcastReceiver) Class.forName(str).newInstance()).onReceive(context, intent);
                    } catch (Throwable th) {
                        StringBuilder sbM = au1.m("MultipleInstallReceiver: error in BroadcastReceiver ", str, " : ");
                        sbM.append(th.getMessage());
                        y0.a(sbM.toString());
                    }
                }
            }
        }
    }
}
