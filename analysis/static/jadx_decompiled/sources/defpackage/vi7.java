package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class vi7 implements ej7 {
    public static final vi7 a = new vi7();
    public static final Parcelable.Creator<vi7> CREATOR = new dj6(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vi7);
    }

    public final int hashCode() {
        return 1079494498;
    }

    public final String toString() {
        return "Progress";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
