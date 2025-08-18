package defpackage;

import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gw5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ iw5 Y;
    public final /* synthetic */ at5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw5(iw5 iw5Var, at5 at5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = iw5Var;
        this.Z = at5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gw5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gw5(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int iNextIndex;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            iw5 iw5Var = this.Y;
            List list = (List) iw5Var.X.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                if (((w9f) listIterator.previous()).b == v9f.b) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            at5 at5VarA = at5.a(this.Z, null, iNextIndex + 1, null, 262135);
            this.X = 1;
            zb2 zb2Var = (zb2) iw5Var.b;
            zb2Var.getClass();
            Object objT0 = j47.t0(zb2Var.Y, new hb2(zb2Var, at5VarA, null, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
