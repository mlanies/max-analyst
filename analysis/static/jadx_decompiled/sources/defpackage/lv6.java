package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class lv6 {
    public static lv6 p;
    public static iv6 q;
    public final aab a;
    public final kv6 b;
    public final wd6 c;
    public final cl4 d;
    public nw7 e;
    public y7g f;
    public nw7 g;
    public y7g h;
    public ob4 i;
    public uf9 j;
    public gab k;
    public kab l;
    public ct m;
    public ana n;
    public AnimatedFactoryV2Impl o;

    public lv6(kv6 kv6Var) {
        f46.I();
        kv6Var.getClass();
        this.b = kv6Var;
        ho9 ho9Var = kv6Var.v;
        ho9Var.getClass();
        ExecutorService executorServiceC = kv6Var.h.c();
        aab aabVar = new aab();
        aabVar.a = executorServiceC;
        aabVar.b = new ArrayDeque();
        this.a = aabVar;
        this.c = new wd6(kv6Var.x);
        f46.I();
        this.d = kv6Var.f;
        ho9Var.getClass();
    }

    public static lv6 g() {
        lv6 lv6Var = p;
        od2.o(lv6Var, "ImagePipelineFactory was not initialized!");
        return lv6Var;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [xe] */
    /* JADX WARN: Type inference failed for: r9v0, types: [xe] */
    public final j84 a() {
        AnimatedFactoryV2Impl animatedFactoryV2ImplB = b();
        if (animatedFactoryV2ImplB == null) {
            return null;
        }
        if (animatedFactoryV2ImplB.h == null) {
            final int i = 0;
            ?? r8 = new ide() { // from class: xe
                @Override // defpackage.ide
                public final Object get() {
                    switch (i) {
                        case 0:
                            return 2;
                        default:
                            return 3;
                    }
                }
            };
            v6d md4Var = animatedFactoryV2ImplB.i;
            if (md4Var == null) {
                md4Var = new md4(animatedFactoryV2ImplB.b.a());
            }
            v6d v6dVar = md4Var;
            final int i2 = 1;
            ?? r9 = new ide() { // from class: xe
                @Override // defpackage.ide
                public final Object get() {
                    switch (i2) {
                        case 0:
                            return 2;
                        default:
                            return 3;
                    }
                }
            };
            if (animatedFactoryV2ImplB.f == null) {
                animatedFactoryV2ImplB.f = new gaa(animatedFactoryV2ImplB);
            }
            gaa gaaVar = animatedFactoryV2ImplB.f;
            if (v4f.b == null) {
                v4f.b = new v4f(new Handler(Looper.getMainLooper()));
            }
            animatedFactoryV2ImplB.h = new j84(gaaVar, v4f.b, v6dVar, RealtimeSinceBootClock.get(), animatedFactoryV2ImplB.a, animatedFactoryV2ImplB.c, r8, r9, new x24(3, Boolean.valueOf(animatedFactoryV2ImplB.k)), new x24(3, Boolean.valueOf(animatedFactoryV2ImplB.d)), new x24(3, Integer.valueOf(animatedFactoryV2ImplB.j)), new x24(3, Integer.valueOf(animatedFactoryV2ImplB.l)));
        }
        return animatedFactoryV2ImplB.h;
    }

    public final AnimatedFactoryV2Impl b() {
        if (this.o == null) {
            s2b s2bVarH = h();
            kv6 kv6Var = this.b;
            o55 o55Var = kv6Var.h;
            jy3 jy3VarC = c();
            kv6Var.v.getClass();
            kv6Var.v.getClass();
            kv6Var.v.getClass();
            kv6Var.v.getClass();
            kv6Var.getClass();
            if (!xfg.h) {
                try {
                    Class cls = Boolean.TYPE;
                    Class cls2 = Integer.TYPE;
                    Constructor constructor = AnimatedFactoryV2Impl.class.getConstructor(s2b.class, o55.class, jy3.class, cls, cls, cls2, cls2, v6d.class);
                    Boolean bool = Boolean.FALSE;
                    xfg.i = (AnimatedFactoryV2Impl) constructor.newInstance(s2bVarH, o55Var, jy3VarC, bool, bool, 30, 1000, null);
                } catch (Throwable unused) {
                }
                if (xfg.i != null) {
                    xfg.h = true;
                }
            }
            this.o = xfg.i;
        }
        return this.o;
    }

    public final jy3 c() {
        if (this.e == null) {
            kv6 kv6Var = this.b;
            nd2 nd2Var = kv6Var.y;
            m84 m84Var = kv6Var.a;
            qq9 qq9Var = kv6Var.l;
            oz7 oz7Var = kv6Var.b;
            kv6Var.v.getClass();
            kv6Var.v.getClass();
            kv6Var.getClass();
            nd2Var.getClass();
            nw7 nw7Var = new nw7(new c32(9, (byte) 0), m84Var);
            qq9Var.getClass();
            this.e = nw7Var;
        }
        return this.e;
    }

    public final y7g d() {
        if (this.f == null) {
            jy3 jy3VarC = c();
            pq9 pq9Var = this.b.i;
            pq9Var.getClass();
            this.f = new y7g(jy3VarC, 21, new wd6(18, pq9Var));
        }
        return this.f;
    }

    public final y7g e() {
        if (this.h == null) {
            kv6 kv6Var = this.b;
            kv6Var.getClass();
            if (this.g == null) {
                nw7 nw7Var = new nw7(new lq9(), kv6Var.g);
                kv6Var.l.getClass();
                this.g = nw7Var;
            }
            nw7 nw7Var2 = this.g;
            pq9 pq9Var = kv6Var.i;
            pq9Var.getClass();
            this.h = new y7g(nw7Var2, 21, new sy4(14, pq9Var));
        }
        return this.h;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 iv6, still in use, count: 3, list:
          (r2v1 iv6) from 0x0113: MOVE (r29v0 iv6) = (r2v1 iv6)
          (r2v1 iv6) from 0x00de: MOVE (r29v2 iv6) = (r2v1 iv6)
          (r2v1 iv6) from 0x00bd: MOVE (r29v4 iv6) = (r2v1 iv6)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [we] */
    public final defpackage.iv6 f() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv6.f():iv6");
    }

    public final s2b h() {
        if (this.m == null) {
            m5b m5bVar = this.b.n;
            i();
            this.m = new ct(m5bVar.a(), this.c);
        }
        return this.m;
    }

    public final t2b i() {
        if (this.n == null) {
            kv6 kv6Var = this.b;
            m5b m5bVar = kv6Var.n;
            kv6Var.v.getClass();
            kv6Var.v.getClass();
            oq0 oq0Var = (oq0) kv6Var.v.d;
            go0 go0VarA = m5bVar.a();
            int i = ((n5b) m5bVar.a.d).d;
            v5b v5bVar = new v5b(i);
            for (int i2 = 0; i2 < i; i2++) {
                yu0 yu0Var = f54.a;
                v5bVar.e(ByteBuffer.allocate(16384));
            }
            this.n = new ana(go0VarA, v5bVar, oq0Var);
        }
        return this.n;
    }
}
