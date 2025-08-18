package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pz8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xz8 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ cz5 s0;
    public final /* synthetic */ CharSequence t0;
    public final /* synthetic */ boolean u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz8(xz8 xz8Var, Long l, cz5 cz5Var, CharSequence charSequence, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = xz8Var;
        this.Z = l;
        this.s0 = cz5Var;
        this.t0 = charSequence;
        this.u0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pz8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pz8(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        cz5 cz5Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        xz8 xz8Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            e52 e52Var = (e52) xz8Var.b.getValue();
            if (e52Var != null) {
                Long l = this.Z;
                long j = e52Var.a;
                if (l != null || (cz5Var = this.s0) == null) {
                    CharSequence charSequence = this.t0;
                    if (charSequence != null && !w9e.C0(charSequence)) {
                        o89 o89Var = (o89) xz8Var.Y.getValue();
                        this.X = 3;
                        if (o89Var.a(j, this.t0, this.Z, this.s0, this.u0, this) == tx3Var) {
                            return tx3Var;
                        }
                    }
                } else {
                    List listSingletonList = Collections.singletonList(new Long(j));
                    if (cz5Var.b == null || !cz5Var.c) {
                        bz5 bz5Var = (bz5) xz8Var.s0.getValue();
                        this.X = 2;
                        bz5Var.getClass();
                        Object objK = j1e.k(new az5(bz5Var, cz5Var, listSingletonList, null), this);
                        if (objK != tx3Var) {
                            objK = e5fVar;
                        }
                        if (objK == tx3Var) {
                            return tx3Var;
                        }
                    } else {
                        sy5 sy5Var = (sy5) xz8Var.Z.getValue();
                        this.X = 1;
                        sy5Var.getClass();
                        Object objK2 = j1e.k(new ry5(sy5Var, cz5Var, listSingletonList, null), this);
                        if (objK2 != tx3Var) {
                            objK2 = e5fVar;
                        }
                        if (objK2 == tx3Var) {
                            return tx3Var;
                        }
                    }
                }
            }
            return e5fVar;
        }
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od2.a0(obj);
        xz8Var.I0.setValue(null);
        xz8Var.s();
        return e5fVar;
    }
}
