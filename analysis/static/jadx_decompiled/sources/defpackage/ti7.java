package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class ti7 implements ej7 {
    public static final Parcelable.Creator<ti7> CREATOR = new dj6(20);
    public final String a;

    public ti7(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
