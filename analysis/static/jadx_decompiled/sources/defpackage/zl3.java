package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zl3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl3(jm3 jm3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zl3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zl3(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        jm3 jm3Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ds3 ds3Var = (ds3) jm3Var.o.getValue();
            this.X = 1;
            obj = ds3Var.b(jm3Var.n, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        uj3 uj3Var = (uj3) obj;
        if (uj3Var == null) {
            return e5fVar;
        }
        AtomicLong atomicLong = jm3Var.l;
        k4a k4aVar = (k4a) ((pk) jm3Var.z.getValue());
        atomicLong.set(ome.d(k4aVar.z(), new bgc(((p7b) k4aVar.y()).a.o(), uj3Var.a.c.e), false, 0, 12));
        kld kldVar = jm3Var.d;
        sfb sfbVar = new sfb(new eqe(vea.W), new Integer(woc.m));
        this.X = 2;
        return kldVar.a(sfbVar, this) == tx3Var ? tx3Var : e5fVar;
    }
}
