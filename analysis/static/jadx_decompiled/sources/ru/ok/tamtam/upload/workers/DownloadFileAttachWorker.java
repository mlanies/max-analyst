package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.ao4;
import defpackage.au8;
import defpackage.ay5;
import defpackage.dfe;
import defpackage.e52;
import defpackage.e5f;
import defpackage.hm9;
import defpackage.hu3;
import defpackage.k56;
import defpackage.khe;
import defpackage.kke;
import defpackage.njc;
import defpackage.nx3;
import defpackage.p82;
import defpackage.pne;
import defpackage.qh5;
import defpackage.s7g;
import defpackage.sn4;
import defpackage.tu0;
import defpackage.tx3;
import defpackage.un4;
import defpackage.w9a;
import defpackage.zi5;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "un4", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class DownloadFileAttachWorker extends ForegroundWorker {
    public final AtomicInteger A0;
    public int B0;
    public long C0;
    public volatile un4 D0;
    public File E0;
    public final ao4 F0;
    public final khe X;
    public final khe Y;
    public final khe Z;
    public final khe a;
    public final khe b;
    public final khe c;
    public final khe o;
    public final khe s0;
    public final khe t0;
    public final khe u0;
    public final khe v0;
    public final khe w0;
    public final khe x0;
    public final khe y0;
    public final khe z0;

    public DownloadFileAttachWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i2 = 12;
        this.b = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i3 = 13;
        this.c = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i4 = 14;
        this.o = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i5 = 1;
        this.X = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i6 = 2;
        this.Y = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i7 = 3;
        this.Z = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i8 = 4;
        this.s0 = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i9 = 5;
        this.t0 = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i10 = 6;
        this.u0 = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i11 = 7;
        this.v0 = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i12 = 8;
        this.w0 = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i13 = 9;
        this.x0 = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i14 = 10;
        this.y0 = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        final int i15 = 11;
        this.z0 = new khe(new k56(this) { // from class: ln4
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        one oneVar = new one();
                        oneVar.a = inputData.d("messageId", 0L);
                        String strE = inputData.e("attachId");
                        if (strE == null) {
                            strE = "";
                        }
                        oneVar.b = strE;
                        oneVar.c = inputData.d("videoId", 0L);
                        oneVar.d = inputData.d("audioId", 0L);
                        oneVar.e = inputData.d("mp4GifId", 0L);
                        oneVar.f = inputData.d("stickerId", 0L);
                        String strE2 = inputData.e("url");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        oneVar.g = strE2;
                        oneVar.h = inputData.b("notifyProgress", false);
                        oneVar.i = inputData.b("checkAutoLoadConnection", false);
                        oneVar.j = inputData.d("fileId", 0L);
                        String strE3 = inputData.e("fileName");
                        oneVar.k = strE3 != null ? strE3 : "";
                        Object obj = inputData.a.get("invalidateCount");
                        oneVar.l = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                        oneVar.m = inputData.b("useOriginalExtension", false);
                        oneVar.n = inputData.b("notCopyVideoToGallery", false);
                        return new pne(oneVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 2:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 3:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 4:
                        return ((jyc) this.b.getTamComponent()).c();
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 7:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 8:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
                    case 13:
                        return ((jyc) this.b.getTamComponent()).j();
                    default:
                        return ((jyc) this.b.getTamComponent()).n();
                }
            }
        });
        this.A0 = new AtomicInteger();
        this.F0 = new ao4(this);
    }

    public final Object c(hu3 hu3Var) {
        File file = this.E0;
        if (file == null) {
            file = null;
        }
        hm9.m("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. CancelLoading: %s", file);
        dfe dfeVar = (dfe) this.Y.getValue();
        File file2 = this.E0;
        Object objB = dfeVar.a.b(file2 != null ? file2 : null, g().b, hu3Var);
        return objB == tx3.a ? objB : e5f.a;
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object createForegroundInfo(Continuation continuation) {
        long j;
        float f;
        long j2;
        Object njcVar;
        PendingIntent pendingIntentC = s7g.d(getApplicationContext()).c(getId());
        un4 un4Var = this.D0;
        File file = null;
        sn4 sn4Var = un4Var instanceof sn4 ? (sn4) un4Var : null;
        if (sn4Var != null) {
            f = sn4Var.a;
            long j3 = sn4Var.b;
            j = sn4Var.c;
            j2 = j3;
        } else {
            j = 0;
            f = -1.0f;
            j2 = 0;
        }
        e52 e52VarC = ((p82) this.X.getValue()).C(j);
        String string = getApplicationContext().getString(((qh5) this.w0.getValue()).e);
        qh5 qh5Var = (qh5) this.w0.getValue();
        Long l = new Long(j2);
        Long l2 = new Long(g().a);
        String strQ = e52VarC != null ? e52VarC.q() : null;
        try {
            File file2 = this.E0;
            if (file2 != null) {
                file = file2;
            }
            njcVar = file.getName();
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = "";
        }
        return new ay5(((Number) this.b.getValue()).intValue(), qh5Var.b(j, l, l2, strQ, string + " " + njcVar, tu0.G(f), false, pendingIntentC), 1);
    }

    public final zi5 d() {
        return (zi5) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:18:0x0043, B:50:0x0117, B:52:0x011d, B:54:0x0134, B:56:0x013a, B:58:0x0140, B:59:0x0146, B:61:0x0151, B:63:0x0159, B:64:0x0163, B:66:0x016b, B:67:0x0175, B:69:0x017d, B:70:0x0188, B:23:0x004d, B:43:0x00e3, B:47:0x00f8, B:26:0x0054, B:32:0x0086, B:34:0x008a, B:36:0x0094, B:38:0x00b7, B:40:0x00dc, B:39:0x00bd, B:29:0x005b), top: B:77:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:18:0x0043, B:50:0x0117, B:52:0x011d, B:54:0x0134, B:56:0x013a, B:58:0x0140, B:59:0x0146, B:61:0x0151, B:63:0x0159, B:64:0x0163, B:66:0x016b, B:67:0x0175, B:69:0x017d, B:70:0x0188, B:23:0x004d, B:43:0x00e3, B:47:0x00f8, B:26:0x0054, B:32:0x0086, B:34:0x008a, B:36:0x0094, B:38:0x00b7, B:40:0x00dc, B:39:0x00bd, B:29:0x005b), top: B:77:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileAttachWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final au8 e() {
        return (au8) this.o.getValue();
    }

    public final pne g() {
        return (pne) this.a.getValue();
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /* renamed from: getCoroutineContext */
    public final nx3 getC() {
        return (nx3) ((w9a) ((kke) this.x0.getValue())).d.getValue();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String getName() {
        String strE = getInputData().e("taskName");
        return strE == null ? "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker" : strE;
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final long getWorkDelay() {
        return 500L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.cu8 r23, final defpackage.d20 r24, final int r25, final long r26, final long r28, final java.io.File r30, kotlin.coroutines.Continuation r31) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileAttachWorker.h(cu8, d20, int, long, long, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object onStopWork(Continuation continuation) {
        hm9.n("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. OnStopWork");
        dfe dfeVar = (dfe) this.Y.getValue();
        File file = this.E0;
        if (file == null) {
            file = null;
        }
        Object objC = dfeVar.a.c(file, g().b, continuation);
        return objC == tx3.a ? objC : e5f.a;
    }
}
