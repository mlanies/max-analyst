package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class gia extends iia {
    public static final gia b = new gia(3500);
    public static final Parcelable.Creator<gia> CREATOR = new fn9(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gia);
    }

    public final int hashCode() {
        return -383399562;
    }

    public final String toString() {
        return "Standard";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
