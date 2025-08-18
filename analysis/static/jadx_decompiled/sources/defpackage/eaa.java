package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class eaa implements Parcelable {
    public static final Parcelable.Creator<eaa> CREATOR = new fn9(3);
    public final String a;
    public final int b;
    public final int c;
    public final Integer o;

    public eaa(int i, int i2, Integer num, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.o = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaa)) {
            return false;
        }
        eaa eaaVar = (eaa) obj;
        return tpa.f(this.a, eaaVar.a) && this.b == eaaVar.b && this.c == eaaVar.c && tpa.f(this.o, eaaVar.o);
    }

    public final int hashCode() {
        int iE = k7d.e(this.c, k7d.e(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.o;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OneMeCountryModel(countryNameCode=" + this.a + ", countryPhoneCode=" + this.b + ", countryName=" + this.c + ", flagDrawable=" + this.o + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        Integer num = this.o;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }
}
