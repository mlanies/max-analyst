package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wx3 extends ffe implements a66 {
    public j87 X;
    public int Y;
    public final /* synthetic */ j87 Z;
    public final /* synthetic */ CoroutineWorker s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx3(j87 j87Var, CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Z = j87Var;
        this.s0 = coroutineWorker;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wx3 wx3Var = (wx3) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wx3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wx3(this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = this.Z;
            this.Y = 1;
            this.s0.getClass();
            throw new IllegalStateException("Not implemented");
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j87 j87Var = this.X;
        od2.a0(obj);
        j87Var.a.j(obj);
        return e5f.a;
    }
}
