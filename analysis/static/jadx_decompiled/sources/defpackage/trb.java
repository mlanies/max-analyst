package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class trb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ urb Z;
    public final /* synthetic */ File s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trb(urb urbVar, File file, Continuation continuation) {
        super(2, continuation);
        this.Z = urbVar;
        this.s0 = file;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((trb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        trb trbVar = new trb(this.Z, this.s0, continuation);
        trbVar.Y = obj;
        return trbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objT0;
        Object njcVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        urb urbVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            trc trcVar = urbVar.c;
            this.Y = sx3Var;
            this.X = 1;
            trcVar.getClass();
            objT0 = j47.t0(xq9.a.plus(trcVar.b), new src(this.s0, trcVar, null), this);
            if (objT0 == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            objT0 = obj;
        }
        Uri uri = (Uri) objT0;
        e5f e5fVar = e5f.a;
        if (uri == null) {
            return e5fVar;
        }
        try {
            njcVar = ((cj0) urbVar.Z).d(uri.toString());
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        xjf xjfVar = (xjf) (njcVar instanceof njc ? null : njcVar);
        up7 up7Var = new up7(3, uri.toString().hashCode(), uri.toString(), xjfVar != null ? xjfVar.a : uri.toString(), 0, 0L, "video/mp4", 0L, null);
        pnf.o(urbVar.w0, new irb(up7Var, urbVar.o.f.r(up7Var)));
        return e5fVar;
    }
}
