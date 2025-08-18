package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class ri7 implements ej7 {
    public static final ri7 a = new ri7();
    public static final Parcelable.Creator<ri7> CREATOR = new dj6(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ri7);
    }

    public final int hashCode() {
        return 743554978;
    }

    public final String toString() {
        return "OpenApp";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
