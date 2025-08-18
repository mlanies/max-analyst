package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class us6 implements d99 {
    public static final Parcelable.Creator<us6> CREATOR = new dj6(6);
    public final boolean X;
    public final int Y;
    public final int a;
    public final String b;
    public final String c;
    public final String o;

    public us6(int i, int i2, String str, String str2, String str3, boolean z) {
        fm9.f(i2 == -1 || i2 > 0);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = z;
        this.Y = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.us6 a(java.util.Map r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us6.a(java.util.Map):us6");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || us6.class != obj.getClass()) {
            return false;
        }
        us6 us6Var = (us6) obj;
        return this.a == us6Var.a && oaf.a(this.b, us6Var.b) && oaf.a(this.c, us6Var.c) && oaf.a(this.o, us6Var.o) && this.X == us6Var.X && this.Y == us6Var.Y;
    }

    public final int hashCode() {
        int i = (527 + this.a) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.X ? 1 : 0)) * 31) + this.Y;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.Y;
    }

    @Override // defpackage.d99
    public final void w(ed8 ed8Var) {
        String str = this.c;
        if (str != null) {
            ed8Var.F = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            ed8Var.D = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        int i2 = oaf.a;
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y);
    }

    public us6(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.o = parcel.readString();
        int i = oaf.a;
        this.X = parcel.readInt() != 0;
        this.Y = parcel.readInt();
    }
}
