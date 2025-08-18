package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class k31 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l31 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k31(long j, l31 l31Var, Continuation continuation) {
        super(2, continuation);
        this.Y = l31Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((k31) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new k31(this.Z, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        long j = this.Z;
        l31 l31Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = l31.p;
            iy2 iy2VarA = l31Var.a();
            this.X = 1;
            obj = ((jz2) iy2VarA).u(j, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5fVar;
            }
            od2.a0(obj);
        }
        e52 e52Var = (e52) obj;
        if (e52Var == null) {
            return e5fVar;
        }
        bc7[] bc7VarArr2 = l31.p;
        jz2 jz2Var = (jz2) l31Var.a();
        long j2 = e52Var.a;
        l31Var.n.o1(l31Var, l31.p[1], l31Var.b(od2.N(jz2Var.m(j2), new j31(new g00(((tm3) l31Var.h.getValue()).a(), j, 1), l31Var, e52Var, 0)), j2));
        if (((el3) l31Var.g.getValue()).m(j)) {
            xb9 xb9Var = (xb9) l31Var.i.getValue();
            int i2 = ft4.o;
            long jR = z7.R(30, kt4.SECONDS);
            this.X = 2;
            if (xb9Var.s(this.Z, jR, this) == tx3Var) {
                return tx3Var;
            }
        }
        return e5fVar;
    }
}
