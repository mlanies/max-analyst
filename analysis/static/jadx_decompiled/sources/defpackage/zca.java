package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zca extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ada Y;
    public final /* synthetic */ File Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zca(ada adaVar, File file, Continuation continuation) {
        super(2, continuation);
        this.Y = adaVar;
        this.Z = file;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zca) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zca(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            trc trcVar = (trc) this.Y.m.getValue();
            this.X = 1;
            trcVar.getClass();
            obj = j47.t0(xq9.a.plus(trcVar.b), new src(this.Z, trcVar, null), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        if (((Uri) obj) == null) {
            hm9.p("ada", "Can't save video", null);
        }
        return e5f.a;
    }
}
