package defpackage;

/* loaded from: classes2.dex */
public final class tne {
    public final iua a;
    public final int b;

    public tne(iua iuaVar, int i) {
        this.a = iuaVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tne)) {
            return false;
        }
        tne tneVar = (tne) obj;
        return this.a == tneVar.a && this.b == tneVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskCountByType(type=");
        sb.append(this.a);
        sb.append(", count=");
        return zr6.j(sb, this.b, ")");
    }
}
