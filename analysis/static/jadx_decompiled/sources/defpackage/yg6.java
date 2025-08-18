package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class yg6 implements ah6 {
    public final String a;
    public final jqe b;
    public final List c;

    public yg6(String str, jqe jqeVar, List list) {
        this.a = str;
        this.b = jqeVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg6)) {
            return false;
        }
        yg6 yg6Var = (yg6) obj;
        return tpa.f(this.a, yg6Var.a) && tpa.f(this.b, yg6Var.b) && tpa.f(this.c, yg6Var.c);
    }

    public final int hashCode() {
        int iF = k7d.f(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return iF + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(conversationId=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", avatarInfo=");
        return au1.i(sb, this.c, ")");
    }
}
