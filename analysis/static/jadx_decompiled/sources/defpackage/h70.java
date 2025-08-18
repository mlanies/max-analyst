package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h70 implements f70 {
    public static final long m = TimeUnit.MILLISECONDS.toNanos(500);
    public static final /* synthetic */ int n = 0;
    public AudioRecord a;
    public final n90 b;
    public final int f;
    public final int g;
    public ey1 h;
    public Executor i;
    public long j;
    public g70 k;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicReference e = new AtomicReference(null);
    public boolean l = false;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h70(defpackage.n90 r10, android.content.Context r11) throws androidx.camera.video.internal.audio.AudioStream$AudioStreamException, java.lang.IllegalArgumentException {
        /*
            r9 = this;
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r9.c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r9.d = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r2 = 0
            r0.<init>(r2)
            r9.e = r0
            r9.l = r1
            int r0 = r10.b
            r3 = 12
            r4 = 16
            r5 = 1
            int r6 = r10.c
            int r7 = r10.d
            if (r0 <= 0) goto L39
            if (r6 > 0) goto L2c
            goto L39
        L2c:
            if (r6 != r5) goto L30
            r8 = r4
            goto L31
        L30:
            r8 = r3
        L31:
            int r0 = android.media.AudioRecord.getMinBufferSize(r0, r8, r7)
            if (r0 <= 0) goto L39
            r0 = r5
            goto L3a
        L39:
            r0 = r1
        L3a:
            int r8 = r10.b
            if (r0 == 0) goto L6f
            r9.b = r10
            int r0 = r10.a()
            r9.g = r0
            if (r6 != r5) goto L49
            r3 = r4
        L49:
            int r0 = android.media.AudioRecord.getMinBufferSize(r8, r3, r7)
            if (r0 <= 0) goto L50
            r1 = r5
        L50:
            defpackage.c54.p(r2, r1)
            int r0 = r0 * 2
            r9.f = r0
            android.media.AudioRecord r10 = c(r0, r10, r11)
            r9.a = r10
            int r9 = r10.getState()
            if (r9 != r5) goto L64
            return
        L64:
            r10.release()
            androidx.camera.video.internal.audio.AudioStream$AudioStreamException r9 = new androidx.camera.video.internal.audio.AudioStream$AudioStreamException
            java.lang.String r10 = "Unable to initialize AudioRecord"
            r9.<init>(r10)
            throw r9
        L6f:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11, r0}
            java.lang.String r11 = "The combination of sample rate %d, channel count %d and audio format %d is not supported."
            java.lang.String r10 = java.lang.String.format(r11, r10)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h70.<init>(n90, android.content.Context):void");
    }

    public static AudioRecord c(int i, n90 n90Var, Context context) throws IllegalArgumentException {
        int i2 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(n90Var.b).setChannelMask(n90Var.c == 1 ? 16 : 12).setEncoding(n90Var.d).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (i2 >= 31 && context != null) {
            sk.c(builder, context);
        }
        builder.setAudioSource(n90Var.a);
        builder.setAudioFormat(audioFormatBuild);
        builder.setBufferSizeInBytes(i);
        return builder.build();
    }

    @Override // defpackage.f70
    public final void a(ey1 ey1Var, q6d q6dVar) {
        c54.p("AudioStream can not be started when setCallback.", !this.d.get());
        b();
        this.h = ey1Var;
        this.i = q6dVar;
        g70 g70Var = this.k;
        if (g70Var != null) {
            this.a.unregisterAudioRecordingCallback(g70Var);
        }
        if (this.k == null) {
            this.k = new g70(this);
        }
        this.a.registerAudioRecordingCallback(q6dVar, this.k);
    }

    public final void b() {
        c54.p("AudioStream has been released.", !this.c.get());
    }

    public final void d(boolean z) {
        Executor executor = this.i;
        ey1 ey1Var = this.h;
        if (executor == null || ey1Var == null || Objects.equals(this.e.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executor.execute(new u60(ey1Var, z, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    @Override // defpackage.f70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.q90 read(java.nio.ByteBuffer r14) {
        /*
            r13 = this;
            r13.b()
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.d
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            defpackage.c54.p(r1, r0)
            android.media.AudioRecord r0 = r13.a
            int r1 = r13.f
            int r0 = r0.read(r14, r1)
            r1 = 0
            if (r0 <= 0) goto L86
            r14.limit(r0)
            boolean r14 = r13.l
            r3 = -1
            if (r14 != 0) goto L71
            android.media.AudioTimestamp r14 = new android.media.AudioTimestamp
            r14.<init>()
            android.media.AudioRecord r5 = r13.a
            r6 = 0
            int r5 = r5.getTimestamp(r14, r6)
            if (r5 != 0) goto L71
            n90 r5 = r13.b
            int r5 = r5.b
            long r7 = r13.j
            long r9 = (long) r5
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r10 = 1
            if (r9 <= 0) goto L3f
            r9 = r10
            goto L40
        L3f:
            r9 = r6
        L40:
            java.lang.String r11 = "sampleRate must be greater than 0."
            defpackage.c54.j(r11, r9)
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 < 0) goto L4a
            r6 = r10
        L4a:
            java.lang.String r9 = "framePosition must be no less than 0."
            defpackage.c54.j(r9, r6)
            long r11 = r14.framePosition
            long r7 = r7 - r11
            long r5 = defpackage.ote.k(r5, r7)
            long r7 = r14.nanoTime
            long r7 = r7 + r5
            int r14 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r14 >= 0) goto L5e
            goto L5f
        L5e:
            r1 = r7
        L5f:
            long r5 = java.lang.System.nanoTime()
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)
            long r7 = defpackage.h70.m
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L72
            r13.l = r10
        L71:
            r1 = r3
        L72:
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 != 0) goto L7a
            long r1 = java.lang.System.nanoTime()
        L7a:
            long r3 = r13.j
            long r5 = (long) r0
            int r14 = r13.g
            long r5 = defpackage.ote.V(r14, r5)
            long r5 = r5 + r3
            r13.j = r5
        L86:
            q90 r13 = new q90
            r13.<init>(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h70.read(java.nio.ByteBuffer):q90");
    }

    @Override // defpackage.f70
    public final void release() {
        if (this.c.getAndSet(true)) {
            return;
        }
        g70 g70Var = this.k;
        if (g70Var != null) {
            this.a.unregisterAudioRecordingCallback(g70Var);
        }
        this.a.release();
    }

    @Override // defpackage.f70
    public final void start() throws IllegalStateException, AudioStream$AudioStreamException {
        b();
        AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (xi4.a.e(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.a;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new AudioStream$AudioStreamException("Unable to initialize AudioRecord");
            }
        }
        this.a.startRecording();
        if (this.a.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new AudioStream$AudioStreamException("Unable to start AudioRecord with state: " + this.a.getRecordingState());
        }
        this.j = 0L;
        this.l = false;
        this.e.set(null);
        AudioRecordingConfiguration activeRecordingConfiguration = this.a.getActiveRecordingConfiguration();
        d(activeRecordingConfiguration != null && activeRecordingConfiguration.isClientSilenced());
    }

    @Override // defpackage.f70
    public final void stop() throws IllegalStateException {
        b();
        if (this.d.getAndSet(false)) {
            this.a.stop();
            if (this.a.getRecordingState() != 1) {
                this.a.getRecordingState();
            }
            if (xi4.a.e(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                this.a.release();
                this.a = c(this.f, this.b, null);
            }
        }
    }
}
