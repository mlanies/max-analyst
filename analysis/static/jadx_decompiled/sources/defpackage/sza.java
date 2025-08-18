package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sza implements d99 {
    public static final Parcelable.Creator<sza> CREATOR = new fn9(25);
    public final int X;
    public final int Y;
    public final int Z;
    public final int a;
    public final String b;
    public final String c;
    public final int o;
    public final byte[] s0;

    public sza(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = i2;
        this.X = i3;
        this.Y = i4;
        this.Z = i5;
        this.s0 = bArr;
    }

    public static sza a(wpa wpaVar) {
        int iG = wpaVar.g();
        String strL = ia9.l(wpaVar.s(wpaVar.g(), b52.a));
        String strS = wpaVar.s(wpaVar.g(), b52.c);
        int iG2 = wpaVar.g();
        int iG3 = wpaVar.g();
        int iG4 = wpaVar.g();
        int iG5 = wpaVar.g();
        int iG6 = wpaVar.g();
        byte[] bArr = new byte[iG6];
        wpaVar.e(0, bArr, iG6);
        return new sza(iG, strL, strS, iG2, iG3, iG4, iG5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sza.class != obj.getClass()) {
            return false;
        }
        sza szaVar = (sza) obj;
        return this.a == szaVar.a && this.b.equals(szaVar.b) && this.c.equals(szaVar.c) && this.o == szaVar.o && this.X == szaVar.X && this.Y == szaVar.Y && this.Z == szaVar.Z && Arrays.equals(this.s0, szaVar.s0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.s0) + ((((((((rh4.d(rh4.d((527 + this.a) * 31, 31, this.b), 31, this.c) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // defpackage.d99
    public final void w(ed8 ed8Var) {
        ed8Var.b(this.a, this.s0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeByteArray(this.s0);
    }

    public sza(Parcel parcel) {
        this.a = parcel.readInt();
        String string = parcel.readString();
        int i = oaf.a;
        this.b = string;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.s0 = parcel.createByteArray();
    }
}
