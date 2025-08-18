package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class pxd implements Parcelable {
    public static final Parcelable.Creator<pxd> CREATOR = new etd(10);
    public int X;
    public int[] Y;
    public List Z;
    public int a;
    public int b;
    public int c;
    public int[] o;
    public boolean s0;
    public boolean t0;
    public boolean u0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.c > 0) {
            parcel.writeIntArray(this.o);
        }
        parcel.writeInt(this.X);
        if (this.X > 0) {
            parcel.writeIntArray(this.Y);
        }
        parcel.writeInt(this.s0 ? 1 : 0);
        parcel.writeInt(this.t0 ? 1 : 0);
        parcel.writeInt(this.u0 ? 1 : 0);
        parcel.writeList(this.Z);
    }
}
