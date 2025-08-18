package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* loaded from: classes2.dex */
public final class kyc extends ffe implements a66 {
    public j87 X;
    public int Y;
    public final /* synthetic */ j87 Z;
    public final /* synthetic */ SdkCoroutineWorker s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyc(j87 j87Var, SdkCoroutineWorker sdkCoroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Z = j87Var;
        this.s0 = sdkCoroutineWorker;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((kyc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kyc(this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        j87 j87Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            j87 j87Var2 = this.Z;
            this.X = j87Var2;
            this.Y = 1;
            Object foregroundInfo = this.s0.getForegroundInfo(this);
            if (foregroundInfo == tx3Var) {
                return tx3Var;
            }
            obj = foregroundInfo;
            j87Var = j87Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j87Var = this.X;
            od2.a0(obj);
        }
        j87Var.a.j(obj);
        return e5f.a;
    }
}
