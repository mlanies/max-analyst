package defpackage;

import com.facebook.imagepipeline.producers.DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class xk4 implements dab {
    public final /* synthetic */ int a;
    public final ide b;
    public final o84 c;
    public final dab d;

    public /* synthetic */ xk4(ide ideVar, o84 o84Var, dab dabVar, int i) {
        this.a = i;
        this.b = ideVar;
        this.c = o84Var;
        this.d = dabVar;
    }

    public static Map c(b47 b47Var, eab eabVar, boolean z, int i) {
        if (b47Var.i(eabVar, "DiskCacheProducer")) {
            return z ? dx6.b("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : dx6.a("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    @Override // defpackage.dab
    public final void a(fi0 fi0Var, eab eabVar) {
        switch (this.a) {
            case 0:
                oj0 oj0Var = (oj0) eabVar;
                wv6 wv6Var = oj0Var.a;
                if (!wv6Var.d(16)) {
                    d(fi0Var, eabVar);
                    break;
                } else {
                    hab habVar = oj0Var.c;
                    habVar.j(eabVar, "DiskCacheProducer");
                    o84 o84Var = this.c;
                    o84Var.getClass();
                    tpd tpdVarD = o84Var.d(wv6Var.b);
                    bl4 bl4Var = (bl4) this.b.get();
                    du0 du0VarL = tpa.l(wv6Var, (du0) bl4Var.d.getValue(), bl4Var.a(), (dx6) bl4Var.f.getValue());
                    if (du0VarL != null) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        du0VarL.b(tpdVarD, atomicBoolean).continueWith(new vk4(this, (b47) habVar, eabVar, fi0Var));
                        oj0Var.a(new wk4(0, atomicBoolean));
                        break;
                    } else {
                        habVar.d(eabVar, "DiskCacheProducer", new DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(wv6Var.a.ordinal()).toString()), null);
                        d(fi0Var, eabVar);
                        break;
                    }
                }
            default:
                oj0 oj0Var2 = (oj0) eabVar;
                if (oj0Var2.X.a < 2) {
                    if (oj0Var2.a.d(32)) {
                        fi0Var = new yk4(fi0Var, eabVar, this.b, this.c);
                    }
                    this.d.a(fi0Var, eabVar);
                    break;
                } else {
                    oj0Var2.h("disk", "nil-result_write");
                    fi0Var.g(1, null);
                    break;
                }
        }
    }

    public void d(fi0 fi0Var, eab eabVar) {
        oj0 oj0Var = (oj0) eabVar;
        if (oj0Var.X.a < 2) {
            this.d.a(fi0Var, eabVar);
        } else {
            oj0Var.h("disk", "nil-result_read");
            fi0Var.g(1, null);
        }
    }
}
