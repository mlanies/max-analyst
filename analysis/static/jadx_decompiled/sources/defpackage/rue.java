package defpackage;

/* loaded from: classes.dex */
public final class rue implements akc {
    public final long b;
    public final akc c;

    public rue(long j, akc akcVar) {
        c54.j("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = akcVar;
    }

    @Override // defpackage.akc
    public final long a() {
        return this.b;
    }

    @Override // defpackage.akc
    public final zjc b(mx1 mx1Var) {
        zjc zjcVarB = this.c.b(mx1Var);
        long j = this.b;
        if (j > 0) {
            return mx1Var.b >= j - zjcVarB.a ? zjc.d : zjcVarB;
        }
        return zjcVarB;
    }
}
