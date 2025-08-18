package defpackage;

/* loaded from: classes.dex */
public final class wqb {
    public final tb8 a;
    public final long b;
    public final long c;

    public wqb(tb8 tb8Var, long j, long j2) {
        this.a = tb8Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqb)) {
            return false;
        }
        wqb wqbVar = (wqb) obj;
        return this.b == wqbVar.b && this.a.equals(wqbVar.a) && this.c == wqbVar.c;
    }

    public final int hashCode() {
        long j = this.b;
        int iHashCode = (this.a.hashCode() + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        long j2 = this.c;
        return iHashCode + ((int) ((j2 >>> 32) ^ j2));
    }
}
