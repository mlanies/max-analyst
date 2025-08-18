package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class woe implements xn0 {
    public static final char[] m = new char[0];
    public final /* synthetic */ int a = 1;
    public boolean b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public woe(String str, re6 re6Var, te teVar, u26 u26Var, boolean z) {
        this.h = re6Var;
        this.i = teVar;
        this.j = u26Var;
        this.b = z;
        this.c = str == null ? String.valueOf(hashCode()) : str;
        this.d = re6Var.s0();
        this.e = re6Var.o0();
        int iC = (int) ote.c(TimeUnit.SECONDS.toMillis(1L) / (((ue) re6Var.b).a / re6Var.x()), 1L);
        this.f = iC;
        this.g = iC;
        this.l = new v26(this);
    }

    public char[] a(int i) {
        mt0 mt0Var = (mt0) this.h;
        return mt0Var != null ? mt0Var.a(2, i) : new char[Math.max(i, 500)];
    }

    public jt b(int i, int i2) {
        boolean z = this.b;
        int i3 = this.e;
        int i4 = this.d;
        if (!z) {
            return new jt(i4, i3, 2);
        }
        if (i < i4 || i2 < i3) {
            double d = i4 / i3;
            if (i2 > i) {
                if (i2 > i3) {
                    i2 = i3;
                }
                i4 = (int) (i2 * d);
                i3 = i2;
            } else {
                if (i > i4) {
                    i = i4;
                }
                i3 = (int) (i / d);
                i4 = i;
            }
        }
        return new jt(i4, i3, 2);
    }

    public void c() {
        this.b = false;
        ((ArrayList) this.l).clear();
        this.f = 0;
        this.g = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] d() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.k
            char[] r0 = (char[]) r0
            if (r0 != 0) goto L67
            java.lang.String r0 = r7.c
            if (r0 == 0) goto Lf
            char[] r0 = r0.toCharArray()
            goto L65
        Lf:
            int r0 = r7.d
            char[] r1 = defpackage.woe.m
            r2 = 1
            if (r0 < 0) goto L31
            int r3 = r7.e
            if (r3 >= r2) goto L1c
        L1a:
            r0 = r1
            goto L65
        L1c:
            if (r0 != 0) goto L27
            java.lang.Object r0 = r7.i
            char[] r0 = (char[]) r0
            char[] r0 = java.util.Arrays.copyOf(r0, r3)
            goto L65
        L27:
            java.lang.Object r1 = r7.i
            char[] r1 = (char[]) r1
            int r3 = r3 + r0
            char[] r0 = java.util.Arrays.copyOfRange(r1, r0, r3)
            goto L65
        L31:
            int r0 = r7.t()
            if (r0 >= r2) goto L38
            goto L1a
        L38:
            char[] r0 = new char[r0]
            java.lang.Object r1 = r7.l
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r2 = 0
            if (r1 == 0) goto L5b
            int r1 = r1.size()
            r3 = r2
            r4 = r3
        L47:
            if (r3 >= r1) goto L5c
            java.lang.Object r5 = r7.l
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r3)
            char[] r5 = (char[]) r5
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r2, r0, r4, r6)
            int r4 = r4 + r6
            int r3 = r3 + 1
            goto L47
        L5b:
            r4 = r2
        L5c:
            java.lang.Object r1 = r7.j
            char[] r1 = (char[]) r1
            int r3 = r7.g
            java.lang.System.arraycopy(r1, r2, r0, r4, r3)
        L65:
            r7.k = r0
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.woe.d():char[]");
    }

    public BigDecimal e() {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = (char[]) this.k;
        if (cArr3 != null) {
            return cy9.a(cArr3, 0, cArr3.length);
        }
        int i = this.d;
        if (i >= 0 && (cArr2 = (char[]) this.i) != null) {
            return cy9.a(cArr2, i, this.e);
        }
        if (this.f == 0 && (cArr = (char[]) this.j) != null) {
            return cy9.a(cArr, 0, this.g);
        }
        char[] cArrD = d();
        String str = cy9.a;
        return cy9.a(cArrD, 0, cArrD.length);
    }

    public int f(boolean z) {
        char[] cArr;
        int i = this.d;
        return (i < 0 || (cArr = (char[]) this.i) == null) ? z ? -cy9.b((char[]) this.j, 1, this.g - 1) : cy9.b((char[]) this.j, 0, this.g) : z ? -cy9.b(cArr, i + 1, this.e - 1) : cy9.b(cArr, i, this.e);
    }

    public String g() {
        if (this.c == null) {
            char[] cArr = (char[]) this.k;
            if (cArr != null) {
                this.c = new String(cArr);
            } else {
                int i = this.d;
                if (i >= 0) {
                    int i2 = this.e;
                    if (i2 < 1) {
                        this.c = "";
                        return "";
                    }
                    this.c = new String((char[]) this.i, i, i2);
                } else {
                    int i3 = this.f;
                    int i4 = this.g;
                    if (i3 == 0) {
                        this.c = i4 != 0 ? new String((char[]) this.j, 0, i4) : "";
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList arrayList = (ArrayList) this.l;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = (char[]) ((ArrayList) this.l).get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append((char[]) this.j, 0, this.g);
                        this.c = sb.toString();
                    }
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.xn0
    public void h() {
        q();
        k();
    }

    @Override // defpackage.xn0
    public void i(l84 l84Var, wn0 wn0Var, vf vfVar, int i, k56 k56Var) {
    }

    @Override // defpackage.xn0
    public o43 j(int i, int i2, int i3) {
        y26 y26VarC;
        jt jtVarB = b(i2, i3);
        ht0 ht0VarQ = q();
        if (ht0VarQ != null) {
            int i4 = jtVarB.b;
            int i5 = jtVarB.c;
            Integer num = (Integer) ht0VarQ.k.get(Integer.valueOf(i));
            if (num != null) {
                int iIntValue = num.intValue();
                ht0VarQ.j = iIntValue;
                gt0 gt0Var = (gt0) ht0VarQ.f.get(num);
                if (gt0Var == null || gt0Var.b || !gt0Var.a.m0()) {
                    gt0Var = null;
                }
                if (gt0Var != null) {
                    fm5 fm5Var = ht0VarQ.i;
                    int i6 = ht0VarQ.g;
                    int iA = fm5Var.a(ht0VarQ.e + i6);
                    if (i6 >= iA ? !((i6 > iIntValue || iIntValue > fm5Var.b) && (iIntValue < 0 || iIntValue > iA)) : !(i6 > iIntValue || iIntValue > iA)) {
                        ht0VarQ.e(i4, i5);
                    }
                    y26VarC = new y26(1, gt0Var.a.clone());
                } else {
                    ht0VarQ.e(i4, i5);
                    y26VarC = ht0VarQ.c(iIntValue);
                }
            } else {
                y26VarC = ht0VarQ.c(i);
            }
        } else {
            y26VarC = null;
        }
        if (y26VarC != null) {
            AtomicInteger atomicInteger = yf.a;
            v26 v26Var = (v26) this.l;
            ConcurrentHashMap concurrentHashMap = yf.d;
            if (!concurrentHashMap.contains(v26Var)) {
                concurrentHashMap.put(v26Var, Integer.valueOf((int) (v26Var.a * 0.2f)));
            }
            int iS = au1.s(y26VarC.a);
            if (iS == 0) {
                yf.a.incrementAndGet();
            } else if (iS == 1) {
                yf.b.incrementAndGet();
            } else {
                if (iS != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                yf.c.incrementAndGet();
            }
        }
        if (y26VarC != null) {
            return y26VarC.b;
        }
        return null;
    }

    @Override // defpackage.xn0
    public void k() {
        ht0 ht0VarQ = q();
        if (ht0VarQ != null) {
            ConcurrentHashMap concurrentHashMap = u26.d;
            u26.d.put(this.c, new a6f(ht0VarQ, new Date()));
        }
        this.k = null;
    }

    @Override // defpackage.xn0
    public void l(int i, int i2) {
        if (i <= 0 || i2 <= 0 || this.d <= 0 || this.e <= 0) {
            return;
        }
        jt jtVarB = b(i, i2);
        ht0 ht0VarQ = q();
        if (ht0VarQ != null) {
            int i3 = jtVarB.b;
            ht0VarQ.e(i3, i3);
        }
    }

    public char[] m() {
        this.d = -1;
        this.g = 0;
        this.e = 0;
        this.i = null;
        this.c = null;
        this.k = null;
        if (this.b) {
            c();
        }
        char[] cArr = (char[]) this.j;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrA = a(0);
        this.j = cArrA;
        return cArrA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c A[PHI: r1
      0x002c: PHI (r1v9 int) = (r1v7 int), (r1v8 int) binds: [B:6:0x002a, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.l
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.l = r0
        Ld:
            java.lang.Object r0 = r3.j
            char[] r0 = (char[]) r0
            r1 = 1
            r3.b = r1
            java.lang.Object r1 = r3.l
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            int r1 = r3.f
            int r2 = r0.length
            int r1 = r1 + r2
            r3.f = r1
            r1 = 0
            r3.g = r1
            int r0 = r0.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L2e
        L2c:
            r0 = r1
            goto L33
        L2e:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L33
            goto L2c
        L33:
            char[] r0 = new char[r0]
            r3.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.woe.n():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f A[PHI: r1
      0x002f: PHI (r1v8 int) = (r1v6 int), (r1v7 int) binds: [B:6:0x002d, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] o() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.l
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.l = r0
        Ld:
            r0 = 1
            r2.b = r0
            java.lang.Object r0 = r2.l
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r2.j
            char[] r1 = (char[]) r1
            r0.add(r1)
            java.lang.Object r0 = r2.j
            char[] r0 = (char[]) r0
            int r0 = r0.length
            int r1 = r2.f
            int r1 = r1 + r0
            r2.f = r1
            r1 = 0
            r2.g = r1
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L31
        L2f:
            r0 = r1
            goto L36
        L31:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L36
            goto L2f
        L36:
            char[] r0 = new char[r0]
            r2.j = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.woe.o():char[]");
    }

    public char[] p() {
        if (this.d >= 0) {
            u(1);
        } else {
            char[] cArr = (char[]) this.j;
            if (cArr == null) {
                this.j = a(0);
            } else if (this.g >= cArr.length) {
                n();
            }
        }
        return (char[]) this.j;
    }

    public ht0 q() {
        ht0 ht0Var;
        if (((ht0) this.k) == null) {
            u26 u26Var = (u26) this.j;
            String str = this.c;
            te teVar = (te) this.i;
            gg ggVar = (gg) this.h;
            u26Var.getClass();
            ConcurrentHashMap concurrentHashMap = u26.d;
            synchronized (concurrentHashMap) {
                a6f a6fVar = (a6f) concurrentHashMap.get(str);
                if (a6fVar != null) {
                    concurrentHashMap.remove(str);
                    ht0Var = a6fVar.a;
                } else {
                    ht0Var = new ht0(u26Var.a, teVar, new fm5(u26Var.b, 6), ggVar, u26Var.c);
                }
            }
            this.k = ht0Var;
        }
        return (ht0) this.k;
    }

    public char[] r() {
        if (this.d >= 0) {
            return (char[]) this.i;
        }
        char[] cArr = (char[]) this.k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.c;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.k = charArray;
            return charArray;
        }
        if (this.b) {
            return d();
        }
        char[] cArr2 = (char[]) this.j;
        return cArr2 == null ? m : cArr2;
    }

    public void s(char[] cArr, int i, int i2) {
        this.c = null;
        this.k = null;
        this.i = cArr;
        this.d = i;
        this.e = i2;
        if (this.b) {
            c();
        }
    }

    public int t() {
        if (this.d >= 0) {
            return this.e;
        }
        char[] cArr = (char[]) this.k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.c;
        return str != null ? str.length() : this.f + this.g;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return g();
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        int i2 = this.e;
        this.e = 0;
        char[] cArr = (char[]) this.i;
        this.i = null;
        int i3 = this.d;
        this.d = -1;
        int i4 = i + i2;
        char[] cArr2 = (char[]) this.j;
        if (cArr2 == null || i4 > cArr2.length) {
            this.j = a(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, (char[]) this.j, 0, i2);
        }
        this.f = 0;
        this.g = i2;
    }

    public woe(mt0 mt0Var) {
        this.h = mt0Var;
    }
}
