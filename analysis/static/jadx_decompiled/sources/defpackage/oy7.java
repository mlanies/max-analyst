package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class oy7 implements Parcelable {
    public static final Parcelable.Creator<oy7> CREATOR = new uk7(5);
    public final ny7 a;

    public oy7(ny7 ny7Var) {
        this.a = ny7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ny7 ny7Var = this.a;
        parcel.writeByte(ny7Var == null ? (byte) 1 : (byte) 0);
        if (ny7Var != null) {
            parcel.writeDouble(ny7Var.a);
            parcel.writeDouble(ny7Var.b);
            parcel.writeByte(ny7Var.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(ny7Var.d ? (byte) 1 : (byte) 0);
            parcel.writeByte(ny7Var.e ? (byte) 1 : (byte) 0);
            parcel.writeInt(ny7Var.f);
            parcel.writeFloat(ny7Var.g);
            parcel.writeFloat(ny7Var.h);
            parcel.writeFloat(ny7Var.i);
        }
    }

    public oy7(Parcel parcel) {
        if (!f8.w(parcel)) {
            ny7 ny7Var = new ny7();
            ny7Var.a = parcel.readDouble();
            ny7Var.b = parcel.readDouble();
            ny7Var.c = parcel.readByte() == 1;
            ny7Var.d = parcel.readByte() == 1;
            ny7Var.e = parcel.readByte() == 1;
            ny7Var.f = parcel.readInt();
            ny7Var.g = parcel.readFloat();
            ny7Var.h = parcel.readFloat();
            ny7Var.i = parcel.readFloat();
            this.a = new ny7(ny7Var);
            return;
        }
        this.a = null;
    }
}
