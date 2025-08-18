package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ay7;
import defpackage.n3;
import defpackage.nfg;
import defpackage.vqf;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LocationAvailability extends n3 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new vqf(17);
    public final nfg[] X;
    public final int a;
    public final int b;
    public final long c;
    public final int o;

    public LocationAvailability(int i, int i2, int i3, long j, nfg[] nfgVarArr) {
        this.o = i < 1000 ? 0 : 1000;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.X = nfgVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.o == locationAvailability.o && Arrays.equals(this.X, locationAvailability.X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.o)});
    }

    public final String toString() {
        boolean z = this.o < 1000;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b);
        ay7.X(parcel, 3, 8);
        parcel.writeLong(this.c);
        ay7.X(parcel, 4, 4);
        int i2 = this.o;
        parcel.writeInt(i2);
        ay7.R(parcel, 5, this.X, i);
        int i3 = i2 >= 1000 ? 0 : 1;
        ay7.X(parcel, 6, 4);
        parcel.writeInt(i3);
        ay7.W(parcel, iT);
    }
}
