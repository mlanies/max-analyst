package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h89 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l89 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h89(l89 l89Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = l89Var;
        this.Z = j;
        this.s0 = j2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((h89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new h89(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Y.i;
            long j = this.Z;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, ey8.h(j, "Scrolling to unread message with sortTime="), null);
            }
            l89 l89Var = this.Y;
            long j2 = this.Z;
            long j3 = this.s0;
            this.X = 1;
            l89.d(l89Var, j2, j3, false, 1, 4);
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
