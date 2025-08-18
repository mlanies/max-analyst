package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class hhg extends cdg {
    public final sfg I0() {
        sfg sfgVar;
        Parcel parcelR = R(G0(), 4);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            sfgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            sfgVar = iInterfaceQueryLocalInterface instanceof sfg ? (sfg) iInterfaceQueryLocalInterface : new sfg(strongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 3);
        }
        parcelR.recycle();
        return sfgVar;
    }

    public final yig J0(oy9 oy9Var) {
        yig yigVar;
        Parcel parcelG0 = G0();
        agg.c(parcelG0, oy9Var);
        Parcel parcelR = R(parcelG0, 2);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            yigVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            yigVar = iInterfaceQueryLocalInterface instanceof yig ? (yig) iInterfaceQueryLocalInterface : new yig(strongBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate", 3);
        }
        parcelR.recycle();
        return yigVar;
    }

    public final xig K0() {
        xig kigVar;
        Parcel parcelR = R(G0(), 5);
        IBinder strongBinder = parcelR.readStrongBinder();
        int i = qig.d;
        if (strongBinder == null) {
            kigVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            kigVar = iInterfaceQueryLocalInterface instanceof xig ? (xig) iInterfaceQueryLocalInterface : new kig(strongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 3);
        }
        parcelR.recycle();
        return kigVar;
    }
}
