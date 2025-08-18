package defpackage;

/* loaded from: classes2.dex */
public final class ls4 {
    public final String a;
    public final String b;
    public final int c;

    public ls4(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ls4) {
            ls4 ls4Var = (ls4) obj;
            if (tpa.f(this.a, ls4Var.a) && tpa.f(this.b, ls4Var.b) && this.c == ls4Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return rh4.d(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DropRecord(event='");
        sb.append(this.a);
        sb.append("', reason='");
        sb.append(this.b);
        sb.append("', count=");
        return au1.h(sb, this.c, ')');
    }
}
