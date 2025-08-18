package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lkg extends pjg {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ hkg c;

    public lkg(hkg hkgVar, IBinder iBinder) {
        this.c = hkgVar;
        this.b = iBinder;
    }

    @Override // defpackage.pjg
    public final void a() throws RemoteException {
        thg pggVar;
        hkg hkgVar = this.c;
        ykg ykgVar = (ykg) hkgVar.b;
        int i = jhg.d;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            pggVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            pggVar = iInterfaceQueryLocalInterface instanceof thg ? (thg) iInterfaceQueryLocalInterface : new pgg(iBinder);
        }
        ykgVar.m = pggVar;
        ykg ykgVar2 = (ykg) hkgVar.b;
        ykgVar2.b.b("linkToDeath", new Object[0]);
        try {
            ykgVar2.m.asBinder().linkToDeath(ykgVar2.j, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            boolean zIsLoggable = Log.isLoggable("PlayCore", 6);
            o97 o97Var = ykgVar2.b;
            if (zIsLoggable) {
                o97.c(o97Var.b, "linkToDeath failed", objArr);
            } else {
                o97Var.getClass();
            }
        }
        ykgVar2.g = false;
        Iterator it = ykgVar2.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ykgVar2.d.clear();
    }
}
