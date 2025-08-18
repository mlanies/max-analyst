package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class fia extends iia {
    public static final fia b = new fia(Long.MAX_VALUE);
    public static final Parcelable.Creator<fia> CREATOR = new fn9(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fia);
    }

    public final int hashCode() {
        return 1868500386;
    }

    public final String toString() {
        return "Indeterminate";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
