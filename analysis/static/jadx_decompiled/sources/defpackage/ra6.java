package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ra6 extends dt6 {
    public static final Parcelable.Creator<ra6> CREATOR = new f73(29);
    public final byte[] X;
    public final String b;
    public final String c;
    public final String o;

    public ra6(String str, byte[] bArr, String str2, String str3) {
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
        if (obj == null || ra6.class != obj.getClass()) {
            return false;
        }
        ra6 ra6Var = (ra6) obj;
        return oaf.a(this.b, ra6Var.b) && oaf.a(this.c, ra6Var.c) && oaf.a(this.o, ra6Var.o) && Arrays.equals(this.X, ra6Var.X);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        return Arrays.hashCode(this.X) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // defpackage.dt6
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeByteArray(this.X);
    }

    public ra6(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = oaf.a;
        this.b = string;
        this.c = parcel.readString();
        this.o = parcel.readString();
        this.X = parcel.createByteArray();
    }
}
