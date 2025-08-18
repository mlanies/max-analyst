package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y99 extends n3 {
    public static final Parcelable.Creator<y99> CREATOR = new vqf(10);
    public final long X;
    public final String Y;
    public final String Z;
    public final int a;
    public final int b;
    public final int c;
    public final long o;
    public final int s0;
    public final int t0;

    public y99(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = j;
        this.X = j2;
        this.Y = str;
        this.Z = str2;
        this.s0 = i4;
        this.t0 = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(this.c);
        ay7.X(parcel, 4, 8);
        parcel.writeLong(this.o);
        ay7.X(parcel, 5, 8);
        parcel.writeLong(this.X);
        ay7.Q(parcel, 6, this.Y);
        ay7.Q(parcel, 7, this.Z);
        ay7.X(parcel, 8, 4);
        parcel.writeInt(this.s0);
        ay7.X(parcel, 9, 4);
        parcel.writeInt(this.t0);
        ay7.W(parcel, iT);
    }
}
