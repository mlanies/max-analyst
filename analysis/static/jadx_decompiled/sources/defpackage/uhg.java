package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class uhg extends sig {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhg(mig migVar, qne qneVar, qne qneVar2) {
        super(qneVar);
        this.c = qneVar2;
        this.o = migVar;
    }

    @Override // defpackage.sig
    public final void a() throws RemoteException {
        HashMap map;
        IInterface qggVar = null;
        switch (this.b) {
            case 0:
                try {
                    mig migVar = (mig) this.o;
                    vhg vhgVar = (vhg) migVar.a.m;
                    String str = migVar.b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = rig.a;
                    synchronized (rig.class) {
                        map = rig.a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    mig migVar2 = (mig) this.o;
                    qne qneVar = (qne) this.c;
                    String str2 = migVar2.b;
                    hig higVar = new hig(migVar2, qneVar);
                    qgg qggVar2 = (qgg) vhgVar;
                    qggVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i = egg.a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(higVar);
                    try {
                        qggVar2.c.transact(2, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    mig migVar3 = (mig) this.o;
                    qm4 qm4Var = mig.c;
                    Object[] objArr = {migVar3.b};
                    if (Log.isLoggable("PlayCore", 6)) {
                        qm4.d(qm4Var.a, "error requesting in-app review for %s", objArr);
                    } else {
                        qm4Var.getClass();
                    }
                    ((qne) this.c).c(new RuntimeException(e));
                    return;
                }
            default:
                int i2 = chg.d;
                IBinder iBinder = (IBinder) this.c;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    qggVar = iInterfaceQueryLocalInterface instanceof vhg ? (vhg) iInterfaceQueryLocalInterface : new qgg(iBinder);
                }
                hkg hkgVar = (hkg) this.o;
                mkg mkgVar = (mkg) hkgVar.b;
                mkgVar.m = qggVar;
                qm4 qm4Var2 = mkgVar.b;
                qm4Var2.b("linkToDeath", new Object[0]);
                try {
                    mkgVar.m.asBinder().linkToDeath(mkgVar.j, 0);
                } catch (RemoteException unused) {
                    Object[] objArr2 = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        qm4.d(qm4Var2.a, "linkToDeath failed", objArr2);
                    } else {
                        qm4Var2.getClass();
                    }
                }
                mkg mkgVar2 = (mkg) hkgVar.b;
                mkgVar2.g = false;
                Iterator it = mkgVar2.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                mkgVar2.d.clear();
                return;
        }
    }

    public uhg(hkg hkgVar, IBinder iBinder) {
        this.c = iBinder;
        this.o = hkgVar;
    }
}
