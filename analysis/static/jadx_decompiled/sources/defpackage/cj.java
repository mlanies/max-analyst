package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cj extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gj Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(gj gjVar, Continuation continuation) {
        super(2, continuation);
        this.Z = gjVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cj) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        cj cjVar = new cj(this.Z, continuation);
        cjVar.Y = obj;
        return cjVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        gj gjVar = this.Z;
        try {
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (i == 0) {
            od2.a0(obj);
            pk pkVar = gjVar.a;
            au auVar = new au(10, ((hyc) gjVar.c).g.getLong("user.reactionsLastSync", 0L));
            this.X = 1;
            obj = ((k4a) pkVar).J(auVar, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        njcVar = (ru) obj;
        if (njcVar instanceof njc) {
            njcVar = null;
        }
        ru ruVar = (ru) njcVar;
        if (ruVar == null) {
            return e5fVar;
        }
        ((hyc) gjVar.c).l("user.reactionsLastSync", Long.valueOf(ruVar.c));
        List list = ruVar.o;
        Map map = ruVar.s0;
        this.X = 2;
        return gj.c(gjVar, list, map, this) == tx3Var ? tx3Var : e5fVar;
    }
}
