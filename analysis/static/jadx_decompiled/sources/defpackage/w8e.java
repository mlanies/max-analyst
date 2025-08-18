package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w8e implements Comparable, Parcelable {
    public static final Parcelable.Creator<w8e> CREATOR = new etd(12);
    public final int a;
    public final int b;
    public final int c;

    public w8e() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w8e w8eVar = (w8e) obj;
        int i = this.a - w8eVar.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - w8eVar.b;
        return i2 == 0 ? this.c - w8eVar.c : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w8e.class != obj.getClass()) {
            return false;
        }
        w8e w8eVar = (w8e) obj;
        return this.a == w8eVar.a && this.b == w8eVar.b && this.c == w8eVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append(this.a);
        sb.append(".");
        sb.append(this.b);
        sb.append(".");
        sb.append(this.c);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public w8e(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
