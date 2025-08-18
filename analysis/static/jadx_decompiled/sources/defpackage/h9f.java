package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h9f extends ct6 {
    public static final Parcelable.Creator<h9f> CREATOR = new etd(22);
    public final String b;
    public final String c;

    public h9f(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h9f.class != obj.getClass()) {
            return false;
        }
        h9f h9fVar = (h9f) obj;
        return this.a.equals(h9fVar.a) && maf.a(this.b, h9fVar.b) && maf.a(this.c, h9fVar.c);
    }

    public final int hashCode() {
        int iD = rh4.d(527, 31, this.a);
        String str = this.b;
        int iHashCode = (iD + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.ct6
    public final String toString() {
        String str = this.a;
        int iE = rh4.e(6, str);
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(rh4.e(iE, str2));
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h9f(Parcel parcel) {
        String string = parcel.readString();
        int i = maf.a;
        super(string);
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
