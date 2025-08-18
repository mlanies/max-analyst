package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m42 extends dt6 {
    public static final Parcelable.Creator<m42> CREATOR = new d6(20);
    public final long X;
    public final long Y;
    public final dt6[] Z;
    public final String b;
    public final int c;
    public final int o;

    public m42(String str, int i, int i2, long j, long j2, dt6[] dt6VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.o = i2;
        this.X = j;
        this.Y = j2;
        this.Z = dt6VarArr;
    }

    @Override // defpackage.dt6, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m42.class != obj.getClass()) {
            return false;
        }
        m42 m42Var = (m42) obj;
        return this.c == m42Var.c && this.o == m42Var.o && this.X == m42Var.X && this.Y == m42Var.Y && oaf.a(this.b, m42Var.b) && Arrays.equals(this.Z, m42Var.Z);
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
        dt6[] dt6VarArr = this.Z;
        parcel.writeInt(dt6VarArr.length);
        for (dt6 dt6Var : dt6VarArr) {
            parcel.writeParcelable(dt6Var, 0);
        }
    }

    public m42(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = oaf.a;
        this.b = string;
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        this.X = parcel.readLong();
        this.Y = parcel.readLong();
        int i2 = parcel.readInt();
        this.Z = new dt6[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.Z[i3] = (dt6) parcel.readParcelable(dt6.class.getClassLoader());
        }
    }
}
