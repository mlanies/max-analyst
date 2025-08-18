package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class tl extends ct6 {
    public static final Parcelable.Creator<tl> CREATOR = new d6(3);
    public final byte[] X;
    public final String b;
    public final String c;
    public final int o;

    public tl(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.o = i;
        this.X = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tl.class != obj.getClass()) {
            return false;
        }
        tl tlVar = (tl) obj;
        return this.o == tlVar.o && maf.a(this.b, tlVar.b) && maf.a(this.c, tlVar.c) && Arrays.equals(this.X, tlVar.X);
    }

    public final int hashCode() {
        int i = (527 + this.o) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return Arrays.hashCode(this.X) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.c99
    public final void p(dd8 dd8Var) {
        dd8Var.a(this.o, this.X);
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
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeByteArray(this.X);
    }

    public tl(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = maf.a;
        this.b = string;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.createByteArray();
    }
}
