package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r43 extends n3 {
    public static final Parcelable.Creator<r43> CREATOR = new vqf(14);
    public final Intent a;

    public r43(Intent intent) {
        this.a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.P(parcel, 1, this.a, i);
        ay7.W(parcel, iT);
    }
}
