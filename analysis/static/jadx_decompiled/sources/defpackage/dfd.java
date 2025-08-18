package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class dfd extends hfd {
    public static final Parcelable.Creator<dfd> CREATOR = new e9b(22);
    public final jqe a;
    public final Integer b;

    public dfd(jqe jqeVar, Integer num) {
        this.a = jqeVar;
        this.b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfd)) {
            return false;
        }
        dfd dfdVar = (dfd) obj;
        return tpa.f(this.a, dfdVar.a) && tpa.f(this.b, dfdVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Property(text=" + this.a + ", icon=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeParcelable(this.a, i);
        Integer num = this.b;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }
}
