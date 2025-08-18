package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final /* synthetic */ class yjc implements b66, mq1 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ yjc(zm4 zm4Var, see seeVar, bue bueVar, nc0 nc0Var, ab0 ab0Var) {
        this.a = zm4Var;
        this.b = seeVar;
        this.c = bueVar;
        this.o = nc0Var;
        this.X = ab0Var;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        return ((qy9) obj).h(new o23((m56) this.a, (lf0) this.c, (a66) this.o, (ztc) this.X, (m56) this.b));
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        Surface surface;
        zm4 zm4Var = (zm4) this.a;
        see seeVar = (see) this.b;
        bue bueVar = (bue) this.c;
        nc0 nc0Var = (nc0) this.o;
        ab0 ab0Var = (ab0) this.X;
        zm4Var.getClass();
        eu4 eu4Var = seeVar.c;
        kc0 kc0VarB = eef.b(ab0Var, eu4Var, nc0Var);
        mc0 mc0Var = ab0Var.a;
        Size size = seeVar.b;
        Range range = seeVar.d;
        ha0 ha0Var = kc0VarB.c;
        ic0 ic0Var = (ic0) (ha0Var != null ? new fc3(kc0VarB.a, bueVar, mc0Var, size, ha0Var, eu4Var, range) : new cff(kc0VarB.a, bueVar, mc0Var, size, eu4Var, range)).get();
        try {
            av1 av1Var = (av1) zm4Var.e;
            Executor executor = (Executor) zm4Var.c;
            av1Var.getClass();
            d15 d15Var = new d15(executor, ic0Var);
            zm4Var.f = d15Var;
            k05 k05Var = d15Var.f;
            if (k05Var instanceof c15) {
                c15 c15Var = (c15) k05Var;
                Executor executor2 = (Executor) zm4Var.d;
                tef tefVar = new tef(zm4Var, lq1Var, seeVar, 1);
                synchronized (c15Var.a) {
                    c15Var.o = tefVar;
                    executor2.getClass();
                    c15Var.X = executor2;
                    surface = c15Var.b;
                }
                if (surface != null) {
                    try {
                        ((q6d) executor2).execute(new kl4(tefVar, 17, surface));
                    } catch (RejectedExecutionException unused) {
                        String str = c15Var.Y.a;
                    }
                }
            } else {
                lq1Var.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (InvalidConfigException e) {
            lq1Var.d(e);
        }
        return "ConfigureVideoEncoderFuture " + zm4Var;
    }

    public /* synthetic */ yjc(m56 m56Var, lf0 lf0Var, a66 a66Var, ztc ztcVar, m56 m56Var2) {
        this.a = m56Var;
        this.c = lf0Var;
        this.o = a66Var;
        this.X = ztcVar;
        this.b = m56Var2;
    }
}
