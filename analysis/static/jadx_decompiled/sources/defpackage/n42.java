package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n42 extends ct6 {
    public static final Parcelable.Creator<n42> CREATOR = new d6(21);
    public final String[] X;
    public final ct6[] Y;
    public final String b;
    public final boolean c;
    public final boolean o;

    public n42(String str, boolean z, boolean z2, String[] strArr, ct6[] ct6VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.o = z2;
        this.X = strArr;
        this.Y = ct6VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n42.class != obj.getClass()) {
            return false;
        }
        n42 n42Var = (n42) obj;
        return this.c == n42Var.c && this.o == n42Var.o && maf.a(this.b, n42Var.b) && Arrays.equals(this.X, n42Var.X) && Arrays.equals(this.Y, n42Var.Y);
    }

    public final int hashCode() {
        int i = (((527 + (this.c ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.X);
        ct6[] ct6VarArr = this.Y;
        parcel.writeInt(ct6VarArr.length);
        for (ct6 ct6Var : ct6VarArr) {
            parcel.writeParcelable(ct6Var, 0);
        }
    }

    public n42(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = maf.a;
        this.b = string;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.X = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.Y = new ct6[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.Y[i3] = (ct6) parcel.readParcelable(ct6.class.getClassLoader());
        }
    }
}
