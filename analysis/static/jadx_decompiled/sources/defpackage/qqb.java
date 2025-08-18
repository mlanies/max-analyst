package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class qqb implements Parcelable {
    public static final Parcelable.Creator<qqb> CREATOR = new e9b(9);
    public final nqb a;

    public qqb(nqb nqbVar) {
        this.a = nqbVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqb) && tpa.f(this.a, ((qqb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QualityParc(value=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nqb nqbVar = this.a;
        parcel.writeString(nqbVar.a.a);
        parcel.writeInt(nqbVar.b);
        parcel.writeInt(nqbVar.c);
        parcel.writeInt(nqbVar.d);
        parcel.writeLong(nqbVar.e);
        parcel.writeByte(nqbVar.f ? (byte) 1 : (byte) 0);
    }
}
