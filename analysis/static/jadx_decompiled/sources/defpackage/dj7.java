package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class dj7 implements ej7 {
    public static final dj7 a = new dj7();
    public static final Parcelable.Creator<dj7> CREATOR = new dj6(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dj7);
    }

    public final int hashCode() {
        return -939562363;
    }

    public final String toString() {
        return "UnknownFolderError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
