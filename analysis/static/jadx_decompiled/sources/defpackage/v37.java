package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v37 extends dt6 {
    public static final Parcelable.Creator<v37> CREATOR = new dj6(11);
    public final String b;
    public final String c;
    public final String o;

    public v37(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v37.class != obj.getClass()) {
            return false;
        }
        v37 v37Var = (v37) obj;
        return oaf.a(this.c, v37Var.c) && oaf.a(this.b, v37Var.b) && oaf.a(this.o, v37Var.o);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // defpackage.dt6
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.o);
    }

    public v37(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = oaf.a;
        this.b = string;
        this.c = parcel.readString();
        this.o = parcel.readString();
    }
}
