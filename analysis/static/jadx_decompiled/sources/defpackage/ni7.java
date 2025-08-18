package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class ni7 implements ej7 {
    public static final Parcelable.Creator<ni7> CREATOR = new dj6(14);
    public final long a;
    public final String b;
    public final boolean c;
    public final String o;

    public ni7(long j, String str, String str2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.o = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.o);
    }
}
