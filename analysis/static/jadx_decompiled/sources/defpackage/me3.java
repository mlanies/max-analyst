package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class me3 {
    public final Executor a;
    public final Executor b;
    public final p8g c;
    public final xxc d;
    public final y8 e;
    public final int f;
    public final int g;
    public final int h;

    public me3(ho9 ho9Var) {
        Executor executor = (Executor) ho9Var.b;
        if (executor == null) {
            this.a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new je3(false));
        } else {
            this.a = executor;
        }
        Executor executor2 = (Executor) ho9Var.d;
        if (executor2 == null) {
            this.b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new je3(true));
        } else {
            this.b = executor2;
        }
        p8g p8gVar = (p8g) ho9Var.c;
        if (p8gVar == null) {
            String str = p8g.a;
            this.c = new o8g();
        } else {
            this.c = p8gVar;
        }
        this.d = new xxc();
        this.e = new y8(12);
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = ho9Var.a;
    }
}
