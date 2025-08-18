package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;

/* loaded from: classes2.dex */
public final class sb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AdminsFromContactsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(Continuation continuation, AdminsFromContactsScreen adminsFromContactsScreen) {
        super(2, continuation);
        this.Y = adminsFromContactsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sb sbVar = (sb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sb sbVar = new sb(continuation, this.Y);
        sbVar.X = obj;
        return sbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = (String) this.X;
        bc7[] bc7VarArr = AdminsFromContactsScreen.u0;
        ((bc) this.Y.c.getValue()).Z.setValue(str);
        return e5f.a;
    }
}
