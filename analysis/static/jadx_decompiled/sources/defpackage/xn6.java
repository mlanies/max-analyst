package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class xn6 implements d99 {
    public static final Parcelable.Creator<xn6> CREATOR = new dj6(2);
    public final String a;
    public final String b;
    public final List c;

    public xn6(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xn6.class != obj.getClass()) {
            return false;
        }
        xn6 xn6Var = (xn6) obj;
        return TextUtils.equals(this.a, xn6Var.a) && TextUtils.equals(this.b, xn6Var.b) && this.c.equals(xn6Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.a;
        sb.append(str != null ? zr6.l(au1.m(" [", str, ", "), this.b, "]") : "");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        List list = this.c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
    }

    public xn6(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((vn6) parcel.readParcelable(vn6.class.getClassLoader()));
        }
        this.c = Collections.unmodifiableList(arrayList);
    }
}
