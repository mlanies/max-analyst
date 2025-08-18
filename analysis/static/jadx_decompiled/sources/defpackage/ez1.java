package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ez1 extends n3 {
    public static final Parcelable.Creator<ez1> CREATOR = new vqf(28);
    public final int a;
    public final rxd b;
    public final Float c;

    public ez1(int i, rxd rxdVar, Float f) {
        boolean z = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            z = rxdVar != null && z;
            i = 3;
        }
        fp3.g("Invalid Cap: type=" + i + " bitmapDescriptor=" + rxdVar + " bitmapRefWidth=" + f, z);
        this.a = i;
        this.b = rxdVar;
        this.c = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ez1 b() {
        int i = this.a;
        if (i == 0) {
            return new bv0();
        }
        rxd rxdVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        char c = 1;
        if (i == 1) {
            return new bv0(c == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 2);
        }
        int i2 = 2;
        if (i == 2) {
            return new bv0(i2, rxdVar, objArr3 == true ? 1 : 0, 1);
        }
        if (i != 3) {
            return this;
        }
        rxd rxdVar2 = this.b;
        fp3.p("bitmapDescriptor must not be null", rxdVar2 != null);
        Float f = this.c;
        fp3.p("bitmapRefWidth must not be null", f != null);
        return new k04(rxdVar2, f.floatValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez1)) {
            return false;
        }
        ez1 ez1Var = (ez1) obj;
        return this.a == ez1Var.a && s36.l(this.b, ez1Var.b) && s36.l(this.c, ez1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public String toString() {
        return zr6.j(new StringBuilder("[Cap: type="), this.a, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.a);
        rxd rxdVar = this.b;
        ay7.O(parcel, 3, rxdVar == null ? null : ((xr6) rxdVar.b).asBinder());
        ay7.N(parcel, 4, this.c);
        ay7.W(parcel, iT);
    }
}
