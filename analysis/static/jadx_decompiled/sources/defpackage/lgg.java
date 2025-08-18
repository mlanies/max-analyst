package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class lgg extends n3 {
    public static final Parcelable.Creator<lgg> CREATOR = new ufg(6);
    public final String a;
    public final int b;

    public lgg(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.Q(parcel, 1, this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b);
        ay7.W(parcel, iT);
    }
}
