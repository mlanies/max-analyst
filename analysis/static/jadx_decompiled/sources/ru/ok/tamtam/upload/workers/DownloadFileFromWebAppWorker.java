package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.av0;
import defpackage.ay5;
import defpackage.bea;
import defpackage.dfe;
import defpackage.do4;
import defpackage.ds3;
import defpackage.e5f;
import defpackage.hm9;
import defpackage.ho4;
import defpackage.io4;
import defpackage.k56;
import defpackage.khe;
import defpackage.kke;
import defpackage.mo4;
import defpackage.njc;
import defpackage.nx3;
import defpackage.oag;
import defpackage.osf;
import defpackage.qh5;
import defpackage.s7g;
import defpackage.tu0;
import defpackage.tx3;
import defpackage.uj3;
import defpackage.vw7;
import defpackage.w9a;
import defpackage.xg5;
import defpackage.yne;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileFromWebAppWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "io4", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class DownloadFileFromWebAppWorker extends ForegroundWorker {
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
    public final AtomicInteger v0;
    public long w0;
    public volatile io4 x0;
    public File y0;
    public final mo4 z0;

    public DownloadFileFromWebAppWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new khe(new k56(this) { // from class: co4
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new yne(strE2 == null ? "" : strE2, str, jD, jD2);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
                    case 2:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 3:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 4:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 5:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 8:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    default:
                        return (ds3) ((jyc) this.b.getTamComponent()).getAccessor().c(ds3.class);
                }
            }
        });
        final int i2 = 1;
        this.b = new khe(new k56(this) { // from class: co4
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new yne(strE2 == null ? "" : strE2, str, jD, jD2);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
                    case 2:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 3:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 4:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 5:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 8:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    default:
                        return (ds3) ((jyc) this.b.getTamComponent()).getAccessor().c(ds3.class);
                }
            }
        });
        final int i3 = 2;
        this.c = new khe(new k56(this) { // from class: co4
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new yne(strE2 == null ? "" : strE2, str, jD, jD2);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
                    case 2:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 3:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 4:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 5:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 8:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    default:
                        return (ds3) ((jyc) this.b.getTamComponent()).getAccessor().c(ds3.class);
                }
            }
        });
        final int i4 = 3;
        this.o = new khe(new k56(this) { // from class: co4
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new yne(strE2 == null ? "" : strE2, str, jD, jD2);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
                    case 2:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 3:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 4:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 5:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 8:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    default:
                        return (ds3) ((jyc) this.b.getTamComponent()).getAccessor().c(ds3.class);
                }
            }
        });
        final int i5 = 4;
        this.X = new khe(new k56(this) { // from class: co4
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new yne(strE2 == null ? "" : strE2, str, jD, jD2);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
                    case 2:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 3:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 4:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 5:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 8:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    default:
                        return (ds3) ((jyc) this.b.getTamComponent()).getAccessor().c(ds3.class);
                }
            }
        });
        final int i6 = 5;
        this.Y = new khe(new k56(this) { // from class: co4
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new yne(strE2 == null ? "" : strE2, str, jD, jD2);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
                    case 2:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 3:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 4:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 5:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 8:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    default:
                        return (ds3) ((jyc) this.b.getTamComponent()).getAccessor().c(ds3.class);
                }
            }
        });
        final int i7 = 6;
        this.Z = new khe(new k56(this) { // from class: co4
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new yne(strE2 == null ? "" : strE2, str, jD, jD2);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
                    case 2:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 3:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 4:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 5:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 8:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    default:
                        return (ds3) ((jyc) this.b.getTamComponent()).getAccessor().c(ds3.class);
                }
            }
        });
        final int i8 = 7;
        this.s0 = new khe(new k56(this) { // from class: co4
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new yne(strE2 == null ? "" : strE2, str, jD, jD2);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
                    case 2:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 3:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 4:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 5:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 8:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    default:
                        return (ds3) ((jyc) this.b.getTamComponent()).getAccessor().c(ds3.class);
                }
            }
        });
        final int i9 = 8;
        this.t0 = new khe(new k56(this) { // from class: co4
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new yne(strE2 == null ? "" : strE2, str, jD, jD2);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
                    case 2:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 3:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 4:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 5:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 8:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    default:
                        return (ds3) ((jyc) this.b.getTamComponent()).getAccessor().c(ds3.class);
                }
            }
        });
        final int i10 = 9;
        this.u0 = new khe(new k56(this) { // from class: co4
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new yne(strE2 == null ? "" : strE2, str, jD, jD2);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
                    case 2:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 3:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 4:
                        return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
                    case 5:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 8:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    default:
                        return (ds3) ((jyc) this.b.getTamComponent()).getAccessor().c(ds3.class);
                }
            }
        });
        this.v0 = new AtomicInteger();
        this.z0 = new mo4(this);
    }

    public final yne c() {
        return (yne) this.a.getValue();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object createForegroundInfo(Continuation continuation) {
        long j;
        float f;
        long j2;
        Object njcVar;
        PendingIntent pendingIntentC = s7g.d(getApplicationContext()).c(getId());
        io4 io4Var = this.x0;
        ho4 ho4Var = io4Var instanceof ho4 ? (ho4) io4Var : null;
        if (ho4Var != null) {
            f = ho4Var.a;
            j = ho4Var.b;
            j2 = ho4Var.c;
        } else {
            j = 0;
            f = -1.0f;
            j2 = 0;
        }
        String string = getApplicationContext().getString(((qh5) this.Z.getValue()).e);
        uj3 uj3Var = (uj3) ((ds3) this.u0.getValue()).c(j2).a.getValue();
        String strD = uj3Var != null ? uj3Var.d() : null;
        qh5 qh5Var = (qh5) this.Z.getValue();
        try {
            File file = this.y0;
            if (file == null) {
                file = null;
            }
            njcVar = file.getName();
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = "";
        }
        String str = string + " " + njcVar;
        int iG = tu0.G(f);
        qh5Var.getClass();
        int iHashCode = Long.hashCode(j2);
        bea beaVar = qh5Var.b;
        beaVar.getClass();
        vw7 vw7Var = vw7.c;
        osf osfVar = osf.Z;
        vw7Var.getClass();
        return new ay5(((Number) this.b.getValue()).intValue(), qh5Var.a(strD, str, Long.valueOf(j), false, iG, oag.p(qh5Var.a, iHashCode, beaVar.k(vw7.c2(j2, osfVar, null))), pendingIntentC), 1);
    }

    public final av0 d() {
        return (av0) this.o.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|2|(2:4|(1:6)(1:7))(0)|8|(1:92)|(1:(1:(1:(1:(3:14|89|90)(2:15|16))(5:17|18|19|48|(2:50|51)(4:54|(2:56|(2:58|93)(1:59))(2:61|(1:63)(2:64|(1:66)(4:67|(2:71|(2:73|95)(2:74|75))|76|96)))|60|94)))(11:22|23|39|(1:41)(1:42)|43|44|91|45|(1:47)|48|(0)(0)))(2:25|26))(3:28|29|(1:31))|32|(1:34)(1:35)|36|(1:38)|39|(0)(0)|43|44|91|45|(0)|48|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0188, code lost:
    
        defpackage.hm9.l0(r14, "File download. Cancelled!", r0);
        r2.o = null;
        r2.getClass();
        r2.Z = 4;
        r8 = r1.y0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0198, code lost:
    
        if (r8 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019a, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019b, code lost:
    
        defpackage.hm9.m(r14, "File download. CancelLoading: %s", r8);
        r0 = r1.d();
        r5 = r1.c().a;
        r7 = r1.c().c;
        r0.c(new defpackage.xg5(r5));
        r1.x0 = r11;
        r0 = (defpackage.dfe) r1.X.getValue();
        r8 = r1.y0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c8, code lost:
    
        if (r8 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ca, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01cb, code lost:
    
        r0 = r0.a.b(r8, null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d1, code lost:
    
        if (r0 == r10) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d3, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d4, code lost:
    
        if (r12 == r10) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d6, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:48:0x0108, B:50:0x010e, B:54:0x0127, B:56:0x012d, B:58:0x0133, B:59:0x013a, B:61:0x0146, B:63:0x014e, B:64:0x0159, B:66:0x015f, B:67:0x0169, B:71:0x0174, B:73:0x0178, B:74:0x017d, B:75:0x0182, B:76:0x0183, B:45:0x0101), top: B:91:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127 A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:48:0x0108, B:50:0x010e, B:54:0x0127, B:56:0x012d, B:58:0x0133, B:59:0x013a, B:61:0x0146, B:63:0x014e, B:64:0x0159, B:66:0x015f, B:67:0x0169, B:71:0x0174, B:73:0x0178, B:74:0x017d, B:75:0x0182, B:76:0x0183, B:45:0x0101), top: B:91:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /* renamed from: getCoroutineContext */
    public final nx3 getC() {
        return (nx3) ((w9a) ((kke) this.s0.getValue())).d.getValue();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String getName() {
        String strE = getInputData().e("taskName");
        return strE == null ? "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker" : strE;
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final long getWorkDelay() {
        return 500L;
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object onStopWork(Continuation continuation) {
        hm9.n("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "File download. OnStopWork");
        av0 av0VarD = d();
        long j = c().a;
        String str = c().c;
        av0VarD.c(new xg5(j));
        this.x0 = do4.a;
        dfe dfeVar = (dfe) this.X.getValue();
        File file = this.y0;
        if (file == null) {
            file = null;
        }
        Object objC = dfeVar.a.c(file, null, continuation);
        return objC == tx3.a ? objC : e5f.a;
    }
}
