package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class jr7 implements Parcelable {
    public static final Parcelable.Creator<jr7> CREATOR = new uk7(4);
    public final ir7 a;

    public jr7(ir7 ir7Var) {
        this.a = ir7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ir7 ir7Var = this.a;
        parcel.writeByte(ir7Var == null ? (byte) 1 : (byte) 0);
        if (ir7Var != null) {
            parcel.writeByte(ir7Var.a ? (byte) 1 : (byte) 0);
            parcel.writeByte(ir7Var.b ? (byte) 1 : (byte) 0);
            parcel.writeInt(au1.s(ir7Var.c));
            parcel.writeInt(au1.s(ir7Var.d));
            parcel.writeInt(ir7Var.e.ordinal());
            parcel.writeLong(ir7Var.h);
            parcel.writeByte(ir7Var.i ? (byte) 1 : (byte) 0);
            parcel.writeByte(ir7Var.f ? (byte) 1 : (byte) 0);
            parcel.writeByte(ir7Var.g ? (byte) 1 : (byte) 0);
            parcel.writeByte(ir7Var.j ? (byte) 1 : (byte) 0);
            parcel.writeByte(ir7Var.k ? (byte) 1 : (byte) 0);
            parcel.writeByte(ir7Var.l ? (byte) 1 : (byte) 0);
            parcel.writeByte(ir7Var.m ? (byte) 1 : (byte) 0);
            parcel.writeByte(ir7Var.n ? (byte) 1 : (byte) 0);
            parcel.writeLong(ir7Var.o);
            parcel.writeLong(ir7Var.p);
            parcel.writeLong(ir7Var.q);
            parcel.writeByte(ir7Var.r ? (byte) 1 : (byte) 0);
        }
    }

    public jr7(Parcel parcel) {
        if (!f8.w(parcel)) {
            gr7 gr7Var = new gr7();
            gr7Var.a = parcel.readByte() == 1;
            gr7Var.b = parcel.readByte() == 1;
            gr7Var.c = au1.v(3)[parcel.readInt()];
            gr7Var.d = au1.v(3)[parcel.readInt()];
            gr7Var.e = hr7.values()[parcel.readInt()];
            gr7Var.f = parcel.readByte() == 1;
            gr7Var.g = parcel.readByte() == 1;
            gr7Var.h = parcel.readLong();
            gr7Var.i = parcel.readByte() == 1;
            gr7Var.j = parcel.readByte() == 1;
            gr7Var.k = parcel.readByte() == 1;
            gr7Var.l = parcel.readByte() == 1;
            gr7Var.m = parcel.readByte() == 1;
            gr7Var.n = parcel.readByte() == 1;
            gr7Var.o = parcel.readLong();
            gr7Var.p = parcel.readLong();
            gr7Var.q = parcel.readLong();
            gr7Var.r = parcel.readByte() == 1;
            this.a = new ir7(gr7Var);
            return;
        }
        this.a = null;
    }
}
