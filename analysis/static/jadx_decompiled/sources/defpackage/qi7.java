package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class qi7 implements ej7 {
    public static final qi7 a = new qi7();
    public static final Parcelable.Creator<qi7> CREATOR = new dj6(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qi7);
    }

    public final int hashCode() {
        return 1103229132;
    }

    public final String toString() {
        return "ItsYou";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
