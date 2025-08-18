package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gu2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pu2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu2(pu2 pu2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = pu2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gu2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gu2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Long lValueOf;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            pu2 pu2Var = this.Y;
            hm9.n(pu2Var.z0, "loadNext");
            mt2 mt2Var = (mt2) pu2Var.x0.getValue();
            boolean zIsEmpty = mt2Var.a.isEmpty();
            boolean z = mt2Var.b;
            if (zIsEmpty && z) {
                this.X = 1;
                if (pu2Var.d(this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                List list = mt2Var.a;
                if ((!list.isEmpty()) && z) {
                    pk5 pk5Var = new pk5(l6d.Z(new at(2, list), new we1(24)));
                    if (pk5Var.hasNext()) {
                        lValueOf = Long.valueOf(((nl2) pk5Var.next()).v0);
                        while (pk5Var.hasNext()) {
                            Long lValueOf2 = Long.valueOf(((nl2) pk5Var.next()).v0);
                            if (lValueOf.compareTo(lValueOf2) > 0) {
                                lValueOf = lValueOf2;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    pu2Var.f(lValueOf != null ? lValueOf.longValue() : Long.MAX_VALUE);
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
