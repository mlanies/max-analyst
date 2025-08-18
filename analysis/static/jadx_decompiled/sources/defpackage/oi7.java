package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class oi7 implements ej7 {
    public static final oi7 a = new oi7();
    public static final Parcelable.Creator<oi7> CREATOR = new dj6(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof oi7);
    }

    public final int hashCode() {
        return 308928755;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
