package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class qia implements tia {
    public static final qia a = new qia();
    public static final Parcelable.Creator<qia> CREATOR = new fn9(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qia);
    }

    public final int hashCode() {
        return 1634881352;
    }

    public final String toString() {
        return "Chevron";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
