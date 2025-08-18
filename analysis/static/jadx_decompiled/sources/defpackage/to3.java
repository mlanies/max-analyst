package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes.dex */
public final class to3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        to3 to3Var = (to3) n((ln3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        to3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        to3 to3Var = new to3(this.Y, continuation);
        to3Var.X = obj;
        return to3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = 1;
        int i2 = 4;
        od2.a0(obj);
        ln3 ln3Var = (ln3) this.X;
        boolean z = ln3Var instanceof p9;
        e5f e5fVar = e5f.a;
        ContactListWidget contactListWidget = this.Y;
        if (z) {
            bc7[] bc7VarArr = ContactListWidget.P0;
            if (contactListWidget.m0().b(eua.e)) {
                an9.g((an9) contactListWidget.b.getValue(), wuc.CONTACTS_ADD);
                tr3 tr3Var = tr3.c;
                tr3Var.getClass();
                tr3Var.P1().b(":contact-list/create-contact", null);
            } else {
                contactListWidget.r0();
            }
        } else if (ln3Var instanceof end) {
            end endVar = (end) ln3Var;
            bc7[] bc7VarArr2 = ContactListWidget.P0;
            contactListWidget.getClass();
            bc7[] bc7VarArr3 = BottomSheetWidget.x0;
            lg3 lg3VarA = od2.a(endVar.b, dy7.g(new kpa("selected.contactId.Action", Long.valueOf(endVar.a))), 4);
            lg3VarA.f(endVar.c);
            endVar.d.forEach(new hk2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 5), i2));
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
            confirmationBottomSheetE.setTargetController(contactListWidget);
            uu3 parentController = contactListWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(contactListWidget);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else if (ln3Var instanceof jnd) {
            ((cn3) contactListWidget.H0.getValue()).a(contactListWidget.requireActivity(), ((jnd) ln3Var).a);
        } else if (ln3Var instanceof dnd) {
            dnd dndVar = (dnd) ln3Var;
            bc7[] bc7VarArr4 = ContactListWidget.P0;
            contactListWidget.getClass();
            CharSequence charSequenceB = dndVar.a.b(contactListWidget.getContext());
            if (charSequenceB != null) {
                wha whaVar = new wha(contactListWidget);
                whaVar.h(charSequenceB);
                whaVar.e(nia.a);
                whaVar.f(pia.a);
                whaVar.d(new px2(dndVar, i));
                whaVar.i();
            }
        } else {
            if (!(ln3Var instanceof dz3)) {
                throw new NoWhenBranchMatchedException();
            }
            tr3 tr3Var2 = tr3.c;
            tr3Var2.getClass();
            tr3Var2.P1().b(":start-conversation/chat", null);
        }
        return e5fVar;
    }
}
