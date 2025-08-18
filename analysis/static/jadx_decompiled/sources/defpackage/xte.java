package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class xte extends tvd {
    public static final Parcelable.Creator<xte> CREATOR = new etd(18);
    public final long a;
    public final long b;

    public xte(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long a(long j, yaf yafVar) {
        long jV = yafVar.v();
        if ((128 & jV) != 0) {
            return 8589934591L & ((((jV & 1) << 32) | yafVar.w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
