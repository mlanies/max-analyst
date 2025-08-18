package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j38 implements c99 {
    public static final Parcelable.Creator<j38> CREATOR = new uk7(7);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int o;

    public j38(byte[] bArr, int i, int i2, String str) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.o = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j38.class != obj.getClass()) {
            return false;
        }
        j38 j38Var = (j38) obj;
        return this.a.equals(j38Var.a) && Arrays.equals(this.b, j38Var.b) && this.c == j38Var.c && this.o == j38Var.o;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + rh4.d(527, 31, this.a)) * 31) + this.c) * 31) + this.o;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return strValueOf.length() != 0 ? "mdta: key=".concat(strValueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
    }

    public j38(Parcel parcel) {
        String string = parcel.readString();
        int i = maf.a;
        this.a = string;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
    }
}
