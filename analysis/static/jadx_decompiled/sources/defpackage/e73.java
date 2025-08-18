package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class e73 implements Parcelable {
    public static final Parcelable.Creator<e73> CREATOR = new d6(28);
    public final int a;
    public final int b;

    public e73(int i) {
        this.a = 1;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e73.class != obj.getClass()) {
            return false;
        }
        e73 e73Var = (e73) obj;
        return this.b == e73Var.b && this.a == e73Var.a;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i != 0 ? au1.s(i) : 0) * 31) + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        if (this.a != 1) {
            throw null;
        }
        parcel.writeString("ADD");
    }

    public e73(Parcel parcel) {
        this.b = parcel.readInt();
        String string = parcel.readString();
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("ADD")) {
            this.a = 1;
            return;
        }
        throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.CommandState.Type.".concat(string));
    }
}
