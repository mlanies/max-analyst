package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class t22 extends n3 {
    public static final Parcelable.Creator<t22> CREATOR = new d6(18);
    public final up7 a;
    public final String b;

    public t22(up7 up7Var, String str) {
        this.a = up7Var;
        this.b = str;
    }

    @Override // defpackage.n3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
