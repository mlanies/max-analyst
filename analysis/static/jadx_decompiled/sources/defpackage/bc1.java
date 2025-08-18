package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* loaded from: classes.dex */
public final class bc1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallJoinLinkPreviewWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc1(Continuation continuation, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        super(2, continuation);
        this.Y = callJoinLinkPreviewWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bc1 bc1Var = (bc1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bc1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bc1 bc1Var = new bc1(continuation, this.Y);
        bc1Var.X = obj;
        return bc1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        nb1 nb1Var = (nb1) this.X;
        bc7[] bc7VarArr = CallJoinLinkPreviewWidget.B0;
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.Y;
        callJoinLinkPreviewWidget.getClass();
        ap1 ap1Var = (ap1) callJoinLinkPreviewWidget.v0.T0(callJoinLinkPreviewWidget, CallJoinLinkPreviewWidget.B0[6]);
        ap1Var.setAvatar(nb1Var.a);
        m38 m38Var = m38.b;
        m38 m38Var2 = nb1Var.c;
        ap1Var.setButtonAction(m38Var2 == m38Var ? iaf.b : iaf.o);
        ap1Var.I(m38Var2 == m38Var, nb1Var.d);
        ap1Var.J(null, null);
        callJoinLinkPreviewWidget.o0().setText(nb1Var.e.b(callJoinLinkPreviewWidget.getContext()));
        knc kncVarM0 = callJoinLinkPreviewWidget.m0();
        Drawable drawable = (Drawable) callJoinLinkPreviewWidget.w0.getValue();
        Drawable drawable2 = (Drawable) callJoinLinkPreviewWidget.x0.getValue();
        eqe eqeVar = new eqe(f0c.call_microphone_enabled_accessibility);
        eqe eqeVar2 = new eqe(f0c.call_microphone_disabled_accessibility);
        callJoinLinkPreviewWidget.getClass();
        CallJoinLinkPreviewWidget.s0(kncVarM0, drawable2, drawable, nb1Var.b, eqeVar, eqeVar2);
        knc kncVarP0 = callJoinLinkPreviewWidget.p0();
        Drawable drawable3 = (Drawable) callJoinLinkPreviewWidget.y0.getValue();
        Drawable drawable4 = (Drawable) callJoinLinkPreviewWidget.z0.getValue();
        eqe eqeVar3 = new eqe(f0c.call_video_enabled_accessibility);
        eqe eqeVar4 = new eqe(f0c.call_video_disabled_accessibility);
        callJoinLinkPreviewWidget.getClass();
        CallJoinLinkPreviewWidget.s0(kncVarP0, drawable4, drawable3, nb1Var.c, eqeVar3, eqeVar4);
        yia yiaVarN0 = callJoinLinkPreviewWidget.n0();
        yiaVarN0.setAvatars(nb1Var.f);
        yiaVarN0.setTitle(nb1Var.g);
        return e5f.a;
    }
}
