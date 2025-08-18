package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class uc9 implements c99 {
    public static final Parcelable.Creator<uc9> CREATOR = new uk7(25);
    public final long X;
    public final long a;
    public final long b;
    public final long c;
    public final long o;

    public uc9(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = j4;
        this.X = j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uc9.class != obj.getClass()) {
            return false;
        }
        uc9 uc9Var = (uc9) obj;
        return this.a == uc9Var.a && this.b == uc9Var.b && this.c == uc9Var.c && this.o == uc9Var.o && this.X == uc9Var.X;
    }

    public final int hashCode() {
        return pag.p(this.X) + ((pag.p(this.o) + ((pag.p(this.c) + ((pag.p(this.b) + ((pag.p(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(this.a);
        sb.append(", photoSize=");
        sb.append(this.b);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(this.c);
        sb.append(", videoStartPosition=");
        sb.append(this.o);
        sb.append(", videoSize=");
        sb.append(this.X);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeLong(this.X);
    }

    public uc9(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.X = parcel.readLong();
    }
}
