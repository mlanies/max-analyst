package defpackage;

import androidx.work.WorkRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class dg5 {
    public final v7g a;
    public final rm4 b;
    public final rm4 c;

    public dg5(v7g v7gVar, rm4 rm4Var, rm4 rm4Var2) {
        this.a = v7gVar;
        this.b = rm4Var;
        this.c = rm4Var2;
    }

    public final void a(long j) {
        int i = 2;
        try {
            List list = (List) new o28(new e0a(new q28(new o28(((py8) this.c.get()).b(), i, new c10(j, 24)), new jj9(i), 0), new hj8(15), 3).v(), i, new hj8(17)).c(nz4.a);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nw8 nw8Var = ((iy8) it.next()).a;
                this.a.c("UploadFileAttachWorker:" + nw8Var.b + ":" + nw8Var.a + ":" + nw8Var.c);
            }
            hm9.m("dg5", "success! cancel attach %d uploads", Integer.valueOf(list.size()));
        } catch (Throwable th) {
            hm9.p("dg5", "failure to cancel attach uploads", th);
        }
    }

    public final void b(long j) {
        int i = 2;
        try {
            uqd uqdVarA = ((up4) this.b.get()).a();
            lh4 lh4Var = new lh4();
            lh4Var.a = j;
            List list = (List) new o28(new e0a(new q28(new o28(uqdVarA, i, lh4Var), yxc.X, 0), c32.o, 3).v(), i, nd2.o).b();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ep4 ep4Var = ((lp4) it.next()).a;
                    this.a.c("UploadDraftMediaWorker/" + ep4Var.a + ":" + ep4Var.b);
                }
            }
            hm9.m("dg5", "success! cancel draft %d uploads", list != null ? Integer.valueOf(list.size()) : null);
        } catch (Exception e) {
            hm9.p("dg5", "failure in cancelling draft uploads other workers", e);
        }
    }

    public final void c(o2 o2Var, long j, long j2, String str) {
        ref refVar;
        int i = o2Var.a;
        int i2 = 7;
        if (i != 1) {
            i2 = i != 2 ? i != 3 ? i != 7 ? i != 10 ? i != 11 ? 1 : 9 : 8 : 5 : 2 : 6;
        } else if (!(o2Var instanceof y95)) {
            i2 = 3;
        }
        if (i2 == 1) {
            hm9.q("FileAttachUploader", "upload: failed, unknown media type = %s", Integer.valueOf(i));
            return;
        }
        nw8 nw8Var = new nw8(j, str, j2);
        hy8 hy8Var = new hy8();
        hy8Var.a = nw8Var;
        hy8Var.d = i2;
        hy8Var.b = o2Var.a();
        hy8Var.c = pag.u(o2Var.a());
        if (o2Var instanceof vgf) {
            ref refVar2 = ((vgf) o2Var).c;
            mqb mqbVar = refVar2.a;
            i20 i20Var = new i20(1);
            i20Var.a = mqbVar;
            i20Var.b = refVar2.b;
            i20Var.c = refVar2.c;
            i20Var.d = refVar2.d;
            refVar = new ref(i20Var);
        } else {
            refVar = null;
        }
        hy8Var.e = refVar;
        d(new iy8(hy8Var));
    }

    public final void d(iy8 iy8Var) {
        hm9.m("UploadFileAttachWorker", "start %s", iy8Var);
        StringBuilder sb = new StringBuilder("UploadFileAttachWorker:");
        nw8 nw8Var = iy8Var.a;
        sb.append(nw8Var.b);
        sb.append(":");
        long j = nw8Var.a;
        sb.append(j);
        sb.append(":");
        String str = nw8Var.c;
        sb.append(str);
        String string = sb.toString();
        qla qlaVar = (qla) ((qla) ((qla) new qla(UploadFileAttachWorker.class).setExpedited(jna.a)).setBackoffCriteria(mf0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("UploadFileAttachWorker");
        HashMap map = new HashMap();
        map.put("workName", string);
        map.put("key.messageId", Long.valueOf(j));
        map.put("key.chatId", Long.valueOf(nw8Var.b));
        map.put("key.attachLocalId", str);
        map.put(ClientCookie.PATH_ATTR, iy8Var.b);
        map.put("lastModified", Long.valueOf(iy8Var.c));
        map.put("uploadType", h4f.r(iy8Var.d));
        map.put("attachLocalId", iy8Var.f);
        ref refVar = iy8Var.e;
        if (refVar != null) {
            map.put("messageUpload.videoConvertOptions", true);
            map.put("messageUpload.videoConvertOptions.quality", refVar.a.name());
            map.put("messageUpload.videoConvertOptions.startTrimPosition", Float.valueOf(refVar.b));
            map.put("messageUpload.videoConvertOptions.endTrimPosition", Float.valueOf(refVar.c));
            map.put("messageUpload.videoConvertOptions.mute", Boolean.valueOf(refVar.d));
        }
        d24 d24Var = new d24(map);
        d24.f(d24Var);
        rla rlaVar = (rla) ((qla) qlaVar.setInputData(d24Var)).build();
        this.a.b(string, h65.b, rlaVar, false).l();
    }
}
