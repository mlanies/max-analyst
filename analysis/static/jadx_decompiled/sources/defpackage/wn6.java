package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class wn6 implements c99 {
    public static final Parcelable.Creator<wn6> CREATOR = new dj6(1);
    public final String a;
    public final String b;
    public final List c;

    public wn6(String str, String str2, List list) {
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
        if (obj == null || wn6.class != obj.getClass()) {
            return false;
        }
        wn6 wn6Var = (wn6) obj;
        return TextUtils.equals(this.a, wn6Var.a) && TextUtils.equals(this.b, wn6Var.b) && this.c.equals(wn6Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String string;
        String str = this.a;
        if (str != null) {
            int iE = rh4.e(5, str);
            String str2 = this.b;
            StringBuilder sb = new StringBuilder(rh4.e(iE, str2));
            sb.append(" [");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "";
        }
        String strValueOf = String.valueOf(string);
        return strValueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(strValueOf) : new String("HlsTrackMetadataEntry");
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

    public wn6(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((un6) parcel.readParcelable(un6.class.getClassLoader()));
        }
        this.c = Collections.unmodifiableList(arrayList);
    }
}
