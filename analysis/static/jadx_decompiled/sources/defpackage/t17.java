package defpackage;

import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class t17 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputNameScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t17(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.Y = inputNameScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        t17 t17Var = (t17) n((o17) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        t17Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        t17 t17Var = new t17(continuation, this.Y);
        t17Var.X = obj;
        return t17Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        o17 o17Var = (o17) this.X;
        if (!(o17Var instanceof o17)) {
            throw new NoWhenBranchMatchedException();
        }
        InputNameScreen inputNameScreen = this.Y;
        mr0.G(inputNameScreen);
        bc7[] bc7VarArr = InputNameScreen.B0;
        x37 x37Var = (x37) inputNameScreen.s0.getValue();
        afc afcVar = o17Var.b;
        Object objV = ay7.v(inputNameScreen.getArgs(), "screen:input_name:avatars", e8b.class);
        if (objV == null) {
            throw new IllegalArgumentException(zr6.i("No value passed for key screen:input_name:avatars of type ", e8b.class.getSimpleName(), " in bundle").toString());
        }
        x37Var.getClass();
        x37Var.a(i24.e(new NeuroAvatarsScreen(afcVar, (e8b) ((Parcelable) objV)), null, null), "InputNameScreen");
        return e5f.a;
    }
}
