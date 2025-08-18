package defpackage;

import java.io.File;
import one.me.sdk.transfer.domain.UploadException;

/* loaded from: classes2.dex */
public final /* synthetic */ class b7f implements qj3, grd, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7f b;

    public /* synthetic */ b7f(d7f d7fVar, int i) {
        this.a = i;
        this.b = d7fVar;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        hm9.p("c7f", "removeUploadFromRepository: failed, data=" + this.b, (Throwable) obj);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 2:
                w8f w8fVar = (w8f) obj;
                d7f d7fVar = this.b;
                String str = d7fVar.a;
                w8fVar.getClass();
                xlc xlcVarA = xlc.a(3, "SELECT * FROM uploads WHERE path=? AND upload_type=? AND last_modified=? LIMIT 1");
                if (str == null) {
                    xlcVarA.W(1);
                } else {
                    xlcVarA.f(1, str);
                }
                xlcVarA.j(2, au1.s(d7fVar.c));
                xlcVarA.j(3, d7fVar.b);
                return new t28(new u8f(w8fVar, xlcVarA, 0));
            default:
                w8f w8fVar2 = (w8f) obj;
                d7f d7fVar2 = this.b;
                String str2 = d7fVar2.a;
                w8fVar2.getClass();
                return new sa3(2, new v8f(w8fVar2, str2, d7fVar2.c, d7fVar2.b));
        }
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) {
        Object njcVar;
        hm9.n("c7f", "checkSourceFileChanged: started");
        d7f d7fVar = this.b;
        try {
            njcVar = Long.valueOf(new File(d7fVar.a).lastModified());
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = 0L;
        }
        long jLongValue = ((Number) njcVar).longValue();
        boolean z = (jLongValue == 0 || jLongValue == d7fVar.b) ? false : true;
        if (nqdVar.h()) {
            return;
        }
        if (z) {
            nqdVar.onError(new UploadException("failed to upload, file changed"));
        } else {
            hm9.n("c7f", "checkSourceFileChanged: finished");
            nqdVar.a(d7fVar);
        }
    }
}
