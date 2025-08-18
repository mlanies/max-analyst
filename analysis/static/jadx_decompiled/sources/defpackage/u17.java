package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;

/* loaded from: classes2.dex */
public final class u17 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputNameScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u17(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.Y = inputNameScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        u17 u17Var = (u17) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        u17Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        u17 u17Var = new u17(continuation, this.Y);
        u17Var.X = obj;
        return u17Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Integer numE;
        od2.a0(obj);
        o35 o35Var = (o35) this.X;
        bc7[] bc7VarArr = InputNameScreen.B0;
        InputNameScreen inputNameScreen = this.Y;
        inputNameScreen.m0().setActiveButtonLoaderState(false);
        boolean z = o35Var instanceof m17;
        aka akaVar = aka.a;
        if (z) {
            m17 m17Var = (m17) o35Var;
            String strValueOf = String.valueOf(((jqe) m17Var.a).b(inputNameScreen.getContext()));
            int iS = au1.s(m17Var.c);
            if (iS == 0) {
                inputNameScreen.n0().d(strValueOf, akaVar);
            } else if (iS == 1) {
                inputNameScreen.o0().d(strValueOf, akaVar);
            } else if (iS != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (o35Var instanceof yj6) {
            int iS2 = au1.s(((yj6) o35Var).a);
            if (iS2 == 0) {
                inputNameScreen.n0().a();
            } else if (iS2 == 1) {
                inputNameScreen.o0().a();
            } else if (iS2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (o35Var instanceof bfc) {
            tt7 tt7Var = (tt7) ((bfc) o35Var).a;
            if (tt7Var instanceof st7) {
                st7 st7Var = (st7) tt7Var;
                ((d80) inputNameScreen.t0.getValue()).a(new c80(st7Var.e));
                inputNameScreen.a.getClass();
                CharSequence charSequenceB = st7Var.c.b(inputNameScreen.getContext());
                if (charSequenceB != null) {
                    jqe jqeVar = st7Var.d;
                    CharSequence charSequenceB2 = jqeVar != null ? jqeVar.b(inputNameScreen.getContext()) : null;
                    wha whaVar = new wha(inputNameScreen);
                    whaVar.h(charSequenceB);
                    whaVar.b(charSequenceB2);
                    View view = inputNameScreen.getView();
                    whaVar.c(new eia(1, (view == null || (numE = br7.E(view)) == null) ? 0 : numE.intValue(), 0, 4));
                    whaVar.i();
                }
            } else {
                if (!(tt7Var instanceof rt7)) {
                    throw new NoWhenBranchMatchedException();
                }
                inputNameScreen.n0().d(String.valueOf(((rt7) tt7Var).c.b(inputNameScreen.getContext())), akaVar);
            }
        } else if (o35Var instanceof mnd) {
            inputNameScreen.o0().setHint(z7.B(inputNameScreen.getContext(), v0c.oneme_login_input_name_hint_surname_short));
            inputNameScreen.o0().d(z7.B(inputNameScreen.getContext(), v0c.oneme_login_input_name_surname_placeholder), aka.b);
        } else if (o35Var instanceof zj6) {
            inputNameScreen.o0().setHint(z7.B(inputNameScreen.getContext(), v0c.oneme_login_input_name_hint_surname));
            inputNameScreen.o0().a();
        } else if (o35Var instanceof lnd) {
            mr0.V(inputNameScreen.n0().a);
        }
        return e5f.a;
    }
}
