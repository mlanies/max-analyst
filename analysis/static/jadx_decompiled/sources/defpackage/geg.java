package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class geg implements neg {
    public final /* synthetic */ int a;
    public final /* synthetic */ moa b;

    public /* synthetic */ geg(moa moaVar, int i) {
        this.a = i;
        this.b = moaVar;
    }

    @Override // defpackage.neg
    public final int a() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // defpackage.neg
    public final void b() {
        switch (this.a) {
            case 0:
                b9b b9bVar = (b9b) this.b.a;
                b9bVar.getClass();
                try {
                    yig yigVar = (yig) b9bVar.c;
                    yigVar.H0(yigVar.G0(), 15);
                    return;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            default:
                b9b b9bVar2 = (b9b) this.b.a;
                b9bVar2.getClass();
                try {
                    yig yigVar2 = (yig) b9bVar2.c;
                    yigVar2.H0(yigVar2.G0(), 5);
                    return;
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
        }
    }
}
