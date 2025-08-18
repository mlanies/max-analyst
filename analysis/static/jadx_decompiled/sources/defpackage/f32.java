package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f32 extends l32 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(f32.class, "consumed$volatile");
    public final boolean X;
    private volatile /* synthetic */ int consumed$volatile;
    public final p8c o;

    public /* synthetic */ f32(p8c p8cVar, boolean z) {
        this(p8cVar, z, hz4.a, -3, 1);
    }

    @Override // defpackage.l32, defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) throws Throwable {
        e5f e5fVar = e5f.a;
        tx3 tx3Var = tx3.a;
        if (this.b != -3) {
            Object objD = super.d(on5Var, continuation);
            return objD == tx3Var ? objD : e5fVar;
        }
        boolean z = this.X;
        if (z && Y.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
        Object objV = fp3.v(on5Var, this.o, z, continuation);
        return objV == tx3Var ? objV : e5fVar;
    }

    @Override // defpackage.l32
    public final String h() {
        return "channel=" + this.o;
    }

    @Override // defpackage.l32
    public final Object j(iab iabVar, Continuation continuation) throws Throwable {
        Object objV = fp3.v(new z5d(iabVar), this.o, this.X, continuation);
        return objV == tx3.a ? objV : e5f.a;
    }

    @Override // defpackage.l32
    public final l32 k(lx3 lx3Var, int i, int i2) {
        return new f32(this.o, this.X, lx3Var, i, i2);
    }

    @Override // defpackage.l32
    public final mn5 l() {
        return new f32(this.o, this.X);
    }

    @Override // defpackage.l32
    public final p8c m(sx3 sx3Var) {
        if (!this.X || Y.getAndSet(this, 1) == 0) {
            return this.b == -3 ? this.o : super.m(sx3Var);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
    }

    public f32(p8c p8cVar, boolean z, lx3 lx3Var, int i, int i2) {
        super(lx3Var, i, i2);
        this.o = p8cVar;
        this.X = z;
        this.consumed$volatile = 0;
    }
}
