package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class upa implements Parcelable {
    public static final Parcelable.Creator<upa> CREATOR = new fn9(20);
    public final int X;
    public final int a;
    public final int b;
    public final int c;
    public final int o;

    public upa(Parcel parcel) {
        this.a = parcel.readInt();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.X);
        parcel.writeInt(this.b);
    }
}
