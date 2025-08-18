package defpackage;

import com.jakewharton.processphoenix.ProcessPhoenix;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class sw7 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MainActivity Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.Y = mainActivity;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        sw7 sw7Var = (sw7) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sw7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sw7 sw7Var = new sw7(this.Y, continuation);
        sw7Var.X = ((Boolean) obj).booleanValue();
        return sw7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (this.X) {
            ProcessPhoenix.b(this.Y);
        }
        return e5f.a;
    }
}
