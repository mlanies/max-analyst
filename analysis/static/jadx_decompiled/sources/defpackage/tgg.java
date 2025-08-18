package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class tgg extends idg {
    public a d;
    public final int e;

    public tgg(a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 4);
        this.d = aVar;
        this.e = i;
    }

    @Override // defpackage.idg
    public final boolean H0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) kgg.a(parcel, Bundle.CREATOR);
            kgg.b(parcel);
            fp3.o(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar = this.d;
            aVar.getClass();
            xhg xhgVar = new xhg(aVar, i2, strongBinder, bundle);
            vfg vfgVar = aVar.X;
            vfgVar.sendMessage(vfgVar.obtainMessage(1, this.e, -1, xhgVar));
            this.d = null;
        } else if (i == 2) {
            parcel.readInt();
            kgg.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            vig vigVar = (vig) kgg.a(parcel, vig.CREATOR);
            kgg.b(parcel);
            a aVar2 = this.d;
            fp3.o(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            fp3.n(vigVar);
            aVar2.F0 = vigVar;
            if (aVar2.t()) {
                wh3 wh3Var = vigVar.o;
                wmc wmcVarH = wmc.h();
                xmc xmcVar = wh3Var == null ? null : wh3Var.a;
                synchronized (wmcVarH) {
                    if (xmcVar == null) {
                        xmcVar = wmc.c;
                    } else {
                        xmc xmcVar2 = (xmc) wmcVarH.a;
                        if (xmcVar2 == null || xmcVar2.a < xmcVar.a) {
                        }
                    }
                    wmcVarH.a = xmcVar;
                }
            }
            Bundle bundle2 = vigVar.a;
            fp3.o(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar3 = this.d;
            aVar3.getClass();
            xhg xhgVar2 = new xhg(aVar3, i3, strongBinder2, bundle2);
            vfg vfgVar2 = aVar3.X;
            vfgVar2.sendMessage(vfgVar2.obtainMessage(1, this.e, -1, xhgVar2));
            this.d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
