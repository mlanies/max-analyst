package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class kc9 implements Comparable, Parcelable {
    public static final Parcelable.Creator<kc9> CREATOR = new uk7(24);
    public final int X;
    public final long Y;
    public String Z;
    public final Calendar a;
    public final int b;
    public final int c;
    public final int o;

    public kc9(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarB = jaf.b(calendar);
        this.a = calendarB;
        this.b = calendarB.get(2);
        this.c = calendarB.get(1);
        this.o = calendarB.getMaximum(7);
        this.X = calendarB.getActualMaximum(5);
        this.Y = calendarB.getTimeInMillis();
    }

    public static kc9 a(int i, int i2) {
        Calendar calendarD = jaf.d(null);
        calendarD.set(1, i);
        calendarD.set(2, i2);
        return new kc9(calendarD);
    }

    public static kc9 b(long j) {
        Calendar calendarD = jaf.d(null);
        calendarD.setTimeInMillis(j);
        return new kc9(calendarD);
    }

    public final String c() {
        if (this.Z == null) {
            this.Z = jaf.a("yMMMM", Locale.getDefault()).format(new Date(this.a.getTimeInMillis()));
        }
        return this.Z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((kc9) obj).a);
    }

    public final int d(kc9 kc9Var) {
        if (!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (kc9Var.b - this.b) + ((kc9Var.c - this.c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc9)) {
            return false;
        }
        kc9 kc9Var = (kc9) obj;
        return this.b == kc9Var.b && this.c == kc9Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
