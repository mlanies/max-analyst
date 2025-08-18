package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g73 extends ct6 {
    public static final Parcelable.Creator<g73> CREATOR = new d6(29);
    public final String b;
    public final String c;
    public final String o;

    public g73(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g73.class != obj.getClass()) {
            return false;
        }
        g73 g73Var = (g73) obj;
        return maf.a(this.c, g73Var.c) && maf.a(this.b, g73Var.b) && maf.a(this.o, g73Var.o);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // defpackage.ct6
    public final String toString() {
        String str = this.a;
        int iE = rh4.e(25, str);
        String str2 = this.b;
        int iE2 = rh4.e(iE, str2);
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(rh4.e(iE2, str3));
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.o);
    }

    public g73(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = maf.a;
        this.b = string;
        this.c = parcel.readString();
        this.o = parcel.readString();
    }
}
