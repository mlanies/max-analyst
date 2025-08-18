package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class e4a implements Parcelable, Serializable {
    public static final Parcelable.Creator<e4a> CREATOR = new fn9(2);
    public final int X;
    public final long Y;
    public final String Z;
    public final String a;
    public final long b;
    public final int c;
    public final String o;
    public final String s0;
    public final List t0;
    public final List u0;
    public final List v0;
    public final List w0;

    public e4a(String str, int i, String str2, int i2, long j, String str3, List list, List list2, List list3, List list4) {
        this.a = str;
        this.c = i;
        this.o = str2;
        this.X = i2;
        this.Y = j;
        this.Z = str3;
        this.s0 = null;
        this.t0 = list;
        this.u0 = list2;
        this.v0 = list3;
        this.w0 = list4;
        this.b = System.currentTimeMillis();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{collector: ");
        sb.append(this.a);
        sb.append(", timetamp: ");
        sb.append(this.b);
        sb.append(", type: ");
        sb.append(this.c);
        sb.append(", operation: ");
        sb.append(this.o);
        sb.append(", time: ");
        sb.append(this.Y);
        String str = this.Z;
        if (str != null) {
            sb.append(", uid: ");
            sb.append(str);
        }
        String str2 = this.s0;
        if (str2 != null) {
            sb.append(", network: ");
            sb.append(str2);
        }
        int i = this.X;
        if (i != 1) {
            sb.append(", count: ");
            sb.append(i);
            sb.append(", ");
        }
        List list = this.u0;
        if (!list.isEmpty()) {
            sb.append(", data: [");
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append((String) list.get(i2));
            }
            sb.append("]");
        }
        List list2 = this.t0;
        if (!list2.isEmpty()) {
            sb.append(", groups: [");
            for (int i3 = 0; i3 < list2.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append((String) list2.get(i3));
            }
            sb.append("]");
        }
        List list3 = this.v0;
        if (!list3.isEmpty()) {
            sb.append(", custom: {");
            for (int i4 = 0; i4 < list3.size(); i4++) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append((String) list3.get(i4));
                sb.append(": ");
                sb.append((String) this.w0.get(i4));
            }
            sb.append("}");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.o);
        parcel.writeInt(this.X);
        parcel.writeLong(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.s0);
        parcel.writeStringList(this.t0);
        parcel.writeStringList(this.u0);
        parcel.writeStringList(this.v0);
        parcel.writeStringList(this.w0);
    }

    public e4a(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.o = parcel.readString();
        this.X = parcel.readInt();
        this.Y = parcel.readLong();
        this.Z = parcel.readString();
        this.s0 = parcel.readString();
        this.t0 = parcel.createStringArrayList();
        this.u0 = parcel.createStringArrayList();
        this.v0 = parcel.createStringArrayList();
        this.w0 = parcel.createStringArrayList();
    }
}
