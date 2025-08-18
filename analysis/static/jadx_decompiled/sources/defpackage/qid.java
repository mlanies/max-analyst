package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qid extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vid Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qid(vid vidVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vidVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qid) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qid(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            vid vidVar = this.Y;
            ng5 ng5Var = (ng5) vidVar.X.getValue();
            ng5Var.j.getClass();
            ng5Var.a(new va8((x8f) null)).h(Collections.singleton(gx0.a));
            fx0 fx0Var = (fx0) vidVar.Z.getValue();
            Long l = fx0Var != null ? new Long(fx0Var.a) : null;
            if (l != null) {
                vid.q(vidVar, l.longValue());
            }
            this.X = 1;
            if (vid.r(vidVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
