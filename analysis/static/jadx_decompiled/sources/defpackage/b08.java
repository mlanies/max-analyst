package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public class b08 {
    public final lfg a;

    public b08(lfg lfgVar) {
        this.a = lfgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b08)) {
            return false;
        }
        try {
            lfg lfgVar = this.a;
            lfg lfgVar2 = ((b08) obj).a;
            jfg jfgVar = (jfg) lfgVar;
            Parcel parcelG0 = jfgVar.G0();
            agg.c(parcelG0, lfgVar2);
            Parcel parcelR = jfgVar.R(parcelG0, 16);
            boolean z = parcelR.readInt() != 0;
            parcelR.recycle();
            return z;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            jfg jfgVar = (jfg) this.a;
            Parcel parcelR = jfgVar.R(jfgVar.G0(), 17);
            int i = parcelR.readInt();
            parcelR.recycle();
            return i;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
