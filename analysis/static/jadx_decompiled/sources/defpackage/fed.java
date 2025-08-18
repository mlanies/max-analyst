package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class fed implements Parcelable {
    public static final Parcelable.Creator<fed> CREATOR = new e9b(20);
    public final int a;
    public final jqe b;
    public final int c;

    public fed(int i, int i2, jqe jqeVar) {
        this.a = i;
        this.b = jqeVar;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fed)) {
            return false;
        }
        fed fedVar = (fed) obj;
        return this.a == fedVar.a && tpa.f(this.b, fedVar.b) && this.c == fedVar.c;
    }

    public final int hashCode() {
        return au1.s(this.c) + k7d.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", caption=");
        sb.append(this.b);
        sb.append(", type=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "NEUTRAL" : "LINK");
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        int i2 = this.c;
        if (i2 == 1) {
            str = "LINK";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "NEUTRAL";
        }
        parcel.writeString(str);
    }
}
