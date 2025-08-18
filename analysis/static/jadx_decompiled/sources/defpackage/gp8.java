package defpackage;

import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* loaded from: classes2.dex */
public final class gp8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MembersListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp8(Continuation continuation, MembersListWidget membersListWidget) {
        super(2, continuation);
        this.Y = membersListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        gp8 gp8Var = (gp8) n((jo8) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        gp8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gp8 gp8Var = new gp8(continuation, this.Y);
        gp8Var.X = obj;
        return gp8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jo8 jo8Var = (jo8) this.X;
        boolean z = jo8Var instanceof ho8;
        MembersListWidget membersListWidget = this.Y;
        if (z) {
            bc7[] bc7VarArr = MembersListWidget.D0;
            bp8 bp8VarP0 = membersListWidget.p0();
            Collection collection = ((ho8) jo8Var).a;
            vxd vxdVar = bp8VarP0.v0;
            if (vxdVar == null || !vxdVar.isActive()) {
                bp8VarP0.v0 = pnf.n(bp8VarP0, ((w9a) ((kke) bp8VarP0.Z.getValue())).a(), null, new yo8(bp8VarP0, collection, null), 2);
            }
        } else {
            if (!(jo8Var instanceof io8)) {
                throw new NoWhenBranchMatchedException();
            }
            bc7[] bc7VarArr2 = MembersListWidget.D0;
            bp8 bp8VarP02 = membersListWidget.p0();
            vn8 vn8Var = new vn8(bp8VarP02.b, bp8VarP02.c, bp8VarP02.u0);
            do8 do8Var = bp8VarP02.Y;
            do8Var.getClass();
            j47.T(do8Var.b, null, null, new co8(do8Var, vn8Var, null), 3);
            bp8VarP02.u0 = wz4.a;
        }
        return e5f.a;
    }
}
