package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class pae extends n3 {
    public static final Parcelable.Creator<pae> CREATOR = new vqf(20);
    public final mae a;
    public final double b;

    public pae(mae maeVar, double d) {
        if (d <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.a = maeVar;
        this.b = d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.P(parcel, 2, this.a, i);
        ay7.X(parcel, 3, 8);
        parcel.writeDouble(this.b);
        ay7.W(parcel, iT);
    }
}
