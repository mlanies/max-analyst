package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class sof extends View.BaseSavedState {
    public static final Parcelable.Creator<sof> CREATOR = new y(13);
    public int a;
    public int b;
    public Parcelable c;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
