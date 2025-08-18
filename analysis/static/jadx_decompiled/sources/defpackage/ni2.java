package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class ni2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ni2 ni2Var = (ni2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ni2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ni2 ni2Var = new ni2(continuation, this.Y);
        ni2Var.X = obj;
        return ni2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        yk8 yk8Var;
        od2.a0(obj);
        q35 q35Var = (q35) this.X;
        bc7[] bc7VarArr = ChatMediaViewerScreen.K0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        chatMediaViewerScreen.getClass();
        if (q35Var instanceof k35) {
            vxd vxdVar = chatMediaViewerScreen.I0;
            if (vxdVar != null) {
                vxdVar.cancel((CancellationException) null);
            }
            if (((k35) q35Var).a instanceof qb8) {
                chatMediaViewerScreen.A0().a((aj2) chatMediaViewerScreen.D0().S0.a.getValue());
                yk8 yk8Var2 = chatMediaViewerScreen.A0;
                if (yk8Var2 != null) {
                    br7.b((ViewGroup) yk8Var2.b, yk8Var2.a(), -1);
                }
                if (chatMediaViewerScreen.A0().getVisibility() == 0 && (yk8Var = chatMediaViewerScreen.A0) != null) {
                    yk8Var.c(true);
                }
                dkf dkfVarB0 = chatMediaViewerScreen.B0();
                if (chatMediaViewerScreen.G0 < 0.0f && dkfVarB0.e() == 0.0f) {
                    dkfVarB0.g(1.0f);
                }
                chatMediaViewerScreen.F0();
            } else {
                g07 g07VarA0 = chatMediaViewerScreen.A0();
                je7 je7Var = g07VarA0.w0;
                if (je7Var.a()) {
                    ((w3b) je7Var.getValue()).setVisibility(8);
                }
                je7 je7Var2 = g07VarA0.x0;
                if (je7Var2.a()) {
                    ((ImageView) je7Var2.getValue()).setVisibility(8);
                }
            }
        } else if (!(q35Var instanceof l35)) {
            if (q35Var instanceof i35) {
                i35 i35Var = (i35) q35Var;
                if (i35Var.a != null) {
                    wha whaVar = new wha(chatMediaViewerScreen);
                    whaVar.h(chatMediaViewerScreen.getContext().getString(i35Var.a.intValue()));
                    whaVar.e(new kia(woc.I));
                    whaVar.i();
                }
                i3a onBackPressedDispatcher = chatMediaViewerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
            } else if (q35Var instanceof j35) {
                j35 j35Var = (j35) q35Var;
                int i = j35Var.a;
                if (i == 5) {
                    yk8 yk8Var3 = chatMediaViewerScreen.A0;
                    if ((yk8Var3 != null ? yk8Var3.a : 0) != i) {
                        chatMediaViewerScreen.E0(j35Var.b);
                    }
                }
                yk8 yk8Var4 = chatMediaViewerScreen.A0;
                if (yk8Var4 != null) {
                    yk8Var4.b(j35Var.a);
                }
            } else if (!(q35Var instanceof m35)) {
                if (!(q35Var instanceof n35)) {
                    throw new NoWhenBranchMatchedException();
                }
                hi2 hi2Var = hi2.c;
                n35 n35Var = (n35) q35Var;
                long j = n35Var.a;
                int iW0 = chatMediaViewerScreen.w0();
                f64 f64VarP1 = hi2Var.P1();
                y7g y7gVar = new y7g(13);
                y7gVar.b = ":dialogs/share-media";
                y7gVar.D(Long.valueOf(j), "msg_id");
                y7gVar.D(Long.valueOf(n35Var.b), "attach_id");
                y7gVar.D(n35Var.c, "local_attach_id");
                y7gVar.D(Integer.valueOf(n35Var.d.ordinal()), "cause_ordinal");
                y7gVar.D(Integer.valueOf(iW0), "snack_bot_margin");
                y7gVar.D(Boolean.TRUE, "force_dark");
                f64VarP1.c(y7gVar.r(), null);
            }
        }
        return e5f.a;
    }
}
