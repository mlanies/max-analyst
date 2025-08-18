package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class t81 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ u81 Y;
    public final /* synthetic */ List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(u81 u81Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = u81Var;
        this.Z = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((t81) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new t81(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            m5d m5dVar = this.Y.c;
            this.X = 1;
            Object objT0 = j47.t0(((w9a) ((kke) ((je7) m5dVar.X).getValue())).b(), new ns1(this.Z, m5dVar, null), this);
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
