package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException;

/* loaded from: classes2.dex */
public final class zif extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ejf Z;
    public final /* synthetic */ File s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zif(ejf ejfVar, File file, Continuation continuation) {
        super(2, continuation);
        this.Z = ejfVar;
        this.s0 = file;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zif) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zif zifVar = new zif(this.Z, this.s0, continuation);
        zifVar.Y = obj;
        return zifVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        cdc cdcVarU = null;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Y;
            w7c w7cVar = this.Z.H0;
            yif yifVar = new yif(2, null);
            this.Y = sx3Var2;
            this.X = 1;
            Object objB = od2.B(w7cVar, yifVar, this);
            if (objB == tx3Var) {
                return tx3Var;
            }
            sx3Var = sx3Var2;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
        }
        if (!tpa.f((Boolean) obj, Boolean.TRUE)) {
            throw new VideoMessageRecordDelegate$PreviewRenderException(0);
        }
        String name = sx3Var.getClass().getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "Camera preview was bind successfully", null);
        }
        ejf ejfVar = this.Z;
        File file = this.s0;
        bc7[] bc7VarArr = ejf.N0;
        ejfVar.getClass();
        ejfVar.u0 = new h7b(18);
        adc adcVar = ejfVar.x0;
        if (adcVar != null) {
            nx0 nx0Var = new nx0((Context) ejfVar.a.getValue(), adcVar, new y8(file).v());
            nx0Var.Y = true;
            nx0Var.x();
            cdcVarU = nx0Var.u((ExecutorService) ejfVar.s0.getValue(), new cy1(11, ejfVar));
        }
        ejfVar.F0 = cdcVarU;
        return e5f.a;
    }
}
