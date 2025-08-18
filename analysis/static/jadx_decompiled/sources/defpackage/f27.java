package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class f27 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f27(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        f27 f27Var = (f27) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        f27Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        f27 f27Var = new f27(continuation, this.Y);
        f27Var.X = obj;
        return f27Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        my3 my3Var = (my3) this.X;
        InputPhoneScreen inputPhoneScreen = this.Y;
        ((d80) inputPhoneScreen.B0.getValue()).a(new c80("phone_country_changed", 3, usc.b(new kpa("phoneCountry", my3Var.a.a))));
        eaa eaaVar = my3Var.a;
        if ("".equals(eaaVar.a)) {
            inputPhoneScreen.p0().w0.removeTextChangedListener(inputPhoneScreen.z0);
            inputPhoneScreen.z0 = null;
        } else {
            f47 f47Var = inputPhoneScreen.z0;
            int i = eaaVar.b;
            String str = eaaVar.a;
            int i2 = my3Var.b;
            if (f47Var == null) {
                f47 f47Var2 = new f47((zua) inputPhoneScreen.y0.getValue(), str, i, i2);
                inputPhoneScreen.z0 = f47Var2;
                inputPhoneScreen.p0().w0.addTextChangedListener(f47Var2);
            } else {
                f47Var.b(i, str);
                f47 f47Var3 = inputPhoneScreen.z0;
                if (f47Var3 != null) {
                    f47Var3.Y = i2;
                }
            }
        }
        CharSequence charSequenceB = my3Var.c.b(inputPhoneScreen.getContext());
        CharSequence charSequence = charSequenceB != null ? charSequenceB : "";
        lea leaVarP0 = inputPhoneScreen.p0();
        leaVarP0.setHint(charSequence);
        leaVarP0.setCountry(eaaVar);
        return e5f.a;
    }
}
