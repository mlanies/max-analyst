package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executors;
import kotlin.coroutines.Continuation;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;

/* loaded from: classes2.dex */
public final class rie extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xie Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rie(xie xieVar, Continuation continuation) {
        super(2, continuation);
        this.Y = xieVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rie) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rie(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        FirebaseMessaging firebaseMessaging;
        ukg ukgVarR;
        int i = 0;
        tx3 tx3Var = tx3.a;
        int i2 = this.X;
        e5f e5fVar = e5f.a;
        xie xieVar = this.Y;
        if (i2 == 0) {
            od2.a0(obj);
            u8e u8eVarG = xieVar.g();
            this.X = 1;
            xe6 xe6Var = (xe6) u8eVarG;
            if (!xe6Var.a()) {
                throw new StoreServicesInfo$ServicesNotAvailableException();
            }
            lqc lqcVar = new lqc(v3c.u(this));
            re6 re6Var = FirebaseMessaging.k;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(fl5.b());
            }
            if (firebaseMessaging.e() == null) {
                ukgVarR = j1e.r(null);
            } else {
                qne qneVar = new qne();
                Executors.newSingleThreadExecutor(new cm9("Firebase-Messaging-Network-Io", 0)).execute(new nl5(firebaseMessaging, qneVar, i));
                ukgVarR = qneVar.a;
            }
            ukgVarR.i(new ph4(lqcVar, xe6Var));
            Object objA = lqcVar.a();
            if (objA != tx3Var) {
                objA = e5fVar;
            }
            if (objA == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        ((hyc) xieVar.b()).m("user.fcmToken", null);
        ((hyc) xieVar.b()).m("user.pushDeviceType", null);
        return e5fVar;
    }
}
