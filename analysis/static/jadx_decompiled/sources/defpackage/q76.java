package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class q76 extends n3 {
    public static final Parcelable.Creator<q76> CREATOR = new f73(25);
    public final int a;

    public q76(int i) {
        this.a = i;
    }

    @Override // defpackage.n3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q76) && this.a == ((q76) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("AsRes(res="), this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
