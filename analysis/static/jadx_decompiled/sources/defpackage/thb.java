package defpackage;

import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class thb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileInviteScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thb(ProfileInviteScreen profileInviteScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileInviteScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((thb) n((phb) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        thb thbVar = new thb(this.Y, continuation);
        thbVar.X = obj;
        return thbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        phb phbVar = (phb) this.X;
        boolean z = phbVar instanceof ohb;
        e5f e5fVar = e5f.a;
        ProfileInviteScreen profileInviteScreen = this.Y;
        if (z) {
            ohb ohbVar = (ohb) phbVar;
            CharSequence charSequenceB = ohbVar.a.b(profileInviteScreen.getContext());
            if (charSequenceB == null) {
                return e5fVar;
            }
            wha whaVar = new wha(profileInviteScreen);
            whaVar.e(new kia(ohbVar.b));
            whaVar.h(charSequenceB);
            whaVar.i();
        } else if (phbVar instanceof lhb) {
            tpa.o(profileInviteScreen.getContext(), ((lhb) phbVar).a);
        } else if (phbVar instanceof nhb) {
            qt3 qt3VarI = dy7.c(1).I(((nhb) phbVar).a);
            bc7[] bc7VarArr = ProfileInviteScreen.Y;
            profileInviteScreen.getClass();
            qt3VarI.Y((ImageView) profileInviteScreen.X.T0(profileInviteScreen, ProfileInviteScreen.Y[0])).build().q(profileInviteScreen);
        } else {
            if (!(phbVar instanceof mhb)) {
                throw new NoWhenBranchMatchedException();
            }
            bc7[] bc7VarArr2 = BottomSheetWidget.x0;
            mhb mhbVar = (mhb) phbVar;
            lg3 lg3VarA = od2.a(mhbVar.a, null, 6);
            lg3VarA.f(mhbVar.b);
            mhbVar.c.forEach(new hk2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 11), 9));
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
            confirmationBottomSheetE.setTargetController(profileInviteScreen);
            uu3 parentController = profileInviteScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(profileInviteScreen);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        }
        return e5fVar;
    }
}
