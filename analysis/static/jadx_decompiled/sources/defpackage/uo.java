package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class uo implements c99 {
    public static final Parcelable.Creator<uo> CREATOR = new d6(6);
    public final int a;
    public final String b;

    public uo(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.b;
        StringBuilder sb = new StringBuilder(rh4.e(33, str));
        sb.append("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }
}
