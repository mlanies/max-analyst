package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class xmc extends n3 {
    public static final Parcelable.Creator<xmc> CREATOR = new vqf(26);
    public final int X;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int o;

    public xmc(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.o = i2;
        this.X = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ay7.X(parcel, 4, 4);
        parcel.writeInt(this.o);
        ay7.X(parcel, 5, 4);
        parcel.writeInt(this.X);
        ay7.W(parcel, iT);
    }
}
