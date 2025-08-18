package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class cv9 {
    public final Map a;
    public final rv9 b;
    public final int c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;

    public cv9(Map map, rv9 rv9Var, int i, int i2, String str, boolean z, String str2) {
        this.a = map;
        this.b = rv9Var;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = z;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv9)) {
            return false;
        }
        cv9 cv9Var = (cv9) obj;
        return tpa.f(this.a, cv9Var.a) && tpa.f(this.b, cv9Var.b) && this.c == cv9Var.c && this.d == cv9Var.d && tpa.f(this.e, cv9Var.e) && this.f == cv9Var.f && tpa.f(this.g, cv9Var.g);
    }

    public final int hashCode() {
        int iD = ms2.d(rh4.d(k7d.e(this.d, k7d.e(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e), 31, this.f);
        String str = this.g;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationData(notificationsMap=");
        sb.append(this.a);
        sb.append(", notificationSettings=");
        sb.append(this.b);
        sb.append(", totalUnreadMessagesCount=");
        sb.append(this.c);
        sb.append(", notificationId=");
        sb.append(this.d);
        sb.append(", groupSummaryKey=");
        sb.append(this.e);
        sb.append(", checkCount=");
        sb.append(this.f);
        sb.append(", tag=");
        return zr6.l(sb, this.g, ")");
    }
}
