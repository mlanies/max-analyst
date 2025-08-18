package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes.dex */
public final class so3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        so3 so3Var = (so3) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        so3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        so3 so3Var = new so3(this.Y, continuation);
        so3Var.X = obj;
        return so3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        ContactListWidget contactListWidget = this.Y;
        mr0.G(contactListWidget);
        if (wm9Var instanceof c64) {
            tr3.c.R1((c64) wm9Var);
        } else if (wm9Var instanceof wla) {
            wha whaVar = new wha(contactListWidget);
            whaVar.h("Ещё не реализовано");
            whaVar.i();
        } else if (wm9Var instanceof fyd) {
            bc7[] bc7VarArr = ContactListWidget.P0;
            fyd fydVar = (fyd) wm9Var;
            ((bt1) contactListWidget.c.getValue()).e(zs1.CONTACT, fydVar.c);
            mr0.G(contactListWidget);
            rg1 rg1Var = (rg1) contactListWidget.D0.getValue();
            long j = fydVar.b;
            boolean z = fydVar.c;
            rg1Var.l(j, z, new ro3(j, z));
        }
        return e5f.a;
    }
}
