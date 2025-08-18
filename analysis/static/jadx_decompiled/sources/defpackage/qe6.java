package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class qe6 extends n3 {
    public static final Parcelable.Creator<qe6> CREATOR = new vqf(2);
    public final int a;
    public final int b;
    public final Bundle c;

    public qe6(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b);
        ay7.M(parcel, 3, this.c);
        ay7.W(parcel, iT);
    }
}
