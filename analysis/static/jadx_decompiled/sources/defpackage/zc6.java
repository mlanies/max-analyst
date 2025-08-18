package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* loaded from: classes.dex */
public final class zc6 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ GifViewerWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc6(Continuation continuation, GifViewerWidget gifViewerWidget) {
        super(2, continuation);
        this.Y = gifViewerWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zc6 zc6Var = (zc6) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zc6Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zc6 zc6Var = new zc6(continuation, this.Y);
        zc6Var.X = obj;
        return zc6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        gef gefVar;
        od2.a0(obj);
        ej2 ej2Var = (ej2) this.X;
        GifViewerWidget gifViewerWidget = this.Y;
        String str = gifViewerWidget.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            boolean z = ej2Var.b != null;
            sb8 sb8Var = ej2Var.a;
            long jN0 = gifViewerWidget.n0();
            String strM0 = gifViewerWidget.m0();
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
        if (sb8Var2 != null && sb8Var2.j() == gifViewerWidget.n0() && tpa.f(ej2Var.a.x(), gifViewerWidget.m0()) && (gefVar = ej2Var.b) != null) {
            gifViewerWidget.s0 = gefVar;
            dkf dkfVarP0 = gifViewerWidget.p0();
            if (dkfVarP0 != null) {
                dkfVarP0.g(0.0f);
            }
            dkf dkfVarP02 = gifViewerWidget.p0();
            if (dkfVarP02 != null) {
                dkfVarP02.L0(true);
            }
            dkf dkfVarP03 = gifViewerWidget.p0();
            if (dkfVarP03 != null) {
                dkfVarP03.I0(ej2Var.b);
            }
            cjg cjgVar = gifViewerWidget.Z;
            if (cjgVar != null) {
                cjgVar.a();
            }
            gifViewerWidget.q0().a(gifViewerWidget.t0);
        }
        return e5f.a;
    }
}
