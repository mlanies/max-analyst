package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class rw8 {
    public final long a;
    public final String b;
    public final long c;
    public final Long d;
    public final long e;
    public final String f;
    public final long g;
    public final Bitmap h;
    public final long i;
    public final yx8 j;
    public final ne5 k;
    public final dv9 l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public rw8(long j, String str, long j2, Long l, long j3, String str2, long j4, Bitmap bitmap, long j5, yx8 yx8Var, ne5 ne5Var, dv9 dv9Var, boolean z, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = l;
        this.e = j3;
        this.f = str2;
        this.g = j4;
        this.h = bitmap;
        this.i = j5;
        this.j = yx8Var;
        this.k = ne5Var;
        this.l = dv9Var;
        this.m = z;
        this.n = z2;
        this.o = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw8)) {
            return false;
        }
        rw8 rw8Var = (rw8) obj;
        return this.a == rw8Var.a && tpa.f(this.b, rw8Var.b) && this.c == rw8Var.c && tpa.f(this.d, rw8Var.d) && this.e == rw8Var.e && tpa.f(this.f, rw8Var.f) && this.g == rw8Var.g && tpa.f(this.h, rw8Var.h) && this.i == rw8Var.i && tpa.f(this.j, rw8Var.j) && this.k == rw8Var.k && tpa.f(this.l, rw8Var.l) && this.m == rw8Var.m && this.n == rw8Var.n && this.o == rw8Var.o;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iM = h4f.m((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        int iM2 = h4f.m(rh4.d(h4f.m((iM + (l == null ? 0 : l.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        Bitmap bitmap = this.h;
        int iHashCode2 = (this.k.hashCode() + ((this.j.hashCode() + h4f.m((iM2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.i)) * 31)) * 31;
        dv9 dv9Var = this.l;
        return Boolean.hashCode(this.o) + ms2.d(ms2.d((iHashCode2 + (dv9Var != null ? dv9Var.hashCode() : 0)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageNotification(pushId=");
        sb.append(this.a);
        sb.append(", eventKey=");
        sb.append(this.b);
        sb.append(", chatServerId=");
        sb.append(this.c);
        sb.append(", chatId=");
        sb.append(this.d);
        sb.append(", messageId=");
        sb.append(this.e);
        sb.append("', senderUserId=");
        sb.append(this.g);
        sb.append(", time=");
        sb.append(this.i);
        sb.append(", text=");
        sb.append(this.j);
        sb.append(", fcmNotificationType=");
        sb.append(this.k);
        sb.append(", image=");
        sb.append(this.l);
        sb.append(", fcmSource=");
        sb.append(this.m);
        sb.append(", isScheduledMessage=");
        sb.append(this.n);
        sb.append(", hasAnyError=");
        return au1.j(sb, this.o, ")");
    }

    public /* synthetic */ rw8(long j, String str, long j2, Long l, long j3, String str2, long j4, Bitmap bitmap, long j5, yx8 yx8Var, ne5 ne5Var, dv9 dv9Var, boolean z, boolean z2, boolean z3, int i) {
        this(j, str, j2, l, j3, str2, j4, bitmap, j5, yx8Var, ne5Var, (i & 2048) != 0 ? null : dv9Var, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? false : z3);
    }
}
