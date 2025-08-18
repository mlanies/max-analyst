package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class bn5 extends pdc implements ym5 {
    public static final Parcelable.Creator<bn5> CREATOR = new f73(20);
    public float X;
    public float Y;
    public int Z;
    public float s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.X);
        parcel.writeFloat(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeFloat(this.s0);
        parcel.writeInt(this.t0);
        parcel.writeInt(this.u0);
        parcel.writeInt(this.v0);
        parcel.writeInt(this.w0);
        parcel.writeByte(this.x0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
