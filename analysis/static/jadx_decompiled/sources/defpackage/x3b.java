package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x3b extends ffe implements a66 {
    public Long X;
    public int Y;
    public final /* synthetic */ z3b Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3b(z3b z3bVar, Continuation continuation) {
        super(2, continuation);
        this.Z = z3bVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((x3b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new x3b(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Long l;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        z3b z3bVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            bh9 bh9VarN = ((uh9) z3bVar.a).n();
            if (bh9VarN == null) {
                return e5fVar;
            }
            Object obj2 = bh9VarN.c.get("MediaMetadata.Extra.MESSAGE_ID");
            Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
            l30 l30Var = vu4.a;
            q0e q0eVar = z3bVar.e;
            if (l2 == null) {
                q0eVar.m(null, new v50(null, 0.0f, l30Var));
                return e5fVar;
            }
            AtomicReference atomicReference = z3bVar.h;
            long jLongValue = l2.longValue();
            ch9 ch9Var = z3bVar.a;
            atomicReference.set(new gu0(jLongValue, ((uh9) ch9Var).y));
            if (!((uh9) ch9Var).y) {
                if (!ch9Var.b()) {
                    uh9 uh9Var = (uh9) ch9Var;
                    if (uh9Var.x) {
                        l30Var = sp3.a;
                    } else {
                        boolean z = uh9Var.w;
                        o84 o84Var = o84.c;
                        if (z || uh9Var.v != 1) {
                            l30Var = o84Var;
                        }
                    }
                }
                q0eVar.m(null, new v50(l2, ((Number) ((uh9) ch9Var).H.a.getValue()).floatValue(), l30Var));
                return e5fVar;
            }
            this.X = l2;
            this.Y = 1;
            if (j47.x(300L, this) == tx3Var) {
                return tx3Var;
            }
            l = l2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l = this.X;
            od2.a0(obj);
        }
        if (((gu0) z3bVar.h.get()).b) {
            long j = ((gu0) z3bVar.h.get()).a;
            if (l != null && j == l.longValue()) {
                z3bVar.e.m(null, new v50(l, ((Number) ((uh9) z3bVar.a).H.a.getValue()).floatValue(), dp3.a));
            }
        }
        return e5fVar;
    }
}
