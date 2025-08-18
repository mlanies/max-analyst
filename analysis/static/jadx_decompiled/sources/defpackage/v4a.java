package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* loaded from: classes.dex */
public final class v4a extends ffe implements a66 {
    public int X;
    public final /* synthetic */ OneMeApplication Y;
    public final /* synthetic */ x4a Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4a(OneMeApplication oneMeApplication, x4a x4aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeApplication;
        this.Z = x4aVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((v4a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new v4a(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            qp4 qp4VarB = qp4.u0.b(this.Y);
            u4a u4aVar = new u4a(0, 0, x4a.class, this.Z, "weakActivities", "getWeakActivities()Ljava/util/concurrent/CopyOnWriteArrayList;");
            this.X = 1;
            qp4VarB.getClass();
            Object objK = j1e.k(new f13(qp4VarB, u4aVar, null), this);
            if (objK != tx3Var) {
                objK = e5fVar;
            }
            if (objK == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
