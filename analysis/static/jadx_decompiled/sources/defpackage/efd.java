package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class efd extends hfd {
    public static final Parcelable.Creator<efd> CREATOR = new e9b(23);
    public final boolean a;
    public final boolean b;

    public efd(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efd)) {
            return false;
        }
        efd efdVar = (efd) obj;
        return this.a == efdVar.a && this.b == efdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Radio(isChecked=" + this.a + ", isEnabled=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
