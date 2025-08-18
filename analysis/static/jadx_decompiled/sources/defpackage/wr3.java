package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.ContactsPickerScreen;

/* loaded from: classes.dex */
public final class wr3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactsPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr3(Continuation continuation, ContactsPickerScreen contactsPickerScreen) {
        super(2, continuation);
        this.Y = contactsPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wr3 wr3Var = (wr3) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wr3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wr3 wr3Var = new wr3(continuation, this.Y);
        wr3Var.X = obj;
        return wr3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objPrevious;
        od2.a0(obj);
        ur3 ur3Var = (ur3) this.X;
        if (!(ur3Var instanceof ur3)) {
            throw new NoWhenBranchMatchedException();
        }
        qp3 qp3Var = ur3Var.a;
        bc7[] bc7VarArr = ContactsPickerScreen.v0;
        ContactsPickerScreen contactsPickerScreen = this.Y;
        ArrayList arrayListE = contactsPickerScreen.getRouter().e();
        ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((coc) objPrevious).a instanceof y16) {
                break;
            }
        }
        coc cocVar = (coc) objPrevious;
        Object obj2 = cocVar != null ? cocVar.a : null;
        y16 y16Var = obj2 instanceof y16 ? (y16) obj2 : null;
        if (y16Var != null) {
            bc7[] bc7VarArr2 = ContactsPickerScreen.v0;
            bc7 bc7Var = bc7VarArr2[0];
            fs fsVar = contactsPickerScreen.t0;
            if (((Number) fsVar.a(contactsPickerScreen)).intValue() != 0) {
                Intent intent = new Intent();
                intent.putExtra("contacts.picker.result.key", qp3Var);
                bc7 bc7Var2 = bc7VarArr2[0];
                y16Var.R(((Number) fsVar.a(contactsPickerScreen)).intValue(), -1, intent);
                i3a onBackPressedDispatcher = contactsPickerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                mr0.G(contactsPickerScreen);
            }
        }
        return e5f.a;
    }
}
