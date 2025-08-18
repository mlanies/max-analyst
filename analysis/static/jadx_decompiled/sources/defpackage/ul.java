package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ul extends dt6 {
    public static final Parcelable.Creator<ul> CREATOR = new d6(4);
    public final byte[] X;
    public final String b;
    public final String c;
    public final int o;

    public ul(String str, String str2, int i, byte[] bArr) {
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
        if (obj == null || ul.class != obj.getClass()) {
            return false;
        }
        ul ulVar = (ul) obj;
        return this.o == ulVar.o && oaf.a(this.b, ulVar.b) && oaf.a(this.c, ulVar.c) && Arrays.equals(this.X, ulVar.X);
    }

    public final int hashCode() {
        int i = (527 + this.o) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return Arrays.hashCode(this.X) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.dt6
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // defpackage.d99
    public final void w(ed8 ed8Var) {
        ed8Var.b(this.o, this.X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeByteArray(this.X);
    }

    public ul(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = oaf.a;
        this.b = string;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.createByteArray();
    }
}
