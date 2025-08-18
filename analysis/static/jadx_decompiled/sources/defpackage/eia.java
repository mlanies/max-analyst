package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class eia implements Parcelable {
    public static final Parcelable.Creator<eia> CREATOR = new fn9(5);
    public final int a;
    public final int b;
    public final int c;

    public eia(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static eia a(eia eiaVar, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = eiaVar.a;
        }
        if ((i4 & 2) != 0) {
            i2 = eiaVar.b;
        }
        if ((i4 & 4) != 0) {
            i3 = eiaVar.c;
        }
        eiaVar.getClass();
        return new eia(i, i2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eia)) {
            return false;
        }
        eia eiaVar = (eia) obj;
        return this.a == eiaVar.a && this.b == eiaVar.b && this.c == eiaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM = au1.m("ContainerParams(gravity=", zr6.j(new StringBuilder("ContainerGravity(value="), this.a, ")"), ", topMargin=");
        sbM.append(this.b);
        sbM.append(", bottomMargin=");
        return zr6.j(sbM, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public /* synthetic */ eia(int i, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 2 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
