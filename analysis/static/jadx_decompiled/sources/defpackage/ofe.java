package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.domain.UploadException;

/* loaded from: classes2.dex */
public final class ofe extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cge Z;
    public final /* synthetic */ d7f s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofe(cge cgeVar, d7f d7fVar, Continuation continuation) {
        super(2, continuation);
        this.Z = cgeVar;
        this.s0 = d7fVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ofe) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ofe ofeVar = new ofe(this.Z, this.s0, continuation);
        ofeVar.Y = obj;
        return ofeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        on5 on5Var;
        Object njcVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            on5Var = (on5) this.Y;
            String str = this.Z.b;
            d7f d7fVar = this.s0;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, "Starting uploading data=" + d7fVar, null);
            }
            cge cgeVar = this.Z;
            d7f d7fVar2 = this.s0;
            cgeVar.getClass();
            try {
                njcVar = Long.valueOf(new File(d7fVar2.a).lastModified());
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            if (njcVar instanceof njc) {
                njcVar = 0L;
            }
            long jLongValue = ((Number) njcVar).longValue();
            if (jLongValue != 0 && jLongValue != d7fVar2.b) {
                hm9.n(cgeVar.b, "File is changed during uploading, aborting!");
                throw new UploadException("Error to upload, file changed");
            }
            cge cgeVar2 = this.Z;
            d7f d7fVar3 = this.s0;
            this.Y = on5Var;
            this.X = 1;
            obj = cge.a(cgeVar2, d7fVar3, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            on5Var = (on5) this.Y;
            od2.a0(obj);
        }
        v6f v6fVar = (v6f) obj;
        String str2 = this.Z.b;
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, str2, "Retrieved upload from repository = " + v6fVar, null);
        }
        this.Y = null;
        this.X = 2;
        if (on5Var.a(v6fVar, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
