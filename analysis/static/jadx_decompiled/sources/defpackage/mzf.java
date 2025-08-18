package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* loaded from: classes2.dex */
public final class mzf extends ffe implements a66 {
    public final /* synthetic */ zzf X;
    public final /* synthetic */ nwf Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzf(zzf zzfVar, nwf nwfVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = zzfVar;
        this.Y = nwfVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mzf mzfVar = (mzf) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mzfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new mzf(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        zzf zzfVar = this.X;
        rf5 rf5Var = (rf5) zzfVar.x0.getValue();
        nwf nwfVar = this.Y;
        String str = nwfVar.d;
        long j = this.Z;
        long j2 = zzfVar.b;
        String str2 = nwfVar.c;
        yne yneVar = new yne(str2, str, j, j2);
        rf5Var.getClass();
        hm9.m("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "start %s", yneVar);
        String str3 = "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker/" + yneVar;
        qla qlaVar = (qla) ((qla) ((qla) new qla(DownloadFileFromWebAppWorker.class).setExpedited(jna.a)).setBackoffCriteria(mf0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker");
        kpa[] kpaVarArr = {new kpa("taskName", str3), new kpa("requestId", Long.valueOf(j)), new kpa("botId", Long.valueOf(j2)), new kpa("fileName", str), new kpa("fileUrl", str2)};
        qqd qqdVar = new qqd(9, (byte) 0);
        for (int i = 0; i < 5; i++) {
            kpa kpaVar = kpaVarArr[i];
            qqdVar.A(kpaVar.b, (String) kpaVar.a);
        }
        mh7 mh7VarB = rf5Var.a.b(str3, h65.b, (rla) ((qla) qlaVar.setInputData(qqdVar.p())).build(), false);
        mh7VarB.l();
        od2.f(od2.g(new uq5(mh7VarB.m.q(), null)), -1, 2);
        mwf mwfVar = mwf.DOWNLOADING;
        zt0 zt0Var = nwfVar.a;
        if (!zt0Var.p()) {
            zt0Var.n(mwfVar);
        }
        zzfVar.R0.put(new Long(this.Z), nwfVar);
        return e5f.a;
    }
}
