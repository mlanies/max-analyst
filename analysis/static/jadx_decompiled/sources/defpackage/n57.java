package defpackage;

import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* loaded from: classes2.dex */
public final class n57 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n57(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.Y = inviteByPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        n57 n57Var = (n57) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        n57Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n57 n57Var = new n57(continuation, this.Y);
        n57Var.X = obj;
        return n57Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        my3 my3Var = (my3) this.X;
        eaa eaaVar = my3Var.a;
        bc7[] bc7VarArr = InviteByPhoneScreen.B0;
        InviteByPhoneScreen inviteByPhoneScreen = this.Y;
        inviteByPhoneScreen.getClass();
        bc7 bc7Var = InviteByPhoneScreen.B0[6];
        inviteByPhoneScreen.z0.b(inviteByPhoneScreen, eaaVar);
        f47 f47Var = inviteByPhoneScreen.y0;
        je7 je7Var = inviteByPhoneScreen.x0;
        int i = my3Var.b;
        eaa eaaVar2 = my3Var.a;
        if (f47Var == null) {
            f47 f47Var2 = new f47((zua) je7Var.getValue(), eaaVar2.a, eaaVar2.b, i);
            inviteByPhoneScreen.y0 = f47Var2;
            inviteByPhoneScreen.o0().w0.addTextChangedListener(f47Var2);
        } else {
            f47Var.b(eaaVar2.b, eaaVar2.a);
            f47 f47Var3 = inviteByPhoneScreen.y0;
            if (f47Var3 != null) {
                f47Var3.Y = i;
            }
        }
        c67 c67VarP0 = inviteByPhoneScreen.p0();
        zua zuaVar = (zua) je7Var.getValue();
        qva qvaVarE = zuaVar.e(eaaVar2.a);
        c67VarP0.D0 = !zuaVar.m(qvaVarE) ? Integer.MAX_VALUE : zuaVar.d(qvaVarE, 1).length();
        CharSequence charSequenceB = my3Var.c.b(inviteByPhoneScreen.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        lea leaVarO0 = inviteByPhoneScreen.o0();
        leaVarO0.setHint(charSequenceB);
        leaVarO0.setCountry(eaaVar2);
        return e5f.a;
    }
}
