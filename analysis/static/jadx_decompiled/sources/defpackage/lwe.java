package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class lwe extends z {
    public static final Parcelable.Creator<lwe> CREATOR = new y(11);
    public int c;
    public boolean o;

    public lwe(Parcel parcel) {
        this(parcel, null);
    }

    @Override // defpackage.z, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public lwe(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.o = parcel.readInt() != 0;
    }
}
