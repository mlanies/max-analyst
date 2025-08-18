package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes.dex */
public final class pe5 extends n3 {
    public static final Parcelable.Creator<pe5> CREATOR = new ufg(4);
    public final String a;
    public final int b;
    public final long c;

    public pe5(long j, String str, int i) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long b() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pe5) {
            pe5 pe5Var = (pe5) obj;
            String str = this.a;
            if (((str != null && str.equals(pe5Var.a)) || (str == null && pe5Var.a == null)) && b() == pe5Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b())});
    }

    public final String toString() {
        qz7 qz7Var = new qz7(this);
        qz7Var.h(this.a, "name");
        qz7Var.h(Long.valueOf(b()), ClientCookie.VERSION_ATTR);
        return qz7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.Q(parcel, 1, this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b);
        long jB = b();
        ay7.X(parcel, 3, 8);
        parcel.writeLong(jB);
        ay7.W(parcel, iT);
    }

    public pe5(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }
}
