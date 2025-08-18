package defpackage;

/* loaded from: classes.dex */
public final class t6a {
    public final int a;
    public final s6a b;
    public final int c;
    public final String d;
    public final int e;

    public t6a(int i, s6a s6aVar, int i2, String str, int i3) {
        this.a = i;
        this.b = s6aVar;
        this.c = i2;
        this.d = str;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6a)) {
            return false;
        }
        t6a t6aVar = (t6a) obj;
        return this.a == t6aVar.a && tpa.f(this.b, t6aVar.b) && this.c == t6aVar.c && tpa.f(this.d, t6aVar.d) && this.e == t6aVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + rh4.d(k7d.e(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(title=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", screenId=");
        sb.append(this.c);
        sb.append(", tag=");
        sb.append(this.d);
        sb.append(", bottomBarItemId=");
        return zr6.j(sb, this.e, ")");
    }
}
