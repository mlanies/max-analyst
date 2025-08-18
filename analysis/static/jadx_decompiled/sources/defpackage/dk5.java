package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class dk5 extends tfg {
    public final File h;
    public final rl8 i;
    public final long j;
    public final pad k;
    public final jq6 l;
    public final int m;

    public dk5(File file, rl8 rl8Var, long j, pad padVar, tq6 tq6Var, int i) {
        this.m = i;
        this.h = file;
        this.i = rl8Var;
        this.j = j;
        this.k = padVar;
        this.l = tq6Var;
    }

    @Override // defpackage.tfg
    public final void E(eu0 eu0Var) {
        float f;
        int i = 1;
        File file = this.h;
        Logger logger = x2a.a;
        y7c y7cVar = new y7c(new vx(new FileInputStream(file), 1, new oue()));
        try {
            long j = this.j;
            if (j > 0) {
                y7cVar.R(j);
            }
            byte[] bArr = new byte[this.m];
            while (true) {
                int i2 = new us0(y7cVar, i).read(bArr, 0, this.m);
                if (i2 == -1) {
                    y7cVar.close();
                    return;
                }
                eu0Var.b0(0, bArr, i2);
                j += i2;
                this.k.b += i2;
                if (!this.h.exists()) {
                    throw new FileNotFoundException(this.h.getAbsolutePath());
                }
                long length = this.h.length();
                if (length == 0) {
                    throw new IOException("FILE_ZERO_LENGTH");
                }
                float f2 = 100.0f;
                float f3 = (j * 100.0f) / length;
                if (f3 <= 100.0f) {
                    f2 = 0.0f;
                    f = f3 < 0.0f ? f2 : f3;
                }
                jq6 jq6Var = this.l;
                if (jq6Var != null) {
                    tq6 tq6Var = (tq6) jq6Var;
                    if (!tq6Var.s0.get()) {
                        tq6Var.Y.b(new bq6(tq6Var, f, length, 1));
                    }
                }
                i = 1;
            }
        } catch (Throwable th) {
            try {
                y7cVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.tfg
    public final long g() {
        return this.h.length() - this.j;
    }

    @Override // defpackage.tfg
    public final rl8 h() {
        return this.i;
    }
}
