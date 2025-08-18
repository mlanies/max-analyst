package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class qeg extends n3 {
    public static final Parcelable.Creator<qeg> CREATOR = new vqf(9);
    public final int a;
    public final ph3 b;
    public final weg c;

    public qeg(int i, ph3 ph3Var, weg wegVar) {
        this.a = i;
        this.b = ph3Var;
        this.c = wegVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.P(parcel, 2, this.b, i);
        ay7.P(parcel, 3, this.c, i);
        ay7.W(parcel, iT);
    }
}
