package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ay7;
import defpackage.fp3;
import defpackage.n3;
import defpackage.qz7;
import defpackage.ufg;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LatLngBounds extends n3 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new ufg(14);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        fp3.o(latLng, "southwest must not be null.");
        fp3.o(latLng2, "northeast must not be null.");
        double d = latLng.a;
        Double dValueOf = Double.valueOf(d);
        double d2 = latLng2.a;
        fp3.h(d2 >= d, "southern latitude exceeds northern latitude (%s > %s)", dValueOf, Double.valueOf(d2));
        this.a = latLng;
        this.b = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        qz7 qz7Var = new qz7(this);
        qz7Var.h(this.a, "southwest");
        qz7Var.h(this.b, "northeast");
        return qz7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.P(parcel, 2, this.a, i);
        ay7.P(parcel, 3, this.b, i);
        ay7.W(parcel, iT);
    }
}
