package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zvd extends tvd {
    public static final Parcelable.Creator<zvd> CREATOR = new etd(3);
    public final boolean X;
    public final long Y;
    public final long Z;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final List s0;
    public final boolean t0;
    public final long u0;
    public final int v0;
    public final int w0;
    public final int x0;

    public zvd(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.o = z3;
        this.X = z4;
        this.Y = j2;
        this.Z = j3;
        this.s0 = Collections.unmodifiableList(list);
        this.t0 = z5;
        this.u0 = j4;
        this.v0 = i;
        this.w0 = i2;
        this.x0 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.X ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.Y);
        parcel.writeLong(this.Z);
        List list = this.s0;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            xvd xvdVar = (xvd) list.get(i2);
            parcel.writeInt(xvdVar.a);
            parcel.writeLong(xvdVar.b);
            parcel.writeLong(xvdVar.c);
        }
        parcel.writeByte(this.t0 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.u0);
        parcel.writeInt(this.v0);
        parcel.writeInt(this.w0);
        parcel.writeInt(this.x0);
    }

    public zvd(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.o = parcel.readByte() == 1;
        this.X = parcel.readByte() == 1;
        this.Y = parcel.readLong();
        this.Z = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new xvd(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.s0 = Collections.unmodifiableList(arrayList);
        this.t0 = parcel.readByte() == 1;
        this.u0 = parcel.readLong();
        this.v0 = parcel.readInt();
        this.w0 = parcel.readInt();
        this.x0 = parcel.readInt();
    }
}
