package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class zm extends dle {
    public final /* synthetic */ dn X;
    public final Object Y;
    public final /* synthetic */ int o = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(dn dnVar, vq7 vq7Var) {
        super(dnVar);
        this.X = dnVar;
        this.Y = vq7Var;
    }

    @Override // defpackage.dle
    public final IntentFilter A() {
        switch (this.o) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // defpackage.dle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int D() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm.D():int");
    }

    @Override // defpackage.dle
    public final void X() throws PackageManager.NameNotFoundException {
        switch (this.o) {
            case 0:
                this.X.k(true, true);
                break;
            default:
                this.X.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(dn dnVar, Context context) {
        super(dnVar);
        this.X = dnVar;
        this.Y = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
