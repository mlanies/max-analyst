package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class weg extends n3 {
    public static final Parcelable.Creator<weg> CREATOR = new vqf(12);
    public final boolean X;
    public final int a;
    public final IBinder b;
    public final ph3 c;
    public final boolean o;

    public weg(int i, IBinder iBinder, ph3 ph3Var, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = ph3Var;
        this.o = z;
        this.X = z2;
    }

    public final boolean equals(Object obj) {
        Object rkgVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof weg)) {
            return false;
        }
        weg wegVar = (weg) obj;
        if (this.c.equals(wegVar.c)) {
            Object rkgVar2 = null;
            IBinder iBinder = this.b;
            if (iBinder == null) {
                rkgVar = null;
            } else {
                int i = w4.d;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                rkgVar = iInterfaceQueryLocalInterface instanceof dr6 ? (dr6) iInterfaceQueryLocalInterface : new rkg(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = wegVar.b;
            if (iBinder2 != null) {
                int i2 = w4.d;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                rkgVar2 = iInterfaceQueryLocalInterface2 instanceof dr6 ? (dr6) iInterfaceQueryLocalInterface2 : new rkg(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (s36.l(rkgVar, rkgVar2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.O(parcel, 2, this.b);
        ay7.P(parcel, 3, this.c, i);
        ay7.X(parcel, 4, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ay7.X(parcel, 5, 4);
        parcel.writeInt(this.X ? 1 : 0);
        ay7.W(parcel, iT);
    }
}
