package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tx0 implements Parcelable {
    public static final Parcelable.Creator<tx0> CREATOR = new d6(14);
    public final int X;
    public final int Y;
    public final int Z;
    public final kc9 a;
    public final kc9 b;
    public final v34 c;
    public final kc9 o;

    public tx0(kc9 kc9Var, kc9 kc9Var2, v34 v34Var, kc9 kc9Var3, int i) {
        Objects.requireNonNull(kc9Var, "start cannot be null");
        Objects.requireNonNull(kc9Var2, "end cannot be null");
        Objects.requireNonNull(v34Var, "validator cannot be null");
        this.a = kc9Var;
        this.b = kc9Var2;
        this.o = kc9Var3;
        this.X = i;
        this.c = v34Var;
        if (kc9Var3 != null && kc9Var.a.compareTo(kc9Var3.a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (kc9Var3 != null && kc9Var3.a.compareTo(kc9Var2.a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > jaf.d(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.Z = kc9Var.d(kc9Var2) + 1;
        this.Y = (kc9Var2.c - kc9Var.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx0)) {
            return false;
        }
        tx0 tx0Var = (tx0) obj;
        return this.a.equals(tx0Var.a) && this.b.equals(tx0Var.b) && Objects.equals(this.o, tx0Var.o) && this.X == tx0Var.X && this.c.equals(tx0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.o, Integer.valueOf(this.X), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.o, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.X);
    }
}
