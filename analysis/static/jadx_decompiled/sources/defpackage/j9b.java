package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j9b extends uvd {
    public static final Parcelable.Creator<j9b> CREATOR = new e9b(3);
    public final long a;
    public final long b;
    public final byte[] c;

    public j9b(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    @Override // defpackage.uvd
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.a);
        sb.append(", identifier= ");
        return zr6.k(sb, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    public j9b(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = oaf.a;
        this.c = bArrCreateByteArray;
    }
}
