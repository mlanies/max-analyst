package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g8a extends ffe implements a66 {
    public int X;
    public final /* synthetic */ h8a Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8a(h8a h8aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = h8aVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((g8a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new g8a(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            h8a h8aVar = this.Y;
            iy2 iy2Var = (iy2) h8aVar.c.getValue();
            long j = h8aVar.b;
            this.X = 1;
            obj = iy2Var.d(j, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
