package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zb9 extends ct6 {
    public static final Parcelable.Creator<zb9> CREATOR = new uk7(22);
    public final int[] X;
    public final int[] Y;
    public final int b;
    public final int c;
    public final int o;

    public zb9(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = iArr;
        this.Y = iArr2;
    }

    @Override // defpackage.ct6, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zb9.class != obj.getClass()) {
            return false;
        }
        zb9 zb9Var = (zb9) obj;
        return this.b == zb9Var.b && this.c == zb9Var.c && this.o == zb9Var.o && Arrays.equals(this.X, zb9Var.X) && Arrays.equals(this.Y, zb9Var.Y);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.Y) + ((Arrays.hashCode(this.X) + ((((((527 + this.b) * 31) + this.c) * 31) + this.o) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeIntArray(this.X);
        parcel.writeIntArray(this.Y);
    }

    public zb9(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = maf.a;
        this.X = iArrCreateIntArray;
        this.Y = parcel.createIntArray();
    }
}
