package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class llc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ilc Z;
    public final /* synthetic */ m56 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llc(ilc ilcVar, m56 m56Var, Continuation continuation) {
        super(2, continuation);
        this.Z = ilcVar;
        this.s0 = m56Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((llc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        llc llcVar = new llc(this.Z, this.s0, continuation);
        llcVar.Y = obj;
        return llcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Throwable th;
        v0f v0fVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        ilc ilcVar = this.Z;
        try {
            if (i == 0) {
                od2.a0(obj);
                v0f v0fVar2 = (v0f) ((sx3) this.Y).getCoroutineContext().get(v0f.c);
                v0fVar2.b.incrementAndGet();
                try {
                    ilcVar.c();
                    try {
                        m56 m56Var = this.s0;
                        this.Y = v0fVar2;
                        this.X = 1;
                        Object objInvoke = m56Var.invoke(this);
                        if (objInvoke == tx3Var) {
                            return tx3Var;
                        }
                        obj = objInvoke;
                        v0fVar = v0fVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        ilcVar.l();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    this = v0fVar2;
                    if (this.b.decrementAndGet() >= 0) {
                        throw th;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v0fVar = (v0f) this.Y;
                try {
                    od2.a0(obj);
                } catch (Throwable th4) {
                    th = th4;
                    ilcVar.l();
                    throw th;
                }
            }
            ilcVar.r();
            ilcVar.l();
            if (v0fVar.b.decrementAndGet() >= 0) {
                return obj;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
