package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* loaded from: classes2.dex */
public final class cg5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dg5 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ long v0;
    public final /* synthetic */ String w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg5(dg5 dg5Var, long j, String str, String str2, long j2, long j3, String str3, Continuation continuation) {
        super(2, continuation);
        this.Y = dg5Var;
        this.Z = j;
        this.s0 = str;
        this.t0 = str2;
        this.u0 = j2;
        this.v0 = j3;
        this.w0 = str3;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cg5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cg5(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            return obj;
        }
        od2.a0(obj);
        v7g v7gVar = this.Y.a;
        long j = this.Z;
        String str = this.s0;
        String str2 = this.t0;
        long j2 = this.u0;
        long j3 = this.v0;
        String str3 = this.w0;
        String str4 = "ru.ok.tamtam.upload.workers.UploadExternalGifWorker/" + new m7f(j, j2, str, j3, str2, str3);
        qla qlaVar = (qla) ((qla) ((qla) new qla(UploadExternalGifWorker.class).setConstraints(new kj3(2, false, false, false, false, -1L, -1L, x53.H0(new LinkedHashSet())))).setExpedited(jna.a)).setBackoffCriteria(mf0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        kpa[] kpaVarArr = {new kpa("taskName", str4), new kpa("requestId", Long.valueOf(j)), new kpa("externalUrl", str), new kpa("attachLocalId", str2), new kpa("messageId", Long.valueOf(j2)), new kpa(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(j3)), new kpa("stickerId", str3)};
        qqd qqdVar = new qqd(9, (byte) 0);
        for (int i2 = 0; i2 < 7; i2++) {
            kpa kpaVar = kpaVarArr[i2];
            qqdVar.A(kpaVar.b, (String) kpaVar.a);
        }
        mh7 mh7VarB = v7gVar.b(str4, h65.b, (rla) ((qla) qlaVar.setInputData(qqdVar.p())).build(), false);
        mh7VarB.l();
        t03 t03Var = new t03(new ovc(od2.f(od2.g(new uq5(mh7VarB.m.q(), null)), -1, 2), 5), 6);
        this.X = 1;
        Object objA = od2.A(t03Var, this);
        return objA == tx3Var ? tx3Var : objA;
    }
}
