package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes.dex */
public final class ap3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ap3) n((dn3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ap3 ap3Var = new ap3(this.Y, continuation);
        ap3Var.X = obj;
        return ap3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        dn3 dn3Var = (dn3) this.X;
        bc7[] bc7VarArr = ContactListWidget.P0;
        ContactListWidget contactListWidget = this.Y;
        contactListWidget.s0();
        CharSequence charSequenceN0 = contactListWidget.n0();
        e5f e5fVar = e5f.a;
        a3g a3gVar = contactListWidget.s0;
        a3g a3gVar2 = contactListWidget.Z;
        a3g a3gVar3 = contactListWidget.Y;
        if (charSequenceN0 == null || charSequenceN0.length() == 0) {
            a3gVar3.E(((dn3) contactListWidget.p0().z0.a.getValue()).a);
            a3gVar2.E(nz4.a);
            a3gVar.E(((dn3) contactListWidget.p0().z0.a.getValue()).c);
            return e5fVar;
        }
        a3gVar3.E(dn3Var.a);
        a3gVar2.E(dn3Var.b);
        a3gVar.E(dn3Var.c);
        return e5fVar;
    }
}
