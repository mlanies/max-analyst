package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class y23 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ z23 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y23(z23 z23Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = z23Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((y23) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new y23(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            String str = (String) this.Y.a;
            long j = this.Z;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, ey8.h(j, "start clear draft for chatId:"), null);
            }
            e52 e52Var = (e52) ((jz2) ((iy2) ((je7) this.Y.c).getValue())).m(this.Z).a.getValue();
            if (e52Var == null) {
                hm9.n((String) this.Y.a, "can't clear draft because chat is null");
                return e5fVar;
            }
            uaa uaaVar = e52Var.b.f0;
            uaa uaaVar2 = uaaVar instanceof uaa ? uaaVar : null;
            if (uaaVar2 == null) {
                hm9.n((String) this.Y.a, "Draft empty in chat don't need clear");
                return e5fVar;
            }
            hm9.n((String) this.Y.a, "Clear local draft");
            z23 z23Var = this.Y;
            this.X = 1;
            z23Var.getClass();
            hm9.n((String) z23Var.a, ey8.h(e52Var.a, "dropAllDrafts "));
            k92 k92Var = e52Var.b;
            if (k92Var.f0 != null) {
                Long l = uaaVar2.e;
                long jLongValue = l != null ? l.longValue() : k92Var.g0;
                if (!((qyc) ((y7d) ((je7) z23Var.f).getValue())).u()) {
                    jLongValue = 0;
                }
                ((jz2) ((iy2) ((je7) z23Var.c).getValue())).l().k(e52Var.a, jLongValue, null);
            }
            Object objC = z23Var.c(e52Var.a, uaaVar2, this);
            if (objC != tx3Var) {
                objC = e5fVar;
            }
            if (objC == tx3Var) {
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
