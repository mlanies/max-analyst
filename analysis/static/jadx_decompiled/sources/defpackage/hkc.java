package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class hkc implements Parcelable {
    public static final Parcelable.Creator<hkc> CREATOR = new vqf(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zeg zegVar = (zeg) this;
        parcel.writeParcelable(zegVar.a, 0);
        parcel.writeInt(zegVar.b ? 1 : 0);
    }
}
