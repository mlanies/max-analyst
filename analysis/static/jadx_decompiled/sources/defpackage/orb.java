package defpackage;

import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class orb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ rrb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orb(Continuation continuation, rrb rrbVar) {
        super(2, continuation);
        this.Y = rrbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        orb orbVar = (orb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        orbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        orb orbVar = new orb(continuation, this.Y);
        orbVar.X = obj;
        return orbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        brb brbVar = (brb) this.X;
        float f = rrb.H0;
        rrb rrbVar = this.Y;
        rrbVar.getClass();
        if (brbVar instanceof arb) {
            hv1 cameraApi = rrbVar.getCameraApi();
            ExecutorService executorService = rrbVar.s0;
            if (executorService == null) {
                executorService = null;
            }
            cameraApi.d(executorService);
        } else if (brbVar instanceof yqb) {
            rrbVar.getCameraApi().a(((yqb) brbVar).a);
        } else {
            if (!(brbVar instanceof zqb)) {
                throw new NoWhenBranchMatchedException();
            }
            rrbVar.getCameraApi().g();
        }
        return e5f.a;
    }
}
