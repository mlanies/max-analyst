package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ql6 extends j13 {
    public byte[] u0;
    public volatile boolean v0;
    public byte[] w0;

    @Override // defpackage.go7
    public final void a() {
        this.v0 = true;
    }

    @Override // defpackage.go7
    public final void load() {
        try {
            this.t0.G(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.v0) {
                byte[] bArr = this.u0;
                if (bArr.length < i2 + 16384) {
                    this.u0 = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.t0.read(this.u0, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.v0) {
                this.w0 = Arrays.copyOf(this.u0, i2);
            }
            mr0.i(this.t0);
        } catch (Throwable th) {
            mr0.i(this.t0);
            throw th;
        }
    }
}
