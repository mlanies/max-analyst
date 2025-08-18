package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vc9 implements d99 {
    public static final Parcelable.Creator<vc9> CREATOR = new uk7(26);
    public final long X;
    public final long a;
    public final long b;
    public final long c;
    public final long o;

    public vc9(long j, long j2, long j3, long j4, long j5) {
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
        if (obj == null || vc9.class != obj.getClass()) {
            return false;
        }
        vc9 vc9Var = (vc9) obj;
        return this.a == vc9Var.a && this.b == vc9Var.b && this.c == vc9Var.c && this.o == vc9Var.o && this.X == vc9Var.X;
    }

    public final int hashCode() {
        return pag.p(this.X) + ((pag.p(this.o) + ((pag.p(this.c) + ((pag.p(this.b) + ((pag.p(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.o + ", videoSize=" + this.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeLong(this.X);
    }

    public vc9(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.X = parcel.readLong();
    }
}
