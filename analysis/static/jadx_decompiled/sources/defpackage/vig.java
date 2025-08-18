package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vig extends n3 {
    public static final Parcelable.Creator<vig> CREATOR = new ufg(11);
    public Bundle a;
    public pe5[] b;
    public int c;
    public wh3 o;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.M(parcel, 1, this.a);
        ay7.R(parcel, 2, this.b, i);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(this.c);
        ay7.P(parcel, 4, this.o, i);
        ay7.W(parcel, iT);
    }
}
