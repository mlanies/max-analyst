package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.animated.gif.GifImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes.dex */
public final class a8g implements ik8, nr4, hk8, mr4, obe, u3d, uw4 {
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ a8g(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public static void k(String str) throws NoSuchAlgorithmException, IOException {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return;
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
            e.toString();
        }
    }

    @Override // defpackage.ik8
    public void A(int i, yj8 yj8Var, pc8 pc8Var) {
        if (o(i, yj8Var)) {
            ((jn) this.b).P(p(pc8Var, yj8Var));
        }
    }

    @Override // defpackage.mr4
    public void B(int i, xj8 xj8Var) {
        if (m(i, xj8Var)) {
            ((kr4) this.c).f();
        }
    }

    @Override // defpackage.nr4
    public void C(int i, yj8 yj8Var) {
        if (o(i, yj8Var)) {
            ((lr4) this.c).b();
        }
    }

    @Override // defpackage.nr4
    public void D(int i, yj8 yj8Var) {
        if (o(i, yj8Var)) {
            ((lr4) this.c).a();
        }
    }

    @Override // defpackage.hk8
    public void E(int i, xj8 xj8Var, pc8 pc8Var) {
        if (m(i, xj8Var)) {
            ((gk8) this.b).c(pc8Var);
        }
    }

