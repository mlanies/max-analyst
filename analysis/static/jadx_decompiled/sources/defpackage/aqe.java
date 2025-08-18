package defpackage;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class aqe extends jqe {
    public static final zpe CREATOR = new zpe();
    public final int b;
    public final int c;

    public aqe(int i, int i2) {
        this.b = i;
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
        if (!(obj instanceof aqe)) {
            return false;
        }
        aqe aqeVar = (aqe) obj;
        return this.b == aqeVar.b && this.c == aqeVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Plurals(resId=");
        sb.append(this.b);
        sb.append(", quantity=");
        return zr6.j(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
