package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class qle implements Runnable {
    public final /* synthetic */ lme X;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bkb b;
    public final /* synthetic */ ol c;
    public final /* synthetic */ pke o;

    public /* synthetic */ qle(bkb bkbVar, ol olVar, pke pkeVar, lme lmeVar) {
        this.b = bkbVar;
        this.c = olVar;
        this.o = pkeVar;
        this.X = lmeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bkb bkbVar = this.b;
                bkbVar.getClass();
                lme lmeVar = this.X;
                lmeVar.b().a(new qle(bkbVar, this.c, this.o, lmeVar));
                break;
            default:
                bkb bkbVar2 = this.b;
                bkbVar2.getClass();
                ol olVar = this.c;
                dle dleVarS = olVar.s();
                pke pkeVar = this.o;
                tle tleVar = (tle) bkbVar2.c;
                if (dleVarS != null) {
                    tleVar.getClass();
                    if (ele.b0.contains(pkeVar.b)) {
                        String name = dleVarS.getClass().getName();
                        ConcurrentHashMap concurrentHashMap = tleVar.a;
                        sle sleVar = (sle) concurrentHashMap.get(name);
                        if (sleVar == null) {
                            sleVar = new sle();
                            sleVar.a = 0;
                        }
                        sleVar.a++;
                        sleVar.b = System.currentTimeMillis();
                        concurrentHashMap.put(name, sleVar);
                    }
                }
                this.X.g(pkeVar);
                tleVar.f(olVar, pkeVar);
                break;
        }
    }

    public /* synthetic */ qle(bkb bkbVar, lme lmeVar, ol olVar, pke pkeVar) {
        this.b = bkbVar;
        this.X = lmeVar;
        this.c = olVar;
        this.o = pkeVar;
    }
}
