package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* loaded from: classes2.dex */
public final class qje implements qj3, l3a {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qje(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((UploadDraftMediaWorker) this.b).e((Throwable) obj);
                break;
            default:
                hm9.n("v7g", "initialized!");
                ((v7g) this.b).h = true;
                ((v7g) this.b).i((p7g) obj);
                p7g p7gVarH = ((v7g) this.b).h();
                qyc qycVar = (qyc) ((v7g) this.b).c;
                qycVar.getClass();
                int iQ = (int) qycVar.q(PmsKey.f137wmbacklogworkerbackoffdelaysec, 10);
                xfg.B(p7gVarH, Integer.valueOf(iQ >= 1 ? iQ : 1), null);
                break;
        }
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    public qje() {
        this.a = 0;
        this.b = new ConcurrentHashMap();
    }
}