    @Override // defpackage.hk8
    public void F(int i, xj8 xj8Var, pc8 pc8Var) {
        if (m(i, xj8Var)) {
            ((gk8) this.b).m(pc8Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r9.F(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        r1.reset();
        r6.E(r9.c, r9.a);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    @Override // defpackage.obe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(byte[] r33, int r34, int r35, defpackage.nbe r36, defpackage.pj3 r37) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8g.G(byte[], int, int, nbe, pj3):void");
    }

    @Override // defpackage.nr4
    public void H(int i, yj8 yj8Var) {
        if (o(i, yj8Var)) {
            ((lr4) this.c).f();
        }
    }

    @Override // defpackage.mr4
    public void I(int i, xj8 xj8Var) {
        if (m(i, xj8Var)) {
            ((kr4) this.c).c();
        }
    }

    @Override // defpackage.obe
    public int J() {
        return 2;
    }

    @Override // defpackage.mr4
    public void K(int i, xj8 xj8Var) {
        if (m(i, xj8Var)) {
            ((kr4) this.c).b();
        }
    }

    @Override // defpackage.ik8
    public void L(int i, yj8 yj8Var, pc8 pc8Var) {
        if (o(i, yj8Var)) {
            ((jn) this.b).n(p(pc8Var, yj8Var));
        }
    }

    @Override // defpackage.hk8
    public void M(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var) {
        if (m(i, xj8Var)) {
            ((gk8) this.b).g(xn7Var, pc8Var);
        }
    }

    @Override // defpackage.hk8
    public void N(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var) {
        if (m(i, xj8Var)) {
            ((gk8) this.b).l(xn7Var, pc8Var);
        }
    }

    @Override // defpackage.uw4
    public void a(final tu0 tu0Var) {
        if (!cqc.c((sd7) this.o)) {
            hm9.n("mx5", "Font already loading");
            return;
        }
        h0a h0aVar = new h0a(new l5(14, this));
        je7 je7Var = (je7) this.b;
        hle hleVar = (hle) je7Var.getValue();
        hleVar.getClass();
        r0a r0aVarN = h0aVar.r(((jle) hleVar).a()).n(((jle) ((hle) je7Var.getValue())).b());
        final int i = 0;
        final int i2 = 1;
        sd7 sd7Var = new sd7(new qj3(this) { // from class: lke
            public final /* synthetic */ a8g b;

            {
                this.b = this;
            }

            @Override // defpackage.qj3
            public final void accept(Object obj) {
                tu0 tu0Var2 = tu0Var;
                a8g a8gVar = this.b;
                switch (i) {
                    case 0:
                        a8gVar.getClass();
                        hm9.k("mx5", "Tam emoji font loaded");
                        tu0Var2.y((t99) obj);
                        break;
                    default:
                        Throwable th = (Throwable) obj;
                        ((cba) ((o45) ((je7) a8gVar.c).getValue())).c(new HandledException("Can't load emoji font", th), true);
                        tu0Var2.v(th);
                        break;
                }
            }
        }, new qj3(this) { // from class: lke
            public final /* synthetic */ a8g b;

            {
                this.b = this;
            }

            @Override // defpackage.qj3
            public final void accept(Object obj) {
                tu0 tu0Var2 = tu0Var;
                a8g a8gVar = this.b;
                switch (i2) {
                    case 0:
                        a8gVar.getClass();
                        hm9.k("mx5", "Tam emoji font loaded");
                        tu0Var2.y((t99) obj);
                        break;
                    default:
                        Throwable th = (Throwable) obj;
                        ((cba) ((o45) ((je7) a8gVar.c).getValue())).c(new HandledException("Can't load emoji font", th), true);
                        tu0Var2.v(th);
                        break;
                }
            }
        }, ft.d);
        r0aVarN.a(sd7Var);
        this.o = sd7Var;
    }

    @Override // defpackage.hk8
    public void b(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var) {
        if (m(i, xj8Var)) {
            ((gk8) this.b).e(xn7Var, pc8Var);
        }
    }

    public n90 c() {
        String strG = ((Integer) this.a) == null ? " audioSource" : "";
        if (((Integer) this.b) == null) {
            strG = strG.concat(" sampleRate");
        }
        if (((Integer) this.c) == null) {
            strG = au1.g(strG, " channelCount");
        }
        if (((Integer) this.o) == null) {
            strG = au1.g(strG, " audioFormat");
        }
        if (!strG.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }
        int iIntValue = ((Integer) this.a).intValue();
        int iIntValue2 = ((Integer) this.b).intValue();
        int iIntValue3 = ((Integer) this.c).intValue();
        int iIntValue4 = ((Integer) this.o).intValue();
        n90 n90Var = new n90(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        String strG2 = iIntValue == -1 ? " audioSource" : "";
        if (iIntValue2 <= 0) {
            strG2 = strG2.concat(" sampleRate");
        }
        if (iIntValue3 <= 0) {
            strG2 = au1.g(strG2, " channelCount");
        }
        if (iIntValue4 == -1) {
            strG2 = au1.g(strG2, " audioFormat");
        }
        if (strG2.isEmpty()) {
            return n90Var;
        }
        throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strG2));
    }

    public synchronized void d() {
        try {
            Iterator it = ((ArrayDeque) this.b).iterator();
            while (it.hasNext()) {
                ((z7c) it.next()).c.d();
            }
            Iterator it2 = ((ArrayDeque) this.c).iterator();
            while (it2.hasNext()) {
                ((z7c) it2.next()).c.d();
            }
            Iterator it3 = ((ArrayDeque) this.o).iterator();
            while (it3.hasNext()) {
                ((b8c) it3.next()).d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ik8
    public void e(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var, IOException iOException, boolean z) {
        if (o(i, yj8Var)) {
            ((jn) this.b).D(yn7Var, p(pc8Var, yj8Var), iOException, z);
        }
    }

    public void f(String str) {
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        ktf ktfVar = (ktf) this.c;
        q36 q36VarF = ktfVar.f();
        if (str == null) {
            q36VarF.W(1);
        } else {
            q36VarF.f(1, str);
        }
        ilcVar.c();
        try {
            q36VarF.n();
            ilcVar.r();
        } finally {
            ilcVar.l();
            ktfVar.t(q36VarF);
        }
    }

    @Override // defpackage.mr4
    public void g(int i, xj8 xj8Var, Exception exc) {
        if (m(i, xj8Var)) {
            ((kr4) this.c).e(exc);
        }
    }

    public synchronized ExecutorService h() {
        try {
            if (((ExecutorService) this.a) == null) {
                this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new je3(naf.g + " Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExecutorService) this.a;
    }

    public void i(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        q();
    }

    public void j(z7c z7cVar) {
        z7cVar.a.decrementAndGet();
        i((ArrayDeque) this.c, z7cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        k(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r6, java.lang.String r7) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "nativeLoad() returned error for "
            java.lang.Object r1 = r5.b
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto Lc
            java.lang.System.load(r7)
            return
        Lc:
            r1 = 4
            r6 = r6 & r1
            if (r6 != r1) goto L15
            java.lang.Object r6 = r5.c
        L12:
            java.lang.String r6 = (java.lang.String) r6
            goto L18
        L15:
            java.lang.Object r6 = r5.o
            goto L12
        L18:
            r1 = 0
            java.lang.Object r2 = r5.a     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L64
            java.lang.Runtime r2 = (java.lang.Runtime) r2     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L64
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L64
            java.lang.Object r3 = r5.b     // Catch: java.lang.Throwable -> L5e
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r5 = r5.a     // Catch: java.lang.Throwable -> L5e
            java.lang.Runtime r5 = (java.lang.Runtime) r5     // Catch: java.lang.Throwable -> L5e
            java.lang.Class<com.facebook.soloader.SoLoader> r4 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r6 = new java.lang.Object[]{r7, r4, r6}     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = r3.invoke(r5, r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L42
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L3e
            k(r7)
        L3e:
            return
        L3f:
            r6 = move-exception
            r1 = r5
            goto L60
        L42:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L3f
            r6.append(r7)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = ": "
            r6.append(r0)     // Catch: java.lang.Throwable -> L3f
            r6.append(r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L3f
            mud r5 = new mud     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r7, r1)     // Catch: java.lang.Throwable -> L5c
            throw r5     // Catch: java.lang.Throwable -> L5c
        L5c:
            r6 = move-exception
            goto L60
        L5e:
            r5 = move-exception
            r6 = r5
        L60:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5c
            throw r6     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L64 java.lang.Throwable -> L64 java.lang.Throwable -> L64
        L62:
            r5 = move-exception
            goto L83
        L64:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = "nativeLoad() error during invocation for "
            r5.append(r6)     // Catch: java.lang.Throwable -> L62
            r5.append(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = ": "
            r5.append(r6)     // Catch: java.lang.Throwable -> L62
            r5.append(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L62
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L62
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L62
            throw r5     // Catch: java.lang.Throwable -> L62
        L83:
            if (r1 == 0) goto L88
            k(r7)
        L88:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8g.l(int, java.lang.String):void");
    }

    public boolean m(int i, xj8 xj8Var) {
        sk8 sk8Var = (sk8) this.a;
        xj8 xj8VarB = null;
        if (xj8Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= sk8Var.c.size()) {
                    break;
                }
                if (((xj8) sk8Var.c.get(i2)).d == xj8Var.d) {
                    xj8VarB = xj8Var.b(Pair.create(sk8Var.b, xj8Var.a));
                    break;
                }
                i2++;
            }
            if (xj8VarB == null) {
                return false;
            }
        }
        int i3 = i + sk8Var.d;
        gk8 gk8Var = (gk8) this.b;
        int i4 = gk8Var.b;
        vk8 vk8Var = (vk8) this.o;
        if (i4 != i3 || !maf.a((xj8) gk8Var.c, xj8VarB)) {
            this.b = new gk8((CopyOnWriteArrayList) ((gk8) vk8Var.j).d, i3, xj8VarB, 0L);
        }
        kr4 kr4Var = (kr4) this.c;
        if (kr4Var.a == i3 && maf.a(kr4Var.b, xj8VarB)) {
            return true;
        }
        this.c = new kr4(((kr4) vk8Var.k).c, i3, xj8VarB);
        return true;
    }

    public boolean o(int i, yj8 yj8Var) {
        yj8 yj8VarU;
        Object obj = this.a;
        pc3 pc3Var = (pc3) this.o;
        if (yj8Var != null) {
            yj8VarU = pc3Var.u(obj, yj8Var);
            if (yj8VarU == null) {
                return false;
            }
        } else {
            yj8VarU = null;
        }
        int iW = pc3Var.w(i, obj);
        jn jnVar = (jn) this.b;
        if (jnVar.b != iW || !oaf.a((yj8) jnVar.c, yj8VarU)) {
            this.b = new jn((CopyOnWriteArrayList) pc3Var.c.o, iW, yj8VarU);
        }
        lr4 lr4Var = (lr4) this.c;
        if (lr4Var.a == iW && oaf.a(lr4Var.b, yj8VarU)) {
            return true;
        }
        this.c = new lr4(pc3Var.d.c, iW, yj8VarU);
        return true;
    }

    public pc8 p(pc8 pc8Var, yj8 yj8Var) {
        pc3 pc3Var = (pc3) this.o;
        Object obj = this.a;
        long j = pc8Var.e;
        long jV = pc3Var.v(j, obj);
        long j2 = pc8Var.f;
        long jV2 = pc3Var.v(j2, obj);
        if (jV == j && jV2 == j2) {
            return pc8Var;
        }
        return new pc8(pc8Var.a, pc8Var.b, (qy5) pc8Var.g, pc8Var.c, pc8Var.d, jV, jV2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            r8 = this;
            byte[] r0 = defpackage.naf.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L46
        L10:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L46
            z7c r2 = (defpackage.z7c) r2     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r8.c     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L46
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L46
            r4 = 64
            if (r3 < r4) goto L29
            goto L48
        L29:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.a     // Catch: java.lang.Throwable -> L46
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L46
            r4 = 5
            if (r3 < r4) goto L33
            goto L10
        L33:
            r1.remove()     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.atomic.AtomicInteger r3 = r2.a     // Catch: java.lang.Throwable -> L46
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L46
            r0.add(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r8.c     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L46
            r3.add(r2)     // Catch: java.lang.Throwable -> L46
            goto L10
        L46:
            r0 = move-exception
            goto La1
        L48:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r1 = r8.c     // Catch: java.lang.Throwable -> L9e
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L9e
            r1.size()     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r8.o     // Catch: java.lang.Throwable -> L9e
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L9e
            r1.size()     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L5e:
            if (r2 >= r1) goto L9d
            java.lang.Object r3 = r0.get(r2)
            z7c r3 = (defpackage.z7c) r3
            java.util.concurrent.ExecutorService r4 = r8.h()
            b8c r5 = r3.c
            u2a r6 = r5.A0
            a8g r6 = r6.a
            byte[] r6 = defpackage.naf.a
            r4.execute(r3)     // Catch: java.lang.Throwable -> L76 java.util.concurrent.RejectedExecutionException -> L78
            goto L92
        L76:
            r8 = move-exception
            goto L95
        L78:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L76
            r6.initCause(r4)     // Catch: java.lang.Throwable -> L76
            r5.j(r6)     // Catch: java.lang.Throwable -> L76
            gq1 r4 = r3.b     // Catch: java.lang.Throwable -> L76
            r4.q(r5, r6)     // Catch: java.lang.Throwable -> L76
            u2a r4 = r5.A0
            a8g r4 = r4.a
            r4.j(r3)
        L92:
            int r2 = r2 + 1
            goto L5e
        L95:
            u2a r0 = r5.A0
            a8g r0 = r0.a
            r0.j(r3)
            throw r8
        L9d:
            return
        L9e:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9e
            throw r0     // Catch: java.lang.Throwable -> L46
        La1:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8g.q():void");
    }

    @Override // defpackage.ik8
    public void r(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var) {
        if (o(i, yj8Var)) {
            ((jn) this.b).y(yn7Var, p(pc8Var, yj8Var));
        }
    }

    @Override // defpackage.nr4
    public void s(int i, yj8 yj8Var, Exception exc) {
        if (o(i, yj8Var)) {
            ((lr4) this.c).e(exc);
        }
    }

    @Override // defpackage.ik8
    public void t(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var) {
        if (o(i, yj8Var)) {
            ((jn) this.b).A(yn7Var, p(pc8Var, yj8Var));
        }
    }

    @Override // defpackage.hk8
    public void u(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var, IOException iOException, boolean z) {
        if (m(i, xj8Var)) {
            ((gk8) this.b).j(xn7Var, pc8Var, iOException, z);
        }
    }

    @Override // defpackage.mr4
    public void v(int i, xj8 xj8Var) {
        if (m(i, xj8Var)) {
            ((kr4) this.c).a();
        }
    }

    @Override // defpackage.nr4
    public void w(int i, yj8 yj8Var, int i2) {
        if (o(i, yj8Var)) {
            ((lr4) this.c).d(i2);
        }
    }

    @Override // defpackage.ik8
    public void x(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var) {
        if (o(i, yj8Var)) {
            ((jn) this.b).G(yn7Var, p(pc8Var, yj8Var));
        }
    }

    @Override // defpackage.mr4
    public void y(int i, xj8 xj8Var, int i2) {
        if (m(i, xj8Var)) {
            ((kr4) this.c).d(i2);
        }
    }

    @Override // defpackage.nr4
    public void z(int i, yj8 yj8Var) {
        if (o(i, yj8Var)) {
            ((lr4) this.c).c();
        }
    }

    public a8g(int i) {
        switch (i) {
            case 7:
                this.b = new ArrayDeque();
                this.c = new ArrayDeque();
                this.o = new ArrayDeque();
                break;
            case 10:
                this.a = new wpa();
                this.b = new wpa();
                this.c = new nua(1);
                break;
            case 13:
                this.a = Runtime.getRuntime();
                Method nativeLoadRuntimeMethod = mhe.getNativeLoadRuntimeMethod();
                this.b = nativeLoadRuntimeMethod;
                String strJoin = null;
                String classLoaderLdLoadLibrary = nativeLoadRuntimeMethod != null ? mhe.getClassLoaderLdLoadLibrary() : null;
                this.c = classLoaderLdLoadLibrary;
                if (classLoaderLdLoadLibrary != null) {
                    String[] strArrSplit = classLoaderLdLoadLibrary.split(":");
                    ArrayList arrayList = new ArrayList(strArrSplit.length);
                    for (String str : strArrSplit) {
                        if (!str.contains("!")) {
                            arrayList.add(str);
                        }
                    }
                    strJoin = TextUtils.join(":", arrayList);
                }
                this.o = strJoin;
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                this.a = new us();
                this.b = new SparseArray();
                this.c = new wv7();
                this.o = new us();
                break;
            default:
                this.a = tu0.r(3, new m52(15));
                this.b = tu0.r(3, new m52(16));
                this.c = tu0.r(3, new m52(17));
                this.o = tu0.r(3, new m52(18));
                break;
        }
    }

    public a8g(m5d m5dVar) {
        ArrayList arrayList;
        GifImage gifImage = (GifImage) m5dVar.c;
        gifImage.getClass();
        this.a = gifImage;
        this.c = o43.o((o43) m5dVar.o);
        ArrayList arrayList2 = (ArrayList) m5dVar.X;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(o43.o((o43) it.next()));
            }
            arrayList = arrayList3;
        }
        this.o = arrayList;
        this.b = (String) m5dVar.b;
    }

    public a8g(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.o = null;
    }
}
