package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.exception.ApiArgumentValidateException;

/* loaded from: classes2.dex */
public final class mqf implements zl1 {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public boolean v0;

    public mqf(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, je7 je7Var10) {
        this.a = je7Var10;
        this.b = je7Var;
        this.c = je7Var2;
        this.o = je7Var3;
        this.X = je7Var4;
        this.Y = je7Var5;
        this.Z = je7Var6;
        this.s0 = je7Var7;
        this.t0 = je7Var8;
        this.u0 = je7Var9;
        ((wr1) ((kr1) je7Var9.getValue())).d(this);
    }

    public final void a() {
        zl4 zl4Var;
        hm9.n("mqf", "onAppGoesBackground");
        this.v0 = false;
        if (((f5a) this.b.getValue()).d()) {
            if (((wr1) ((kr1) this.u0.getValue())).q()) {
                hm9.n("mqf", "ignore onAppGoesBackground due to active call");
                return;
            }
            u0b u0bVar = (u0b) this.c.getValue();
            u0bVar.getClass();
            hm9.n("u0b", "stopInteractivePings");
            ((k4a) ((pk) u0bVar.a.getValue())).G(false);
            zl4 zl4Var2 = u0bVar.f;
            if (zl4Var2 != null && !zl4Var2.h() && (zl4Var = u0bVar.f) != null) {
                zl4Var.g();
            }
            w7b w7bVar = (w7b) this.o.getValue();
            AtomicBoolean atomicBoolean = w7bVar.v0;
            if (atomicBoolean.get()) {
                w7bVar.g();
                atomicBoolean.set(false);
            }
            w7bVar.u0.o1(w7bVar, w7b.w0[0], null);
            ((sna) this.Y.getValue()).getClass();
            Iterator it = sna.b.entrySet().iterator();
            while (it.hasNext()) {
                qna qnaVar = (qna) ((Map.Entry) it.next()).getValue();
                if (qnaVar.a.isEmpty()) {
                    zl4 zl4Var3 = qnaVar.b;
                    if (zl4Var3 != null && !zl4Var3.h()) {
                        zl4Var3.g();
                    }
                    it.remove();
                }
            }
            sna.c.clear();
            ((tle) ((mle) this.Z.getValue())).e(false);
            ((ng5) this.s0.getValue()).b.getClass();
        }
    }

    public final void b(boolean z) {
        int iOrdinal;
        hm9.m("mqf", "onAppGoesForeground forceContactSync = %b", Boolean.valueOf(z));
        je7 je7Var = this.a;
        ((yle) je7Var.getValue()).f(false);
        je7 je7Var2 = this.t0;
        ((gh3) je7Var2.getValue()).invalidate();
        if (!this.v0 && ((wr1) ((kr1) this.u0.getValue())).r()) {
            hm9.n("mqf", "ignore onAppGoesForeground due to incoming call.");
            return;
        }
        this.v0 = true;
        ((tle) ((mle) this.Z.getValue())).e(true);
        if (!((gh3) je7Var2.getValue()).a() && je7Var.a()) {
            ((yle) je7Var.getValue()).i();
        }
        ((yle) je7Var.getValue()).f(false);
        ((u0b) this.c.getValue()).b();
        if (((f5a) this.b.getValue()).d()) {
            w7b w7bVar = (w7b) this.o.getValue();
            w7bVar.v0.set(true);
            if (((f5a) w7bVar.Y.getValue()).d()) {
                pk pkVar = (pk) w7bVar.Z.getValue();
                long jF = ((hyc) w7bVar.e()).f("user.presenceLastSync", 0L);
                k4a k4aVar = (k4a) pkVar;
                k4aVar.getClass();
                if (jF < 0 && (iOrdinal = k4aVar.x().ordinal()) != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            throw new ApiArgumentValidateException("invalid last sync time");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    hm9.p(k4aVar.a, "invalid last sync time", new ApiArgumentValidateException("invalid last sync time"));
                    k4a.v(k4aVar, new wp3(((p7b) k4aVar.y()).a.o(), null, jF));
                }
            }
            if (z) {
                ((jva) ((bva) this.X.getValue())).c();
            }
        }
    }

    @Override // defpackage.zl1
    public final void i() {
        if (this.v0) {
            return;
        }
        a();
        hm9.n("mqf", "Call was ended. Stop ping activity state.");
    }

    @Override // defpackage.zl1
    public final void onCallAccepted() {
        if (this.v0) {
            return;
        }
        b(false);
        hm9.n("mqf", "Call was accepted. Start ping activity state.");
    }
}
