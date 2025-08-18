package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xx3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ CoroutineWorker Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx3(CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = coroutineWorker;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xx3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xx3(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        CoroutineWorker coroutineWorker = this.Y;
        try {
            if (i == 0) {
                od2.a0(obj);
                this.X = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
            coroutineWorker.b.j((fm7) obj);
        } catch (Throwable th) {
            coroutineWorker.b.k(th);
        }
        return e5f.a;
    }
}
