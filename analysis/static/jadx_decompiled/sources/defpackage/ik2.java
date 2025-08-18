package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;

/* loaded from: classes2.dex */
public final class ik2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMembersCompactWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik2(ChatMembersCompactWidget chatMembersCompactWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = chatMembersCompactWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ik2 ik2Var = (ik2) n((qo8) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ik2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ik2 ik2Var = new ik2(this.Y, continuation);
        ik2Var.X = obj;
        return ik2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        qo8 qo8Var = (qo8) this.X;
        if (qo8Var instanceof mo8) {
            ckb.c.e2(((mo8) qo8Var).a);
        } else {
            boolean z = qo8Var instanceof lo8;
            ChatMembersCompactWidget chatMembersCompactWidget = this.Y;
            if (z) {
                lo8 lo8Var = (lo8) qo8Var;
                int i = lo8Var.a;
                bc7[] bc7VarArr = ChatMembersCompactWidget.Z;
                chatMembersCompactWidget.getClass();
                int i2 = wea.t0;
                long j = lo8Var.b;
                if (i == i2) {
                    ro8 ro8VarO0 = chatMembersCompactWidget.o0();
                    ro8VarO0.Z.m(null, Collections.singleton(Long.valueOf(j)));
                } else if (i == wea.s0) {
                    bl2 bl2VarN0 = chatMembersCompactWidget.n0();
                    pnf.n(bl2VarN0, ((w9a) ((kke) bl2VarN0.Y.getValue())).b(), null, new xk2(bl2VarN0, j, null), 2);
                }
            } else if (qo8Var instanceof no8) {
                int i3 = ((no8) qo8Var).a;
                if (i3 == wea.v0) {
                    ckb ckbVar = ckb.c;
                    bc7[] bc7VarArr2 = ChatMembersCompactWidget.Z;
                    ckbVar.Z1(chatMembersCompactWidget.m0());
                } else if (i3 == wea.E0) {
                    ckb ckbVar2 = ckb.c;
                    bc7[] bc7VarArr3 = ChatMembersCompactWidget.Z;
                    ckbVar2.c2(chatMembersCompactWidget.m0());
                } else if (i3 == wea.X0) {
                    ckb ckbVar3 = ckb.c;
                    bc7[] bc7VarArr4 = ChatMembersCompactWidget.Z;
                    ckbVar3.d2(chatMembersCompactWidget.m0(), "MEMBER");
                }
            } else if (qo8Var instanceof oo8) {
                ckb.c.e2(((oo8) qo8Var).a);
            } else {
                if (!(qo8Var instanceof po8)) {
                    throw new NoWhenBranchMatchedException();
                }
                wha whaVar = new wha(chatMembersCompactWidget);
                whaVar.h(z7.B(chatMembersCompactWidget.getContext(), jpc.A2));
                whaVar.i();
            }
        }
        return e5f.a;
    }
}
