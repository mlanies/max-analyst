package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o42 extends dt6 {
    public static final Parcelable.Creator<o42> CREATOR = new d6(22);
    public final String[] X;
    public final dt6[] Y;
    public final String b;
    public final boolean c;
    public final boolean o;

    public o42(String str, boolean z, boolean z2, String[] strArr, dt6[] dt6VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.o = z2;
        this.X = strArr;
        this.Y = dt6VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o42.class != obj.getClass()) {
            return false;
        }
        o42 o42Var = (o42) obj;
        return this.c == o42Var.c && this.o == o42Var.o && oaf.a(this.b, o42Var.b) && Arrays.equals(this.X, o42Var.X) && Arrays.equals(this.Y, o42Var.Y);
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
        dt6[] dt6VarArr = this.Y;
        parcel.writeInt(dt6VarArr.length);
        for (dt6 dt6Var : dt6VarArr) {
            parcel.writeParcelable(dt6Var, 0);
        }
    }

    public o42(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = oaf.a;
        this.b = string;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.X = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.Y = new dt6[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.Y[i3] = (dt6) parcel.readParcelable(dt6.class.getClassLoader());
        }
    }
}
