package defpackage;

import android.media.MediaCodec;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k65 extends j65 {
    public final boolean P0;
    public final u43 Q0;
    public final int R0;
    public final ArrayList S0;
    public j2d T0;
    public int U0;

    public k65(boolean z, glc glcVar, int i, g03 g03Var, wt wtVar) {
        super(2, g03Var, wtVar);
        this.P0 = z;
        this.Q0 = glcVar;
        this.R0 = i;
        this.S0 = new ArrayList();
    }

    @Override // defpackage.j65
    public final boolean G() throws ExportException {
        if (this.F0.d()) {
            this.E0.e();
            this.G0 = true;
            return false;
        }
        y84 y84Var = this.F0;
        MediaCodec.BufferInfo bufferInfo = y84Var.f(false) ? y84Var.a : null;
        if (bufferInfo == null) {
            return false;
        }
        long j = bufferInfo.presentationTimeUs;
        long j2 = j - this.C0;
        if (j2 >= 0) {
            ArrayList arrayList = this.S0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Long) arrayList.get(i)).longValue() == j) {
                    arrayList.remove(i);
                }
            }
            if (this.E0.c() == this.U0 || !this.E0.h(j2)) {
                return false;
            }
            this.F0.j(j2, true);
            return true;
        }
        this.F0.i();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.j65
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(defpackage.qy5 r4) {
        /*
            r3 = this;
            wqc r0 = r3.E0
            defpackage.fm9.l(r0)
            i63 r0 = r4.A
            boolean r0 = defpackage.i63.g(r0)
            if (r0 == 0) goto L13
            int r0 = r3.R0
            r1 = 1
            if (r0 != r1) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            wqc r0 = r3.E0
            android.view.Surface r0 = r0.a()
            r0.getClass()
            u43 r2 = r3.Q0
            y84 r4 = r2.d(r4, r0, r1)
            r3.F0 = r4
            int r4 = r4.f
            r3.U0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k65.H(qy5):void");
    }

    @Override // defpackage.j65
    public final void J(p54 p54Var) {
        long j = p54Var.Z;
        if (j < this.w0) {
            this.S0.add(Long.valueOf(j));
        }
    }

    @Override // defpackage.j65
    public final void K(qy5 qy5Var) {
        if (this.P0) {
            this.T0 = new j2d(qy5Var);
        }
    }

    @Override // defpackage.j65
    public final qy5 L(qy5 qy5Var) {
        if (this.R0 != 3 || !i63.g(qy5Var.A)) {
            return qy5Var;
        }
        ny5 ny5VarA = qy5Var.a();
        ny5VarA.z = i63.h;
        return ny5VarA.a();
    }

    @Override // defpackage.j65
    public final qy5 M(qy5 qy5Var) {
        i63 i63Var = qy5Var.A;
        if (i63Var == null || !i63Var.e()) {
            i63Var = i63.h;
        }
        if (this.R0 == 1 && i63.g(i63Var)) {
            i63Var = i63.h;
        }
        ny5 ny5VarA = qy5Var.a();
        ny5VarA.z = i63Var;
        return new qy5(ny5VarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed A[EDGE_INSN: B:60:0x00ed->B:61:0x00ee BREAK  A[LOOP:1: B:52:0x00d4->B:58:0x00e8]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
    @Override // defpackage.j65
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P(defpackage.p54 r19) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k65.P(p54):boolean");
    }

    @Override // defpackage.vj0
    public final String k() {
        return "ExoAssetLoaderVideoRenderer";
    }
}
