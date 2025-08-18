package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class m34 implements Parcelable {
    public static final Parcelable.Creator<m34> CREATOR = new f73(6);
    public final x34 a;
    public final qte b;
    public final qte c;

    public m34(x34 x34Var, qte qteVar, qte qteVar2) {
        this.a = x34Var;
        this.b = qteVar;
        this.c = qteVar2;
    }

    public static m34 a(m34 m34Var, x34 x34Var, qte qteVar, qte qteVar2, int i) {
        if ((i & 1) != 0) {
            x34Var = m34Var.a;
        }
        if ((i & 2) != 0) {
            qteVar = m34Var.b;
        }
        if ((i & 4) != 0) {
            qteVar2 = m34Var.c;
        }
        return new m34(x34Var, qteVar, qteVar2);
    }

    public final long b() {
        Calendar calendar = Calendar.getInstance();
        x34 x34Var = this.a;
        calendar.set(1, x34Var.o);
        calendar.set(2, x34Var.c);
        calendar.set(5, x34Var.b);
        calendar.set(11, this.b.a);
        calendar.set(12, this.c.a);
        calendar.set(13, 0);
        calendar.set(14, 0);
        hm9.n("DateTime", calendar.getTime().toString());
        return calendar.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m34)) {
            return false;
        }
        m34 m34Var = (m34) obj;
        return tpa.f(this.a, m34Var.a) && tpa.f(this.b, m34Var.b) && tpa.f(this.c, m34Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + k7d.e(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DateTime(day=" + this.a + ", hour=" + this.b + ", minutes=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
    }
}
