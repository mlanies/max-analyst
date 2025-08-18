package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes.dex */
public final class h68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h68 h68Var = (h68) n((j48) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        h68Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        h68 h68Var = new h68(continuation, this.Y);
        h68Var.X = obj;
        return h68Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = 1;
        od2.a0(obj);
        j48 j48Var = (j48) this.X;
        boolean z = j48Var instanceof d48;
        MediaBarWidget mediaBarWidget = this.Y;
        if (z) {
            bc7[] bc7VarArr = MediaBarWidget.d1;
            mediaBarWidget.w0().setText(mediaBarWidget.X.f.k);
            mediaBarWidget.D0((i5d) mediaBarWidget.B0().F0.a.getValue());
            boolean z2 = ((Boolean) mediaBarWidget.B0().D0.a.getValue()).booleanValue() || mediaBarWidget.B0().s();
            mediaBarWidget.w0().setVisibility(z2 ? 0 : 8);
            bc7 bc7Var = MediaBarWidget.d1[16];
            ((w12) mediaBarWidget.P0.getValue()).setVisibility(z2 ^ true ? 0 : 8);
            mediaBarWidget.E0((n00) mediaBarWidget.B0().s0.getValue());
            f6b f6bVarX0 = mediaBarWidget.x0();
            if (!f6bVarX0.isLaidOut() || f6bVarX0.isLayoutRequested()) {
                f6bVarX0.addOnLayoutChangeListener(new k68(mediaBarWidget, i));
            } else if (mediaBarWidget.B0().s()) {
                mediaBarWidget.x0().k();
            } else {
                mediaBarWidget.x0().setHalfScreen(null);
            }
            an9.g(mediaBarWidget.o, wuc.CHAT_ATTACH_PICKER);
        } else if (j48Var instanceof a48) {
            if (((a48) j48Var).a) {
                bc7[] bc7VarArr2 = MediaBarWidget.d1;
                mediaBarWidget.w0().setText(null);
            }
            bc7[] bc7VarArr3 = MediaBarWidget.d1;
            mediaBarWidget.x0().j(true);
        } else if (j48Var instanceof b48) {
            bc7[] bc7VarArr4 = MediaBarWidget.d1;
            mediaBarWidget.w0().e(false);
        } else if (j48Var instanceof e48) {
            bc7[] bc7VarArr5 = MediaBarWidget.d1;
            mediaBarWidget.getClass();
            bc7[] bc7VarArr6 = BottomSheetWidget.x0;
            lg3 lg3VarE = wg0.e(u8a.B, 6, null);
            lg3VarE.a(new mg3(1, new eqe(u8a.z), 1, false));
            lg3VarE.a(new mg3(2, new eqe(u8a.A), 2, false));
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
            confirmationBottomSheetE.setTargetController(mediaBarWidget);
            uu3 parentController = mediaBarWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(mediaBarWidget);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else if (j48Var instanceof z38) {
            bc7[] bc7VarArr7 = MediaBarWidget.d1;
            pnf.o(mediaBarWidget.u0().o, h86.a);
        } else if (j48Var instanceof c48) {
            bc7[] bc7VarArr8 = MediaBarWidget.d1;
            s86 s86VarU0 = mediaBarWidget.u0();
            q4d q4dVar = ((c48) j48Var).a;
            s86VarU0.getClass();
            pnf.o(s86VarU0.o, new j86(q4dVar));
        } else if (j48Var instanceof g48) {
            g48 g48Var = (g48) j48Var;
            up7 up7VarH = ay7.H(g48Var.a.a);
            bc7[] bc7VarArr9 = MediaBarWidget.d1;
            mediaBarWidget.C0(up7VarH, g48Var.b, "SELECTED_MEDIA_ALBUM");
        } else if (j48Var instanceof h48) {
            MediaBarWidget.m0(mediaBarWidget, s8a.k, u8a.V);
        } else if (j48Var instanceof f48) {
            MediaBarWidget.m0(mediaBarWidget, s8a.j, u8a.U);
        } else {
            if (!(j48Var instanceof i48)) {
                throw new NoWhenBranchMatchedException();
            }
            MediaBarWidget.n0(mediaBarWidget, ((i48) j48Var).a);
        }
        return e5f.a;
    }
}
