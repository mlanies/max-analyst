package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class zqf implements d99 {
    public static final Parcelable.Creator<zqf> CREATOR = new vqf(1);
    public final String a;
    public final String b;

    public zqf(String str, String str2) {
        this.a = lz7.V(str);
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
        zqf zqfVar = (zqf) obj;
        return this.a.equals(zqfVar.a) && this.b.equals(zqfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + rh4.d(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }

    @Override // defpackage.d99
    public final void w(ed8 ed8Var) {
        String str;
        String str2 = this.a;
        str2.getClass();
        str = this.b;
        switch (str2) {
            case "ALBUM":
                ed8Var.c = str;
                break;
            case "TITLE":
                ed8Var.a = str;
                break;
            case "DESCRIPTION":
                ed8Var.g = str;
                break;
            case "ALBUMARTIST":
                ed8Var.d = str;
                break;
            case "ARTIST":
                ed8Var.b = str;
                break;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public zqf(Parcel parcel) {
        String string = parcel.readString();
        int i = oaf.a;
        this.a = string;
        this.b = parcel.readString();
    }
}
