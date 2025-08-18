package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class afc implements Parcelable {
    public static final Parcelable.Creator<afc> CREATOR = new e9b(11);
    public final Long X;
    public final String a;
    public final String b;
    public final String c;
    public final String o;

    public afc(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = str4;
        this.X = l;
    }

    public static afc a(afc afcVar, Long l) {
        String str = afcVar.a;
        String str2 = afcVar.b;
        String str3 = afcVar.c;
        String str4 = afcVar.o;
        afcVar.getClass();
        return new afc(str, str2, str3, str4, l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afc)) {
            return false;
        }
        afc afcVar = (afc) obj;
        return tpa.f(this.a, afcVar.a) && tpa.f(this.b, afcVar.b) && tpa.f(this.c, afcVar.c) && tpa.f(this.o, afcVar.o) && tpa.f(this.X, afcVar.X);
    }

    public final int hashCode() {
        int iD = rh4.d(rh4.d(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.o);
        Long l = this.X;
        return iD + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "RegistrationData(token=" + this.a + ", phone=" + this.b + ", name=" + this.c + ", surname=" + this.o + ", photoId=" + this.X + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        Long l = this.X;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }
}
