package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class xqf implements c99 {
    public static final Parcelable.Creator<xqf> CREATOR = new etd(29);
    public final String a;
    public final String b;

    public xqf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xqf xqfVar = (xqf) obj;
        return this.a.equals(xqfVar.a) && this.b.equals(xqfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + rh4.d(527, 31, this.a);
    }

    @Override // defpackage.c99
    public final void p(dd8 dd8Var) {
        String str;
        String str2 = this.a;
        str2.getClass();
        str = this.b;
        switch (str2) {
            case "ALBUM":
                dd8Var.c = str;
                break;
            case "TITLE":
                dd8Var.a = str;
                break;
            case "DESCRIPTION":
                dd8Var.g = str;
                break;
            case "ALBUMARTIST":
                dd8Var.d = str;
                break;
            case "ARTIST":
                dd8Var.b = str;
                break;
        }
    }

    public final String toString() {
        String str = this.a;
        int iE = rh4.e(5, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(rh4.e(iE, str2));
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public xqf(Parcel parcel) {
        String string = parcel.readString();
        int i = maf.a;
        this.a = string;
        this.b = parcel.readString();
    }
}
