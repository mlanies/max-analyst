package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class srb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ urb Y;
    public final /* synthetic */ byte[] Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srb(urb urbVar, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.Y = urbVar;
        this.Z = bArr;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((srb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new srb(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objT0;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        urb urbVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            djb djbVar = urbVar.b;
            this.X = 1;
            djbVar.getClass();
            objT0 = j47.t0(xq9.a.plus((nx3) djbVar.c), new rrc(djbVar, this.Z, null), this);
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
        up7 up7Var = new up7(1, uri.hashCode(), uri.toString(), uri.toString(), 0, 0L, "image/jpeg", 0L, null);
        pnf.o(urbVar.w0, new irb(up7Var, urbVar.o.f.r(up7Var)));
        urbVar.t0.m(null, drb.a);
        return e5fVar;
    }
}
