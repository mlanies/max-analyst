package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i9f extends dt6 {
    public static final Parcelable.Creator<i9f> CREATOR = new etd(23);
    public final String b;
    public final String c;

    public i9f(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i9f.class != obj.getClass()) {
            return false;
        }
        i9f i9fVar = (i9f) obj;
        return this.a.equals(i9fVar.a) && oaf.a(this.b, i9fVar.b) && oaf.a(this.c, i9fVar.c);
    }

    public final int hashCode() {
        int iD = rh4.d(527, 31, this.a);
        String str = this.b;
        int iHashCode = (iD + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.dt6
    public final String toString() {
        return this.a + ": url=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i9f(Parcel parcel) {
        String string = parcel.readString();
        int i = oaf.a;
        super(string);
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
