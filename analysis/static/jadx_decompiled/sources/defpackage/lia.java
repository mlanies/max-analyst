package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class lia implements oia {
    public static final lia a = new lia();
    public static final Parcelable.Creator<lia> CREATOR = new fn9(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lia);
    }

    public final int hashCode() {
        return -2022406681;
    }

    public final String toString() {
        return "Empty";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
