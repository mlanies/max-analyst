package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xzf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zzf Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzf(zzf zzfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = zzfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xzf) n((oxf) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xzf xzfVar = new xzf(this.Y, continuation);
        xzfVar.X = obj;
        return xzfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        oxf oxfVar = (oxf) this.X;
        zzf zzfVar = this.Y;
        w97 w97Var = (w97) zzfVar.R0.get(new Long(oxfVar.a()));
        e5f e5fVar = e5f.a;
        if (w97Var == null) {
            return e5fVar;
        }
        boolean z = oxfVar instanceof mxf;
        ConcurrentHashMap concurrentHashMap = zzfVar.R0;
        if (z) {
            w97Var.a(mwf.SUCCESS);
            concurrentHashMap.remove(new Long(((mxf) oxfVar).a));
        } else if (oxfVar instanceof lxf) {
            w97Var.a(mwf.CANCELLED);
            concurrentHashMap.remove(new Long(((lxf) oxfVar).a));
        } else {
            if (!(oxfVar instanceof nxf)) {
                throw new NoWhenBranchMatchedException();
            }
            w97Var.b(new qwf());
            concurrentHashMap.remove(new Long(((nxf) oxfVar).a));
        }
        return e5fVar;
    }
}
