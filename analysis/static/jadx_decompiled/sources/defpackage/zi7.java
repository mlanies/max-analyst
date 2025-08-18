package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zi7 implements ej7 {
    public static final zi7 a = new zi7();
    public static final Parcelable.Creator<zi7> CREATOR = new dj6(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zi7);
    }

    public final int hashCode() {
        return 1867749234;
    }

    public final String toString() {
        return "ShowContactRemoved";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
