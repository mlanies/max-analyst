package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class mg3 implements Parcelable {
    public static final Parcelable.Creator<mg3> CREATOR = new f73(1);
    public final int a;
    public final jqe b;
    public final int c;
    public final boolean o;

    public mg3(int i, jqe jqeVar, int i2, boolean z) {
        this.a = i;
        this.b = jqeVar;
        this.c = i2;
        this.o = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg3)) {
            return false;
        }
        mg3 mg3Var = (mg3) obj;
        return this.a == mg3Var.a && tpa.f(this.b, mg3Var.b) && this.c == mg3Var.c && this.o == mg3Var.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + ey8.g(this.c, k7d.f(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", caption=");
        sb.append(this.b);
        sb.append(", type=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "THEMED" : "PRIMARY" : "NEUTRAL" : "NEGATIVE");
        sb.append(", filledButton=");
        return au1.j(sb, this.o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        int i2 = this.c;
        if (i2 == 1) {
            str = "NEGATIVE";
        } else if (i2 == 2) {
            str = "NEUTRAL";
        } else if (i2 == 3) {
            str = "PRIMARY";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "THEMED";
        }
        parcel.writeString(str);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
