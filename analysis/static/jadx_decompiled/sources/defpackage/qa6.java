package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qa6 extends ct6 {
    public static final Parcelable.Creator<qa6> CREATOR = new f73(28);
    public final byte[] X;
    public final String b;
    public final String c;
    public final String o;

    public qa6(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qa6.class != obj.getClass()) {
            return false;
        }
        qa6 qa6Var = (qa6) obj;
        return maf.a(this.b, qa6Var.b) && maf.a(this.c, qa6Var.c) && maf.a(this.o, qa6Var.o) && Arrays.equals(this.X, qa6Var.X);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        return Arrays.hashCode(this.X) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // defpackage.ct6
    public final String toString() {
        String str = this.a;
        int iE = rh4.e(36, str);
        String str2 = this.b;
        int iE2 = rh4.e(iE, str2);
        String str3 = this.c;
        int iE3 = rh4.e(iE2, str3);
        String str4 = this.o;
        StringBuilder sb = new StringBuilder(rh4.e(iE3, str4));
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeByteArray(this.X);
    }

    public qa6(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = maf.a;
        this.b = string;
        this.c = parcel.readString();
        this.o = parcel.readString();
        this.X = parcel.createByteArray();
    }
}
