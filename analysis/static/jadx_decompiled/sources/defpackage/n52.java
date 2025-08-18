package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatAdminsScreen;

/* loaded from: classes2.dex */
public final class n52 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatAdminsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n52(ChatAdminsScreen chatAdminsScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = chatAdminsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        n52 n52Var = (n52) n((qo8) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        n52Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n52 n52Var = new n52(this.Y, continuation);
        n52Var.X = obj;
        return n52Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String strB;
        od2.a0(obj);
        qo8 qo8Var = (qo8) this.X;
        boolean z = qo8Var instanceof mo8;
        ChatAdminsScreen chatAdminsScreen = this.Y;
        if (z) {
            ckb ckbVar = ckb.c;
            bc7[] bc7VarArr = ChatAdminsScreen.w0;
            long jN0 = chatAdminsScreen.n0();
            long j = ((mo8) qo8Var).a;
            ckbVar.getClass();
            ckbVar.R1(ckb.b2(jN0, j));
        } else if (qo8Var instanceof lo8) {
            lo8 lo8Var = (lo8) qo8Var;
            int i = lo8Var.a;
            bc7[] bc7VarArr2 = ChatAdminsScreen.w0;
            chatAdminsScreen.getClass();
            if (i == wea.q0) {
                u52 u52VarM0 = chatAdminsScreen.m0();
                ds3 ds3Var = (ds3) u52VarM0.o.getValue();
                long j2 = lo8Var.b;
                od2.L(od2.F(new mqc(new r52(ds3Var.c(j2), null, u52VarM0, j2)), ((w9a) ((kke) u52VarM0.X.getValue())).b()), u52VarM0.a);
            }
        } else if (qo8Var instanceof no8) {
            if (((no8) qo8Var).a == wea.u0) {
                ckb ckbVar2 = ckb.c;
                bc7[] bc7VarArr3 = ChatAdminsScreen.w0;
                long jN02 = chatAdminsScreen.n0();
                ckbVar2.P1().b(":profile/add-admins?chat_id=" + jN02, null);
            }
        } else if (qo8Var instanceof po8) {
            if (((Boolean) chatAdminsScreen.Z.getValue()).booleanValue()) {
                ckb ckbVar3 = ckb.c;
                long jN03 = chatAdminsScreen.n0();
                long jLongValue = ((Number) chatAdminsScreen.s0.getValue()).longValue();
                ckbVar3.getClass();
                ckbVar3.R1(ckb.b2(jN03, jLongValue));
            } else {
                wha whaVar = new wha(chatAdminsScreen);
                whaVar.h(z7.B(chatAdminsScreen.getContext(), jpc.A2));
                whaVar.i();
            }
        } else {
            if (!(qo8Var instanceof oo8)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((Boolean) chatAdminsScreen.Z.getValue()).booleanValue()) {
                ckb ckbVar4 = ckb.c;
                long jN04 = chatAdminsScreen.n0();
                long j3 = ((oo8) qo8Var).a;
                ckbVar4.getClass();
                ckbVar4.R1(ckb.b2(jN04, j3));
            } else {
                wha whaVar2 = new wha(chatAdminsScreen);
                e52 e52VarQ = chatAdminsScreen.m0().q();
                if (e52VarQ == null || !e52VarQ.I()) {
                    strB = z7.B(chatAdminsScreen.getContext(), jpc.C);
                } else {
                    strB = z7.B(chatAdminsScreen.getContext(), jpc.w);
                }
                whaVar2.h(strB);
                whaVar2.i();
            }
        }
        return e5f.a;
    }
}
