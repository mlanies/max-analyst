package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ple implements Runnable {
    public final /* synthetic */ ol X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bkb b;
    public final /* synthetic */ lme c;
    public final /* synthetic */ gle o;

    public /* synthetic */ ple(bkb bkbVar, ol olVar, lme lmeVar, gle gleVar) {
        this.b = bkbVar;
        this.X = olVar;
        this.c = lmeVar;
        this.o = gleVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bkb bkbVar = this.b;
                bkbVar.getClass();
                ol olVar = this.X;
                dle dleVarS = olVar.s();
                if (dleVarS != null) {
                    ((tle) bkbVar.c).a.remove(dleVarS.getClass().getName());
                }
                lme lmeVar = this.c;
                lmeVar.b().a(new ple(bkbVar, lmeVar, this.o, olVar));
                break;
            default:
                lme lmeVar2 = this.c;
                gle gleVar = this.o;
                ol olVar2 = this.X;
                bkb bkbVar2 = this.b;
                bkbVar2.getClass();
                try {
                    lmeVar2.e(gleVar);
                    tle.a((tle) bkbVar2.c, olVar2);
                    break;
                } catch (Exception e) {
                    hm9.r(tle.B0, e, "failure to run task %s", olVar2);
                    lmeVar2.g(new pke("app.exception", e.getMessage(), null));
                }
        }
    }

    public /* synthetic */ ple(bkb bkbVar, lme lmeVar, gle gleVar, ol olVar) {
        this.b = bkbVar;
        this.c = lmeVar;
        this.o = gleVar;
        this.X = olVar;
    }
}
