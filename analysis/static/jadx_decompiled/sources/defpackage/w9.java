package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class w9 implements Parcelable {
    public static final Parcelable.Creator<w9> CREATOR = new d6(2);
    public final int a;
    public final int b;
    public final String c;

    public w9(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9)) {
            return false;
        }
        w9 w9Var = (w9) obj;
        return this.a == w9Var.a && this.b == w9Var.b && tpa.f(this.c, w9Var.c);
    }

    public final int hashCode() {
        int iE = k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddLinkState(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", link=");
        return zr6.l(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }
}
