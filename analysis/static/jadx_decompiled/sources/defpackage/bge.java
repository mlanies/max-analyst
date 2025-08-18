package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bge extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cge Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bge(cge cgeVar, Continuation continuation) {
        super(2, continuation);
        this.Z = cgeVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bge) n((v6f) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bge bgeVar = new bge(this.Z, continuation);
        bgeVar.Y = obj;
        return bgeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            v6f v6fVar = (v6f) this.Y;
            if (v6fVar.a()) {
                d7f d7fVar = v6fVar.a;
                int i2 = d7fVar.c;
                boolean z = i2 == 6;
                cge cgeVar = this.Z;
                if (z || h4f.a(i2)) {
                    this.X = 1;
                    if (cgeVar.h(d7fVar, this) == tx3Var) {
                        return tx3Var;
                    }
                } else {
                    this.X = 2;
                    if (cgeVar.f(v6fVar, this) == tx3Var) {
                        return tx3Var;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
