package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* loaded from: classes.dex */
public final class yc6 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ GifViewerWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc6(Continuation continuation, GifViewerWidget gifViewerWidget) {
        super(2, continuation);
        this.Y = gifViewerWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yc6 yc6Var = (yc6) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yc6Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yc6 yc6Var = new yc6(continuation, this.Y);
        yc6Var.X = obj;
        return yc6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        q35 q35Var = (q35) this.X;
        bc7[] bc7VarArr = GifViewerWidget.u0;
        GifViewerWidget gifViewerWidget = this.Y;
        gifViewerWidget.getClass();
        if (q35Var instanceof k35) {
            k35 k35Var = (k35) q35Var;
            if (tpa.f(k35Var.a.x(), gifViewerWidget.m0()) && k35Var.a.j() == gifViewerWidget.n0()) {
                sb8 sb8VarY = gifViewerWidget.r0().y(gifViewerWidget.n0(), gifViewerWidget.m0());
                jb8 jb8Var = sb8VarY instanceof jb8 ? (jb8) sb8VarY : null;
                if (jb8Var != null) {
                    if (gifViewerWidget.o0().getFailure()) {
                        gifViewerWidget.r0().A(gifViewerWidget.n0(), gifViewerWidget.m0());
                        gifViewerWidget.o0().r(jb8Var.o, gifViewerWidget.o0().getFailure());
                    } else {
                        gifViewerWidget.r0().B(gifViewerWidget.n0(), gifViewerWidget.m0());
                    }
                }
            }
        } else if (q35Var instanceof l35) {
            l35 l35Var = (l35) q35Var;
            if (tpa.f(l35Var.a.x(), gifViewerWidget.m0()) && l35Var.a.j() == gifViewerWidget.n0()) {
                gifViewerWidget.s0 = null;
                dkf dkfVarP0 = gifViewerWidget.p0();
                if (dkfVarP0 != null) {
                    dkfVarP0.L0(false);
                    dkfVarP0.pause();
                    dkfVarP0.M0(null);
                    dkfVarP0.N0();
                }
                gifViewerWidget.q0().b();
            }
        } else if (q35Var instanceof m35) {
            m35 m35Var = (m35) q35Var;
            if (tpa.f(m35Var.a.Y, gifViewerWidget.m0())) {
                jb8 jb8Var2 = m35Var.a;
                if (jb8Var2.a == gifViewerWidget.n0()) {
                    gifViewerWidget.o0().r(jb8Var2.o, true);
                }
            }
        }
        return e5f.a;
    }
}
