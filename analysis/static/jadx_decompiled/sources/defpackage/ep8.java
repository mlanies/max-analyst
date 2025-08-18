package defpackage;

import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* loaded from: classes2.dex */
public final class ep8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MembersListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep8(Continuation continuation, MembersListWidget membersListWidget) {
        super(2, continuation);
        this.Y = membersListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ep8 ep8Var = (ep8) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ep8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ep8 ep8Var = new ep8(continuation, this.Y);
        ep8Var.X = obj;
        return ep8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = MembersListWidget.D0;
        MembersListWidget membersListWidget = this.Y;
        if (!membersListWidget.o0().r()) {
            c03 c03Var = membersListWidget.B0;
            if (c03Var != null) {
                membersListWidget.n0().p0(c03Var);
            }
            membersListWidget.B0 = null;
            w54 w54Var = membersListWidget.C0;
            if (w54Var != null) {
                membersListWidget.n0().r0(w54Var);
            }
            membersListWidget.C0 = null;
        } else if (membersListWidget.B0 == null) {
            wz7 wz7Var = new wz7(5, membersListWidget);
            c03 c03Var2 = new c03(new cp8(membersListWidget, 0), new ga(wz7Var, 18, membersListWidget), new a42(3, wz7Var), new a42(4, wz7Var));
            membersListWidget.n0().j(c03Var2);
            membersListWidget.B0 = c03Var2;
            w54 w54Var2 = new w54(membersListWidget.n0());
            membersListWidget.n0().l(w54Var2);
            membersListWidget.C0 = w54Var2;
        }
        membersListWidget.n0().Y();
        return e5f.a;
    }
}
