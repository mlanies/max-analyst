package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class cfd extends hfd {
    public static final cfd a = new cfd();
    public static final Parcelable.Creator<cfd> CREATOR = new e9b(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cfd);
    }

    public final int hashCode() {
        return 1237842843;
    }

    public final String toString() {
        return "Arrow";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
