package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class ilb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ilb ilbVar = (ilb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ilbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ilb ilbVar = new ilb(continuation, this.Y);
        ilbVar.X = obj;
        return ilbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        amb ambVar = (amb) this.X;
        boolean z = ambVar instanceof vlb;
        ProfileScreen profileScreen = this.Y;
        if (z) {
            vlb vlbVar = (vlb) ambVar;
            bc7[] bc7VarArr = ProfileScreen.D0;
            profileScreen.getClass();
            bc7[] bc7VarArr2 = BottomSheetWidget.x0;
            lg3 lg3VarA = od2.a(vlbVar.a, vlbVar.d, 4);
            lg3VarA.f(vlbVar.b);
            mg3[] mg3VarArr = (mg3[]) vlbVar.c.toArray(new mg3[0]);
            lg3VarA.a((mg3[]) Arrays.copyOf(mg3VarArr, mg3VarArr.length));
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
            confirmationBottomSheetE.setTargetController(profileScreen);
            uu3 parentController = profileScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(profileScreen);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else if (ambVar instanceof ulb) {
            CharSequence charSequenceB = ((ulb) ambVar).a.b(profileScreen.getContext());
            if (charSequenceB != null) {
                wha whaVar = new wha(profileScreen);
                whaVar.e(nia.a);
                whaVar.f(pia.a);
                whaVar.h(charSequenceB);
                whaVar.d(new fd7(ambVar));
                whaVar.i();
            }
        } else if (ambVar instanceof wlb) {
            CharSequence charSequenceB2 = ((wlb) ambVar).a.b(profileScreen.getContext());
            if (charSequenceB2 != null) {
                wha whaVar2 = new wha(profileScreen);
                whaVar2.e(new kia(gpc.x0));
                whaVar2.h(charSequenceB2);
                whaVar2.i();
            }
        } else if (ambVar instanceof zlb) {
            wha whaVar3 = new wha(profileScreen);
            zlb zlbVar = (zlb) ambVar;
            Integer num = zlbVar.a;
            if (num != null) {
                whaVar3.e(new kia(num.intValue()));
            }
            whaVar3.g(zlbVar.b);
            whaVar3.i();
        } else if (ambVar instanceof rlb) {
            String str = o37.a;
            Context context = profileScreen.getContext();
            CharSequence charSequenceB3 = ((rlb) ambVar).a.b(profileScreen.getContext());
            if (charSequenceB3 == null) {
                charSequenceB3 = "";
            }
            o37.d(context, charSequenceB3, null);
        } else if (ambVar instanceof ylb) {
            bc7[] bc7VarArr3 = ProfileScreen.D0;
            profileScreen.getClass();
            dy7.c(1).I(((ylb) ambVar).a).Y((ufd) profileScreen.y0.T0(profileScreen, ProfileScreen.D0[9])).build().q(profileScreen);
        } else {
            if (ambVar instanceof xlb) {
                ((xlb) ambVar).getClass();
                dy7.g(new kpa("profile:participant_id_for_action", new Long(0L)));
                bc7[] bc7VarArr4 = ProfileScreen.D0;
                profileScreen.q0();
                throw null;
            }
            if (tpa.f(ambVar, slb.a)) {
                bc7[] bc7VarArr5 = ProfileScreen.D0;
                ((eua) profileScreen.A0.getValue()).g(new l5g(profileScreen, 1));
            } else {
                if (!(ambVar instanceof tlb)) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    profileScreen.startActivityForResult(((tlb) ambVar).a, 333);
                    an9.g((an9) profileScreen.B0.getValue(), wuc.AVATAR_PICKER_CAMERA);
                } catch (ActivityNotFoundException unused) {
                    bc7[] bc7VarArr6 = ProfileScreen.D0;
                    profileScreen.r0().z();
                    hm9.p(ProfileScreen.class.getName(), "failed open camera", null);
                }
            }
        }
        return e5f.a;
    }
}
