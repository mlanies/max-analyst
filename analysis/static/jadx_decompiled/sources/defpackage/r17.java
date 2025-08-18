package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;

/* loaded from: classes2.dex */
public final class r17 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputNameScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r17(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.Y = inputNameScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        r17 r17Var = (r17) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        r17Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        r17 r17Var = new r17(continuation, this.Y);
        r17Var.X = obj;
        return r17Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean zBooleanValue = ((Boolean) this.X).booleanValue();
        InputNameScreen inputNameScreen = this.Y;
        if (zBooleanValue) {
            bc7[] bc7VarArr = InputNameScreen.B0;
            boolean zB = ((eua) inputNameScreen.Y.getValue()).b(eua.f);
            je7 je7Var = inputNameScreen.Y;
            je7 je7Var2 = inputNameScreen.Z;
            if (!zB) {
                ((hyc) ((q33) je7Var2.getValue())).j("app.writeConctatsRequested", true);
                ((eua) je7Var.getValue()).e(new l5g(inputNameScreen, 1));
            } else if (!((eua) je7Var.getValue()).b(eua.g)) {
                hyc hycVar = (hyc) ((q33) je7Var2.getValue());
                hycVar.getClass();
                if (!((t33) hycVar).g.getBoolean("app.writeConctatsRequested", false)) {
                    ((hyc) ((q33) je7Var2.getValue())).j("app.writeConctatsRequested", true);
                    ((eua) je7Var.getValue()).e(new l5g(inputNameScreen, 1));
                }
            }
        } else {
            int i = vc7.a;
            if (!vc7.b(vc7.c)) {
                bc7[] bc7VarArr2 = InputNameScreen.B0;
                mr0.V(inputNameScreen.n0().a);
            }
        }
        return e5f.a;
    }
}
