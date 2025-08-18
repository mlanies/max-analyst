package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class r16 implements Parcelable {
    public static final Parcelable.Creator<r16> CREATOR = new f73(24);
    public final int X;
    public final int Y;
    public final String Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean o;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final int w0;
    public final String x0;
    public final int y0;
    public final boolean z0;

    public r16(a aVar) {
        this.a = aVar.getClass().getName();
        this.b = aVar.Y;
        this.c = aVar.z0;
        this.o = aVar.B0;
        this.X = aVar.J0;
        this.Y = aVar.K0;
        this.Z = aVar.L0;
        this.s0 = aVar.O0;
        this.t0 = aVar.x0;
        this.u0 = aVar.N0;
        this.v0 = aVar.M0;
        this.w0 = aVar.c1.ordinal();
        this.x0 = aVar.t0;
        this.y0 = aVar.u0;
        this.z0 = aVar.W0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.o) {
            sb.append(" dynamicContainer");
        }
        int i = this.Y;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.Z;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.s0) {
            sb.append(" retainInstance");
        }
        if (this.t0) {
            sb.append(" removing");
        }
        if (this.u0) {
            sb.append(" detached");
        }
        if (this.v0) {
            sb.append(" hidden");
        }
        String str2 = this.x0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.y0);
        }
        if (this.z0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.s0 ? 1 : 0);
        parcel.writeInt(this.t0 ? 1 : 0);
        parcel.writeInt(this.u0 ? 1 : 0);
        parcel.writeInt(this.v0 ? 1 : 0);
        parcel.writeInt(this.w0);
        parcel.writeString(this.x0);
        parcel.writeInt(this.y0);
        parcel.writeInt(this.z0 ? 1 : 0);
    }

    public r16(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.o = parcel.readInt() != 0;
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readString();
        this.s0 = parcel.readInt() != 0;
        this.t0 = parcel.readInt() != 0;
        this.u0 = parcel.readInt() != 0;
        this.v0 = parcel.readInt() != 0;
        this.w0 = parcel.readInt();
        this.x0 = parcel.readString();
        this.y0 = parcel.readInt();
        this.z0 = parcel.readInt() != 0;
    }
}
