package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class tra extends n3 {
    public static final Parcelable.Creator<tra> CREATOR = new ufg(19);
    public final int a;
    public final Float b;

    public tra(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        fp3.g("Invalid PatternItem: type=" + i + " length=" + f, z);
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tra)) {
            return false;
        }
        tra traVar = (tra) obj;
        return this.a == traVar.a && s36.l(this.b, traVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "[PatternItem: type=" + this.a + " length=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.a);
        ay7.N(parcel, 3, this.b);
        ay7.W(parcel, iT);
    }
}
