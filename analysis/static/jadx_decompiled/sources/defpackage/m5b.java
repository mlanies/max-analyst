package defpackage;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class m5b {
    public final bg7 a;
    public pq8 b;
    public go0 c;
    public pq8 d;
    public wm5 e;
    public pq8 f;
    public y7g g;
    public sh0 h;
    public ja6 i;

    public m5b(bg7 bg7Var) {
        this.a = bg7Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.go0 a() {
        /*
            r6 = this;
            go0 r0 = r6.c
            if (r0 != 0) goto L8d
            bg7 r0 = r6.a
            java.lang.Object r1 = r0.j
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -1868884870: goto L3d;
                case -1106578487: goto L33;
                case -404562712: goto L29;
                case -402149703: goto L1f;
                case 95945896: goto L15;
                default: goto L14;
            }
        L14:
            goto L47
        L15:
            java.lang.String r2 = "dummy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = 0
            goto L48
        L1f:
            java.lang.String r2 = "dummy_with_tracking"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = r5
            goto L48
        L29:
            java.lang.String r2 = "experimental"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = r4
            goto L48
        L33:
            java.lang.String r2 = "legacy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = 4
            goto L48
        L3d:
            java.lang.String r2 = "legacy_default_params"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = r3
            goto L48
        L47:
            r1 = -1
        L48:
            if (r1 == 0) goto L86
            if (r1 == r5) goto L7e
            if (r1 == r4) goto L70
            java.lang.Object r2 = r0.c
            rq9 r2 = (defpackage.rq9) r2
            java.lang.Object r4 = r0.e
            qq9 r4 = (defpackage.qq9) r4
            if (r1 == r3) goto L64
            rs0 r1 = new rs0
            java.lang.Object r0 = r0.b
            n5b r0 = (defpackage.n5b) r0
            r1.<init>(r4, r0, r2)
            r6.c = r1
            goto L8d
        L64:
            rs0 r0 = new rs0
            n5b r1 = defpackage.n84.a()
            r0.<init>(r4, r1, r2)
            r6.c = r0
            goto L8d
        L70:
            lw7 r1 = new lw7
            rq9 r2 = defpackage.rq9.o()
            int r0 = r0.a
            r1.<init>(r0, r2)
            r6.c = r1
            goto L8d
        L7e:
            et4 r0 = new et4
            r0.<init>()
            r6.c = r0
            goto L8d
        L86:
            ys4 r0 = new ys4
            r0.<init>()
            r6.c = r0
        L8d:
            go0 r6 = r6.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5b.a():go0");
    }

    public final wm5 b() {
        if (this.e == null) {
            bg7 bg7Var = this.a;
            this.e = new wm5((qq9) bg7Var.e, (n5b) bg7Var.d);
        }
        return this.e;
    }

    public final y7g c(int i) {
        pq8 pq8Var;
        if (this.g == null) {
            bg7 bg7Var = this.a;
            if (i == 0) {
                if (this.f == null) {
                    try {
                        this.f = (pq8) NativeMemoryChunkPool.class.getConstructor(sq8.class, n5b.class, o5b.class).newInstance((qq9) bg7Var.e, (n5b) bg7Var.f, (rq9) bg7Var.g);
                    } catch (ClassNotFoundException e) {
                        ta5.c("PoolFactory", "", e);
                        this.f = null;
                    } catch (IllegalAccessException e2) {
                        ta5.c("PoolFactory", "", e2);
                        this.f = null;
                    } catch (InstantiationException e3) {
                        ta5.c("PoolFactory", "", e3);
                        this.f = null;
                    } catch (NoSuchMethodException e4) {
                        ta5.c("PoolFactory", "", e4);
                        this.f = null;
                    } catch (InvocationTargetException e5) {
                        ta5.c("PoolFactory", "", e5);
                        this.f = null;
                    }
                }
                pq8Var = this.f;
            } else if (i == 1) {
                if (this.d == null) {
                    try {
                        this.d = (pq8) BufferMemoryChunkPool.class.getConstructor(sq8.class, n5b.class, o5b.class).newInstance((qq9) bg7Var.e, (n5b) bg7Var.f, (rq9) bg7Var.g);
                    } catch (ClassNotFoundException unused) {
                        this.d = null;
                    } catch (IllegalAccessException unused2) {
                        this.d = null;
                    } catch (InstantiationException unused3) {
                        this.d = null;
                    } catch (NoSuchMethodException unused4) {
                        this.d = null;
                    } catch (InvocationTargetException unused5) {
                        this.d = null;
                    }
                }
                pq8Var = this.d;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
                }
                if (this.b == null) {
                    try {
                        this.b = (pq8) AshmemMemoryChunkPool.class.getConstructor(sq8.class, n5b.class, o5b.class).newInstance((qq9) bg7Var.e, (n5b) bg7Var.f, (rq9) bg7Var.g);
                    } catch (ClassNotFoundException unused6) {
                        this.b = null;
                    } catch (IllegalAccessException unused7) {
                        this.b = null;
                    } catch (InstantiationException unused8) {
                        this.b = null;
                    } catch (NoSuchMethodException unused9) {
                        this.b = null;
                    } catch (InvocationTargetException unused10) {
                        this.b = null;
                    }
                }
                pq8Var = this.b;
            }
            od2.o(pq8Var, "failed to get pool for chunk type: " + i);
            this.g = new y7g(pq8Var, 24, d());
        }
        return this.g;
    }

    public final sh0 d() {
        if (this.h == null) {
            if (this.i == null) {
                bg7 bg7Var = this.a;
                this.i = new ja6((qq9) bg7Var.e, (n5b) bg7Var.h, (rq9) bg7Var.i);
            }
            this.h = new sh0(this.i);
        }
        return this.h;
    }
}
