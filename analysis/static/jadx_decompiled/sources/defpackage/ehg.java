package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class ehg implements ServiceConnection {
    public final int a;
    public final /* synthetic */ a b;

    public ehg(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder == null) {
            a aVar = this.b;
            synchronized (aVar.Y) {
                i = aVar.x0;
            }
            if (i == 3) {
                aVar.E0 = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            vfg vfgVar = aVar.X;
            vfgVar.sendMessage(vfgVar.obtainMessage(i2, aVar.G0.get(), 16));
            return;
        }
        synchronized (this.b.Z) {
            try {
                a aVar2 = this.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.s0 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ffg)) ? new ffg(iBinder) : (ffg) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVar3 = this.b;
        int i3 = this.a;
        aVar3.getClass();
        cig cigVar = new cig(aVar3, 0);
        vfg vfgVar2 = aVar3.X;
        vfgVar2.sendMessage(vfgVar2.obtainMessage(7, i3, -1, cigVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar;
        synchronized (this.b.Z) {
            aVar = this.b;
            aVar.s0 = null;
        }
        int i = this.a;
        vfg vfgVar = aVar.X;
        vfgVar.sendMessage(vfgVar.obtainMessage(6, i, 1));
    }
}
