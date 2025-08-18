package defpackage;

import android.security.keystore.UserNotAuthenticatedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o0g extends ffe implements a66 {
    public int X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ p0g Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0g(boolean z, p0g p0gVar, Continuation continuation) {
        super(2, continuation);
        this.Y = z;
        this.Z = p0gVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((o0g) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new o0g(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            if (this.Y) {
                String str = ((l0g) this.Z.t0.getValue()).a;
                try {
                    pnf.o(this.Z.v0, new j0g(str, this.Z.o.i(null)));
                } catch (UserNotAuthenticatedException unused) {
                    hm9.m0(this.Z.X, "Can't prepare crypto object because need auth by biometry", new Object[0]);
                    pnf.o(this.Z.v0, new j0g(str, null));
                }
                return e5fVar;
            }
            mtf mtfVar = (mtf) this.Z.Y.getValue();
            p0g p0gVar = this.Z;
            long j = p0gVar.b;
            long j2 = p0gVar.c;
            this.X = 1;
            obj = mtfVar.a(j, j2, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                p0g p0gVar2 = this.Z;
                bc7[] bc7VarArr = p0g.z0;
                p0gVar2.q();
                return e5fVar;
            }
            od2.a0(obj);
        }
        puf pufVar = (puf) obj;
        puf pufVarA = pufVar != null ? puf.a(pufVar, false, false, 7) : null;
        if (pufVarA == null) {
            p0g p0gVar3 = this.Z;
            String str2 = p0gVar3.X;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.s0, str2, ey8.h(p0gVar3.c, "Can't update webApp state in db with unchecked state, botId = "), null);
            }
            return e5fVar;
        }
        mtf mtfVar2 = (mtf) this.Z.Y.getValue();
        this.X = 2;
        mtfVar2.getClass();
        if (ote.j(mtfVar2.a, new ltf(mtfVar2, pufVarA, 1), this) == tx3Var) {
            return tx3Var;
        }
        p0g p0gVar22 = this.Z;
        bc7[] bc7VarArr2 = p0g.z0;
        p0gVar22.q();
        return e5fVar;
    }
}
