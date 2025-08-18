package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class rk9 implements Parcelable {
    public static final Parcelable.Creator<rk9> CREATOR = new uk7(29);
    public final int a;
    public final boolean b;
    public final boolean c;

    public rk9(qk9 qk9Var) {
        this.a = qk9Var.a;
        this.b = qk9Var.b;
        this.c = qk9Var.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    public rk9(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
    }
}
