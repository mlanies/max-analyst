package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class uw7 extends ffe implements a66 {
    public final /* synthetic */ MainActivity X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        uw7 uw7Var = (uw7) n((Boolean) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        uw7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new uw7(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.X.i0();
        return e5f.a;
    }
}
