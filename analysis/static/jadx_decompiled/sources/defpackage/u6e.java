package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u6e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ w6e Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ Long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6e(w6e w6eVar, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.Y = w6eVar;
        this.Z = l;
        this.s0 = l2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((u6e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new u6e(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = 0;
        int i2 = 2;
        tx3 tx3Var = tx3.a;
        int i3 = this.X;
        if (i3 == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = w6e.B0;
            sc5 sc5Var = (sc5) this.Y.o.getValue();
            Long l = this.Z;
            final long jLongValue = l.longValue();
            Long l2 = this.s0;
            final long jLongValue2 = l2.longValue();
            sc5Var.getClass();
            hm9.m("sc5", "setFavoriteStickerSetMoved: stickerSetId=%d, targetPositionStickerId=%d", l, l2);
            qa3 qa3Var = new qa3(sc5Var.b(), i2, new pc5(jLongValue, jLongValue2, 0));
            final dd5 dd5Var = (dd5) sc5Var.Y.getValue();
            dd5Var.getClass();
            db3 db3VarF = new qa3(qa3Var, i, new qa3(new oqd(new kde() { // from class: ad5
                @Override // defpackage.kde
                public final Object get() {
                    final dd5 dd5Var2 = dd5Var;
                    dd5Var2.getClass();
                    final long j = jLongValue;
                    final long j2 = jLongValue2;
                    return dd5Var2.a(new Callable() { // from class: cd5
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            k4a k4aVar = (k4a) dd5Var2.a;
                            return Long.valueOf(ome.d(k4aVar.z(), new ku(((p7b) k4aVar.y()).a.o(), 5, j, j2, -1), false, 0, 12));
                        }
                    });
                }
            }, i).h(new gd1(12, mu.class)), i2, new nc5(14)).k(dd5Var.d)).g(new nc5(i2)).f(new f6() { // from class: qc5
                @Override // defpackage.f6
                public final void run() {
                    hm9.m("sc5", "setFavoriteStickerSetMoved: success move stickerSetId=%d, to position of stickerSetId=%d", Long.valueOf(jLongValue), Long.valueOf(jLongValue2));
                }
            });
            this.X = 1;
            if (s36.e(db3VarF, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
