package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class cwa implements Parcelable {
    public static final Parcelable.Creator<cwa> CREATOR = new fn9(23);
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;

    public cwa(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.o = z4;
        this.X = z5;
        this.Y = z6;
        this.Z = z7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwa)) {
            return false;
        }
        cwa cwaVar = (cwa) obj;
        return this.a == cwaVar.a && this.b == cwaVar.b && this.c == cwaVar.c && this.o == cwaVar.o && this.X == cwaVar.X && this.Y == cwaVar.Y && this.Z == cwaVar.Z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Z) + ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.X), 31, this.Y);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoEditorViewState(redoVisible=");
        sb.append(this.a);
        sb.append(", undoVisible=");
        sb.append(this.b);
        sb.append(", clearVisible=");
        sb.append(this.c);
        sb.append(", drawStickerVisible=");
        sb.append(this.o);
        sb.append(", drawStickerEnabled=");
        sb.append(this.X);
        sb.append(", doneEnabled=");
        sb.append(this.Y);
        sb.append(", isRegularSending=");
        return au1.j(sb, this.Z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }
}
