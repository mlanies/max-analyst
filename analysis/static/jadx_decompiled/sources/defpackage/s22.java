package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class s22 extends n3 {
    public static final Parcelable.Creator<s22> CREATOR = new d6(17);
    public final up7 a;
    public final Uri b;

    public s22(up7 up7Var, Uri uri) {
        this.a = up7Var;
        this.b = uri;
    }

    @Override // defpackage.n3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
