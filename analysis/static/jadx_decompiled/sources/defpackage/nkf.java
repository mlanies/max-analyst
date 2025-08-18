package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class nkf extends okf {
    public static final Parcelable.Creator<nkf> CREATOR = new etd(27);
    public final mqb a;

    public nkf(mqb mqbVar) {
        this.a = mqbVar;
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
