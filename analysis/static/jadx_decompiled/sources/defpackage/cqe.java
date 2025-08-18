package defpackage;

import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public final class cqe extends jqe {
    public static final bqe CREATOR = new bqe();
    public final int b;
    public final int c;
    public final List o;

    public cqe(List list, int i, int i2) {
        this.b = i;
        this.c = i2;
        this.o = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqe)) {
            return false;
        }
        cqe cqeVar = (cqe) obj;
        return this.b == cqeVar.b && this.c == cqeVar.c && tpa.f(this.o, cqeVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + k7d.e(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PluralsParams(resId=");
        sb.append(this.b);
        sb.append(", quantity=");
        sb.append(this.c);
        sb.append(", args=");
        return au1.i(sb, this.o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeList(this.o);
    }
}
