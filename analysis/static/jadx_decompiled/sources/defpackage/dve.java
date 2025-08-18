package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousByteChannel;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dve extends ffe implements a66 {
    public int X;
    public final /* synthetic */ tve Y;
    public final /* synthetic */ ByteBuffer Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dve(tve tveVar, ByteBuffer byteBuffer, Continuation continuation) {
        super(2, continuation);
        this.Y = tveVar;
        this.Z = byteBuffer;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dve) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dve(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            AsynchronousByteChannel asynchronousByteChannel = this.Y.b;
            this.X = 1;
            sy1 sy1Var = new sy1(1, v3c.u(this));
            sy1Var.n();
            asynchronousByteChannel.read(this.Z, sy1Var, fv.b);
            obj = sy1Var.m();
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
