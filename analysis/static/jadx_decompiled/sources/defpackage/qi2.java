package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class qi2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qi2 qi2Var = (qi2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qi2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qi2 qi2Var = new qi2(continuation, this.Y);
        qi2Var.X = obj;
        return qi2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        yk8 yk8Var;
        od2.a0(obj);
        if (((Boolean) this.X).booleanValue()) {
            ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
            vxd vxdVar = chatMediaViewerScreen.I0;
            if (vxdVar != null) {
                vxdVar.cancel((CancellationException) null);
            }
            chatMediaViewerScreen.A0().a((aj2) chatMediaViewerScreen.D0().S0.a.getValue());
            yk8 yk8Var2 = chatMediaViewerScreen.A0;
            if (yk8Var2 != null) {
                br7.b((ViewGroup) yk8Var2.b, yk8Var2.a(), -1);
            }
            if (chatMediaViewerScreen.A0().getVisibility() == 0 && (yk8Var = chatMediaViewerScreen.A0) != null) {
                yk8Var.c(true);
            }
            chatMediaViewerScreen.F0();
            chatMediaViewerScreen.D0().X0.g(Boolean.FALSE);
        }
        return e5f.a;
    }
}
