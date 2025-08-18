package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class a27 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ fka Y;
    public final /* synthetic */ InputPhoneScreen Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a27(InputPhoneScreen inputPhoneScreen, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = inputPhoneScreen;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                a27 a27Var = new a27(this.Z, (Continuation) obj3, 0);
                a27Var.Y = (fka) obj2;
                e5f e5fVar = e5f.a;
                a27Var.o(e5fVar);
                return e5fVar;
            default:
                a27 a27Var2 = new a27(this.Z, (Continuation) obj3, 1);
                a27Var2.Y = (fka) obj2;
                e5f e5fVar2 = e5f.a;
                a27Var2.o(e5fVar2);
                return e5fVar2;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e5f e5fVar = e5f.a;
        InputPhoneScreen inputPhoneScreen = this.Z;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                fka fkaVar = this.Y;
                bc7[] bc7VarArr = InputPhoneScreen.E0;
                inputPhoneScreen.p0().onThemeChanged(fkaVar);
                break;
            default:
                od2.a0(obj);
                fka fkaVar2 = this.Y;
                bc7[] bc7VarArr2 = InputPhoneScreen.E0;
                inputPhoneScreen.getClass();
                Drawable background = ((View) inputPhoneScreen.t0.T0(inputPhoneScreen, InputPhoneScreen.E0[2])).getBackground();
                ib9 ib9Var = background instanceof ib9 ? (ib9) background : null;
                if (ib9Var != null) {
                    ib9Var.onThemeChanged(fkaVar2);
                    break;
                }
                break;
        }
        return e5fVar;
    }
}
