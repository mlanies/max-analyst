package ru.ok.tamtam.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.k56;
import defpackage.khe;
import defpackage.v7g;
import java.util.HashSet;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.BacklogWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/workmanager/BacklogWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "xfg", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class BacklogWorker extends SdkCoroutineWorker {
    public static BacklogWorker Y;
    public volatile boolean X;
    public final khe a;
    public final khe b;
    public final Object c;
    public final HashSet o;

    public BacklogWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new khe(new k56(this) { // from class: af0
            public final /* synthetic */ BacklogWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((jyc) this.b.getTamComponent()).s();
                    default:
                        return (v7g) ((jyc) this.b.getTamComponent()).getAccessor().c(v7g.class);
                }
            }
        });
        final int i2 = 1;
        this.b = new khe(new k56(this) { // from class: af0
            public final /* synthetic */ BacklogWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((jyc) this.b.getTamComponent()).s();
                    default:
                        return (v7g) ((jyc) this.b.getTamComponent()).getAccessor().c(v7g.class);
                }
            }
        });
        this.c = new Object();
        this.o = new HashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:22:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r7, int r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.bf0
            if (r0 == 0) goto L13
            r0 = r9
            bf0 r0 = (defpackage.bf0) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            bf0 r0 = new bf0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.Y
            mec r7 = r0.X
            java.util.List r8 = r0.o
            defpackage.od2.a0(r9)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L72
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.od2.a0(r9)
            mec r9 = new mec
            r9.<init>()
            r9.a = r6
            r6 = r7
            r7 = r9
        L44:
            r9 = 10
            if (r8 <= r9) goto L4b
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L4b:
            java.lang.Object r9 = r7.a
            ru.ok.tamtam.workmanager.BacklogWorker r9 = (ru.ok.tamtam.workmanager.BacklogWorker) r9
            khe r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            kke r9 = (defpackage.kke) r9
            w9a r9 = (defpackage.w9a) r9
            nx3 r9 = r9.b()
            cf0 r2 = new cf0
            r4 = 0
            r2.<init>(r7, r6, r4)
            r0.o = r6
            r0.X = r7
            r0.Y = r8
            r0.t0 = r3
            java.lang.Object r9 = defpackage.j47.t0(r9, r2, r0)
            if (r9 != r1) goto L72
            return r1
        L72:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L82
            java.lang.Object r9 = r7.a
            ru.ok.tamtam.workmanager.BacklogWorker r9 = (ru.ok.tamtam.workmanager.BacklogWorker) r9
            int r8 = r8 + r3
            r7.a = r9
            goto L44
        L82:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.c(java.util.List, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0098 -> B:29:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.df0
            if (r0 == 0) goto L13
            r0 = r9
            df0 r0 = (defpackage.df0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            df0 r0 = new df0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mec r8 = r0.o
            defpackage.od2.a0(r9)
            goto L9b
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.od2.a0(r9)
            mec r9 = new mec
            r9.<init>()
            r9.a = r8
            r8 = r9
        L3c:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r2 = r8.a
            ru.ok.tamtam.workmanager.BacklogWorker r2 = (ru.ok.tamtam.workmanager.BacklogWorker) r2
            java.lang.Object r2 = r2.c
            monitor-enter(r2)
            java.lang.String r4 = "BACKLOG_WORKER"
            java.lang.String r5 = "checkStayAliveAndRunIfNeeded %d"
            java.lang.Object r6 = r8.a     // Catch: java.lang.Throwable -> L82
            ru.ok.tamtam.workmanager.BacklogWorker r6 = (ru.ok.tamtam.workmanager.BacklogWorker) r6     // Catch: java.lang.Throwable -> L82
            java.util.HashSet r6 = r6.o     // Catch: java.lang.Throwable -> L82
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L82
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L82
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L82
            java.lang.Object[] r6 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L82
            defpackage.hm9.m(r4, r5, r6)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r4 = r8.a     // Catch: java.lang.Throwable -> L82
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch: java.lang.Throwable -> L82
            java.util.HashSet r4 = r4.o     // Catch: java.lang.Throwable -> L82
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L82
            r4 = r4 ^ r3
            if (r4 == 0) goto L84
            java.lang.Object r4 = r8.a     // Catch: java.lang.Throwable -> L82
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch: java.lang.Throwable -> L82
            java.util.HashSet r4 = r4.o     // Catch: java.lang.Throwable -> L82
            r9.addAll(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r4 = r8.a     // Catch: java.lang.Throwable -> L82
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch: java.lang.Throwable -> L82
            java.util.HashSet r4 = r4.o     // Catch: java.lang.Throwable -> L82
            r4.clear()     // Catch: java.lang.Throwable -> L82
            goto L84
        L82:
            r8 = move-exception
            goto La5
        L84:
            monitor-exit(r2)
            boolean r2 = r9.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto La2
            java.lang.Object r2 = r8.a
            ru.ok.tamtam.workmanager.BacklogWorker r2 = (ru.ok.tamtam.workmanager.BacklogWorker) r2
            r0.o = r8
            r0.Z = r3
            java.lang.Object r9 = r2.g(r9, r0)
            if (r9 != r1) goto L9b
            return r1
        L9b:
            java.lang.Object r9 = r8.a
            ru.ok.tamtam.workmanager.BacklogWorker r9 = (ru.ok.tamtam.workmanager.BacklogWorker) r9
            r8.a = r9
            goto L3c
        La2:
            e5f r8 = defpackage.e5f.a
            return r8
        La5:
            monitor-exit(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ef0
            if (r0 == 0) goto L13
            r0 = r7
            ef0 r0 = (defpackage.ef0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ef0 r0 = new ef0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.od2.a0(r7)
            goto L56
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            ru.ok.tamtam.workmanager.BacklogWorker r6 = r0.o
            defpackage.od2.a0(r7)
            goto L4b
        L39:
            defpackage.od2.a0(r7)
            ru.ok.tamtam.workmanager.BacklogWorker.Y = r6
            r0.o = r6
            r0.Z = r5
            nz4 r7 = defpackage.nz4.a
            java.lang.Object r7 = r6.g(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r0.o = r3
            r0.Z = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            ru.ok.tamtam.workmanager.BacklogWorker.Y = r3
            em7 r6 = defpackage.fm7.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final v7g e() {
        return (v7g) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #1 {all -> 0x014b, blocks: (B:31:0x007b, B:33:0x0081), top: B:76:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:15:0x0039, B:37:0x00ae, B:39:0x00ca, B:41:0x00d0, B:44:0x00df, B:47:0x00e9, B:52:0x00fa, B:56:0x0108, B:61:0x0115, B:64:0x0133, B:22:0x0053, B:25:0x005e, B:28:0x0069), top: B:74:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:15:0x0039, B:37:0x00ae, B:39:0x00ca, B:41:0x00d0, B:44:0x00df, B:47:0x00e9, B:52:0x00fa, B:56:0x0108, B:61:0x0115, B:64:0x0133, B:22:0x0053, B:25:0x005e, B:28:0x0069), top: B:74:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0144 -> B:16:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.g(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.Continuation r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.h(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
