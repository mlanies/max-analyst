package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class wfc extends n3 {
    public static final Parcelable.Creator<wfc> CREATOR = new e9b(12);
    public final Bundle a;
    public us b;

    public wfc(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.M(parcel, 2, this.a);
        ay7.W(parcel, iT);
    }
}
