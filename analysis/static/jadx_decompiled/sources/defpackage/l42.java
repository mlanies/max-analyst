package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l42 extends ct6 {
    public static final Parcelable.Creator<l42> CREATOR = new d6(19);
    public final long X;
    public final long Y;
    public final ct6[] Z;
    public final String b;
    public final int c;
    public final int o;

    public l42(String str, int i, int i2, long j, long j2, ct6[] ct6VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.o = i2;
        this.X = j;
        this.Y = j2;
        this.Z = ct6VarArr;
    }

    @Override // defpackage.ct6, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l42.class != obj.getClass()) {
            return false;
        }
        l42 l42Var = (l42) obj;
        return this.c == l42Var.c && this.o == l42Var.o && this.X == l42Var.X && this.Y == l42Var.Y && maf.a(this.b, l42Var.b) && Arrays.equals(this.Z, l42Var.Z);
    }

    public final int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.o) * 31) + ((int) this.X)) * 31) + ((int) this.Y)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeLong(this.X);
        parcel.writeLong(this.Y);
        ct6[] ct6VarArr = this.Z;
        parcel.writeInt(ct6VarArr.length);
        for (ct6 ct6Var : ct6VarArr) {
            parcel.writeParcelable(ct6Var, 0);
        }
    }

    public l42(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = maf.a;
        this.b = string;
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        this.X = parcel.readLong();
        this.Y = parcel.readLong();
        int i2 = parcel.readInt();
        this.Z = new ct6[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.Z[i3] = (ct6) parcel.readParcelable(ct6.class.getClassLoader());
        }
    }
}
