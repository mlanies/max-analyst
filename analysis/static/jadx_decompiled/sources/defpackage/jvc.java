package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class jvc extends BroadcastReceiver {
    public final HashSet a = new HashSet();

    public jvc(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                lqf lqfVar = (lqf) it.next();
                lqfVar.getClass();
                hm9.n("lqf", "onScreenOff");
                if (lqfVar.l) {
                    lqfVar.l = false;
                    if (lqfVar.k) {
                        lqfVar.a();
                    }
                }
            }
            return;
        }
        if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                lqf lqfVar2 = (lqf) it2.next();
                ir6 ir6Var = hm9.m;
                if (ir6Var != null) {
                    lqfVar2.getClass();
                    if (ir6Var.c()) {
                        ir6Var.d(us7.X, "lqf", "onScreenOn, isAppVisible=" + lqfVar2.k + ", isScreenOn=" + lqfVar2.l, null);
                    }
                }
                if (!lqfVar2.l) {
                    lqfVar2.l = true;
                    if (lqfVar2.k) {
                        lqfVar2.b();
                    }
                }
            }
        }
    }
}
