package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class yte extends uvd {
    public static final Parcelable.Creator<yte> CREATOR = new etd(19);
    public final long a;
    public final long b;

    public yte(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long a(long j, wpa wpaVar) {
        long jU = wpaVar.u();
        if ((128 & jU) != 0) {
            return 8589934591L & ((((jU & 1) << 32) | wpaVar.w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.uvd
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.a);
        sb.append(", playbackPositionUs= ");
        return zr6.k(sb, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
