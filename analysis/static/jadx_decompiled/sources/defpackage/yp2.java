package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yp2 extends ffe implements a66 {
    public long X;
    public int Y;
    public final /* synthetic */ rq2 Z;
    public final /* synthetic */ Uri s0;
    public final /* synthetic */ Long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp2(rq2 rq2Var, Uri uri, Long l, Continuation continuation) {
        super(2, continuation);
        this.Z = rq2Var;
        this.s0 = uri;
        this.t0 = l;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yp2(this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        long j;
        Object objC;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        rq2 rq2Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            e52 e52Var = (e52) rq2Var.Y0.a.getValue();
            if (e52Var != null) {
                p5d p5dVar = (p5d) rq2Var.D0.getValue();
                List listSingletonList = Collections.singletonList(new aqd(1, this.s0.toString()));
                long j2 = e52Var.a;
                this.X = j2;
                this.Y = 1;
                if (p5dVar.a(j2, null, listSingletonList, false, this.t0, null, this) == tx3Var) {
                    return tx3Var;
                }
                j = j2;
            }
            return e5fVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            objC = obj;
            pnf.o(rq2Var.b1, (zo2) objC);
            return e5fVar;
        }
        long j3 = this.X;
        od2.a0(obj);
        j = j3;
        mq9 mq9Var = zo2.d;
        lu0 lu0VarQ = rq2.q(rq2Var);
        this.Y = 2;
        objC = mq9Var.c(j, 1, lu0VarQ, null, true, this);
        if (objC == tx3Var) {
            return tx3Var;
        }
        pnf.o(rq2Var.b1, (zo2) objC);
        return e5fVar;
    }
}
