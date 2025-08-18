package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* loaded from: classes2.dex */
public final class qn7 {
    public static void a(v7g v7gVar, boolean z) {
        hm9.n(LoadEmojiFontWorker.TAG, "start");
        qla qlaVar = (qla) ((qla) ((qla) ((qla) new qla(LoadEmojiFontWorker.class).setBackoffCriteria(mf0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).setConstraints(new kj3(z ? 2 : 3, false, false, false, false, -1L, -1L, x53.H0(new LinkedHashSet())))).setExpedited(jna.a)).addTag(LoadEmojiFontWorker.TAG);
        kpa[] kpaVarArr = {new kpa(LoadEmojiFontWorker.WAITING_FOR_WIFI, Boolean.valueOf(z))};
        qqd qqdVar = new qqd(9, (byte) 0);
        kpa kpaVar = kpaVarArr[0];
        qqdVar.A(kpaVar.b, (String) kpaVar.a);
        rla rlaVar = (rla) ((qla) qlaVar.setInputData(qqdVar.p())).build();
        hm9.n(LoadEmojiFontWorker.TAG, "work " + rlaVar.getId());
        v7gVar.b(LoadEmojiFontWorker.TAG, h65.b, rlaVar, false).l();
    }
}
