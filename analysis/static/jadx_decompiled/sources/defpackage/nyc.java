package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* loaded from: classes2.dex */
public final class nyc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ SdkCoroutineWorker Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyc(SdkCoroutineWorker sdkCoroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = sdkCoroutineWorker;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nyc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nyc(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        SdkCoroutineWorker sdkCoroutineWorker = this.Y;
        try {
            if (i == 0) {
                od2.a0(obj);
                this.X = 1;
                obj = sdkCoroutineWorker.doWork(this);
                if (obj == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
            sdkCoroutineWorker.future.j((fm7) obj);
        } catch (Throwable th) {
            sdkCoroutineWorker.future.k(th);
        }
        return e5f.a;
    }
}
