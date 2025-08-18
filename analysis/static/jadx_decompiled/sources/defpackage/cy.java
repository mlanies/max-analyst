package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class cy extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ cy() {
        this.a = 6;
    }

    private final void a(Message message) {
        Set set;
        Set set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            x94 x94Var = (x94) this.b;
            if (obj == x94Var.y) {
                if (x94Var.p == 2 || x94Var.i()) {
                    x94Var.y = null;
                    boolean z = obj2 instanceof Exception;
                    imc imcVar = x94Var.c;
                    if (z) {
                        imcVar.X((Exception) obj2, false);
                        return;
                    }
                    try {
                        x94Var.b.m((byte[]) obj2);
                        imcVar.c = null;
                        HashSet hashSet = (HashSet) imcVar.b;
                        zw6 zw6VarJ = zw6.j(hashSet);
                        hashSet.clear();
                        ls5 ls5VarListIterator = zw6VarJ.listIterator(0);
                        while (ls5VarListIterator.hasNext()) {
                            x94 x94Var2 = (x94) ls5VarListIterator.next();
                            if (x94Var2.l()) {
                                x94Var2.h(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        imcVar.X(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        x94 x94Var3 = (x94) this.b;
        if (obj == x94Var3.x && x94Var3.i()) {
            x94Var3.x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                x94Var3.k((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (x94Var3.e == 3) {
                    t65 t65Var = x94Var3.b;
                    byte[] bArr2 = x94Var3.w;
                    int i2 = oaf.a;
                    t65Var.l(bArr2, bArr);
                    ex3 ex3Var = x94Var3.i;
                    synchronized (ex3Var.b) {
                        set2 = ex3Var.o;
                    }
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        ((lr4) it.next()).b();
                    }
                    return;
                }
                byte[] bArrL = x94Var3.b.l(x94Var3.v, bArr);
                int i3 = x94Var3.e;
                if ((i3 == 2 || (i3 == 0 && x94Var3.w != null)) && bArrL != null && bArrL.length != 0) {
                    x94Var3.w = bArrL;
                }
                x94Var3.p = 4;
                ex3 ex3Var2 = x94Var3.i;
                synchronized (ex3Var2.b) {
                    set = ex3Var2.o;
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((lr4) it2.next()).a();
                }
            } catch (Exception | NoSuchMethodError e2) {
                x94Var3.k(e2, true);
            }
        }
    }

    private final void b(Message message) {
        Set set;
        Set set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 0) {
            w94 w94Var = (w94) this.b;
            if (obj == w94Var.x) {
                if (w94Var.o == 2 || w94Var.i()) {
                    w94Var.x = null;
                    boolean z = obj2 instanceof Exception;
                    h7b h7bVar = w94Var.c;
                    if (z) {
                        h7bVar.s((Exception) obj2, false);
                        return;
                    }
                    try {
                        w94Var.b.m((byte[]) obj2);
                        h7bVar.c = null;
                        HashSet hashSet = (HashSet) h7bVar.b;
                        zw6 zw6VarJ = zw6.j(hashSet);
                        hashSet.clear();
                        ls5 ls5VarListIterator = zw6VarJ.listIterator(0);
                        while (ls5VarListIterator.hasNext()) {
                            w94 w94Var2 = (w94) ls5VarListIterator.next();
                            if (w94Var2.l()) {
                                w94Var2.h(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        h7bVar.s(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        w94 w94Var3 = (w94) this.b;
        if (obj == w94Var3.w && w94Var3.i()) {
            w94Var3.w = null;
            if (obj2 instanceof Exception) {
                w94Var3.k((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (w94Var3.e == 3) {
                    s65 s65Var = w94Var3.b;
                    byte[] bArr2 = w94Var3.v;
                    int i2 = maf.a;
                    s65Var.l(bArr2, bArr);
                    ex3 ex3Var = w94Var3.i;
                    synchronized (ex3Var.b) {
                        set2 = ex3Var.o;
                    }
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        ((kr4) it.next()).b();
                    }
                    return;
                }
                byte[] bArrL = w94Var3.b.l(w94Var3.u, bArr);
                int i3 = w94Var3.e;
                if ((i3 == 2 || (i3 == 0 && w94Var3.v != null)) && bArrL != null && bArrL.length != 0) {
                    w94Var3.v = bArrL;
                }
                w94Var3.o = 4;
                ex3 ex3Var2 = w94Var3.i;
                synchronized (ex3Var2.b) {
                    set = ex3Var2.o;
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((kr4) it2.next()).a();
                }
                return;
            } catch (Exception e2) {
                w94Var3.k(e2, true);
            }
            w94Var3.k(e2, true);
        }
    }

    private final void c(Message message) {
        th8 th8Var;
        t68 t68Var;
        cy cyVar;
        if (message.what == 1) {
            synchronized (((t68) this.b).a) {
                th8Var = (th8) ((WeakReference) ((t68) this.b).c).get();
                t68Var = (t68) this.b;
                cyVar = (cy) t68Var.d;
            }
            if (th8Var == null || t68Var != th8Var.getCallback() || cyVar == null) {
                return;
            }
            th8Var.a((vi8) message.obj);
            ((t68) this.b).getClass();
            th8Var.a(null);
        }
    }

    public void d(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0407 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ey] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [ey] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r21) throws android.media.MediaCodec.CryptoException {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy.handleMessage(android.os.Message):void");
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.a) {
            case 6:
                Bundle data = message.getData();
                ClassLoader classLoader = q68.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    public /* synthetic */ cy(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(gf8 gf8Var) {
        super(Looper.getMainLooper());
        this.a = 7;
        this.b = gf8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(Looper looper, m5d m5dVar) {
        super(looper);
        this.a = 13;
        this.b = m5dVar;
    }
}
