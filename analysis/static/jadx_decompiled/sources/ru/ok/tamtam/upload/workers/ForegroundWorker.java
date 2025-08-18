package ru.ok.tamtam.upload.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.bn9;
import defpackage.es3;
import defpackage.ey5;
import defpackage.z7;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000  2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00158\u0014X\u0094D¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lay5;", "getForegroundInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newProgress", "", "needToShowNotification", "(F)Z", "Lfm7;", "doWork", "Lbn9;", "needUpdateWorkerProgressNotifUseCase", "Lbn9;", "", "startTime", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isGetForegroundInfoCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oldProgress", "F", "workDelay", "getWorkDelay", "()J", "Companion", "ey5", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class ForegroundWorker extends SdkCoroutineWorker {
    public static final ey5 Companion = new ey5();
    private static final long WORK_DELAY = 1000;
    private AtomicBoolean isGetForegroundInfoCalled;
    private final bn9 needUpdateWorkerProgressNotifUseCase;
    private float oldProgress;
    private long startTime;
    private final long workDelay;

    public ForegroundWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.needUpdateWorkerProgressNotifUseCase = new bn9(z7.g(new es3(19, this)));
        this.isGetForegroundInfoCalled = new AtomicBoolean(false);
        this.workDelay = WORK_DELAY;
    }

    public abstract Object createForegroundInfo(Continuation continuation);

    public abstract Object doForegroundWork(Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super defpackage.fm7> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fy5
            if (r0 == 0) goto L13
            r0 = r7
            fy5 r0 = (defpackage.fy5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            fy5 r0 = new fy5
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ru.ok.tamtam.upload.workers.ForegroundWorker r6 = r0.o
            defpackage.od2.a0(r7)
            goto L56
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.od2.a0(r7)
            long r4 = java.lang.System.currentTimeMillis()
            r6.startTime = r4
            fke r7 = r6.getTamComponent()
            jyc r7 = (defpackage.jyc) r7
            ri4 r7 = r7.h()
            java.lang.String r2 = r6.getName()
            r7.f(r2)
            r0.o = r6
            r0.Z = r3
            java.lang.Object r7 = r6.doForegroundWork(r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            fm7 r7 = (defpackage.fm7) r7
            fke r0 = r6.getTamComponent()
            jyc r0 = (defpackage.jyc) r0
            ri4 r0 = r0.h()
            java.lang.String r6 = r6.getName()
            r0.g(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getForegroundInfo(kotlin.coroutines.Continuation<? super defpackage.ay5> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gy5
            if (r0 == 0) goto L13
            r0 = r5
            gy5 r0 = (defpackage.gy5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            gy5 r0 = new gy5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ru.ok.tamtam.upload.workers.ForegroundWorker r4 = r0.o
            defpackage.od2.a0(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.od2.a0(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.isGetForegroundInfoCalled
            r5.set(r3)
            r0.o = r4
            r0.Z = r3
            java.lang.Object r5 = r4.createForegroundInfo(r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            ay5 r5 = (defpackage.ay5) r5
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "foreground info = %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            defpackage.hm9.m(r4, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.getForegroundInfo(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract String getName();

    public long getWorkDelay() {
        return this.workDelay;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean needToShowNotification(float r11) {
        /*
            r10 = this;
            boolean r0 = java.lang.Float.isNaN(r11)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.isGetForegroundInfoCalled
            boolean r0 = r0.get()
            java.lang.String r2 = r10.getName()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "needToShowNotification: 1 %b"
            defpackage.hm9.m(r2, r4, r3)
            if (r0 == 0) goto L37
            int r2 = defpackage.tu0.G(r11)
            float r3 = r10.oldProgress
            int r3 = defpackage.tu0.G(r3)
            if (r2 != r3) goto L37
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "needToShowNotification: 2 – needToShow && newProgress.roundToInt() == oldProgress.roundToInt()"
            defpackage.hm9.n(r10, r11)
            return r1
        L37:
            r2 = 1
            if (r0 != 0) goto La2
            bn9 r0 = r10.needUpdateWorkerProgressNotifUseCase
            float r3 = r10.oldProgress
            long r4 = r10.startTime
            r0.getClass()
            r6 = 0
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto La3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto La3
            int r6 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r6 != 0) goto L51
            goto La3
        L51:
            int r6 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r6 <= 0) goto La3
            int r6 = defpackage.tu0.G(r11)
            if (r2 > r6) goto La3
            r7 = 101(0x65, float:1.42E-43)
            if (r6 >= r7) goto La3
            float r3 = r11 - r3
            bc7[] r6 = defpackage.bn9.b
            r7 = r6[r1]
            rm4 r0 = r0.a
            java.lang.Object r7 = r0.get()
            y7d r7 = (defpackage.y7d) r7
            qyc r7 = (defpackage.qyc) r7
            r7.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.f100progressdifffornotify
            java.lang.String r8 = r8.name()
            ne7 r7 = r7.g
            r9 = 1101004800(0x41a00000, float:20.0)
            float r7 = r7.getFloat(r8, r9)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto La2
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r4
            r3 = r6[r1]
            java.lang.Object r0 = r0.get()
            y7d r0 = (defpackage.y7d) r0
            qyc r0 = (defpackage.qyc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f142workerprogresstimedifffornotifyms
            r4 = 10000(0x2710, double:4.9407E-320)
            long r3 = r0.q(r3, r4)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto La3
        La2:
            r1 = r2
        La3:
            java.lang.String r0 = r10.getName()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            float r3 = r10.oldProgress
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Float r4 = java.lang.Float.valueOf(r11)
            long r5 = r10.startTime
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5}
            java.lang.String r3 = "needToShowNotification: 3 %b, oldProgress = %f, newProgress = %f, startTime = %d"
            defpackage.hm9.m(r0, r3, r2)
            r10.oldProgress = r11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.needToShowNotification(float):boolean");
    }
}
