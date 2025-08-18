package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ts6 implements c99 {
    public static final Parcelable.Creator<ts6> CREATOR = new dj6(5);
    public final boolean X;
    public final int Y;
    public final int a;
    public final String b;
    public final String c;
    public final String o;

    public ts6(int i, int i2, String str, String str2, String str3, boolean z) {
        np8.d(i2 == -1 || i2 > 0);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = z;
        this.Y = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ts6 a(java.util.Map r12) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts6.a(java.util.Map):ts6");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ts6.class != obj.getClass()) {
            return false;
        }
        ts6 ts6Var = (ts6) obj;
        return this.a == ts6Var.a && maf.a(this.b, ts6Var.b) && maf.a(this.c, ts6Var.c) && maf.a(this.o, ts6Var.o) && this.X == ts6Var.X && this.Y == ts6Var.Y;
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

    @Override // defpackage.c99
    public final void p(dd8 dd8Var) {
        String str = this.c;
        if (str != null) {
            dd8Var.E = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            dd8Var.C = str2;
        }
    }

    public final String toString() {
        String str = this.c;
        int iE = rh4.e(80, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(rh4.e(iE, str2));
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(this.a);
        sb.append(", metadataInterval=");
        sb.append(this.Y);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        int i2 = maf.a;
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y);
    }

    public ts6(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.o = parcel.readString();
        int i = maf.a;
        this.X = parcel.readInt() != 0;
        this.Y = parcel.readInt();
    }
}
