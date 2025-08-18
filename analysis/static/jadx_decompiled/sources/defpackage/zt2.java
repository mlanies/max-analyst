package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.exception.ChatNotFoundException;

/* loaded from: classes.dex */
public final class zt2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ pu2 Z;
    public final /* synthetic */ jec s0;
    public final /* synthetic */ mm3 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt2(Object obj, Continuation continuation, pu2 pu2Var, jec jecVar, mm3 mm3Var) {
        super(2, continuation);
        this.Y = obj;
        this.Z = pu2Var;
        this.s0 = jecVar;
        this.t0 = mm3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zt2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zt2(this.Y, continuation, this.Z, this.s0, this.t0);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        boolean z = true;
        if (i == 0) {
            od2.a0(obj);
            nl2 nl2Var = (nl2) this.Y;
            pu2 pu2Var = this.Z;
            e52 e52Var = (e52) ((jz2) ((iy2) pu2Var.t0.getValue())).m(nl2Var.a).a.getValue();
            if (e52Var == null) {
                return null;
            }
            ArrayList arrayListJ = e52Var.j();
            if (arrayListJ.isEmpty()) {
                return e5fVar;
            }
            Iterator it = arrayListJ.iterator();
            while (it.hasNext()) {
                if (this.t0.a.d(((uj3) it.next()).n())) {
                    iy2 iy2Var = (iy2) pu2Var.t0.getValue();
                    this.X = 1;
                    p82 p82VarL = ((jz2) iy2Var).l();
                    ConcurrentHashMap concurrentHashMap = p82VarL.f;
                    long j = e52Var.a;
                    e52 e52VarC = (e52) concurrentHashMap.get(Long.valueOf(j));
                    if (e52VarC == null) {
                        e52VarC = p82VarL.C(j);
                    }
                    if (e52VarC != null) {
                        if (p82VarL.A(j) == null) {
                            ((cba) ((o45) p82VarL.o.get())).c(new ChatNotFoundException(ey8.h(j, "chat is null for #")), true);
                        } else {
                            ma2 ma2Var = (ma2) p82VarL.x.get();
                            e52 e52VarA = ma2Var.a(e52VarC.a, ((p7b) ((m7b) ma2Var.c.getValue())).a.t(), e52VarC.b, e52VarC.c, e52VarC.o, e52VarC.X);
                            e52VarA.o0((el3) p82VarL.r.get());
                            p82VarL.f0(null, new w72(p82VarL, j, e52VarA, z));
                        }
                    }
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                }
            }
            return e5fVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od2.a0(obj);
        this.s0.a = true;
        return e5fVar;
    }
}
