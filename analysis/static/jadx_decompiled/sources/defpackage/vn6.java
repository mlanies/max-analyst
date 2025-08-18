package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class vn6 implements Parcelable {
    public static final Parcelable.Creator<vn6> CREATOR = new dj6(4);
    public final String X;
    public final String Y;
    public final int a;
    public final int b;
    public final String c;
    public final String o;

    public vn6(String str, int i, int i2, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.o = str2;
        this.X = str3;
        this.Y = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vn6.class != obj.getClass()) {
            return false;
        }
        vn6 vn6Var = (vn6) obj;
        return this.a == vn6Var.a && this.b == vn6Var.b && TextUtils.equals(this.c, vn6Var.c) && TextUtils.equals(this.o, vn6Var.o) && TextUtils.equals(this.X, vn6Var.X) && TextUtils.equals(this.Y, vn6Var.Y);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.o;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.X;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.Y;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
    }

    public vn6(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.o = parcel.readString();
        this.X = parcel.readString();
        this.Y = parcel.readString();
    }
}
