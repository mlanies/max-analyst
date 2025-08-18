package defpackage;

import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public final class gqe extends jqe {
    public static final fqe CREATOR = new fqe();
    public final int b;
    public final List c;

    public gqe(int i, List list) {
        this.b = i;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqe)) {
            return false;
        }
        gqe gqeVar = (gqe) obj;
        return this.b == gqeVar.b && tpa.f(this.c, gqeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ResourceParams(resId=" + this.b + ", args=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeList(this.c);
    }
}
