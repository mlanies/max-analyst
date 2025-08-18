package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class mhg extends n3 {
    public static final Parcelable.Creator<mhg> CREATOR = new ufg(9);
    public final PendingIntent X;
    public final ekg Y;
    public final String Z;
    public final int a;
    public final lhg b;
    public final alg c;
    public final tkg o;

    public mhg(int i, lhg lhgVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        alg xkgVar;
        tkg okgVar;
        this.a = i;
        this.b = lhgVar;
        ekg ujgVar = null;
        if (iBinder != null) {
            int i2 = zkg.d;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            xkgVar = iInterfaceQueryLocalInterface instanceof alg ? (alg) iInterfaceQueryLocalInterface : new xkg(iBinder, "com.google.android.gms.location.ILocationListener", 2);
        } else {
            xkgVar = null;
        }
        this.c = xkgVar;
        this.X = pendingIntent;
        if (iBinder2 != null) {
            int i3 = ahg.e;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            okgVar = iInterfaceQueryLocalInterface2 instanceof tkg ? (tkg) iInterfaceQueryLocalInterface2 : new okg(iBinder2, "com.google.android.gms.location.ILocationCallback", 2);
        } else {
            okgVar = null;
        }
        this.o = okgVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            ujgVar = iInterfaceQueryLocalInterface3 instanceof ekg ? (ekg) iInterfaceQueryLocalInterface3 : new ujg(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 2);
        }
        this.Y = ujgVar;
        this.Z = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.P(parcel, 2, this.b, i);
        alg algVar = this.c;
        ay7.O(parcel, 3, algVar == null ? null : algVar.asBinder());
        ay7.P(parcel, 4, this.X, i);
        tkg tkgVar = this.o;
        ay7.O(parcel, 5, tkgVar == null ? null : tkgVar.asBinder());
        ekg ekgVar = this.Y;
        ay7.O(parcel, 6, ekgVar != null ? ekgVar.asBinder() : null);
        ay7.Q(parcel, 8, this.Z);
        ay7.W(parcel, iT);
    }
}
