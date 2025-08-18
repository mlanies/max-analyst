package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class gtd implements Parcelable {
    public final long a;
    public final long b;
    public final int c;
    public static final ye4 o = new ye4(21);
    public static final Parcelable.Creator<gtd> CREATOR = new etd(0);

    public gtd(long j, long j2, int i) {
        fm9.f(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gtd.class != obj.getClass()) {
            return false;
        }
        gtd gtdVar = (gtd) obj;
        return this.a == gtdVar.a && this.b == gtdVar.b && this.c == gtdVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        int i = oaf.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.a + ", endTimeMs=" + this.b + ", speedDivisor=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
