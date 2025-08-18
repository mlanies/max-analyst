package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a7f;
import defpackage.au8;
import defpackage.av0;
import defpackage.ay5;
import defpackage.b10;
import defpackage.cd8;
import defpackage.cu8;
import defpackage.d00;
import defpackage.dg5;
import defpackage.dm4;
import defpackage.e52;
import defpackage.fk5;
import defpackage.fm7;
import defpackage.ft;
import defpackage.g7f;
import defpackage.g8f;
import defpackage.hm9;
import defpackage.iu8;
import defpackage.iy8;
import defpackage.k56;
import defpackage.k8g;
import defpackage.khe;
import defpackage.l20;
import defpackage.l6f;
import defpackage.ly8;
import defpackage.muc;
import defpackage.n2f;
import defpackage.njc;
import defpackage.nw8;
import defpackage.p5c;
import defpackage.p82;
import defpackage.py8;
import defpackage.q5c;
import defpackage.q8f;
import defpackage.qa3;
import defpackage.qh5;
import defpackage.r0a;
import defpackage.r9d;
import defpackage.rh4;
import defpackage.s7g;
import defpackage.s8g;
import defpackage.sd7;
import defpackage.sna;
import defpackage.tfg;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.v6f;
import defpackage.vx8;
import defpackage.xje;
import defpackage.y7f;
import defpackage.yt8;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class UploadFileAttachWorker extends ForegroundWorker {
    public sd7 A0;
    public volatile float B0;
    public volatile fm7 C0;
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

    public UploadFileAttachWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i2 = 11;
        this.b = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i2) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i3 = 12;
        this.c = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i3) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i4 = 13;
        this.o = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i4) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i5 = 14;
        this.X = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i5) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i6 = 1;
        this.Y = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i6) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i7 = 2;
        this.Z = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i7) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i8 = 3;
        this.s0 = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i8) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i9 = 4;
        this.t0 = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i9) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i10 = 5;
        this.u0 = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i10) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i11 = 6;
        this.v0 = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i11) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i12 = 7;
        this.w0 = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i12) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i13 = 8;
        this.x0 = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i13) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i14 = 9;
        this.y0 = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i14) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        final int i15 = 10;
        this.z0 = new khe(new k56(this) { // from class: t7f
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i15) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        hy8 hy8Var = new hy8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        hy8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        hy8Var.f = strE2;
                        hy8Var.c = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        hy8Var.a = new nw8(jD, strE3 == null ? "" : strE3, jD2);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        hy8Var.d = h4f.w(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE5 != null ? strE5 : "");
                            i20Var.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        hy8Var.e = refVar;
                        return new iy8(hy8Var);
                    case 1:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 2:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 3:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                    case 4:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    case 5:
                        return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return ((jyc) this.b.getTamComponent()).q();
                    case 8:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 9:
                        return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
                    case 10:
                        return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
                    case 11:
                        return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((jyc) this.b.getTamComponent()).e();
                    case 13:
                        return ((jyc) this.b.getTamComponent()).n();
                    default:
                        return ((jyc) this.b.getTamComponent()).u();
                }
            }
        });
        this.B0 = -1.0f;
    }

    public final iy8 c() {
        return (iy8) this.a.getValue();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object createForegroundInfo(Continuation continuation) {
        Object njcVar;
        String string;
        PendingIntent pendingIntentC = s7g.d(getApplicationContext()).c(getId());
        e52 e52VarC = ((p82) this.Z.getValue()).C(c().a.b);
        if (e52VarC == null) {
            hm9.p("UploadFileAttachWorker", "chat is null in getForegroundInfo!", null);
            h();
            this.C0 = fm7.a();
        }
        try {
            njcVar = new File(c().b).getName();
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = "";
        }
        String strJ = rh4.j(getApplicationContext().getString(((qh5) this.v0.getValue()).h), " ", (String) njcVar);
        qh5 qh5Var = (qh5) this.v0.getValue();
        long j = c().a.b;
        if (e52VarC == null || (string = e52VarC.q()) == null) {
            string = getApplicationContext().getString(((qh5) this.v0.getValue()).h);
        }
        return new ay5(c().a.hashCode(), qh5Var.b(j, null, null, string, e52VarC == null ? null : strJ, tu0.G(this.B0), true, pendingIntentC), 1);
    }

    public final au8 d() {
        return (au8) this.o.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(Throwable th) {
        hm9.q("UploadFileAttachWorker", "onUploadFailed: %s", c().a, th);
        if (th instanceof HttpErrorException) {
            av0 av0Var = (av0) this.c.getValue();
            long j = c().a.b;
            av0Var.c(new fk5(((HttpErrorException) th).a));
        } else if (th instanceof TamErrorException) {
            ((av0) this.c.getValue()).c(new cd8(((TamErrorException) th).a));
        }
        this.B0 = -1.0f;
        cu8 cu8VarQ = d().q(c().a.a);
        if (cu8VarQ == null || cu8VarQ.v0 == vx8.DELETED) {
            hm9.p("UploadFileAttachWorker", "failMessageUpload: message is deleted", null);
        } else {
            d().x(cu8VarQ, iu8.s0);
            d().v(c().a.a, c().a.c, new n2f(8));
            ((av0) this.c.getValue()).c(new l6f(c().a.b, c().a.a, 0));
        }
        r9d.y((s8g) this.X.getValue());
        h();
        ((dg5) this.Y.getValue()).a(c().a.a);
        this.C0 = fm7.a();
    }

    public final void g(ly8 ly8Var) {
        k8g k8gVar;
        hm9.m("UploadFileAttachWorker", "onUploadUpdate %s", ly8Var);
        v6f v6fVar = ly8Var.a;
        q8f q8fVar = v6fVar.g;
        if (v6fVar.a()) {
            hm9.m("UploadFileAttachWorker", "onUploadSuccess: key=%s, messageUploadState=%s", c().a, ly8Var);
            long j = c().a.a;
            String str = c().a.c;
            long j2 = c().a.b;
            d().v(j, str, new g7f(ly8Var, 2));
            ((d00) this.y0.getValue()).a(new p5c(j, ly8Var.a.f));
            h();
            ((av0) this.c.getValue()).c(new l6f(j2, j, 0));
            r9d.y((s8g) this.X.getValue());
            this.C0 = fm7.b();
            return;
        }
        if (q8fVar != q8f.UPLOADING) {
            Throwable th = new Throwable("Internal error. Unknown upload state");
            hm9.r("UploadFileAttachWorker", th, "onUploadUpdate: failed. Unknown upload state. key=%s, state=%s", c().a, ly8Var);
            e(th);
            return;
        }
        hm9.m("UploadFileAttachWorker", "onUploadProgress %s, %s", c(), ly8Var);
        long j3 = c().a.a;
        String str2 = c().a.c;
        long j4 = c().a.b;
        cu8 cu8VarQ = d().q(c().a.a);
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 != vx8.DELETED && (k8gVar = cu8VarQ.z0) != null && k8gVar.i() > 0) {
                Iterator it = ((List) k8gVar.a).iterator();
                while (it.hasNext()) {
                    if (tpa.f(((l20) it.next()).r, c().a.c)) {
                        v6f v6fVar2 = ly8Var.a;
                        i(tfg.a(v6fVar2.a.c));
                        this.B0 = v6fVar2.e;
                        d().v(j3, str2, new a7f(v6fVar2, 2));
                        ((d00) this.y0.getValue()).a(new q5c(v6fVar2.e, j3, v6fVar2.f));
                        ((av0) this.c.getValue()).c(new l6f(j4, j3, 0));
                        return;
                    }
                }
            }
        }
        hm9.k0("UploadFileAttachWorker", null, "cancelUploadIfMessageIsDeleted: message or attach is deleted %s", Arrays.copyOf(new Object[]{c()}, 1));
        h();
        this.C0 = fm7.a();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String getName() {
        String strE = getInputData().e("workName");
        return strE == null ? "UploadFileAttachWorker" : strE;
    }

    public final void h() {
        hm9.m("UploadFileAttachWorker", "removeUpload %s", c());
        hm9.m("UploadFileAttachWorker", "stopTyping %s", c());
        e52 e52VarC = ((p82) this.Z.getValue()).C(c().a.b);
        if (e52VarC != null) {
            sna snaVar = (sna) this.s0.getValue();
            long j = e52VarC.b.a;
            long j2 = c().a.a;
            snaVar.getClass();
            sna.b(j, j2);
        }
        sd7 sd7Var = this.A0;
        if (sd7Var != null) {
            dm4.a(sd7Var);
        }
        try {
            py8 py8Var = (py8) this.b.getValue();
            nw8 nw8Var = c().a;
            new qa3(py8Var.b(), 2, new yt8(3, nw8Var)).a();
            hm9.m("UploadFileAttachWorker", "removeUploadFromStorage: success %s", c());
        } catch (Throwable th) {
            hm9.p("UploadFileAttachWorker", "removeUploadFromStorage failure", th);
        }
    }

    public final void i(b10 b10Var) {
        hm9.m("UploadFileAttachWorker", "sendTyping %s", c());
        e52 e52VarC = ((p82) this.Z.getValue()).C(c().a.b);
        if (e52VarC == null) {
            return;
        }
        ((sna) this.s0.getValue()).f(e52VarC.b.a, b10Var, c().a.a);
    }

    public final void j() {
        hm9.n("UploadFileAttachWorker", "startUpload");
        b10 b10VarA = tfg.a(c().d);
        if (b10VarA == b10.UNKNOWN) {
            e(new Throwable("Internal error. Unknown attach type for upload type"));
            return;
        }
        i(b10VarA);
        r0a r0aVarN = ((g8f) this.t0.getValue()).a(c()).n(muc.d);
        sd7 sd7Var = new sd7(new xje(2, this), new y7f(0, this), ft.d);
        r0aVarN.a(sd7Var);
        this.A0 = sd7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(kotlin.coroutines.Continuation r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00be A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:16:0x0040, B:44:0x00ba, B:46:0x00be, B:50:0x00df, B:53:0x00ff, B:54:0x0105, B:56:0x0123, B:60:0x013b, B:66:0x0156, B:71:0x0173, B:77:0x01a3, B:79:0x01a7, B:74:0x017d, B:76:0x0183, B:23:0x005b, B:31:0x007c, B:34:0x0083, B:43:0x00b2, B:37:0x008a, B:40:0x00ad), top: B:88:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123 A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:16:0x0040, B:44:0x00ba, B:46:0x00be, B:50:0x00df, B:53:0x00ff, B:54:0x0105, B:56:0x0123, B:60:0x013b, B:66:0x0156, B:71:0x0173, B:77:0x01a3, B:79:0x01a7, B:74:0x017d, B:76:0x0183, B:23:0x005b, B:31:0x007c, B:34:0x0083, B:43:0x00b2, B:37:0x008a, B:40:0x00ad), top: B:88:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173 A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:16:0x0040, B:44:0x00ba, B:46:0x00be, B:50:0x00df, B:53:0x00ff, B:54:0x0105, B:56:0x0123, B:60:0x013b, B:66:0x0156, B:71:0x0173, B:77:0x01a3, B:79:0x01a7, B:74:0x017d, B:76:0x0183, B:23:0x005b, B:31:0x007c, B:34:0x0083, B:43:0x00b2, B:37:0x008a, B:40:0x00ad), top: B:88:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x016a -> B:70:0x016c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.l(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
