package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class jtc extends ktc {
    public static final Parcelable.Creator<jtc> CREATOR = new e9b(16);
    public final m34 a;
    public final boolean b;
    public final Parcelable c;

    public jtc(m34 m34Var, boolean z, Parcelable parcelable) {
        this.a = m34Var;
        this.b = z;
        this.c = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtc)) {
            return false;
        }
        jtc jtcVar = (jtc) obj;
        return tpa.f(this.a, jtcVar.a) && this.b == jtcVar.b && tpa.f(this.c, jtcVar.c);
    }

    public final int hashCode() {
        int iD = ms2.d(this.a.hashCode() * 31, 31, this.b);
        Parcelable parcelable = this.c;
        return iD + (parcelable == null ? 0 : parcelable.hashCode());
    }

    public final String toString() {
        return "DelayedAttrs(sendTime=" + this.a + ", notifySender=" + this.b + ", input=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }
}
