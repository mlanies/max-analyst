package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.au1;
import defpackage.ay5;
import defpackage.b10;
import defpackage.cqc;
import defpackage.dg5;
import defpackage.e52;
import defpackage.fm7;
import defpackage.ft;
import defpackage.g8f;
import defpackage.gd1;
import defpackage.hm9;
import defpackage.hy8;
import defpackage.iy8;
import defpackage.jp4;
import defpackage.k56;
import defpackage.khe;
import defpackage.lp4;
import defpackage.p82;
import defpackage.qa3;
import defpackage.qh5;
import defpackage.qje;
import defpackage.r0a;
import defpackage.r8f;
import defpackage.r9d;
import defpackage.s7g;
import defpackage.s8g;
import defpackage.sd7;
import defpackage.uaa;
import defpackage.up4;
import defpackage.w5e;
import defpackage.ztc;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadDraftMediaWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class UploadDraftMediaWorker extends ForegroundWorker {
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
    public sd7 w0;
    public volatile float x0;
    public volatile fm7 y0;

    public UploadDraftMediaWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new khe(new k56(this) { // from class: f7f
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        ep4 ep4Var = new ep4(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        String str = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        int iW = h4f.w(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE4 != null ? strE4 : "");
                            i20Var.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        return new lp4(ep4Var, str, jD2, iW, refVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 2:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 3:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 4:
                        return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).u();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 7:
                        return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
                    case 8:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 9:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    default:
                        hle hleVarT = ((jyc) this.b.getTamComponent()).t();
                        hleVarT.getClass();
                        return ((jle) hleVarT).a();
                }
            }
        });
        final int i2 = 4;
        this.b = new khe(new k56(this) { // from class: f7f
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i2) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        ep4 ep4Var = new ep4(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        String str = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        int iW = h4f.w(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE4 != null ? strE4 : "");
                            i20Var.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        return new lp4(ep4Var, str, jD2, iW, refVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 2:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 3:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 4:
                        return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).u();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 7:
                        return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
                    case 8:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 9:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    default:
                        hle hleVarT = ((jyc) this.b.getTamComponent()).t();
                        hleVarT.getClass();
                        return ((jle) hleVarT).a();
                }
            }
        });
        final int i3 = 5;
        this.c = new khe(new k56(this) { // from class: f7f
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i3) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        ep4 ep4Var = new ep4(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        String str = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        int iW = h4f.w(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE4 != null ? strE4 : "");
                            i20Var.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        return new lp4(ep4Var, str, jD2, iW, refVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 2:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 3:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 4:
                        return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).u();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 7:
                        return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
                    case 8:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 9:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    default:
                        hle hleVarT = ((jyc) this.b.getTamComponent()).t();
                        hleVarT.getClass();
                        return ((jle) hleVarT).a();
                }
            }
        });
        final int i4 = 6;
        this.o = new khe(new k56(this) { // from class: f7f
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i4) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        ep4 ep4Var = new ep4(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        String str = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        int iW = h4f.w(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE4 != null ? strE4 : "");
                            i20Var.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        return new lp4(ep4Var, str, jD2, iW, refVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 2:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 3:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 4:
                        return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).u();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 7:
                        return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
                    case 8:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 9:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    default:
                        hle hleVarT = ((jyc) this.b.getTamComponent()).t();
                        hleVarT.getClass();
                        return ((jle) hleVarT).a();
                }
            }
        });
        final int i5 = 7;
        this.X = new khe(new k56(this) { // from class: f7f
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i5) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        ep4 ep4Var = new ep4(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        String str = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        int iW = h4f.w(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE4 != null ? strE4 : "");
                            i20Var.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        return new lp4(ep4Var, str, jD2, iW, refVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 2:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 3:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 4:
                        return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).u();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 7:
                        return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
                    case 8:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 9:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    default:
                        hle hleVarT = ((jyc) this.b.getTamComponent()).t();
                        hleVarT.getClass();
                        return ((jle) hleVarT).a();
                }
            }
        });
        final int i6 = 8;
        this.Y = new khe(new k56(this) { // from class: f7f
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i6) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        ep4 ep4Var = new ep4(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        String str = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        int iW = h4f.w(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE4 != null ? strE4 : "");
                            i20Var.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        return new lp4(ep4Var, str, jD2, iW, refVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 2:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 3:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 4:
                        return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).u();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 7:
                        return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
                    case 8:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 9:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    default:
                        hle hleVarT = ((jyc) this.b.getTamComponent()).t();
                        hleVarT.getClass();
                        return ((jle) hleVarT).a();
                }
            }
        });
        final int i7 = 9;
        this.Z = new khe(new k56(this) { // from class: f7f
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i7) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        ep4 ep4Var = new ep4(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        String str = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        int iW = h4f.w(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE4 != null ? strE4 : "");
                            i20Var.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        return new lp4(ep4Var, str, jD2, iW, refVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 2:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 3:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 4:
                        return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).u();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 7:
                        return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
                    case 8:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 9:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    default:
                        hle hleVarT = ((jyc) this.b.getTamComponent()).t();
                        hleVarT.getClass();
                        return ((jle) hleVarT).a();
                }
            }
        });
        final int i8 = 10;
        this.s0 = new khe(new k56(this) { // from class: f7f
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i8) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        ep4 ep4Var = new ep4(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        String str = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        int iW = h4f.w(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE4 != null ? strE4 : "");
                            i20Var.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        return new lp4(ep4Var, str, jD2, iW, refVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 2:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 3:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 4:
                        return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).u();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 7:
                        return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
                    case 8:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 9:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    default:
                        hle hleVarT = ((jyc) this.b.getTamComponent()).t();
                        hleVarT.getClass();
                        return ((jle) hleVarT).a();
                }
            }
        });
        final int i9 = 1;
        this.t0 = new khe(new k56(this) { // from class: f7f
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i9) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        ep4 ep4Var = new ep4(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        String str = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        int iW = h4f.w(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE4 != null ? strE4 : "");
                            i20Var.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        return new lp4(ep4Var, str, jD2, iW, refVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 2:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 3:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 4:
                        return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).u();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 7:
                        return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
                    case 8:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 9:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    default:
                        hle hleVarT = ((jyc) this.b.getTamComponent()).t();
                        hleVarT.getClass();
                        return ((jle) hleVarT).a();
                }
            }
        });
        final int i10 = 2;
        this.u0 = new khe(new k56(this) { // from class: f7f
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i10) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        ep4 ep4Var = new ep4(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        String str = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        int iW = h4f.w(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE4 != null ? strE4 : "");
                            i20Var.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        return new lp4(ep4Var, str, jD2, iW, refVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 2:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 3:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 4:
                        return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).u();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 7:
                        return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
                    case 8:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 9:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    default:
                        hle hleVarT = ((jyc) this.b.getTamComponent()).t();
                        hleVarT.getClass();
                        return ((jle) hleVarT).a();
                }
            }
        });
        final int i11 = 3;
        this.v0 = new khe(new k56(this) { // from class: f7f
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ref refVar;
                switch (i11) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        ep4 ep4Var = new ep4(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        String str = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        int iW = h4f.w(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            i20 i20Var = new i20(1);
                            i20Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            i20Var.a = mqb.valueOf(strE4 != null ? strE4 : "");
                            i20Var.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            i20Var.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            refVar = new ref(i20Var);
                        } else {
                            refVar = null;
                        }
                        return new lp4(ep4Var, str, jD2, iW, refVar);
                    case 1:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 2:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 3:
                        return ((jyc) this.b.getTamComponent()).s();
                    case 4:
                        return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).u();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 7:
                        return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
                    case 8:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 9:
                        return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
                    default:
                        hle hleVarT = ((jyc) this.b.getTamComponent()).t();
                        hleVarT.getClass();
                        return ((jle) hleVarT).a();
                }
            }
        });
        this.x0 = -1.0f;
    }

    public final p82 c() {
        return (p82) this.o.getValue();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object createForegroundInfo(Continuation continuation) {
        String string;
        PendingIntent pendingIntentC = s7g.d(getApplicationContext()).c(getId());
        e52 e52VarC = c().C(d().a.a);
        if (e52VarC == null) {
            i();
        }
        qh5 qh5Var = (qh5) this.t0.getValue();
        long j = d().a.a;
        if (e52VarC == null || (string = e52VarC.q()) == null) {
            string = getApplicationContext().getString(((qh5) this.t0.getValue()).f);
        }
        return new ay5(d().a.hashCode(), qh5Var.b(j, null, null, string, e52VarC == null ? null : getApplicationContext().getString(((qh5) this.t0.getValue()).f), (int) this.x0, true, pendingIntentC), 1);
    }

    public final lp4 d() {
        return (lp4) this.a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008b A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:15:0x0031, B:40:0x0087, B:42:0x008b, B:44:0x00a3, B:52:0x00c1, B:55:0x00d0, B:57:0x00d4, B:22:0x0042, B:30:0x0055, B:39:0x0084, B:33:0x005c, B:36:0x007f), top: B:61:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:15:0x0031, B:40:0x0087, B:42:0x008b, B:44:0x00a3, B:52:0x00c1, B:55:0x00d0, B:57:0x00d4, B:22:0x0042, B:30:0x0055, B:39:0x0084, B:33:0x005c, B:36:0x007f), top: B:61:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00cd -> B:40:0x0087). Please report as a decompilation issue!!! */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadDraftMediaWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(Throwable th) {
        hm9.p("UploadDraftMediaWorker", "onUploadFailed: draftMediaUploadKey = " + d().a, th);
        hm9.p("UploadDraftMediaWorker", "failDraftUpload: key = " + d().a, null);
        e52 e52VarC = c().C(d().a.a);
        if (e52VarC == null) {
            hm9.p("UploadDraftMediaWorker", "failDraftUpload: chat is null", null);
        } else {
            uaa uaaVar = e52VarC.b.f0;
            if (uaaVar == null) {
                hm9.p("UploadDraftMediaWorker", "failDraftUpload: draft is null", null);
            } else {
                ((jp4) this.X.getValue()).c(uaaVar);
                p82 p82VarC = c();
                Long lB = uaaVar.b();
                p82VarC.k(e52VarC.a, lB != null ? lB.longValue() : 0L, uaaVar);
                r9d.y((s8g) this.c.getValue());
            }
        }
        g();
        ((dg5) this.u0.getValue()).b(d().a.a);
        this.y0 = fm7.a();
    }

    public final void g() {
        try {
            new qa3(((up4) this.b.getValue()).a(), 2, new gd1(10, d().a)).a();
            hm9.n("UploadDraftMediaWorker", "removeUploadFromStorage: success for key = " + d().a);
        } catch (Throwable th) {
            hm9.p("UploadDraftMediaWorker", "removeUploadFromStorage: failed for key = " + d().a, th);
        }
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String getName() {
        String strE = getInputData().e("workName");
        return strE == null ? "UploadDraftMediaWorker" : strE;
    }

    public final void h() {
        b10 b10Var;
        hm9.n("UploadDraftMediaWorker", "startUpload: draftUpload = " + d());
        int i = d().d;
        if (i == 0) {
            throw null;
        }
        switch (r8f.$EnumSwitchMapping$0[au1.s(i)]) {
            case 1:
                b10Var = b10.UNKNOWN;
                break;
            case 2:
            case 3:
                b10Var = b10.VIDEO;
                break;
            case 4:
            case 5:
                b10Var = b10.PHOTO;
                break;
            case 6:
                b10Var = b10.FILE;
                break;
            case 7:
                b10Var = b10.AUDIO;
                break;
            case 8:
                b10Var = b10.STICKER;
                break;
            default:
                b10Var = b10.UNKNOWN;
                break;
        }
        if (b10Var == b10.UNKNOWN) {
            e(new IllegalStateException("Internal error. Unknown attach type for upload type"));
            return;
        }
        hy8 hy8Var = new hy8();
        hy8Var.e = d().e;
        hy8Var.b = d().b;
        hy8Var.d = d().d;
        hy8Var.c = d().c;
        hy8Var.f = d().a.b;
        r0a r0aVarN = ((g8f) this.Z.getValue()).a(new iy8(hy8Var)).n((ztc) this.s0.getValue());
        sd7 sd7Var = new sd7(new w5e(this), new qje(2, this), ft.d);
        r0aVarN.a(sd7Var);
        this.w0 = sd7Var;
    }

    public final void i() {
        hm9.n("UploadDraftMediaWorker", "cancel: key =" + d().a);
        cqc.b(this.w0);
        g();
        hm9.n("UploadDraftMediaWorker", "cancel: finished for key = " + d().a.b);
        this.y0 = fm7.a();
    }
}
