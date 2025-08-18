package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class k42 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ j5d Z;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k42(j5d j5dVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Z = j5dVar;
        this.s0 = obj;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((k42) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        k42 k42Var = new k42(this.Z, this.s0, continuation);
        k42Var.Y = obj;
        return k42Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        Object g42Var = e5f.a;
        try {
            if (i == 0) {
                od2.a0(obj);
                j5d j5dVar = this.Z;
                Object obj2 = this.s0;
                this.X = 1;
                if (j5dVar.o(obj2, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
            njcVar = g42Var;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (!(!(njcVar instanceof njc))) {
            g42Var = new g42(pjc.a(njcVar));
        }
        return new i42(g42Var);
    }
}
