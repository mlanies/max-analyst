package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class ew8 implements Parcelable {
    public static final Parcelable.Creator<ew8> CREATOR = new uk7(18);
    public final bw8 a;

    public ew8(bw8 bw8Var) {
        this.a = bw8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bw8 bw8Var = this.a;
        parcel.writeByte(bw8Var == null ? (byte) 1 : (byte) 0);
        if (bw8Var != null) {
            parcel.writeParcelable(new xw8(bw8Var.c), i);
            parcel.writeInt(bw8Var.a);
            parcel.writeLong(bw8Var.b);
            parcel.writeString(bw8Var.d);
            parcel.writeString(bw8Var.e);
            parcel.writeLong(bw8Var.f);
            parcel.writeLong(bw8Var.g);
        }
    }

    public ew8(Parcel parcel) {
        if (!f8.w(parcel)) {
            this.a = new bw8(parcel.readInt(), parcel.readLong(), ((xw8) parcel.readParcelable(xw8.class.getClassLoader())).a, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
        } else {
            this.a = null;
        }
    }
}
