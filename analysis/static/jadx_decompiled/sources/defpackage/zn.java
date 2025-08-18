package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class zn extends View.BaseSavedState {
    public static final Parcelable.Creator<zn> CREATOR = new d6(5);
    public boolean a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }
}
