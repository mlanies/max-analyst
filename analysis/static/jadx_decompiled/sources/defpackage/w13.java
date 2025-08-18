package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes.dex */
public final class w13 extends n3 {
    public static final Parcelable.Creator<w13> CREATOR = new ufg(3);
    public int X;
    public float Y;
    public boolean Z;
    public LatLng a;
    public double b;
    public float c;
    public int o;
    public boolean s0;
    public List t0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.P(parcel, 2, this.a, i);
        double d = this.b;
        ay7.X(parcel, 3, 8);
        parcel.writeDouble(d);
        float f = this.c;
        ay7.X(parcel, 4, 4);
        parcel.writeFloat(f);
        int i2 = this.o;
        ay7.X(parcel, 5, 4);
        parcel.writeInt(i2);
        int i3 = this.X;
        ay7.X(parcel, 6, 4);
        parcel.writeInt(i3);
        float f2 = this.Y;
        ay7.X(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.Z;
        ay7.X(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.s0;
        ay7.X(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ay7.S(parcel, this.t0, 10);
        ay7.W(parcel, iT);
    }
}
