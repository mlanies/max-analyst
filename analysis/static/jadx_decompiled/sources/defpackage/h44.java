package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h44 extends ffe implements m56 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ o44 Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h44(long j, o44 o44Var, Continuation continuation) {
        super(1, continuation);
        this.s0 = j;
        this.Z = o44Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.X) {
            case 0:
                return new h44(this.s0, this.Z, continuation).o(e5f.a);
            default:
                return new h44(this.Z, this.s0, continuation).o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e5f e5fVar = e5f.a;
        long j = this.s0;
        o44 o44Var = this.Z;
        tx3 tx3Var = tx3.a;
        switch (this.X) {
            case 0:
                int i = this.Y;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                    return e5fVar;
                }
                od2.a0(obj);
                hm9.m(o44.k, "cancelServerChatId %d", new Long(j));
                o44Var.g.e.l(j);
                b79 b79Var = (b79) o44Var.a.getValue();
                this.Y = 1;
                return ((n79) b79Var).d(j, this) == tx3Var ? tx3Var : e5fVar;
            default:
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                    return e5fVar;
                }
                od2.a0(obj);
                f44 f44Var = o44Var.g;
                f44 f44Var2 = f44.f;
                boolean z = f44Var.b;
                gi9 gi9Var = f44Var.e;
                gi9Var.a(j);
                f44 f44Var3 = new f44(f44Var.a, z, gi9Var, f44Var.c, null);
                this.Y = 1;
                return o44.a(o44Var, f44Var3, this) == tx3Var ? tx3Var : e5fVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h44(o44 o44Var, long j, Continuation continuation) {
        super(1, continuation);
        this.Z = o44Var;
        this.s0 = j;
    }
}
