package defpackage;

import one.me.login.inputname.InputNameScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class q17 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ q17(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        InputNameScreen inputNameScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = InputNameScreen.B0;
                inputNameScreen.r0();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                bc7[] bc7VarArr2 = InputNameScreen.B0;
                boolean z = charSequence.length() > 0;
                String string = charSequence.toString();
                bc7 bc7Var = InputNameScreen.B0[5];
                inputNameScreen.z0.b(inputNameScreen, string);
                nf nfVarM0 = inputNameScreen.m0();
                nfVarM0.c = true;
                nfVarM0.setEnabled(z);
                w17 w17VarQ0 = inputNameScreen.q0();
                w17VarQ0.getClass();
                pnf.o(w17VarQ0.s0, new yj6(1));
                break;
            case 2:
                CharSequence charSequence2 = (CharSequence) obj;
                bc7[] bc7VarArr3 = InputNameScreen.B0;
                w17 w17VarQ02 = inputNameScreen.q0();
                w17VarQ02.getClass();
                pnf.o(w17VarQ02.s0, new yj6(2));
                String string2 = charSequence2.toString();
                bc7 bc7Var2 = InputNameScreen.B0[6];
                inputNameScreen.A0.b(inputNameScreen, string2);
                inputNameScreen.q0().q(charSequence2.toString(), inputNameScreen.o0().a.isFocused());
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bc7[] bc7VarArr4 = InputNameScreen.B0;
                if (!inputNameScreen.o0().c()) {
                    inputNameScreen.q0().q(inputNameScreen.p0(), zBooleanValue);
                    break;
                }
                break;
        }
        return e5fVar;
    }
}
