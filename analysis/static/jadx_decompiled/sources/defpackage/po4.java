package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class po4 extends Handler {
    public final HandlerThread a;
    public final d9g b;
    public final ap4 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    public po4(HandlerThread handlerThread, q94 q94Var, r94 r94Var, Handler handler, boolean z) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = q94Var;
        this.c = r94Var;
        this.d = handler;
        this.i = 3;
        this.j = 5;
        this.h = z;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public static dn4 a(dn4 dn4Var, int i, int i2) {
        return new dn4(dn4Var.a, i, dn4Var.c, System.currentTimeMillis(), dn4Var.e, i2, 0, dn4Var.h);
    }

    public final dn4 b(String str, boolean z) {
        int iC = c(str);
        if (iC != -1) {
            return (dn4) this.e.get(iC);
        }
        if (!z) {
            return null;
        }
        try {
            return ((q94) this.b).d(str);
        } catch (IOException e) {
            z04.v("Failed to load download: " + str, e);
            return null;
        }
    }

    public final int c(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((dn4) arrayList.get(i)).a.a.equals(str)) {
                return i;
            }
            i++;
        }
    }

    public final void d(dn4 dn4Var) {
        int i = dn4Var.b;
        fm9.k((i == 3 || i == 4) ? false : true);
        int iC = c(dn4Var.a.a);
        ArrayList arrayList = this.e;
        if (iC == -1) {
            arrayList.add(dn4Var);
            Collections.sort(arrayList, new ye4(2));
        } else {
            boolean z = dn4Var.c != ((dn4) arrayList.get(iC)).c;
            arrayList.set(iC, dn4Var);
            if (z) {
                Collections.sort(arrayList, new ye4(2));
            }
        }
        try {
            ((q94) this.b).i(dn4Var);
        } catch (IOException e) {
            z04.v("Failed to update index.", e);
        }
        this.d.obtainMessage(3, new oo4(dn4Var, false, new ArrayList(arrayList), null)).sendToTarget();
    }

    public final dn4 e(dn4 dn4Var, int i, int i2) {
        fm9.k((i == 3 || i == 4) ? false : true);
        dn4 dn4VarA = a(dn4Var, i, i2);
        d(dn4VarA);
        return dn4VarA;
    }

    public final void f(dn4 dn4Var, int i) {
        if (i == 0) {
            if (dn4Var.b == 1) {
                e(dn4Var, 0, 0);
            }
        } else if (i != dn4Var.f) {
            int i2 = dn4Var.b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            d(new dn4(dn4Var.a, i2, dn4Var.c, System.currentTimeMillis(), dn4Var.e, i, 0, dn4Var.h));
        }
    }

    public final void g() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return;
            }
            dn4 dn4Var = (dn4) arrayList.get(i);
            HashMap map = this.f;
            ro4 ro4Var = (ro4) map.get(dn4Var.a.a);
            ap4 ap4Var = this.c;
            int i3 = dn4Var.b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        ro4Var.getClass();
                        fm9.k(!ro4Var.o);
                        if (this.h || this.g != 0 || i2 >= this.i) {
                            e(dn4Var, 0, 0);
                            ro4Var.a(false);
                        }
                    } else {
                        if (i3 != 5 && i3 != 7) {
                            throw new IllegalStateException();
                        }
                        if (ro4Var != null) {
                            if (!ro4Var.o) {
                                ro4Var.a(false);
                            }
                        } else if (!this.l) {
                            vo4 vo4Var = dn4Var.a;
                            ro4 ro4Var2 = new ro4(dn4Var.a, ((r94) ap4Var).a(vo4Var), dn4Var.h, true, this.j, this);
                            map.put(vo4Var.a, ro4Var2);
                            this.l = true;
                            ro4Var2.start();
                        }
                    }
                } else if (ro4Var != null) {
                    fm9.k(!ro4Var.o);
                    ro4Var.a(false);
                }
            } else if (ro4Var != null) {
                fm9.k(!ro4Var.o);
                ro4Var.a(false);
            } else if (this.h || this.g != 0 || this.k >= this.i) {
                ro4Var = null;
            } else {
                dn4 dn4VarE = e(dn4Var, 2, 0);
                vo4 vo4Var2 = dn4VarE.a;
                ro4 ro4Var3 = new ro4(dn4VarE.a, ((r94) ap4Var).a(vo4Var2), dn4VarE.h, false, this.j, this);
                map.put(vo4Var2.a, ro4Var3);
                int i4 = this.k;
                this.k = i4 + 1;
                if (i4 == 0) {
                    sendEmptyMessageDelayed(12, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                }
                ro4Var3.start();
                ro4Var = ro4Var3;
            }
            if (ro4Var != null && !ro4Var.o) {
                i2++;
            }
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0328  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.String] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po4.handleMessage(android.os.Message):void");
    }
}
