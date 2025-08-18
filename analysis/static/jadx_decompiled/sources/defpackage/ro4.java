package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class ro4 extends Thread implements yo4 {
    public final int X;
    public volatile po4 Y;
    public volatile boolean Z;
    public final vo4 a;
    public final zo4 b;
    public final uo4 c;
    public final boolean o;
    public Exception s0;
    public long t0 = -1;

    public ro4(vo4 vo4Var, zo4 zo4Var, uo4 uo4Var, boolean z, int i, po4 po4Var) {
        this.a = vo4Var;
        this.b = zo4Var;
        this.c = uo4Var;
        this.o = z;
        this.X = i;
        this.Y = po4Var;
    }

    public final void a(boolean z) {
        if (z) {
            this.Y = null;
        }
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.b.cancel();
        interrupt();
    }

    public final void b(float f, long j, long j2) {
        this.c.a = j2;
        this.c.b = f;
        if (j != this.t0) {
            this.t0 = j;
            po4 po4Var = this.Y;
            if (po4Var != null) {
                po4Var.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException, IOException {
        try {
            if (this.o) {
                this.b.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.Z) {
                    try {
                        this.b.a(this);
                        break;
                    } catch (IOException e) {
                        if (!this.Z) {
                            long j2 = this.c.a;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 > this.X) {
                                throw e;
                            }
                            Thread.sleep(Math.min(i * 1000, 5000));
                            i = i2;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.s0 = e2;
        }
        po4 po4Var = this.Y;
        if (po4Var != null) {
            po4Var.obtainMessage(10, this).sendToTarget();
        }
    }
}
