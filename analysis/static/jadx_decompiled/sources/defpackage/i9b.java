package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i9b extends tvd {
    public static final Parcelable.Creator<i9b> CREATOR = new e9b(2);
    public final long a;
    public final long b;
    public final byte[] c;

    public i9b(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    public i9b(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = maf.a;
        this.c = bArrCreateByteArray;
    }
}
