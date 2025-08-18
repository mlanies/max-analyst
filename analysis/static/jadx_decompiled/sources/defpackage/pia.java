package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class pia implements tia {
    public static final pia a = new pia();
    public static final Parcelable.Creator<pia> CREATOR = new fn9(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pia);
    }

    public final int hashCode() {
        return -1310310577;
    }

    public final String toString() {
        return "CancelBtn";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
