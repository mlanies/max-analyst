package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yd7 extends n3 {
    public static final Parcelable.Creator<yd7> CREATOR = new vqf(16);
    public final long a;
    public final int b;
    public final boolean c;
    public final ghg o;

    public yd7(long j, int i, boolean z, ghg ghgVar) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.o = ghgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yd7)) {
            return false;
        }
        yd7 yd7Var = (yd7) obj;
        return this.a == yd7Var.a && this.b == yd7Var.b && this.c == yd7Var.c && s36.l(this.o, yd7Var.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder sbL = au1.l("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            sbL.append("maxAge=");
            nhg.a(j, sbL);
        }
        int i = this.b;
        if (i != 0) {
            sbL.append(", ");
            if (i == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sbL.append(str);
        }
        if (this.c) {
            sbL.append(", bypass");
        }
        ghg ghgVar = this.o;
        if (ghgVar != null) {
            sbL.append(", impersonation=");
            sbL.append(ghgVar);
        }
        sbL.append(']');
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 8);
        parcel.writeLong(this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ay7.P(parcel, 5, this.o, i);
        ay7.W(parcel, iT);
    }
}
