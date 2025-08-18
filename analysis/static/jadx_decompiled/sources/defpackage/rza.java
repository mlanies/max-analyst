package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class rza implements c99 {
    public static final Parcelable.Creator<rza> CREATOR = new fn9(24);
    public final int X;
    public final int Y;
    public final int Z;
    public final int a;
    public final String b;
    public final String c;
    public final int o;
    public final byte[] s0;

    public rza(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = i2;
        this.X = i3;
        this.Y = i4;
        this.Z = i5;
        this.s0 = bArr;
    }

    public static rza a(yaf yafVar) {
        int iH = yafVar.h();
        String strT = yafVar.t(yafVar.h(), b52.a);
        String strT2 = yafVar.t(yafVar.h(), b52.c);
        int iH2 = yafVar.h();
        int iH3 = yafVar.h();
        int iH4 = yafVar.h();
        int iH5 = yafVar.h();
        int iH6 = yafVar.h();
        byte[] bArr = new byte[iH6];
        yafVar.g(0, bArr, iH6);
        return new rza(iH, strT, strT2, iH2, iH3, iH4, iH5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rza.class != obj.getClass()) {
            return false;
        }
        rza rzaVar = (rza) obj;
        return this.a == rzaVar.a && this.b.equals(rzaVar.b) && this.c.equals(rzaVar.c) && this.o == rzaVar.o && this.X == rzaVar.X && this.Y == rzaVar.Y && this.Z == rzaVar.Z && Arrays.equals(this.s0, rzaVar.s0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.s0) + ((((((((rh4.d(rh4.d((527 + this.a) * 31, 31, this.b), 31, this.c) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31);
    }

    @Override // defpackage.c99
    public final void p(dd8 dd8Var) {
        dd8Var.a(this.a, this.s0);
    }

    public final String toString() {
        String str = this.b;
        int iE = rh4.e(32, str);
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(rh4.e(iE, str2));
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
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

    public rza(Parcel parcel) {
        this.a = parcel.readInt();
        String string = parcel.readString();
        int i = maf.a;
        this.b = string;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.s0 = parcel.createByteArray();
    }
}
