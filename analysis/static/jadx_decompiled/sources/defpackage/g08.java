package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes.dex */
public class g08 extends n3 {
    public static final Parcelable.Creator<g08> CREATOR = new ufg(18);
    public View A0;
    public int B0;
    public String C0;
    public float D0;
    public float X;
    public float Y;
    public boolean Z;
    public LatLng a;
    public String b;
    public String c;
    public rxd o;
    public boolean s0;
    public boolean t0;
    public float u0;
    public float v0;
    public float w0;
    public float x0;
    public float y0;
    public int z0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.P(parcel, 2, this.a, i);
        ay7.Q(parcel, 3, this.b);
        ay7.Q(parcel, 4, this.c);
        rxd rxdVar = this.o;
        ay7.O(parcel, 5, rxdVar == null ? null : ((xr6) rxdVar.b).asBinder());
        float f = this.X;
        ay7.X(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.Y;
        ay7.X(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.Z;
        ay7.X(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.s0;
        ay7.X(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ay7.X(parcel, 10, 4);
        parcel.writeInt(this.t0 ? 1 : 0);
        ay7.X(parcel, 11, 4);
        parcel.writeFloat(this.u0);
        ay7.X(parcel, 12, 4);
        parcel.writeFloat(this.v0);
        ay7.X(parcel, 13, 4);
        parcel.writeFloat(this.w0);
        ay7.X(parcel, 14, 4);
        parcel.writeFloat(this.x0);
        float f3 = this.y0;
        ay7.X(parcel, 15, 4);
        parcel.writeFloat(f3);
        ay7.X(parcel, 17, 4);
        parcel.writeInt(this.z0);
        ay7.O(parcel, 18, new oy9(this.A0));
        int i2 = this.B0;
        ay7.X(parcel, 19, 4);
        parcel.writeInt(i2);
        ay7.Q(parcel, 20, this.C0);
        ay7.X(parcel, 21, 4);
        parcel.writeFloat(this.D0);
        ay7.W(parcel, iT);
    }
}
