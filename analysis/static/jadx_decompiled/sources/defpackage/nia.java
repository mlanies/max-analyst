package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class nia implements oia {
    public static final nia a = new nia();
    public static final Parcelable.Creator<nia> CREATOR = new fn9(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nia);
    }

    public final int hashCode() {
        return -2008676385;
    }

    public final String toString() {
        return "Timer";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
