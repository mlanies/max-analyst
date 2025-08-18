package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class wi7 implements ej7, cj7 {
    public static final Parcelable.Creator<wi7> CREATOR = new dj6(23);
    public final long a;
    public final long b;
    public final String c;

    public wi7(long j, String str, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ej7, defpackage.cj7
    public final String m() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
    }
}
