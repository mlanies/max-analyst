package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.d9b;
import defpackage.hc0;
import defpackage.kc;
import defpackage.o2f;
import defpackage.t05;
import defpackage.t8f;
import defpackage.vq7;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter(LogFactory.PRIORITY_KEY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        o2f.b(context);
        vq7 vq7VarA = hc0.a();
        vq7VarA.t(queryParameter);
        vq7VarA.o = d9b.b(iIntValue);
        if (queryParameter2 != null) {
            vq7VarA.c = Base64.decode(queryParameter2, 0);
        }
        t8f t8fVar = o2f.a().d;
        hc0 hc0VarJ = vq7VarA.j();
        kc kcVar = new kc(0);
        t8fVar.getClass();
        t8fVar.e.execute(new t05(t8fVar, hc0VarJ, i, kcVar));
    }
}
