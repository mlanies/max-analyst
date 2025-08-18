package defpackage;

import java.io.File;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class s7f implements fq6 {
    public final /* synthetic */ UploadExternalGifWorker a;

    public s7f(UploadExternalGifWorker uploadExternalGifWorker) {
        this.a = uploadExternalGifWorker;
    }

    @Override // defpackage.fq6
    public final void a() {
        hm9.p("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadFailed", null);
        this.a.z0 = hx9.u0;
    }

    @Override // defpackage.fq6
    public final void b() {
        hm9.p("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onUrlExpired", null);
        ((cba) ((o45) this.a.w0.getValue())).c(new HandledException("Tenor gif url expired"), true);
        this.a.z0 = huc.u0;
    }

    @Override // defpackage.fq6
    public final void d() {
        hm9.n("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCancelled");
        this.a.z0 = rq9.u0;
    }

    @Override // defpackage.fq6
    public final void e(File file) throws Throwable {
        hm9.n("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCompleted");
        ((eoe) this.a.s0.getValue()).d(this.a.d().a);
        UploadExternalGifWorker.c(this.a);
        cu8 cu8VarQ = ((au8) this.a.o.getValue()).q(this.a.d().d);
        if (cu8VarQ == null || cu8VarQ.v0 == vx8.DELETED) {
            hm9.n("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCompleted: Message was deleted");
            this.a.z0 = o7f.a;
            return;
        }
        File fileL = ((kk5) ((zi5) this.a.c.getValue())).l(this.a.d().f);
        if (!pag.k(fileL)) {
            ((cj0) ((af8) this.a.t0.getValue())).b(file, fileL);
        }
        this.a.z0 = new n7f(new y95(file.getAbsolutePath(), 0, 0, null, null, null));
    }

    @Override // defpackage.fq6
    public final void f() {
        hm9.p("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadInterrupted: Can't download video", null);
        ((eoe) this.a.s0.getValue()).n(this.a.d().a, goe.c);
        this.a.z0 = buc.u0;
    }

    @Override // defpackage.fq6
    public final String getDownloadContext() {
        UploadExternalGifWorker uploadExternalGifWorker = this.a;
        return uploadExternalGifWorker.d().d + "_" + uploadExternalGifWorker.d().c;
    }

    @Override // defpackage.fq6
    public final void j(float f, long j) {
        hm9.n("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadProgress progress = %s " + f);
        long jNanoTime = System.nanoTime();
        if ((f > 0.0f || f < 100.0f) && Math.abs(jNanoTime - this.a.y0) < 500000000) {
            hm9.n("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "Skip progress");
            return;
        }
        UploadExternalGifWorker uploadExternalGifWorker = this.a;
        uploadExternalGifWorker.y0 = jNanoTime;
        cu8 cu8VarQ = ((au8) uploadExternalGifWorker.o.getValue()).q(this.a.d().d);
        if (cu8VarQ != null && cu8VarQ.v0 != vx8.DELETED) {
            this.a.z0 = new p7f(f, cu8VarQ.o);
            return;
        }
        hm9.n("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadProgress: Message was deleted");
        ((gq6) this.a.Y.getValue()).a(((kk5) ((zi5) this.a.c.getValue())).n(this.a.d().f), this.a.d().f);
        ((eoe) this.a.s0.getValue()).d(this.a.d().a);
        UploadExternalGifWorker.c(this.a);
    }
}
