package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class lcb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lcb) n((vcb) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lcb lcbVar = new lcb(continuation, this.Y);
        lcbVar.X = obj;
        return lcbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        CharSequence charSequenceB;
        od2.a0(obj);
        vcb vcbVar = (vcb) this.X;
        boolean z = vcbVar instanceof tcb;
        e5f e5fVar = e5f.a;
        ProfileChangeLinkScreen profileChangeLinkScreen = this.Y;
        if (z) {
            mr0.G(profileChangeLinkScreen);
            dy7.c(1).I(((tcb) vcbVar).b).Y((ImageView) profileChangeLinkScreen.Z.T0(profileChangeLinkScreen, ProfileChangeLinkScreen.v0[2])).build().q(profileChangeLinkScreen);
        } else {
            if (vcbVar instanceof ucb) {
                ucb ucbVar = (ucb) vcbVar;
                jqe jqeVar = ucbVar.b;
                if (jqeVar == null || (charSequenceB = jqeVar.b(profileChangeLinkScreen.getContext())) == null) {
                    return e5fVar;
                }
                jqe jqeVar2 = ucbVar.c;
                CharSequence charSequenceB2 = jqeVar2 != null ? jqeVar2.b(profileChangeLinkScreen.getContext()) : null;
                wha whaVar = new wha(profileChangeLinkScreen);
                whaVar.h(charSequenceB);
                whaVar.b(charSequenceB2);
                int i = ucbVar.d ? 1 : 2;
                uia uiaVar = whaVar.b;
                whaVar.b = uia.a(uiaVar, null, null, null, null, eia.a(uiaVar.X, i, 0, 0, 6), null, 47);
                whaVar.c(new eia(0, 0, ProfileChangeLinkScreen.m0(profileChangeLinkScreen).getVisibility() == 0 ? (tu0.G(12 * fk4.d().getDisplayMetrics().density) * 2) + ProfileChangeLinkScreen.m0(profileChangeLinkScreen).getMeasuredHeight() : 0, 3));
                Integer num = ucbVar.e;
                whaVar.e(num != null ? new kia(num.intValue()) : lia.a);
                whaVar.i();
            } else if (vcbVar instanceof rcb) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", ((rcb) vcbVar).b.b(profileChangeLinkScreen.getContext()));
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                gfb.c.P1().b(":chats/share", dy7.g(new kpa("oneme:share:data", intent), new kpa("oneme:share:title", z7.B(profileChangeLinkScreen.getContext(), vea.Q1)), new kpa("tag", ProfileChangeLinkScreen.class.getName())));
            } else if (vcbVar instanceof ocb) {
                ((ClipboardManager) profileChangeLinkScreen.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied Text", ((ocb) vcbVar).b));
            } else if (vcbVar instanceof scb) {
                bc7[] bc7VarArr = BottomSheetWidget.x0;
                scb scbVar = (scb) vcbVar;
                lg3 lg3VarA = od2.a(scbVar.b, null, 6);
                lg3VarA.f(scbVar.c);
                scbVar.d.forEach(new hk2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 8), 7));
                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
                confirmationBottomSheetE.setTargetController(profileChangeLinkScreen);
                uu3 parentController = profileChangeLinkScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                confirmationBottomSheetE.z0(profileChangeLinkScreen);
                if (zncVarT != null) {
                    coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
            } else if (vcbVar instanceof pcb) {
                String str = o37.a;
                Context context = profileChangeLinkScreen.getContext();
                CharSequence charSequenceB3 = ((pcb) vcbVar).b.b(profileChangeLinkScreen.getContext());
                if (charSequenceB3 == null) {
                    charSequenceB3 = "";
                }
                o37.d(context, charSequenceB3, null);
            } else {
                if (!(vcbVar instanceof qcb)) {
                    throw new NoWhenBranchMatchedException();
                }
                gfb.c.P1().e(new ffb(0, new wz7(profileChangeLinkScreen, vcbVar, 24)));
            }
        }
        return e5fVar;
    }
}
