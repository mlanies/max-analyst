package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class be9 implements d99 {
    public static final Parcelable.Creator<be9> CREATOR = new uk7(28);
    public final long a;
    public final long b;
    public final long c;

    public be9(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be9)) {
            return false;
        }
        be9 be9Var = (be9) obj;
        return this.a == be9Var.a && this.b == be9Var.b && this.c == be9Var.c;
    }

    public final int hashCode() {
        return pag.p(this.c) + ((pag.p(this.b) + ((pag.p(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }

    public be9(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
    }
}
