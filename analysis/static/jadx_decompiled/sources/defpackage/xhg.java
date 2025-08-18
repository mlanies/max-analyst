package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class xhg extends bfg {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhg(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // defpackage.bfg
    public final void b(ph3 ph3Var) {
        gpf gpfVar = this.h.z0;
        if (gpfVar != null) {
            ((he6) gpfVar.a).k(ph3Var);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.bfg
    public final boolean c() throws RemoteException {
        IInterface iInterfaceL;
        IBinder iBinder = this.g;
        try {
            fp3.n(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.h;
            if (aVar.p().equals(interfaceDescriptor) && (iInterfaceL = aVar.l(iBinder)) != null && (a.u(aVar, 2, 4, iInterfaceL) || a.u(aVar, 3, 4, iInterfaceL))) {
                aVar.D0 = null;
                oof oofVar = aVar.y0;
                if (oofVar == null) {
                    return true;
                }
                ((ge6) oofVar.a).onConnected();
                return true;
            }
        } catch (RemoteException unused) {
        }
        return false;
    }
}
