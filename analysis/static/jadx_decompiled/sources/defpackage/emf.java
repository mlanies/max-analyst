package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* loaded from: classes.dex */
public final class emf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoViewerWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emf(Continuation continuation, VideoViewerWidget videoViewerWidget) {
        super(2, continuation);
        this.Y = videoViewerWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        emf emfVar = (emf) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        emfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        emf emfVar = new emf(continuation, this.Y);
        emfVar.X = obj;
        return emfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        gef gefVar;
        dkf dkfVarB0;
        od2.a0(obj);
        ej2 ej2Var = (ej2) this.X;
        VideoViewerWidget videoViewerWidget = this.Y;
        String str = videoViewerWidget.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            boolean z = ej2Var.b != null;
            sb8 sb8Var = ej2Var.a;
            long jN0 = videoViewerWidget.n0();
            String strM0 = videoViewerWidget.m0();
            StringBuilder sb = new StringBuilder("Media viewer. Video page state changed, \n                        |hasContent:");
            sb.append(z);
            sb.append(", \n                        |item:");
            sb.append(sb8Var);
            sb.append(", curMsgId:");
            ms2.j(jN0, ", \n                        |curAttachId:", strM0, sb);
            sb.append("\n                        |");
            ir6Var.d(us7Var, str, x9e.c0(sb.toString()), null);
        }
        sb8 sb8Var2 = ej2Var.a;
        if (sb8Var2 != null && sb8Var2.j() == videoViewerWidget.n0() && tpa.f(ej2Var.a.x(), videoViewerWidget.m0()) && (gefVar = ej2Var.b) != null) {
            videoViewerWidget.s0 = gefVar;
            dmf dmfVarO0 = videoViewerWidget.o0();
            if (dmfVarO0 != null && (dkfVarB0 = ((ChatMediaViewerScreen) dmfVarO0).B0()) != null) {
                dkfVarB0.I0(ej2Var.b);
            }
            cjg cjgVar = videoViewerWidget.Z;
            if (cjgVar != null) {
                cjgVar.a();
            }
            videoViewerWidget.p0().a(videoViewerWidget.t0);
        }
        return e5f.a;
    }
}
