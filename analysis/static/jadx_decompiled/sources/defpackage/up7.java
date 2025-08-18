package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class up7 extends o2 implements Parcelable {
    public static final Parcelable.Creator<up7> CREATOR = new uk7(2);
    public final int X;
    public final long Y;
    public final String Z;
    public final long b;
    public final String c;
    public final String o;
    public final long s0;
    public Uri t0;

    public up7(int i, long j, String str, String str2, int i2, long j2, String str3, long j3, Uri uri) {
        super(i);
        this.b = j;
        this.c = str;
        this.o = str2;
        this.X = i2;
        this.Y = j2;
        this.Z = str3;
        this.s0 = j3;
        this.t0 = uri;
    }

    @Override // defpackage.o2
    public String a() {
        Uri uri = this.t0;
        return uri != null ? uri.toString() : this.c;
    }

    public Uri c() {
        Uri uri = this.t0;
        if (uri != null) {
            return uri;
        }
        try {
            Uri uri2 = Uri.parse(this.c);
            this.t0 = uri2;
            return uri2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean d() {
        if (this.a != 1) {
            return false;
        }
        String str = this.Z;
        return str != null ? eae.o0(str, ey8.f(5), true) : false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        f8.H(parcel, this.c);
        f8.H(parcel, this.o);
        parcel.writeInt(this.X);
        parcel.writeLong(this.Y);
        parcel.writeString(this.Z);
        parcel.writeLong(this.s0);
        Uri uri = this.t0;
        byte b = uri != null ? (byte) 1 : (byte) 0;
        parcel.writeByte(b);
        if (b != 0) {
            parcel.writeParcelable(uri, i);
        }
    }

    public up7(Parcel parcel) {
        this(parcel.readInt(), parcel.readLong(), f8.x(parcel), f8.x(parcel), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readLong(), (Uri) (parcel.readByte() == 1 ? parcel.readParcelable(Uri.class.getClassLoader()) : null));
    }
}
