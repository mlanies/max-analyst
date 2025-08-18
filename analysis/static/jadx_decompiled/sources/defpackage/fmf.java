package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* loaded from: classes.dex */
public final class fmf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoViewerWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmf(Continuation continuation, VideoViewerWidget videoViewerWidget) {
        super(2, continuation);
        this.Y = videoViewerWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fmf fmfVar = (fmf) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fmfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fmf fmfVar = new fmf(continuation, this.Y);
        fmfVar.X = obj;
        return fmfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        dkf dkfVarB0;
        od2.a0(obj);
        q35 q35Var = (q35) this.X;
        bc7[] bc7VarArr = VideoViewerWidget.u0;
        VideoViewerWidget videoViewerWidget = this.Y;
        videoViewerWidget.getClass();
        if (q35Var instanceof l35) {
            l35 l35Var = (l35) q35Var;
            if (l35Var.a.j() == videoViewerWidget.n0() && tpa.f(l35Var.a.x(), videoViewerWidget.m0())) {
                hm9.n(videoViewerWidget.a, "Media viewer. Clear prev page");
                gef gefVar = videoViewerWidget.s0;
                boolean z = gefVar != null && gefVar.c0();
                videoViewerWidget.s0 = null;
                dmf dmfVarO0 = videoViewerWidget.o0();
                if (dmfVarO0 != null && (dkfVarB0 = ((ChatMediaViewerScreen) dmfVarO0).B0()) != null) {
                    ck2 ck2Var = (ck2) videoViewerWidget.o.getValue();
                    long jN0 = videoViewerWidget.n0();
                    String strM0 = videoViewerWidget.m0();
                    long jF0 = dkfVarB0.F0();
                    long jG0 = dkfVarB0.G0();
                    ck2Var.getClass();
                    j47.S(ck2Var.a, xq9.a, vx3.c, new tj2(ck2Var, jN0, strM0, jF0, jG0, z, null));
                    dkfVarB0.pause();
                    dkfVarB0.M0(null);
                    dkfVarB0.N0();
                }
                videoViewerWidget.p0().b();
            }
        }
        return e5f.a;
    }
}
