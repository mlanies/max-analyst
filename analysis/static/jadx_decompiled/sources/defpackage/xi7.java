package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class xi7 implements ej7, cj7 {
    public static final Parcelable.Creator<xi7> CREATOR = new dj6(24);
    public final long a;
    public final String b;

    public xi7(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ej7, defpackage.cj7
    public final String m() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
    }
}
