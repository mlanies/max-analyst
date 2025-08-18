package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* loaded from: classes2.dex */
public final class ql2 {
    public final long a;
    public final String b;
    public final long c;
    public final String d;
    public final rl2 e;
    public final List f;
    public final List g;
    public final Bitmap h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final String n;
    public final long o;

    public ql2(long j, String str, long j2, String str2, rl2 rl2Var, List list, List list2, Bitmap bitmap, int i, boolean z, boolean z2, long j3, long j4, String str3, long j5) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = rl2Var;
        this.f = list;
        this.g = list2;
        this.h = bitmap;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = j3;
        this.m = j4;
        this.n = str3;
        this.o = j5;
    }

    public static ql2 a(ql2 ql2Var, List list, List list2, boolean z, int i) {
        long j = ql2Var.a;
        String str = ql2Var.b;
        long j2 = ql2Var.c;
        String str2 = ql2Var.d;
        rl2 rl2Var = ql2Var.e;
        List list3 = (i & 32) != 0 ? ql2Var.f : list;
        List list4 = (i & 64) != 0 ? ql2Var.g : list2;
        Bitmap bitmap = ql2Var.h;
        int i2 = (i & 256) != 0 ? ql2Var.i : 0;
        boolean z2 = (i & 512) != 0 ? ql2Var.j : z;
        boolean z3 = ql2Var.k;
        long j3 = ql2Var.l;
        long j4 = ql2Var.m;
        String str3 = ql2Var.n;
        long j5 = ql2Var.o;
        ql2Var.getClass();
        return new ql2(j, str, j2, str2, rl2Var, list3, list4, bitmap, i2, z2, z3, j3, j4, str3, j5);
    }

    public final boolean b() {
        rw8 rw8Var = (rw8) x53.q0(this.f);
        return rw8Var != null && rw8Var.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql2)) {
            return false;
        }
        ql2 ql2Var = (ql2) obj;
        return this.a == ql2Var.a && tpa.f(this.b, ql2Var.b) && this.c == ql2Var.c && tpa.f(this.d, ql2Var.d) && this.e == ql2Var.e && tpa.f(this.f, ql2Var.f) && tpa.f(this.g, ql2Var.g) && tpa.f(this.h, ql2Var.h) && this.i == ql2Var.i && this.j == ql2Var.j && this.k == ql2Var.k && this.l == ql2Var.l && this.m == ql2Var.m && tpa.f(this.n, ql2Var.n) && this.o == ql2Var.o;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iG = k7d.g(this.g, k7d.g(this.f, (this.e.hashCode() + rh4.d(h4f.m((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31, 31), 31);
        Bitmap bitmap = this.h;
        int iM = h4f.m(h4f.m(ms2.d(ms2.d(k7d.e(this.i, (iG + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str2 = this.n;
        return Long.hashCode(this.o) + ((iM + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ChatNotification(pushId=" + this.a + ", eventKey=" + this.b + ", chatServerId=" + this.c + "', chatNotificationType=" + this.e + ", displayMessages=" + x53.n0(this.f, ",", "[", "]", new we1(19), 24) + ", droppedMessages=" + this.g.size() + ", totalUnreadMessagesCount=" + this.i + ", needNotify=" + this.j + ", showNotificationText=" + this.k + ", lastMessageId=" + this.l + ", lastMessageDate=" + this.m + ", pushType=" + this.n + ", createdTime=" + this.o + ", isScheduled=" + b() + ")";
    }
}
