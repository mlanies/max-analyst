package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class x34 implements Parcelable {
    public static final Parcelable.Creator<x34> CREATOR = new f73(8);
    public final String X;
    public final long a;
    public final int b;
    public final int c;
    public final int o;

    public x34(int i, int i2, int i3, long j, String str) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x34)) {
            return false;
        }
        x34 x34Var = (x34) obj;
        return this.a == x34Var.a && this.b == x34Var.b && this.c == x34Var.c && this.o == x34Var.o && tpa.f(this.X, x34Var.X);
    }

    public final int hashCode() {
        return this.X.hashCode() + k7d.e(this.o, k7d.e(this.c, k7d.e(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Day(id=");
        sb.append(this.a);
        sb.append(", day=");
        sb.append(this.b);
        sb.append(", month=");
        sb.append(this.c);
        sb.append(", year=");
        sb.append(this.o);
        sb.append(", string=");
        return zr6.l(sb, this.X, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeString(this.X);
    }
}
