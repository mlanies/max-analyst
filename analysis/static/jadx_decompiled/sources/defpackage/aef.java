package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class aef extends bef {
    public static final Parcelable.Creator<aef> CREATOR = new etd(25);
    public final xdf a;

    public aef(xdf xdfVar) {
        this.a = xdfVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
