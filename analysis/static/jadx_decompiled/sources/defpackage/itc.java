package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class itc extends ktc {
    public static final Parcelable.Creator<itc> CREATOR = new e9b(15);
    public final Parcelable a;

    public itc(Parcelable parcelable) {
        this.a = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof itc) && tpa.f(this.a, ((itc) obj).a);
    }

    public final int hashCode() {
        Parcelable parcelable = this.a;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    public final String toString() {
        return "Close(input=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
