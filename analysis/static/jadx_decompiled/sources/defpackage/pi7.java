package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class pi7 implements ej7, cj7 {
    public static final Parcelable.Creator<pi7> CREATOR = new dj6(16);
    public final Uri a;
    public final String b;

    public pi7(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ej7, defpackage.cj7
    public final String m() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new m64(this.a), i);
        parcel.writeString(this.b);
    }
}
