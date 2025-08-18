package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k38 implements d99 {
    public static final Parcelable.Creator<k38> CREATOR = new uk7(8);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int o;

    public k38(byte[] bArr, int i, int i2, String str) {
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
        if (obj == null || k38.class != obj.getClass()) {
            return false;
        }
        k38 k38Var = (k38) obj;
        return this.a.equals(k38Var.a) && Arrays.equals(this.b, k38Var.b) && this.c == k38Var.c && this.o == k38Var.o;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + rh4.d(527, 31, this.a)) * 31) + this.c) * 31) + this.o;
    }

    public final String toString() {
        String strQ;
        byte[] bArr = this.b;
        int i = this.o;
        if (i == 1) {
            strQ = oaf.q(bArr);
        } else if (i == 23) {
            strQ = String.valueOf(Float.intBitsToFloat(s5c.z(bArr)));
        } else if (i != 67) {
            int i2 = oaf.a;
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i3 = 0; i3 < bArr.length; i3++) {
                sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i3] & 15, 16));
            }
            strQ = sb.toString();
        } else {
            strQ = String.valueOf(s5c.z(bArr));
        }
        return "mdta: key=" + this.a + ", value=" + strQ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
    }

    public k38(Parcel parcel) {
        String string = parcel.readString();
        int i = oaf.a;
        this.a = string;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
    }
}
