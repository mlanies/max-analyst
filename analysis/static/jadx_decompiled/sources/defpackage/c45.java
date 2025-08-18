package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c45 implements c99 {
    public static final Parcelable.Creator<c45> CREATOR;
    public static final oy5 Z;
    public static final oy5 s0;
    public final byte[] X;
    public int Y;
    public final String a;
    public final String b;
    public final long c;
    public final long o;

    static {
        my5 my5Var = new my5();
        my5Var.k = "application/id3";
        Z = my5Var.a();
        my5 my5Var2 = new my5();
        my5Var2.k = "application/x-scte35";
        s0 = my5Var2.a();
        CREATOR = new f73(17);
    }

    public c45(String str, String str2, long j, long j2, byte[] bArr) {
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
        if (obj == null || c45.class != obj.getClass()) {
            return false;
        }
        c45 c45Var = (c45) obj;
        return this.c == c45Var.c && this.o == c45Var.o && maf.a(this.a, c45Var.a) && maf.a(this.b, c45Var.b) && Arrays.equals(this.X, c45Var.X);
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

    @Override // defpackage.c99
    public final oy5 k() {
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

    @Override // defpackage.c99
    public final byte[] o() {
        if (k() != null) {
            return this.X;
        }
        return null;
    }

    public final String toString() {
        String str = this.a;
        int iE = rh4.e(79, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(rh4.e(iE, str2));
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(this.o);
        sb.append(", durationMs=");
        sb.append(this.c);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeByteArray(this.X);
    }

    public c45(Parcel parcel) {
        String string = parcel.readString();
        int i = maf.a;
        this.a = string;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.X = parcel.createByteArray();
    }
}
