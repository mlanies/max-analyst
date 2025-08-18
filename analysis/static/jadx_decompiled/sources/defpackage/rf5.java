package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* loaded from: classes2.dex */
public final class rf5 {
    public final v7g a;

    public rf5(v7g v7gVar) {
        this.a = v7gVar;
    }

    public final t03 a(pne pneVar) {
        hm9.m("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "start %s", pneVar);
        StringBuilder sb = new StringBuilder("TaskAttachDownloadData{messageId=");
        long j = pneVar.a;
        sb.append(j);
        sb.append(", attachId='");
        String str = pneVar.b;
        sb.append(str);
        sb.append("', videoId=");
        long j2 = pneVar.c;
        sb.append(j2);
        sb.append(", audioId=");
        long j3 = pneVar.d;
        sb.append(j3);
        sb.append(", mp4GifId=");
        long j4 = pneVar.e;
        sb.append(j4);
        sb.append(", stickerId=");
        long j5 = pneVar.f;
        sb.append(j5);
        sb.append(", fileId=");
        long j6 = pneVar.j;
        sb.append(j6);
        sb.append(", fileName='");
        String str2 = pneVar.k;
        String strI = wg0.i("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker/", zr6.l(sb, str2, "'}"));
        qla qlaVar = (qla) ((qla) ((qla) new qla(DownloadFileAttachWorker.class).setExpedited(jna.a)).setBackoffCriteria(mf0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker");
        kpa[] kpaVarArr = {new kpa("taskName", strI), new kpa("messageId", Long.valueOf(j)), new kpa("attachId", str), new kpa("videoId", Long.valueOf(j2)), new kpa("audioId", Long.valueOf(j3)), new kpa("mp4GifId", Long.valueOf(j4)), new kpa("stickerId", Long.valueOf(j5)), new kpa("url", pneVar.g), new kpa("notifyProgress", Boolean.valueOf(pneVar.h)), new kpa("checkAutoLoadConnection", Boolean.valueOf(pneVar.i)), new kpa("fileId", Long.valueOf(j6)), new kpa("fileName", str2), new kpa("invalidateCount", Integer.valueOf(pneVar.l)), new kpa("useOriginalExtension", Boolean.valueOf(pneVar.m)), new kpa("notCopyVideoToGallery", Boolean.valueOf(pneVar.n))};
        qqd qqdVar = new qqd(9, (byte) 0);
        for (int i = 0; i < 15; i++) {
            kpa kpaVar = kpaVarArr[i];
            qqdVar.A(kpaVar.b, (String) kpaVar.a);
        }
        rla rlaVar = (rla) ((qla) qlaVar.setInputData(qqdVar.p())).build();
        mh7 mh7VarB = this.a.b(strI, h65.b, rlaVar, false);
        mh7VarB.l();
        return new t03(od2.f(od2.g(new uq5(mh7VarB.m.q(), null)), -1, 2), 5);
    }
}
