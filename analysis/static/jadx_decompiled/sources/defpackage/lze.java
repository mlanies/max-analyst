package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class lze implements Parcelable {
    public final int X;
    public final int Y;
    public final int Z;
    public final String a;
    public final String b;
    public final String c;
    public final int o;
    public final int s0;
    public final int t0;
    public static final lze u0 = new lze(null, null, null, -1, -1, 0, 0, 0, 0);
    public static final Parcelable.Creator<lze> CREATOR = new etd(21);

    public lze(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = i;
        this.X = i2;
        this.Y = i3;
        this.Z = i4;
        this.s0 = i5;
        this.t0 = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lze.class != obj.getClass()) {
            return false;
        }
        lze lzeVar = (lze) obj;
        if (this.o != lzeVar.o || this.X != lzeVar.X || this.Y != lzeVar.Y || this.Z != lzeVar.Z || this.s0 != lzeVar.s0 || this.t0 != lzeVar.t0) {
            return false;
        }
        String str = lzeVar.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = lzeVar.b;
        String str4 = this.b;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = lzeVar.c;
        String str6 = this.c;
        return str6 != null ? str6.equals(str5) : str5 == null;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return ((((((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + this.s0) * 31) + this.t0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Track{id='");
        sb.append(this.a);
        sb.append("', label='");
        sb.append(this.b);
        sb.append("', language='");
        sb.append(this.c);
        sb.append("', width=");
        sb.append(this.o);
        sb.append(", height=");
        sb.append(this.X);
        sb.append(", bitrate=");
        sb.append(this.Y);
        sb.append(", rendererIndex=");
        sb.append(this.Z);
        sb.append(", groupIndex=");
        sb.append(this.s0);
        sb.append(", trackIndex=");
        return au1.h(sb, this.t0, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.s0);
        parcel.writeInt(this.t0);
    }

    public lze(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.s0 = parcel.readInt();
        this.t0 = parcel.readInt();
    }
}
