package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b03 extends z {
    public static final Parcelable.Creator<b03> CREATOR = new y(3);
    public boolean c;

    public b03(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt() == 1;
    }

    @Override // defpackage.z, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
