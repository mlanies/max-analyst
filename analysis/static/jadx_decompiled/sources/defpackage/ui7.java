package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class ui7 implements ej7 {
    public static final Parcelable.Creator<ui7> CREATOR = new dj6(21);
    public final long a;
    public final String b;

    public ui7(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
    }
}
