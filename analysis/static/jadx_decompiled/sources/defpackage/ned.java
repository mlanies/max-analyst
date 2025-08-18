package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ned extends ffe implements a66 {
    public final /* synthetic */ ped X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ned(ped pedVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = pedVar;
        this.Y = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ned nedVar = (ned) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        nedVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ned(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ped pedVar = this.X;
        e52 e52VarQ = ((jz2) ((iy2) pedVar.X.getValue())).q(this.Y);
        if (e52VarQ != null) {
            ihd.c.getClass();
            pnf.o(pedVar.y0, new c64(zr6.k(new StringBuilder(":profile?id="), e52VarQ.a, "&type=local_chat&is_opened_from_dialog=false")));
        }
        return e5f.a;
    }
}
