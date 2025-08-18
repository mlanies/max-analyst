package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class al2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bl2 Y;
    public final /* synthetic */ List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al2(bl2 bl2Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = bl2Var;
        this.Z = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((al2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new al2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bl2 bl2Var = this.Y;
            e52 e52VarQ = bl2Var.q();
            if (e52VarQ == null) {
                return e5fVar;
            }
            eh4 eh4Var = (eh4) bl2Var.Z.getValue();
            long j = e52VarQ.b.a;
            boolean z = bl2Var.v0.get();
            this.X = 1;
            eh4Var.a(bl2Var.b, j, this.Z, z);
            if (e5fVar == tx3Var) {
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
