package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oc2 extends ol implements lme {
    public final Object X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc2(long j, Serializable serializable, int i) {
        super(j);
        this.o = i;
        this.X = serializable;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    @Override // defpackage.lme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.gle r18) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc2.e(gle):void");
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        switch (this.o) {
            case 0:
                l().c(new oi0(this.a, pkeVar));
                break;
            case 1:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                bn3 bn3Var = (bn3) plVar.O.getValue();
                bn3Var.getClass();
                if ("not.found".equals(pkeVar.b)) {
                    el3 el3Var = (el3) bn3Var.b.getValue();
                    for (long j : (long[]) this.X) {
                        el3Var.o(j);
                    }
                }
                ((av0) bn3Var.a.getValue()).c(new oi0(this.a, pkeVar));
                break;
            default:
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                plVar2.b().c(new oi0(this.a, pkeVar));
                break;
        }
    }

    @Override // defpackage.ol
    public final dle i() {
        switch (this.o) {
            case 0:
                return new au((String) this.X);
            case 1:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((ri4) plVar.b.getValue()).e();
                return new tq2((long[]) this.X);
            default:
                gs9 gs9Var = new gs9(sla.x0, 13);
                HashMap map = new HashMap();
                ((Map) this.X).forEach(new r33(1, map));
                gs9Var.n("contactList", map);
                return gs9Var;
        }
    }
}
