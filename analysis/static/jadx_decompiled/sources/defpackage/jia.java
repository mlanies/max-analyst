package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class jia implements oia {
    public static final Parcelable.Creator<jia> CREATOR = new fn9(10);
    public final int a;
    public final int b;

    public jia(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jia)) {
            return false;
        }
        jia jiaVar = (jia) obj;
        return this.a == jiaVar.a && this.b == jiaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColoredIcon(iconRes=");
        sb.append(this.a);
        sb.append(", tintColor=");
        return zr6.j(sb, this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
