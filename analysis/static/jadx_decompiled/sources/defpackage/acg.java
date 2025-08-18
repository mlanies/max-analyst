package defpackage;

import android.opengl.EGLSurface;
import org.webrtc.RendererCommon;
import ru.ok.android.webrtc.opengl.CallVideoFrameDrawer$CallVideoFrameDrawerError;

/* loaded from: classes2.dex */
public final class acg extends rd7 implements m56 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ oe1 b;
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acg(ne1 ne1Var, Object obj, oe1 oe1Var) {
        super(1);
        this.c = ne1Var;
        this.o = obj;
        this.b = oe1Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        a4c a4cVar;
        switch (this.a) {
            case 0:
                ne1 ne1Var = this.c;
                cp1 cp1Var = (cp1) ne1Var;
                cp1Var.getClass();
                cp1Var.k = (RendererCommon.GlDrawer) this.o;
                long jNanoTime = System.nanoTime();
                dp1 dp1Var = cp1Var.l;
                dp1Var.g = jNanoTime;
                dp1Var.f = 0;
                dp1Var.h = 0L;
                dp1Var.i = 0L;
                dp1Var.c.set(0);
                dp1Var.d.set(0);
                oe1 oe1Var = cp1Var.g;
                if (oe1Var == null || (a4cVar = oe1Var.a) == null) {
                    throw new CallVideoFrameDrawer$CallVideoFrameDrawerError("Render is missing inside onInitialize() callback");
                }
                a4cVar.log(cp1Var.j, "Instance " + cp1Var.b + " initialized. Total count is " + cp1.m.incrementAndGet());
                this.b.i.add(ne1Var);
                return e5f.a;
            default:
                k56 k56Var = (k56) this.o;
                me1 me1Var = (me1) obj;
                try {
                    oe1 oe1Var2 = this.b;
                    ne1 ne1Var2 = this.c;
                    oe1Var2.getClass();
                    EGLSurface eGLSurface = ne1Var2.a;
                    ne1Var2.a = null;
                    me1Var.e(eGLSurface);
                    return e5f.a;
                } finally {
                    if (k56Var != null) {
                        k56Var.invoke();
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acg(oe1 oe1Var, ne1 ne1Var, k56 k56Var) {
        super(1);
        this.b = oe1Var;
        this.c = ne1Var;
        this.o = k56Var;
    }
}
