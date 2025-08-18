package defpackage;

import android.util.SparseIntArray;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class bg7 {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public bg7() {
        jyc jycVar = jyc.a;
        f5a f5aVarD = jycVar.d();
        jp jpVar = ((p7b) jycVar.q()).c;
        je7 je7Var = iyc.a;
        khe kheVarD = jycVar.getAccessor().d(q33.class);
        je7 je7Var2 = iyc.e;
        khe kheVarD2 = jycVar.getAccessor().d(blb.class);
        khe kheVarD3 = jycVar.getAccessor().d(t23.class);
        khe kheVar = new khe(new m57(10));
        khe kheVar2 = new khe(new m57(11));
        je7 je7Var3 = iyc.a;
        this.b = f5aVarD;
        this.c = jpVar;
        this.d = kheVarD;
        this.e = je7Var2;
        this.f = kheVarD2;
        this.a = 6;
        this.g = kheVarD3;
        this.h = kheVar;
        this.i = kheVar2;
        this.j = je7Var3;
    }

    public static void b(int i, k56 k56Var) {
        long jNanoTime = System.nanoTime();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "LibraryUpgradeHelper", wg0.g(i, "Upgrade to ", " started"), null);
        }
        k56Var.invoke();
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            us7 us7Var = us7.X;
            int i2 = ft4.o;
            ir6Var2.d(us7Var, "LibraryUpgradeHelper", "Upgrade to " + i + " complete. It takes " + ft4.j(z7.S(System.nanoTime() - jNanoTime, kt4.NANOSECONDS)), null);
        }
    }

    public void a() {
        kxc kxcVar = (kxc) ((hp) this.c);
        boolean zContains = kxcVar.g.contains("app.library.version");
        f5a f5aVar = (f5a) this.b;
        int i = this.a;
        if (!zContains) {
            if (f5aVar.d()) {
                kxcVar.k(5, "app.library.version");
            } else {
                kxcVar.k(i, "app.library.version");
            }
        }
        int i2 = kxcVar.g.getInt("app.library.version", 6);
        if (i2 == i) {
            hm9.n("LibraryUpgradeHelper", "upgrade not needed");
            return;
        }
        if (f5aVar.d()) {
            if (i2 < 1) {
                final int i3 = 0;
                b(1, new k56(this) { // from class: xf7
                    public final /* synthetic */ bg7 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.k56
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                ((t23) ((je7) this.b.g).getValue()).a();
                                break;
                            case 1:
                                ((t23) ((je7) this.b.g).getValue()).a();
                                break;
                            case 2:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new yf7(this.b, null), 2);
                                break;
                            case 3:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new zf7(this.b, null), 2);
                                break;
                            default:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new ag7(this.b, null), 2);
                                break;
                        }
                        return e5f.a;
                    }
                });
            }
            if (i2 <= 1 && i > 1) {
                final int i4 = 1;
                b(2, new k56(this) { // from class: xf7
                    public final /* synthetic */ bg7 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.k56
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                ((t23) ((je7) this.b.g).getValue()).a();
                                break;
                            case 1:
                                ((t23) ((je7) this.b.g).getValue()).a();
                                break;
                            case 2:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new yf7(this.b, null), 2);
                                break;
                            case 3:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new zf7(this.b, null), 2);
                                break;
                            default:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new ag7(this.b, null), 2);
                                break;
                        }
                        return e5f.a;
                    }
                });
            }
            if (i2 <= 3 && i > 3) {
                final int i5 = 2;
                b(4, new k56(this) { // from class: xf7
                    public final /* synthetic */ bg7 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.k56
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                ((t23) ((je7) this.b.g).getValue()).a();
                                break;
                            case 1:
                                ((t23) ((je7) this.b.g).getValue()).a();
                                break;
                            case 2:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new yf7(this.b, null), 2);
                                break;
                            case 3:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new zf7(this.b, null), 2);
                                break;
                            default:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new ag7(this.b, null), 2);
                                break;
                        }
                        return e5f.a;
                    }
                });
            }
            if (i2 <= 4 && i > 4) {
                final int i6 = 3;
                b(5, new k56(this) { // from class: xf7
                    public final /* synthetic */ bg7 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.k56
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                ((t23) ((je7) this.b.g).getValue()).a();
                                break;
                            case 1:
                                ((t23) ((je7) this.b.g).getValue()).a();
                                break;
                            case 2:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new yf7(this.b, null), 2);
                                break;
                            case 3:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new zf7(this.b, null), 2);
                                break;
                            default:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new ag7(this.b, null), 2);
                                break;
                        }
                        return e5f.a;
                    }
                });
            }
            if (i2 <= 5 && i > 5) {
                final int i7 = 4;
                b(6, new k56(this) { // from class: xf7
                    public final /* synthetic */ bg7 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.k56
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                ((t23) ((je7) this.b.g).getValue()).a();
                                break;
                            case 1:
                                ((t23) ((je7) this.b.g).getValue()).a();
                                break;
                            case 2:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new yf7(this.b, null), 2);
                                break;
                            case 3:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new zf7(this.b, null), 2);
                                break;
                            default:
                                j47.T(zd6.a, ((w9a) ((kke) sd3.i.getValue())).b(), null, new ag7(this.b, null), 2);
                                break;
                        }
                        return e5f.a;
                    }
                });
            }
        }
        kxcVar.k(i, "app.library.version");
    }

    public bg7(h7b h7bVar) {
        int i;
        f46.I();
        h7bVar.getClass();
        this.b = n84.a();
        this.c = rq9.o();
        int i2 = xa4.a;
        int i3 = i2 * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i4 = 131072; i4 <= 4194304; i4 *= 2) {
            sparseIntArray.put(i4, i2);
        }
        this.d = new n5b(4194304, i3, sparseIntArray, xa4.a);
        this.e = qq9.j();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i5 = iMin < 16777216 ? 3145728 : iMin < 33554432 ? 6291456 : 12582912;
        int iMin2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin2 < 16777216) {
            i = iMin2 / 2;
        } else {
            i = (iMin2 / 4) * 3;
        }
        this.f = new n5b(i5, i, sparseIntArray2, -1);
        this.g = rq9.o();
        n5b n5bVar = (n5b) h7bVar.b;
        if (n5bVar == null) {
            SparseIntArray sparseIntArray3 = new SparseIntArray();
            sparseIntArray3.put(16384, 5);
            n5bVar = new n5b(81920, 1048576, sparseIntArray3, -1);
        }
        this.h = n5bVar;
        this.i = rq9.o();
        String str = (String) h7bVar.c;
        this.j = str == null ? "legacy" : str;
        this.a = 4194304;
        f46.I();
    }
}
