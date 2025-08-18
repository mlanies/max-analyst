package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class w05 implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z05 b;

    public /* synthetic */ w05(z05 z05Var, int i) {
        this.a = i;
        this.b = z05Var;
    }

    @Override // defpackage.mq1
    public final String q(final lq1 lq1Var) {
        switch (this.a) {
            case 0:
                final z05 z05Var = this.b;
                final int i = 0;
                z05Var.o.h.execute(new Runnable() { // from class: x05
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                lq1Var.b(z05Var.b);
                                break;
                            default:
                                final z05 z05Var2 = z05Var;
                                lt0 lt0Var = z05Var2.b;
                                lt0 lt0Var2 = lt0.a;
                                lq1 lq1Var2 = lq1Var;
                                if (lt0Var != lt0Var2) {
                                    if (lt0Var != lt0.b) {
                                        lq1Var2.d(new IllegalStateException("Unknown state: " + z05Var2.b));
                                        break;
                                    } else {
                                        lq1Var2.d(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    d15 d15Var = z05Var2.o;
                                    final bm7 bm7VarA = d15Var.a();
                                    kq0.y(bm7VarA, lq1Var2);
                                    final int i2 = 0;
                                    lq1Var2.a(new Runnable() { // from class: y05
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i2) {
                                                case 0:
                                                    z05 z05Var3 = z05Var2;
                                                    z05Var3.getClass();
                                                    bm7 bm7Var = bm7VarA;
                                                    if (!bm7Var.cancel(true)) {
                                                        c54.p(null, bm7Var.isDone());
                                                        try {
                                                            ((f17) bm7Var.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = z05Var3.o.a;
                                                            e.toString();
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    z05Var2.c.remove(bm7VarA);
                                                    break;
                                            }
                                        }
                                    }, ju0.k());
                                    z05Var2.c.add(bm7VarA);
                                    final int i3 = 1;
                                    bm7VarA.d(new Runnable() { // from class: y05
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    z05 z05Var3 = z05Var2;
                                                    z05Var3.getClass();
                                                    bm7 bm7Var = bm7VarA;
                                                    if (!bm7Var.cancel(true)) {
                                                        c54.p(null, bm7Var.isDone());
                                                        try {
                                                            ((f17) bm7Var.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = z05Var3.o.a;
                                                            e.toString();
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    z05Var2.c.remove(bm7VarA);
                                                    break;
                                            }
                                        }
                                    }, d15Var.h);
                                    break;
                                }
                        }
                    }
                });
                return "fetchData";
            default:
                final z05 z05Var2 = this.b;
                final int i2 = 1;
                z05Var2.o.h.execute(new Runnable() { // from class: x05
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                lq1Var.b(z05Var2.b);
                                break;
                            default:
                                final z05 z05Var22 = z05Var2;
                                lt0 lt0Var = z05Var22.b;
                                lt0 lt0Var2 = lt0.a;
                                lq1 lq1Var2 = lq1Var;
                                if (lt0Var != lt0Var2) {
                                    if (lt0Var != lt0.b) {
                                        lq1Var2.d(new IllegalStateException("Unknown state: " + z05Var22.b));
                                        break;
                                    } else {
                                        lq1Var2.d(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    d15 d15Var = z05Var22.o;
                                    final bm7 bm7VarA = d15Var.a();
                                    kq0.y(bm7VarA, lq1Var2);
                                    final int i22 = 0;
                                    lq1Var2.a(new Runnable() { // from class: y05
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    z05 z05Var3 = z05Var22;
                                                    z05Var3.getClass();
                                                    bm7 bm7Var = bm7VarA;
                                                    if (!bm7Var.cancel(true)) {
                                                        c54.p(null, bm7Var.isDone());
                                                        try {
                                                            ((f17) bm7Var.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = z05Var3.o.a;
                                                            e.toString();
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    z05Var22.c.remove(bm7VarA);
                                                    break;
                                            }
                                        }
                                    }, ju0.k());
                                    z05Var22.c.add(bm7VarA);
                                    final int i3 = 1;
                                    bm7VarA.d(new Runnable() { // from class: y05
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    z05 z05Var3 = z05Var22;
                                                    z05Var3.getClass();
                                                    bm7 bm7Var = bm7VarA;
                                                    if (!bm7Var.cancel(true)) {
                                                        c54.p(null, bm7Var.isDone());
                                                        try {
                                                            ((f17) bm7Var.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = z05Var3.o.a;
                                                            e.toString();
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    z05Var22.c.remove(bm7VarA);
                                                    break;
                                            }
                                        }
                                    }, d15Var.h);
                                    break;
                                }
                        }
                    }
                });
                return "acquireBuffer";
        }
    }
}
