package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ykf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ykf(Object obj, int i, long j, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.c;
        int i = this.b;
        Object obj = this.o;
        switch (this.a) {
            case 0:
                wva wvaVar = (wva) obj;
                wvaVar.getClass();
                int i2 = maf.a;
                h74 h74Var = ((n75) wvaVar.c).a.C0;
                ed edVarJ = h74Var.J((xj8) h74Var.o.e);
                h74Var.Q(edVarJ, 1018, new z64(edVarJ, i, j));
                break;
            default:
                aab aabVar = (aab) obj;
                aabVar.getClass();
                int i3 = oaf.a;
                i74 i74Var = ((o75) aabVar.b).a.D0;
                fd fdVarG = i74Var.g((yj8) i74Var.o.X);
                i74Var.I(fdVarG, 1018, new s64(fdVarG, i, j));
                break;
        }
    }
}
