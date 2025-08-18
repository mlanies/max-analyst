package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class keb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keb(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.Y = profileEditAdminPermissionsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        keb kebVar = (keb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kebVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        keb kebVar = new keb(continuation, this.Y);
        kebVar.X = obj;
        return kebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ldb ldbVar = (ldb) this.X;
        boolean z = ldbVar instanceof jdb;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.Y;
        if (z) {
            mr0.G(profileEditAdminPermissionsWidget);
            bc7[] bc7VarArr = BottomSheetWidget.x0;
            jdb jdbVar = (jdb) ldbVar;
            lg3 lg3VarA = od2.a(jdbVar.a, null, 6);
            lg3VarA.f(jdbVar.b);
            jdbVar.c.forEach(new oo2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 9), 1));
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
            confirmationBottomSheetE.setTargetController(profileEditAdminPermissionsWidget);
            uu3 parentController = profileEditAdminPermissionsWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(profileEditAdminPermissionsWidget);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else {
            if (!(ldbVar instanceof kdb)) {
                throw new NoWhenBranchMatchedException();
            }
            vha vhaVar = profileEditAdminPermissionsWidget.w0;
            if (vhaVar != null) {
                vhaVar.a();
            }
            wha whaVar = new wha(profileEditAdminPermissionsWidget);
            kdb kdbVar = (kdb) ldbVar;
            whaVar.g(kdbVar.a);
            Integer num = kdbVar.b;
            if (num != null) {
                whaVar.e(new kia(num.intValue()));
            }
            profileEditAdminPermissionsWidget.w0 = whaVar.i();
        }
        return e5f.a;
    }
}
