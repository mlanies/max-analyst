package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class n32 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mn5 Y;
    public final /* synthetic */ z5d Z;
    public final /* synthetic */ c5d s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n32(mn5 mn5Var, z5d z5dVar, f5d f5dVar, Continuation continuation) {
        super(2, continuation);
        this.Y = mn5Var;
        this.Z = z5dVar;
        this.s0 = f5dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((n32) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new n32(this.Y, this.Z, (f5d) this.s0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [c5d] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [f5d] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        ?? r2 = this.s0;
        try {
            if (i == 0) {
                od2.a0(obj);
                mn5 mn5Var = this.Y;
                z5d z5dVar = this.Z;
                this.X = 1;
                if (mn5Var.d(z5dVar, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
            r2 = (f5d) r2;
            r2.c();
            return e5f.a;
        } catch (Throwable th) {
            ((f5d) r2).c();
            throw th;
        }
    }
}
