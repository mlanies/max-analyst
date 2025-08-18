package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;

/* loaded from: classes2.dex */
public final class h9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AddChatAdminsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(Continuation continuation, AddChatAdminsScreen addChatAdminsScreen) {
        super(2, continuation);
        this.Y = addChatAdminsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h9 h9Var = (h9) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        h9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        h9 h9Var = new h9(continuation, this.Y);
        h9Var.X = obj;
        return h9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        qo8 qo8Var = (qo8) this.X;
        boolean z = qo8Var instanceof mo8;
        e5f e5fVar = e5f.a;
        if (z) {
            ckb ckbVar = ckb.c;
            bc7[] bc7VarArr = AddChatAdminsScreen.x0;
            long jM0 = this.Y.m0();
            long j = ((mo8) qo8Var).a;
            ckbVar.getClass();
            StringBuilder sb = new StringBuilder(":profile/edit/admin_permission?chat_id=");
            sb.append(jM0);
            sb.append("&contact_id=");
            ckbVar.P1().b(zr6.k(sb, j, "&permissions_type=setup_new_admin"), null);
        }
        return e5fVar;
    }
}
