package ru.ok.tamtam.location.live;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.ay5;
import defpackage.gn7;
import defpackage.k56;
import defpackage.khe;
import defpackage.s7g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.location.live.LiveLocationWorker;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/location/live/LiveLocationWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class LiveLocationWorker extends SdkCoroutineWorker {
    public final khe a;
    public final khe b;
    public final khe c;

    public LiveLocationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new khe(new k56(this) { // from class: hn7
            public final /* synthetic */ LiveLocationWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Long.valueOf(this.b.getInputData().d(ApiProtocol.PARAM_CHAT_ID, -1L));
                    case 1:
                        return (gn7) ((jyc) this.b.getTamComponent()).getAccessor().c(gn7.class);
                    default:
                        return (cn7) ((jyc) this.b.getTamComponent()).getAccessor().c(cn7.class);
                }
            }
        });
        final int i2 = 1;
        this.b = new khe(new k56(this) { // from class: hn7
            public final /* synthetic */ LiveLocationWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Long.valueOf(this.b.getInputData().d(ApiProtocol.PARAM_CHAT_ID, -1L));
                    case 1:
                        return (gn7) ((jyc) this.b.getTamComponent()).getAccessor().c(gn7.class);
                    default:
                        return (cn7) ((jyc) this.b.getTamComponent()).getAccessor().c(cn7.class);
                }
            }
        });
        final int i3 = 2;
        this.c = new khe(new k56(this) { // from class: hn7
            public final /* synthetic */ LiveLocationWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return Long.valueOf(this.b.getInputData().d(ApiProtocol.PARAM_CHAT_ID, -1L));
                    case 1:
                        return (gn7) ((jyc) this.b.getTamComponent()).getAccessor().c(gn7.class);
                    default:
                        return (cn7) ((jyc) this.b.getTamComponent()).getAccessor().c(cn7.class);
                }
            }
        });
    }

    public final long c() {
        return ((Number) this.a.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:10:0x0025, B:29:0x0063], limit reached: 77 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00f7 -> B:72:0x00f8). Please report as a decompilation issue!!! */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.location.live.LiveLocationWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object getForegroundInfo(Continuation continuation) {
        return new ay5(Long.hashCode(c()) ^ (-861719020), ((gn7) this.b.getValue()).a(c(), s7g.d(getApplicationContext()).c(getId())), 8);
    }
}
