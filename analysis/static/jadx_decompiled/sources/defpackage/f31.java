package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f31 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ l31 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f31(l31 l31Var, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = l31Var;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                f31 f31Var = new f31(this.Z, continuation, 0);
                f31Var.Y = th;
                e5f e5fVar = e5f.a;
                f31Var.o(e5fVar);
                return e5fVar;
            default:
                f31 f31Var2 = new f31(this.Z, continuation, 1);
                f31Var2.Y = th;
                e5f e5fVar2 = e5f.a;
                f31Var2.o(e5fVar2);
                return e5fVar2;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                Throwable th = this.Y;
                if (!(th instanceof CancellationException)) {
                    hm9.p(this.Z.getClass().getName(), "fail no get chat", th);
                }
                break;
            default:
                od2.a0(obj);
                Throwable th2 = this.Y;
                if (!(th2 instanceof CancellationException)) {
                    hm9.p(this.Z.getClass().getName(), "fail to handle call link", th2);
                }
                break;
        }
        return e5f.a;
    }
}
