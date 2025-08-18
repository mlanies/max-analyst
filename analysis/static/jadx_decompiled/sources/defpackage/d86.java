package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class d86 implements Parcelable {
    public static final Parcelable.Creator<d86> CREATOR = new f73(27);
    public static final d86 t0 = new d86(true, true, true, false, nz4.a, false, false);
    public final List X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final boolean s0;

    public d86(boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.o = z4;
        this.X = list;
        this.Y = z5;
        this.Z = z6;
        this.s0 = !z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d86)) {
            return false;
        }
        d86 d86Var = (d86) obj;
        return this.a == d86Var.a && this.b == d86Var.b && this.c == d86Var.c && this.o == d86Var.o && tpa.f(this.X, d86Var.X) && this.Y == d86Var.Y && this.Z == d86Var.Z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Z) + ms2.d(k7d.g(this.X, ms2.d(ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31), 31, this.Y);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryMode(needCameraView=");
        sb.append(this.a);
        sb.append(", useVideos=");
        sb.append(this.b);
        sb.append(", multiSelectionEnabled=");
        sb.append(this.c);
        sb.append(", isMessageEdit=");
        sb.append(this.o);
        sb.append(", selectedItems=");
        sb.append(this.X);
        sb.append(", profileCreation=");
        sb.append(this.Y);
        sb.append(", useTopInset=");
        return au1.j(sb, this.Z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        List list = this.X;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }
}
