package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class h5b {
    public final qfg a;

    public h5b(qfg qfgVar) {
        fp3.n(qfgVar);
        this.a = qfgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h5b)) {
            return false;
        }
        try {
            qfg qfgVar = this.a;
            qfg qfgVar2 = ((h5b) obj).a;
            ofg ofgVar = (ofg) qfgVar;
            Parcel parcelG0 = ofgVar.G0();
            agg.c(parcelG0, qfgVar2);
            Parcel parcelR = ofgVar.R(parcelG0, 15);
            boolean z = parcelR.readInt() != 0;
            parcelR.recycle();
            return z;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            ofg ofgVar = (ofg) this.a;
            Parcel parcelR = ofgVar.R(ofgVar.G0(), 16);
            int i = parcelR.readInt();
            parcelR.recycle();
            return i;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
