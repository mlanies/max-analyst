package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class flf extends yqc {
    public final bkb e;
    public final elf f;
    public final p54 g;
    public final long h;
    public volatile long i;
    public boolean j;

    public flf(Context context, qy5 qy5Var, f1f f1fVar, crd crdVar, List list, zff zffVar, v43 v43Var, hj9 hj9Var, gte gteVar, x99 x99Var, xw0 xw0Var, long j, boolean z) throws ExportException {
        super(qy5Var, hj9Var);
        this.h = j;
        this.i = -9223372036854775807L;
        i63 i63Var = qy5Var.A;
        i63Var.getClass();
        i63 i63Var2 = i63Var.c == 2 ? Objects.equals(qy5Var.n, "image/jpeg_r") ? new i63(6, 1, 7, -1, -1, null) : i63.h : i63Var;
        ny5 ny5VarA = qy5Var.a();
        ny5VarA.z = i63Var2;
        elf elfVar = new elf(v43Var, new qy5(ny5VarA), hj9Var.b.w(2), f1fVar, x99Var);
        this.f = elfVar;
        this.g = new p54(0);
        try {
            bkb bkbVar = new bkb(this, context, z ? new o84(18) : new o9g(29, zffVar), (elfVar.g == 2 && i63.g(i63Var)) ? i63.h : i63Var2, gteVar, xw0Var, crdVar, list);
            this.e = bkbVar;
            bkbVar.a();
        } catch (VideoFrameProcessingException e) {
            throw new ExportException("Video frame processing error", e, 5001);
        }
    }

    @Override // defpackage.yqc
    public final sf6 j(lv4 lv4Var, qy5 qy5Var, int i) throws ExportException {
        try {
            return ((p1f) this.e.a).f(i);
        } catch (VideoFrameProcessingException e) {
            throw new ExportException("Video frame processing error", e, 5001);
        }
    }

    @Override // defpackage.yqc
    public final p54 k() {
        p54 p54Var = this.g;
        elf elfVar = this.f;
        MediaCodec.BufferInfo bufferInfo = null;
        p54Var.X = elfVar.i != null ? elfVar.i.c() : null;
        if (this.g.X == null) {
            return null;
        }
        elf elfVar2 = this.f;
        if (elfVar2.i != null) {
            y84 y84Var = elfVar2.i;
            if (y84Var.f(false)) {
                bufferInfo = y84Var.a;
            }
        }
        bufferInfo.getClass();
        if (bufferInfo.presentationTimeUs == 0) {
            if (((p1f) this.e.a).k() != this.j || this.i == -9223372036854775807L || bufferInfo.size <= 0) {
                this.j = true;
            } else {
                bufferInfo.presentationTimeUs = this.i;
            }
        }
        p54 p54Var2 = this.g;
        p54Var2.Z = bufferInfo.presentationTimeUs;
        p54Var2.b = bufferInfo.flags;
        return p54Var2;
    }

    @Override // defpackage.yqc
    public final qy5 l() throws ExportException {
        elf elfVar = this.f;
        if (elfVar.i == null) {
            return null;
        }
        y84 y84Var = elfVar.i;
        y84Var.f(false);
        qy5 qy5Var = y84Var.j;
        if (qy5Var == null || elfVar.j == 0) {
            return qy5Var;
        }
        ny5 ny5VarA = qy5Var.a();
        ny5VarA.v = elfVar.j;
        return new qy5(ny5VarA);
    }

    @Override // defpackage.yqc
    public final boolean m() {
        elf elfVar = this.f;
        return elfVar.i != null && elfVar.i.d();
    }

    @Override // defpackage.yqc
    public final void o() {
        this.e.release();
        elf elfVar = this.f;
        if (elfVar.i != null) {
            elfVar.i.h();
        }
        elfVar.k = true;
    }

    @Override // defpackage.yqc
    public final void p() throws ExportException {
        elf elfVar = this.f;
        if (elfVar.i != null) {
            elfVar.i.i();
        }
    }
}
