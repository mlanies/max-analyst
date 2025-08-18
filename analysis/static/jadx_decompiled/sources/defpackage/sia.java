package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class sia implements tia {
    public static final Parcelable.Creator<sia> CREATOR = new fn9(18);
    public final jqe a;

    public sia(jqe jqeVar) {
        this.a = jqeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sia) && tpa.f(this.a, ((sia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("TextButton(caption="), this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
