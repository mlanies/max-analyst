package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nfg extends n3 {
    public static final Parcelable.Creator<nfg> CREATOR = new vqf(27);
    public final int a;
    public final int b;
    public final long c;
    public final long o;

    public nfg(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.o = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nfg) {
            nfg nfgVar = (nfg) obj;
            if (this.a == nfgVar.a && this.b == nfgVar.b && this.c == nfgVar.c && this.o == nfgVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.o), Long.valueOf(this.c)});
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        long j = this.o;
        int length3 = String.valueOf(j).length();
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j2).length());
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i);
        sb.append(" Cell status: ");
        sb.append(i2);
        au1.q(j, " elapsed time NS: ", " system time ms: ", sb);
        sb.append(j2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b);
        ay7.X(parcel, 3, 8);
        parcel.writeLong(this.c);
        ay7.X(parcel, 4, 8);
        parcel.writeLong(this.o);
        ay7.W(parcel, iT);
    }
}
