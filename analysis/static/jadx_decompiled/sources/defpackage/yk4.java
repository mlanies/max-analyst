package defpackage;

import com.facebook.imagepipeline.producers.DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;

/* loaded from: classes.dex */
public final class yk4 extends rg4 {
    public final eab c;
    public final ide d;
    public final o84 e;

    public yk4(fi0 fi0Var, eab eabVar, ide ideVar, o84 o84Var) {
        super(fi0Var);
        this.c = eabVar;
        this.d = ideVar;
        this.e = o84Var;
    }

    @Override // defpackage.fi0
    public final void h(int i, Object obj) {
        g05 g05Var = (g05) obj;
        eab eabVar = this.c;
        oj0 oj0Var = (oj0) eabVar;
        oj0Var.c.j(eabVar, "DiskCacheWriteProducer");
        boolean zB = fi0.b(i);
        hab habVar = oj0Var.c;
        fi0 fi0Var = this.b;
        if (!zB && g05Var != null && (i & 10) == 0) {
            g05Var.o0();
            if (g05Var.c != ou6.c) {
                o84 o84Var = this.e;
                o84Var.getClass();
                wv6 wv6Var = oj0Var.a;
                tpd tpdVarD = o84Var.d(wv6Var.b);
                bl4 bl4Var = (bl4) this.d.get();
                du0 du0VarL = tpa.l(wv6Var, (du0) bl4Var.d.getValue(), bl4Var.a(), (dx6) bl4Var.f.getValue());
                if (du0VarL != null) {
                    du0VarL.d(tpdVarD, g05Var);
                    habVar.a(eabVar, "DiskCacheWriteProducer", null);
                    fi0Var.g(i, g05Var);
                    return;
                } else {
                    habVar.d(eabVar, "DiskCacheWriteProducer", new DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(wv6Var.a.ordinal()).toString()), null);
                    fi0Var.g(i, g05Var);
                    return;
                }
            }
        }
        habVar.a(eabVar, "DiskCacheWriteProducer", null);
        fi0Var.g(i, g05Var);
    }
}
