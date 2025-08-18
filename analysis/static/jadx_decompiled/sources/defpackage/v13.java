package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class v13 {
    public final ojg a;

    public v13(ojg ojgVar) {
        fp3.n(ojgVar);
        this.a = ojgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v13)) {
            return false;
        }
        try {
            ojg ojgVar = this.a;
            ojg ojgVar2 = ((v13) obj).a;
            fjg fjgVar = (fjg) ojgVar;
            Parcel parcelG0 = fjgVar.G0();
            agg.c(parcelG0, ojgVar2);
            Parcel parcelR = fjgVar.R(parcelG0, 17);
            boolean z = parcelR.readInt() != 0;
            parcelR.recycle();
            return z;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            fjg fjgVar = (fjg) this.a;
            Parcel parcelR = fjgVar.R(fjgVar.G0(), 18);
            int i = parcelR.readInt();
            parcelR.recycle();
            return i;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
