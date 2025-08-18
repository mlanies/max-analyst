package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class mae extends n3 {
    public static final Parcelable.Creator<mae> CREATOR = new vqf(19);
    public final txd X;
    public final float a;
    public final int b;
    public final int c;
    public final boolean o;

    public mae(float f, int i, int i2, boolean z, txd txdVar) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.o = z;
        this.X = txdVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 2, 4);
        parcel.writeFloat(this.a);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(this.b);
        ay7.X(parcel, 4, 4);
        parcel.writeInt(this.c);
        ay7.X(parcel, 5, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ay7.P(parcel, 6, this.X, i);
        ay7.W(parcel, iT);
    }
}
