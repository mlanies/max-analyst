package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class gle extends zje {
    public static final fle b = new fle();

    public gle() {
    }

    public void b(gy8 gy8Var, String str) {
    }

    public gle(gy8 gy8Var) {
        try {
            long jNanoTime = System.nanoTime();
            if (gy8Var.m()) {
                int iX0 = gy8Var.x0();
                for (int i = 0; i < iX0; i++) {
                    b(gy8Var, gy8Var.z0());
                }
            }
            this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - jNanoTime));
        } catch (Exception e) {
            hm9.p("gle", "failed to parse unpacker response: ", e);
            throw new RuntimeException(e);
        }
    }
}
