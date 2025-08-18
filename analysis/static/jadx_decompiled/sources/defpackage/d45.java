package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d45 implements d99 {
    public static final Parcelable.Creator<d45> CREATOR;
    public static final qy5 Z;
    public static final qy5 s0;
    public final byte[] X;
    public int Y;
    public final String a;
    public final String b;
    public final long c;
    public final long o;

    static {
        ny5 ny5Var = new ny5();
        ny5Var.m = ia9.l("application/id3");
        Z = ny5Var.a();
        ny5 ny5Var2 = new ny5();
        ny5Var2.m = ia9.l("application/x-scte35");
        s0 = ny5Var2.a();
        CREATOR = new f73(18);
    }

    public d45(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.o = j2;
        this.X = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d45.class != obj.getClass()) {
            return false;
        }
        d45 d45Var = (d45) obj;
        return this.c == d45Var.c && this.o == d45Var.o && oaf.a(this.a, d45Var.a) && oaf.a(this.b, d45Var.b) && Arrays.equals(this.X, d45Var.X);
    }

    public final int hashCode() {
        if (this.Y == 0) {
            String str = this.a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.c;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.o;
            this.Y = Arrays.hashCode(this.X) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.Y;
    }

    @Override // defpackage.d99
    public final qy5 k() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return s0;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return Z;
            default:
                return null;
        }
    }

    @Override // defpackage.d99
    public final byte[] o() {
        if (k() != null) {
            return this.X;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.o + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeByteArray(this.X);
    }

    public d45(Parcel parcel) {
        String string = parcel.readString();
        int i = oaf.a;
        this.a = string;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.X = parcel.createByteArray();
    }
}
