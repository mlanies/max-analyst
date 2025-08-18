package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class ajg implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ajg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                mkg mkgVar = (mkg) obj;
                mkgVar.b.b("reportBinderDeath", new Object[0]);
                au1.r(mkgVar.i.get());
                mkgVar.b.b("%s : Binder has died.", mkgVar.c);
                Iterator it = mkgVar.d.iterator();
                while (it.hasNext()) {
                    sig sigVar = (sig) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(mkgVar.c).concat(" : Binder has died."));
                    qne qneVar = sigVar.a;
                    if (qneVar != null) {
                        qneVar.c(remoteException);
                    }
                }
                mkgVar.d.clear();
                synchronized (mkgVar.f) {
                    mkgVar.c();
                }
                return;
            default:
                ykg ykgVar = (ykg) obj;
                ykgVar.b.b("reportBinderDeath", new Object[0]);
                au1.r(ykgVar.i.get());
                ykgVar.b.b("%s : Binder has died.", ykgVar.c);
                Iterator it2 = ykgVar.d.iterator();
                while (it2.hasNext()) {
                    pjg pjgVar = (pjg) it2.next();
                    RemoteException remoteException2 = new RemoteException(String.valueOf(ykgVar.c).concat(" : Binder has died."));
                    qne qneVar2 = pjgVar.a;
                    if (qneVar2 != null) {
                        qneVar2.c(remoteException2);
                    }
                }
                ykgVar.d.clear();
                synchronized (ykgVar.f) {
                    ykgVar.d();
                }
                return;
        }
    }
}
