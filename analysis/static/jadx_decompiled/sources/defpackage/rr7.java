package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class rr7 extends n3 implements rjc {
    public static final Parcelable.Creator<rr7> CREATOR = new vqf(24);
    public final Status a;
    public final sr7 b;

    public rr7(Status status, sr7 sr7Var) {
        this.a = status;
        this.b = sr7Var;
    }

    @Override // defpackage.rjc
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.P(parcel, 1, this.a, i);
        ay7.P(parcel, 2, this.b, i);
        ay7.W(parcel, iT);
    }
}
