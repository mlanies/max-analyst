package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class x7b implements Parcelable {
    public static final Parcelable.Creator<x7b> CREATOR = new fn9(28);
    public final r7b a;

    public x7b(r7b r7bVar) {
        this.a = r7bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        r7b r7bVar = this.a;
        parcel.writeInt(r7bVar.a);
        parcel.writeInt(r7bVar.b);
    }

    public x7b(Parcel parcel) {
        this.a = new r7b(parcel.readInt(), parcel.readInt());
    }
}
