package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class rp7 implements Parcelable {
    public static final Parcelable.Creator<rp7> CREATOR = new uk7(1);
    public final String X;
    public final String Y;
    public final int Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int o;
    public final Rect s0;
    public final float[] t0;
    public final boolean u0;
    public final int v0;
    public final int w0;

    public rp7(qp7 qp7Var) {
        this.a = qp7Var.a;
        this.b = qp7Var.b;
        this.c = true;
        this.o = 0;
        this.X = qp7Var.c;
        this.Y = qp7Var.d;
        this.Z = qp7Var.e;
        this.s0 = null;
        this.t0 = null;
        this.u0 = true;
        this.v0 = qp7Var.f;
        this.w0 = qp7Var.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.o);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeParcelable(this.s0, i);
        parcel.writeFloatArray(this.t0);
        parcel.writeByte(this.u0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.v0);
        parcel.writeInt(this.w0);
    }

    public rp7(Parcel parcel) {
        this.a = parcel.readByte() != 0;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readInt();
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readInt();
        this.s0 = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.t0 = parcel.createFloatArray();
        this.u0 = parcel.readByte() != 0;
        this.v0 = parcel.readInt();
        this.w0 = parcel.readInt();
    }
}
