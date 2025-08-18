package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class dn8 implements Parcelable {
    public static final Parcelable.Creator<dn8> CREATOR = new uk7(15);
    public final hfd X;
    public final int a;
    public final jqe b;
    public final jfd c;
    public final Integer o;

    public /* synthetic */ dn8(int i, eqe eqeVar, Integer num) {
        this(i, eqeVar, jfd.a, num, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn8)) {
            return false;
        }
        dn8 dn8Var = (dn8) obj;
        return this.a == dn8Var.a && tpa.f(this.b, dn8Var.b) && this.c == dn8Var.c && tpa.f(this.o, dn8Var.o) && tpa.f(this.X, dn8Var.X);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + k7d.f(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Integer num = this.o;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        hfd hfdVar = this.X;
        return iHashCode2 + (hfdVar != null ? hfdVar.hashCode() : 0);
    }

    public final String toString() {
        return "MemberListAction(id=" + this.a + ", text=" + this.b + ", type=" + this.c + ", startIconRes=" + this.o + ", endViewType=" + this.X + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        Integer num = this.o;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.X, i);
    }

    public dn8(int i, jqe jqeVar, jfd jfdVar, Integer num, hfd hfdVar) {
        this.a = i;
        this.b = jqeVar;
        this.c = jfdVar;
        this.o = num;
        this.X = hfdVar;
    }
}
