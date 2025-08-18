package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.ay5;
import defpackage.e52;
import defpackage.k56;
import defpackage.khe;
import defpackage.kk5;
import defpackage.kpa;
import defpackage.m7f;
import defpackage.mh5;
import defpackage.p7f;
import defpackage.p82;
import defpackage.q7f;
import defpackage.qh5;
import defpackage.s7f;
import defpackage.s7g;
import defpackage.sna;
import defpackage.zi5;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadExternalGifWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "q7f", "m7f", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class UploadExternalGifWorker extends ForegroundWorker {
    public final s7f A0;
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
    public long y0;
    public volatile q7f z0;

    public UploadExternalGifWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i2 = 7;
        this.b = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i3 = 8;
        this.c = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i4 = 9;
        this.o = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i5 = 10;
        this.X = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i6 = 11;
        this.Y = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i7 = 12;
        this.Z = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i8 = 1;
        this.s0 = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i9 = 2;
        this.t0 = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i10 = 3;
        this.u0 = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i11 = 4;
        this.v0 = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i12 = 5;
        this.w0 = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        final int i13 = 6;
        this.x0 = new khe(new k56(this) { // from class: k7f
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        d24 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("attachLocalId");
                        String str2 = strE2 == null ? "" : strE2;
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        return new m7f(jD, jD2, str, jD3, str2, strE3 == null ? "" : strE3);
                    case 1:
                        return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
                    case 2:
                        return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
                    case 3:
                        return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
                    case 4:
                        return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
                    case 5:
                        return ((jyc) this.b.getTamComponent()).i();
                    case 6:
                        return ((jyc) this.b.getTamComponent()).k();
                    case 7:
                        return Integer.valueOf(this.b.d().hashCode());
                    case 8:
                        return ((jyc) this.b.getTamComponent()).j();
                    case 9:
                        return ((jyc) this.b.getTamComponent()).n();
                    case 10:
                        return ((jyc) this.b.getTamComponent()).f();
                    case 11:
                        return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
                    default:
                        return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
                }
            }
        });
        this.A0 = new s7f(this);
    }

    public static final void c(UploadExternalGifWorker uploadExternalGifWorker) {
        e52 e52VarC = ((p82) uploadExternalGifWorker.X.getValue()).C(uploadExternalGifWorker.d().e);
        if (e52VarC != null) {
            sna snaVar = (sna) uploadExternalGifWorker.Z.getValue();
            long j = e52VarC.b.a;
            long j2 = uploadExternalGifWorker.d().d;
            snaVar.getClass();
            sna.b(j, j2);
        }
        ((mh5) uploadExternalGifWorker.u0.getValue()).b(((kk5) ((zi5) uploadExternalGifWorker.c.getValue())).n(uploadExternalGifWorker.d().f));
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object createForegroundInfo(Continuation continuation) {
        kpa kpaVar;
        String strQ;
        q7f q7fVar = this.z0;
        if (q7fVar instanceof p7f) {
            p7f p7fVar = (p7f) q7fVar;
            kpaVar = new kpa(new Float(p7fVar.a), new Long(p7fVar.b));
        } else {
            kpaVar = new kpa(new Float(-1.0f), new Long(0L));
        }
        float fFloatValue = ((Number) kpaVar.a).floatValue();
        long jLongValue = ((Number) kpaVar.b).longValue();
        PendingIntent pendingIntentC = s7g.d(getApplicationContext()).c(getId());
        e52 e52VarC = ((p82) this.X.getValue()).C(d().e);
        qh5 qh5Var = (qh5) this.x0.getValue();
        long j = d().e;
        Long l = new Long(jLongValue);
        Long l2 = new Long(d().d);
        if (e52VarC == null || (strQ = e52VarC.q()) == null) {
            strQ = "";
        }
        return new ay5(((Number) this.b.getValue()).intValue(), qh5Var.b(j, l, l2, strQ, getApplicationContext().getString(((qh5) this.x0.getValue()).g), (int) fFloatValue, false, pendingIntentC), 1);
    }

    public final m7f d() {
        return (m7f) this.a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0033, B:34:0x00d1, B:36:0x00d7, B:39:0x00ed, B:40:0x00ef, B:42:0x00f3, B:44:0x00f9, B:46:0x0106, B:48:0x010a, B:50:0x010e, B:52:0x0116, B:53:0x0121, B:55:0x0129, B:56:0x0133, B:58:0x0137, B:60:0x015a, B:64:0x016a, B:69:0x0181, B:71:0x0189, B:72:0x0195, B:73:0x019a, B:74:0x019b, B:77:0x01ac, B:79:0x01bd, B:21:0x0049, B:24:0x0054, B:27:0x006a, B:29:0x007e, B:30:0x0096, B:32:0x00b0, B:33:0x00b6), top: B:83:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01a9 -> B:34:0x00d1). Please report as a decompilation issue!!! */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadExternalGifWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String getName() {
        String strE = getInputData().e("taskName");
        return strE == null ? "ru.ok.tamtam.upload.workers.UploadExternalGifWorker" : strE;
    }
}
