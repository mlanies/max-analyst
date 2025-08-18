package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class o60 implements ybc, MediaRecorder.OnInfoListener {
    public MediaRecorder X;
    public ubc Y;
    public volatile String Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;

    public o60(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        khe kheVarD = f9g.a.getAccessor().d(y7d.class);
        this.a = je7Var;
        this.b = kheVarD;
        this.c = je7Var2;
        this.o = je7Var3;
    }

    @Override // defpackage.ybc
    public final int a() {
        MediaRecorder mediaRecorder = this.X;
        if (mediaRecorder == null) {
            return 0;
        }
        try {
            return mediaRecorder.getMaxAmplitude();
        } catch (RuntimeException e) {
            hm9.p(o60.class.getName(), "Can't getRecorderAmplitude illegal state", e);
            return 0;
        }
    }

    @Override // defpackage.ybc
    public final boolean b() {
        return this.X != null;
    }

    public final boolean c(int i, int i2, Integer num, String str) throws IllegalStateException, IOException, IllegalArgumentException {
        try {
            MediaRecorder mediaRecorderJ = Build.VERSION.SDK_INT >= 31 ? m30.j((Context) this.a.getValue()) : new MediaRecorder();
            this.X = mediaRecorderJ;
            mediaRecorderJ.setAudioSource(1);
            mediaRecorderJ.setOutputFormat(6);
            mediaRecorderJ.setAudioEncoder(i);
            mediaRecorderJ.setOnInfoListener(this);
            qyc qycVar = (qyc) ((y7d) this.b.getValue());
            qycVar.getClass();
            mediaRecorderJ.setMaxDuration(((int) qycVar.q(PmsKey.f63maxaudiolength, 3600)) * 1000);
            mediaRecorderJ.setAudioSamplingRate(i2);
            if (num != null) {
                mediaRecorderJ.setAudioEncodingBitRate(num.intValue());
            }
            mediaRecorderJ.setAudioChannels(1);
            mediaRecorderJ.setOutputFile(str);
            mediaRecorderJ.prepare();
            mediaRecorderJ.start();
            return true;
        } catch (RuntimeException e) {
            String name = o60.class.getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var == null || !ir6Var.c()) {
                return false;
            }
            ir6Var.d(us7.s0, name, e.getMessage() + " encoder: " + i, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d A[PHI: r0
      0x001d: PHI (r0v4 android.media.MediaRecorder) = (r0v3 android.media.MediaRecorder), (r0v5 android.media.MediaRecorder) binds: [B:13:0x001b, B:22:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ybc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r4 = this;
            android.media.MediaRecorder r0 = r4.X
            if (r0 == 0) goto L32
            r1 = 0
            if (r0 == 0) goto L2d
            r0.stop()     // Catch: java.lang.Throwable -> Lb java.lang.RuntimeException -> Ld
            goto L2d
        Lb:
            r0 = move-exception
            goto L23
        Ld:
            r0 = move-exception
            java.lang.Class<o60> r2 = defpackage.o60.class
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = "Can't stopRecordAudio"
            defpackage.hm9.p(r2, r3, r0)     // Catch: java.lang.Throwable -> Lb
            android.media.MediaRecorder r0 = r4.X
            if (r0 == 0) goto L20
        L1d:
            r0.release()
        L20:
            r4.X = r1
            goto L32
        L23:
            android.media.MediaRecorder r2 = r4.X
            if (r2 == 0) goto L2a
            r2.release()
        L2a:
            r4.X = r1
            throw r0
        L2d:
            android.media.MediaRecorder r0 = r4.X
            if (r0 == 0) goto L20
            goto L1d
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o60.d():void");
    }

    @Override // defpackage.ybc
    public final void e() throws IllegalStateException {
        MediaRecorder mediaRecorder = this.X;
        if (mediaRecorder != null) {
            mediaRecorder.resume();
        }
    }

    @Override // defpackage.ybc
    public final Object f(long j, Continuation continuation) throws IllegalStateException, IOException, IllegalArgumentException {
        String absolutePath = ((kk5) ((zi5) this.o.getValue())).d(j).getAbsolutePath();
        e5f e5fVar = e5f.a;
        if (absolutePath == null) {
            hm9.n(o60.class.getName(), "Couldn't create a file for the audio message");
            return e5fVar;
        }
        this.Z = absolutePath;
        if (!c(3, 90000, new Integer(60000), absolutePath) && !c(3, 45000, new Integer(30000), absolutePath) && !c(3, 16000, null, absolutePath)) {
            c(0, 16000, null, absolutePath);
        }
        return e5fVar;
    }

    @Override // defpackage.ybc
    public final Object g(xbc xbcVar) {
        String str;
        if (!(xbcVar instanceof vbc) || (str = this.Z) == null) {
            return null;
        }
        vbc vbcVar = (vbc) xbcVar;
        return new j50(str, vbcVar.a, vbcVar.b);
    }

    @Override // defpackage.ybc
    public final void h() throws IllegalStateException {
        MediaRecorder mediaRecorder = this.X;
        if (mediaRecorder != null) {
            mediaRecorder.pause();
        }
    }

    @Override // defpackage.ybc
    public final boolean i() {
        return ((eua) this.c.getValue()).b(eua.h);
    }

    @Override // defpackage.ybc
    public final void j(cbc cbcVar) {
        this.Y = cbcVar;
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        ubc ubcVar;
        if ((i == 800 || i == 801) && (ubcVar = this.Y) != null) {
            ((cbc) ubcVar).y();
        }
    }
}
