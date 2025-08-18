package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class cw8 {
    public final long a;
    public final long b;
    public final Layout c;
    public final zv8 d;
    public final vv8 e;
    public final boolean f;

    public cw8(long j, long j2, Layout layout, zv8 zv8Var, vv8 vv8Var, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = layout;
        this.d = zv8Var;
        this.e = vv8Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw8)) {
            return false;
        }
        cw8 cw8Var = (cw8) obj;
        return this.a == cw8Var.a && this.b == cw8Var.b && tpa.f(this.c, cw8Var.c) && tpa.f(this.d, cw8Var.d) && tpa.f(this.e, cw8Var.e) && this.f == cw8Var.f;
    }

    public final int hashCode() {
        int iM = h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
        Layout layout = this.c;
        int iHashCode = (iM + (layout == null ? 0 : layout.hashCode())) * 31;
        zv8 zv8Var = this.d;
        int iHashCode2 = (iHashCode + (zv8Var == null ? 0 : zv8Var.hashCode())) * 31;
        vv8 vv8Var = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (vv8Var != null ? vv8Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageLink(messageId=");
        sb.append(this.a);
        sb.append(", messageLinkId=");
        sb.append(this.b);
        sb.append(", senderLayout=");
        sb.append(this.c);
        sb.append(", replyModel=");
        sb.append(this.d);
        sb.append(", forwardModel=");
        sb.append(this.e);
        sb.append(", isFloating=");
        return au1.j(sb, this.f, ")");
    }
}
