package defpackage;

import android.media.MediaCodec;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class i65 extends j65 {
    public final u43 P0;
    public boolean Q0;

    public i65(glc glcVar, g03 g03Var, wt wtVar) {
        super(1, g03Var, wtVar);
        this.P0 = glcVar;
    }

    @Override // defpackage.j65
    public final boolean G() throws ExportException {
        p54 p54VarD = this.E0.d();
        if (p54VarD == null) {
            return false;
        }
        if (!this.Q0) {
            if (this.F0.d()) {
                ByteBuffer byteBuffer = p54VarD.X;
                byteBuffer.getClass();
                byteBuffer.limit(0);
                p54VarD.a(4);
                this.G0 = this.E0.f();
                return false;
            }
            ByteBuffer byteBufferC = this.F0.c();
            if (byteBufferC == null) {
                return false;
            }
            p54VarD.x(byteBufferC.limit());
            p54VarD.X.put(byteBufferC).flip();
            y84 y84Var = this.F0;
            MediaCodec.BufferInfo bufferInfo = y84Var.f(false) ? y84Var.a : null;
            bufferInfo.getClass();
            p54VarD.Z = bufferInfo.presentationTimeUs;
            p54VarD.b = bufferInfo.flags;
            this.F0.i();
            this.Q0 = true;
        }
        if (!this.E0.f()) {
            return false;
        }
        this.Q0 = false;
        return true;
    }

    @Override // defpackage.j65
    public final void H(qy5 qy5Var) {
        this.F0 = this.P0.g(qy5Var);
    }

    @Override // defpackage.j65
    public final boolean P(p54 p54Var) {
        if (p54Var.f(4)) {
            return false;
        }
        long j = p54Var.Z - this.C0;
        p54Var.Z = j;
        if (this.F0 == null || j >= 0) {
            return false;
        }
        p54Var.v();
        return true;
    }

    @Override // defpackage.vj0
    public final String k() {
        return "ExoAssetLoaderAudioRenderer";
    }
}
