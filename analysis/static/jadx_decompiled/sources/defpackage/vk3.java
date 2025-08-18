package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vk3 extends ffe implements a66 {
    public final /* synthetic */ zk3 X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk3(zk3 zk3Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = zk3Var;
        this.Y = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vk3 vk3Var = (vk3) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vk3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vk3(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        zk3 zk3Var = this.X;
        zk3Var.p.set(((k4a) ((pk) zk3Var.l.getValue())).H(2, 0L, null, null, null, null, null, this.Y));
        return e5f.a;
    }
}
