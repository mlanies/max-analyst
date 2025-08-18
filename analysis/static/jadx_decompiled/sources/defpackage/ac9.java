package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ac9 extends dt6 {
    public static final Parcelable.Creator<ac9> CREATOR = new uk7(23);
    public final int[] X;
    public final int[] Y;
    public final int b;
    public final int c;
    public final int o;

    public ac9(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = iArr;
        this.Y = iArr2;
    }

    @Override // defpackage.dt6, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ac9.class != obj.getClass()) {
            return false;
        }
        ac9 ac9Var = (ac9) obj;
        return this.b == ac9Var.b && this.c == ac9Var.c && this.o == ac9Var.o && Arrays.equals(this.X, ac9Var.X) && Arrays.equals(this.Y, ac9Var.Y);
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

    public ac9(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = oaf.a;
        this.X = iArrCreateIntArray;
        this.Y = parcel.createIntArray();
    }
}
