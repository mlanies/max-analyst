package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class cg0 implements Parcelable {
    public static final Parcelable.Creator<cg0> CREATOR = new d6(10);
    public CharSequence A0;
    public int B0;
    public int C0;
    public Integer D0;
    public Integer F0;
    public Integer G0;
    public Integer H0;
    public Integer I0;
    public Integer J0;
    public Integer K0;
    public Integer L0;
    public Integer M0;
    public Integer N0;
    public Boolean O0;
    public Integer X;
    public Integer Y;
    public Integer Z;
    public int a;
    public Integer b;
    public Integer c;
    public Integer o;
    public Integer s0;
    public String u0;
    public Locale y0;
    public CharSequence z0;
    public int t0 = 255;
    public int v0 = -2;
    public int w0 = -2;
    public int x0 = -2;
    public Boolean E0 = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.o);
        parcel.writeSerializable(this.X);
        parcel.writeSerializable(this.Y);
        parcel.writeSerializable(this.Z);
        parcel.writeSerializable(this.s0);
        parcel.writeInt(this.t0);
        parcel.writeString(this.u0);
        parcel.writeInt(this.v0);
        parcel.writeInt(this.w0);
        parcel.writeInt(this.x0);
        CharSequence charSequence = this.z0;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.A0;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.B0);
        parcel.writeSerializable(this.D0);
        parcel.writeSerializable(this.F0);
        parcel.writeSerializable(this.G0);
        parcel.writeSerializable(this.H0);
        parcel.writeSerializable(this.I0);
        parcel.writeSerializable(this.J0);
        parcel.writeSerializable(this.K0);
        parcel.writeSerializable(this.N0);
        parcel.writeSerializable(this.L0);
        parcel.writeSerializable(this.M0);
        parcel.writeSerializable(this.E0);
        parcel.writeSerializable(this.y0);
        parcel.writeSerializable(this.O0);
    }
}
