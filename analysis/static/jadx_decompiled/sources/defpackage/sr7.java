package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class sr7 extends n3 {
    public static final Parcelable.Creator<sr7> CREATOR = new vqf(25);
    public final boolean X;
    public final boolean Y;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;

    public sr7(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.o = z4;
        this.X = z5;
        this.Y = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ay7.X(parcel, 4, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ay7.X(parcel, 5, 4);
        parcel.writeInt(this.X ? 1 : 0);
        ay7.X(parcel, 6, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        ay7.W(parcel, iT);
    }
}
