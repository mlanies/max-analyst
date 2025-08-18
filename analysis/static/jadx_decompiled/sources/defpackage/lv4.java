package defpackage;

/* loaded from: classes.dex */
public final class lv4 {
    public final tb8 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final int f;
    public final vv4 g;

    public lv4(tb8 tb8Var, boolean z, boolean z2, boolean z3, long j, int i, vv4 vv4Var) {
        fm9.j("Audio and video cannot both be removed", (z && z2) ? false : true);
        this.a = tb8Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = i;
        this.g = vv4Var;
    }

    public final kv4 a() {
        kv4 kv4Var = new kv4();
        kv4Var.a = this.a;
        kv4Var.b = this.b;
        kv4Var.c = this.c;
        kv4Var.d = this.d;
        kv4Var.e = this.e;
        kv4Var.f = this.f;
        kv4Var.g = this.g;
        return kv4Var;
    }

    public final long b(long j) {
        long jF;
        boolean z = this.b;
        vv4 vv4Var = this.g;
        if (z) {
            jF = -9223372036854775807L;
        } else {
            ls5 ls5VarListIterator = vv4Var.a.listIterator(0);
            jF = j;
            while (ls5VarListIterator.hasNext()) {
                jF = ((m60) ls5VarListIterator.next()).f(jF);
            }
        }
        if (this.c) {
            j = -9223372036854775807L;
        } else {
            ls5 ls5VarListIterator2 = vv4Var.b.listIterator(0);
            while (ls5VarListIterator2.hasNext()) {
                ((z18) ls5VarListIterator2.next()).getClass();
            }
        }
        return Math.max(jF, j);
    }
}
