package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class dia implements Parcelable {
    public static final Parcelable.Creator<dia> CREATOR = new fn9(4);
    public final int a;

    public /* synthetic */ dia(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dia) {
            return this.a == ((dia) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("ContainerGravity(value="), this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
