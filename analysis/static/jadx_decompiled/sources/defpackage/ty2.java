package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.util.LangUtils;

/* loaded from: classes2.dex */
public final class ty2 implements o82, obe {
    public static final byte[] s0 = {0, 7, 8, 15};
    public static final byte[] t0 = {0, 119, -120, -1};
    public static final byte[] u0 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public static final void a(ty2 ty2Var) {
        SparseArray sparseArray = (SparseArray) ty2Var.X;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            c8e c8eVar = (c8e) sparseArray.valueAt(i);
            SparseArray sparseArray2 = (SparseArray) ty2Var.Y;
            c8eVar.getClass();
            List arrayList = (List) sparseArray2.get(0);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray2.put(0, arrayList);
            }
            arrayList.add(c8eVar);
        }
        sparseArray.clear();
        ((SparseArray) ty2Var.o).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable d(defpackage.ty2 r4, long r5, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof defpackage.ny2
            if (r0 == 0) goto L16
            r0 = r7
            ny2 r0 = (defpackage.ny2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            ny2 r0 = new ny2
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r5 = r0.X
            ty2 r4 = r0.o
            defpackage.od2.a0(r7)     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            goto L56
        L2e:
            r7 = move-exception
            goto L5a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r4.c     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            je7 r7 = (defpackage.je7) r7     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            java.lang.Object r7 = r7.getValue()     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            p82 r7 = (defpackage.p82) r7     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            iqd r7 = r7.y(r5)     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            r0.o = r4     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            r0.X = r5     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            r0.s0 = r3     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            java.lang.Object r7 = defpackage.s36.f(r7, r0)     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            if (r7 != r1) goto L56
            goto L71
        L56:
            e52 r7 = (defpackage.e52) r7     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            r1 = r7
            goto L71
        L5a:
            java.lang.Object r4 = r4.a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for chatId="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            defpackage.hm9.p(r4, r5, r7)
            r4 = 0
            r1 = r4
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty2.d(ty2, long, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable e(defpackage.ty2 r7, long r8, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.oy2
            if (r0 == 0) goto L16
            r0 = r10
            oy2 r0 = (defpackage.oy2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            oy2 r0 = new oy2
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r8 = r0.X
            ty2 r7 = r0.o
            defpackage.od2.a0(r10)     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            goto L6d
        L2e:
            r10 = move-exception
            goto L71
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r7.c     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            je7 r10 = (defpackage.je7) r10     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            java.lang.Object r10 = r10.getValue()     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            p82 r10 = (defpackage.p82) r10     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            pa3 r2 = r10.f()     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            c82 r4 = new c82     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            r5 = 1
            r4.<init>(r10, r8, r5)     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            q1a r5 = new q1a     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            r6 = 2
            r5.<init>(r6, r4)     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            ib3 r4 = new ib3     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            r4.<init>(r5, r2)     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            ztc r10 = r10.y     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            drd r10 = r4.m(r10)     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            r0.o = r7     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            r0.X = r8     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            r0.s0 = r3     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            java.lang.Object r10 = defpackage.s36.f(r10, r0)     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            if (r10 != r1) goto L6d
            goto L88
        L6d:
            e52 r10 = (defpackage.e52) r10     // Catch: ru.ok.tamtam.exception.ChatNotFoundException -> L2e
            r1 = r10
            goto L88
        L71:
            java.lang.Object r7 = r7.a
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for serverId="
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            defpackage.hm9.p(r7, r8, r10)
            r7 = 0
            r1 = r7
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty2.e(ty2, long, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public static byte[] f(int i, int i2, s02 s02Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) s02Var.i(i2);
        }
        return bArr;
    }

    public static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = i(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = i(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = i(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = i(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = i(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = i(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = i(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022b A[LOOP:3: B:87:0x017a->B:116:0x022b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty2.l(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static nt4 m(s02 s02Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int i8 = s02Var.i(8);
        s02Var.t(8);
        int i9 = 2;
        int i10 = i - 2;
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrG = g();
        int[] iArrH = h();
        while (i10 > 0) {
            int i12 = s02Var.i(i7);
            int i13 = s02Var.i(i7);
            int[] iArr2 = (i13 & 128) != 0 ? iArr : (i13 & 64) != 0 ? iArrG : iArrH;
            if ((i13 & 1) != 0) {
                i5 = s02Var.i(i7);
                i6 = s02Var.i(i7);
                i2 = s02Var.i(i7);
                i4 = s02Var.i(i7);
                i3 = i10 - 6;
            } else {
                int i14 = s02Var.i(6) << i9;
                int i15 = s02Var.i(4) << 4;
                i2 = s02Var.i(4) << 4;
                i3 = i10 - 4;
                i4 = s02Var.i(i9) << 6;
                i5 = i14;
                i6 = i15;
            }
            if (i5 == 0) {
                i6 = i11;
                i2 = i6;
                i4 = 255;
            }
            double d = i5;
            double d2 = i6 - 128;
            double d3 = i2 - 128;
            iArr2[i12] = i((byte) (255 - (i4 & 255)), oaf.j((int) ((1.402d * d2) + d), 0, 255), oaf.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), oaf.j((int) ((d3 * 1.772d) + d), 0, 255));
            i10 = i3;
            i11 = 0;
            i8 = i8;
            iArrH = iArrH;
            i7 = 8;
            i9 = 2;
        }
        return new nt4(i8, iArr, iArrG, iArrH);
    }

    public static qt4 o(s02 s02Var) {
        byte[] bArr;
        int i = s02Var.i(16);
        s02Var.t(4);
        int i2 = s02Var.i(2);
        boolean zH = s02Var.h();
        s02Var.t(1);
        byte[] bArr2 = oaf.f;
        if (i2 != 1) {
            if (i2 == 0) {
                int i3 = s02Var.i(16);
                int i4 = s02Var.i(16);
                if (i3 > 0) {
                    bArr2 = new byte[i3];
                    s02Var.l(i3, bArr2);
                }
                if (i4 > 0) {
                    bArr = new byte[i4];
                    s02Var.l(i4, bArr);
                }
            }
            return new qt4(i, zH, bArr2, bArr);
        }
        s02Var.t(s02Var.i(8) * 16);
        bArr = bArr2;
        return new qt4(i, zH, bArr2, bArr);
    }

    @Override // defpackage.obe
    public void G(byte[] bArr, int i, int i2, nbe nbeVar, pj3 pj3Var) {
        yt4 yt4Var;
        b04 b04Var;
        int i3;
        char c;
        char c2;
        int i4;
        ot4 ot4Var;
        ArrayList arrayList;
        int i5;
        yt4 yt4Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        vt4 vt4Var;
        vt4 vt4Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        int i16 = 0;
        s02 s02Var = new s02(bArr, i + i2, 2, (byte) 0);
        s02Var.q(i);
        while (true) {
            int iB = s02Var.b();
            yt4Var = (yt4) this.Y;
            if (iB >= 48 && s02Var.i(i15) == 15) {
                int i17 = s02Var.i(i15);
                int i18 = 16;
                int i19 = s02Var.i(16);
                int i20 = s02Var.i(16);
                int iF = s02Var.f() + i20;
                if (i20 * 8 > s02Var.b()) {
                    z04.c0("Data field length exceeds limit");
                    s02Var.t(s02Var.b());
                } else {
                    switch (i17) {
                        case 16:
                            if (i19 == yt4Var.a) {
                                rt4 rt4Var = (rt4) yt4Var.i;
                                s02Var.i(i15);
                                int i21 = s02Var.i(4);
                                int i22 = s02Var.i(2);
                                s02Var.t(2);
                                int i23 = i20 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i23 > 0) {
                                    int i24 = s02Var.i(i15);
                                    s02Var.t(i15);
                                    i23 -= 6;
                                    sparseArray.put(i24, new tt4(s02Var.i(16), s02Var.i(16)));
                                    i15 = 8;
                                }
                                rt4 rt4Var2 = new rt4(i21, i22, sparseArray);
                                if (i22 == 0) {
                                    if (rt4Var != null && rt4Var.a != i21) {
                                        yt4Var.i = rt4Var2;
                                        break;
                                    }
                                } else {
                                    yt4Var.i = rt4Var2;
                                    yt4Var.c.clear();
                                    yt4Var.d.clear();
                                    yt4Var.e.clear();
                                    break;
                                }
                            }
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            rt4 rt4Var3 = (rt4) yt4Var.i;
                            if (i19 == yt4Var.a && rt4Var3 != null) {
                                int i25 = s02Var.i(i15);
                                s02Var.t(4);
                                boolean zH = s02Var.h();
                                s02Var.t(3);
                                int i26 = s02Var.i(16);
                                int i27 = s02Var.i(16);
                                s02Var.i(3);
                                int i28 = s02Var.i(3);
                                s02Var.t(2);
                                int i29 = s02Var.i(i15);
                                int i30 = s02Var.i(i15);
                                int i31 = s02Var.i(4);
                                int i32 = s02Var.i(2);
                                s02Var.t(2);
                                int i33 = i20 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i33 > 0) {
                                    int i34 = s02Var.i(i18);
                                    int i35 = s02Var.i(2);
                                    s02Var.i(2);
                                    int i36 = s02Var.i(12);
                                    s02Var.t(4);
                                    int i37 = s02Var.i(12);
                                    int i38 = i33 - 6;
                                    if (i35 == 1 || i35 == 2) {
                                        s02Var.i(i15);
                                        s02Var.i(i15);
                                        i33 -= 8;
                                    } else {
                                        i33 = i38;
                                    }
                                    sparseArray2.put(i34, new xt4(i36, i37));
                                    i18 = 16;
                                }
                                vt4 vt4Var3 = new vt4(i25, zH, i26, i27, i28, i29, i30, i31, i32, sparseArray2);
                                SparseArray sparseArray3 = yt4Var.c;
                                if (rt4Var3.b == 0 && (vt4Var2 = (vt4) sparseArray3.get(i25)) != null) {
                                    int i39 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = vt4Var2.j;
                                        if (i39 < sparseArray4.size()) {
                                            vt4Var3.j.put(sparseArray4.keyAt(i39), (xt4) sparseArray4.valueAt(i39));
                                            i39++;
                                        }
                                    }
                                }
                                sparseArray3.put(vt4Var3.a, vt4Var3);
                                break;
                            }
                            break;
                        case 18:
                            if (i19 != yt4Var.a) {
                                if (i19 == yt4Var.b) {
                                    nt4 nt4VarM = m(s02Var, i20);
                                    yt4Var.f.put(nt4VarM.a, nt4VarM);
                                    break;
                                }
                            } else {
                                nt4 nt4VarM2 = m(s02Var, i20);
                                yt4Var.d.put(nt4VarM2.a, nt4VarM2);
                                break;
                            }
                            break;
                        case 19:
                            if (i19 != yt4Var.a) {
                                if (i19 == yt4Var.b) {
                                    qt4 qt4VarO = o(s02Var);
                                    yt4Var.g.put(qt4VarO.a, qt4VarO);
                                    break;
                                }
                            } else {
                                qt4 qt4VarO2 = o(s02Var);
                                yt4Var.e.put(qt4VarO2.a, qt4VarO2);
                                break;
                            }
                            break;
                        case 20:
                            if (i19 == yt4Var.a) {
                                s02Var.t(4);
                                boolean zH2 = s02Var.h();
                                s02Var.t(3);
                                int i40 = s02Var.i(16);
                                int i41 = s02Var.i(16);
                                if (zH2) {
                                    int i42 = s02Var.i(16);
                                    int i43 = s02Var.i(16);
                                    int i44 = s02Var.i(16);
                                    i11 = i42;
                                    i14 = s02Var.i(16);
                                    i13 = i43;
                                    i12 = i44;
                                } else {
                                    i11 = i16;
                                    i12 = i11;
                                    i13 = i40;
                                    i14 = i41;
                                }
                                yt4Var.h = new ot4(i40, i41, i11, i13, i12, i14);
                                break;
                            }
                            break;
                    }
                    s02Var.u(iF - s02Var.f());
                }
                i15 = 8;
                i16 = 0;
            }
        }
        rt4 rt4Var4 = (rt4) yt4Var.i;
        if (rt4Var4 == null) {
            ls5 ls5Var = zw6.b;
            b04Var = new b04(-9223372036854775807L, -9223372036854775807L, ffc.X);
        } else {
            ot4 ot4Var2 = (ot4) yt4Var.h;
            if (ot4Var2 == null) {
                ot4Var2 = (ot4) this.o;
            }
            Bitmap bitmap = (Bitmap) this.Z;
            Canvas canvas = (Canvas) this.c;
            if (bitmap == null || ot4Var2.a + 1 != bitmap.getWidth() || ot4Var2.b + 1 != ((Bitmap) this.Z).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ot4Var2.a + 1, ot4Var2.b + 1, Bitmap.Config.ARGB_8888);
                this.Z = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i45 = 0;
            while (true) {
                SparseArray sparseArray5 = rt4Var4.c;
                if (i45 < sparseArray5.size()) {
                    canvas.save();
                    tt4 tt4Var = (tt4) sparseArray5.valueAt(i45);
                    vt4 vt4Var4 = (vt4) yt4Var.c.get(sparseArray5.keyAt(i45));
                    int i46 = tt4Var.a + ot4Var2.c;
                    int i47 = tt4Var.b + ot4Var2.e;
                    int iMin = Math.min(vt4Var4.c + i46, ot4Var2.d);
                    int i48 = vt4Var4.d;
                    int i49 = i47 + i48;
                    canvas.clipRect(i46, i47, iMin, Math.min(i49, ot4Var2.f));
                    SparseArray sparseArray6 = yt4Var.d;
                    int i50 = vt4Var4.f;
                    nt4 nt4Var = (nt4) sparseArray6.get(i50);
                    if (nt4Var == null && (nt4Var = (nt4) yt4Var.f.get(i50)) == null) {
                        nt4Var = (nt4) this.X;
                    }
                    int i51 = 0;
                    while (true) {
                        SparseArray sparseArray7 = vt4Var4.j;
                        if (i51 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i51);
                            xt4 xt4Var = (xt4) sparseArray7.valueAt(i51);
                            rt4 rt4Var5 = rt4Var4;
                            qt4 qt4Var = (qt4) yt4Var.e.get(iKeyAt);
                            if (qt4Var == null) {
                                qt4Var = (qt4) yt4Var.g.get(iKeyAt);
                            }
                            if (qt4Var != null) {
                                Paint paint = qt4Var.b ? null : (Paint) this.a;
                                yt4Var2 = yt4Var;
                                int i52 = xt4Var.a + i46;
                                int i53 = xt4Var.b + i47;
                                i5 = i45;
                                int i54 = vt4Var4.e;
                                int i55 = i51;
                                int[] iArr = i54 == 3 ? nt4Var.d : i54 == 2 ? nt4Var.c : nt4Var.b;
                                i6 = i55;
                                arrayList = arrayList2;
                                ot4Var = ot4Var2;
                                i8 = i48;
                                i7 = i49;
                                i10 = i46;
                                i9 = i47;
                                vt4Var = vt4Var4;
                                Paint paint2 = paint;
                                l(qt4Var.c, iArr, i54, i52, i53, paint2, canvas);
                                l(qt4Var.d, iArr, i54, i52, i53 + 1, paint2, canvas);
                            } else {
                                ot4Var = ot4Var2;
                                arrayList = arrayList2;
                                i5 = i45;
                                yt4Var2 = yt4Var;
                                i6 = i51;
                                i7 = i49;
                                i8 = i48;
                                i9 = i47;
                                i10 = i46;
                                vt4Var = vt4Var4;
                            }
                            i51 = i6 + 1;
                            rt4Var4 = rt4Var5;
                            vt4Var4 = vt4Var;
                            i46 = i10;
                            yt4Var = yt4Var2;
                            i45 = i5;
                            arrayList2 = arrayList;
                            ot4Var2 = ot4Var;
                            i48 = i8;
                            i49 = i7;
                            i47 = i9;
                        } else {
                            rt4 rt4Var6 = rt4Var4;
                            ot4 ot4Var3 = ot4Var2;
                            ArrayList arrayList3 = arrayList2;
                            int i56 = i45;
                            yt4 yt4Var3 = yt4Var;
                            int i57 = i49;
                            int i58 = i48;
                            int i59 = i47;
                            int i60 = i46;
                            vt4 vt4Var5 = vt4Var4;
                            boolean z = vt4Var5.b;
                            int i61 = vt4Var5.c;
                            if (z) {
                                int i62 = vt4Var5.e;
                                c = 3;
                                if (i62 == 3) {
                                    i4 = nt4Var.d[vt4Var5.g];
                                    c2 = 2;
                                } else {
                                    c2 = 2;
                                    i4 = i62 == 2 ? nt4Var.c[vt4Var5.h] : nt4Var.b[vt4Var5.i];
                                }
                                Paint paint3 = (Paint) this.b;
                                paint3.setColor(i4);
                                i3 = i59;
                                canvas.drawRect(i60, i3, i60 + i61, i57, paint3);
                            } else {
                                i3 = i59;
                                c = 3;
                                c2 = 2;
                            }
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.Z, i60, i3, i61, i58);
                            float f = ot4Var3.a;
                            float f2 = ot4Var3.b;
                            arrayList3.add(new yz3(null, null, null, bitmapCreateBitmap2, i3 / f2, 0, 0, i60 / f, 0, Integer.MIN_VALUE, -3.4028235E38f, i61 / f, i58 / f2, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            yt4Var = yt4Var3;
                            rt4Var4 = rt4Var6;
                            arrayList2 = arrayList3;
                            ot4Var2 = ot4Var3;
                            i45 = i56 + 1;
                        }
                    }
                } else {
                    b04Var = new b04(-9223372036854775807L, -9223372036854775807L, arrayList2);
                }
            }
        }
        pj3Var.accept(b04Var);
    }

    @Override // defpackage.obe
    public int J() {
        return 2;
    }

    @Override // defpackage.o82
    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ti9 ti9Var = (ti9) ((ConcurrentHashMap) this.Y).remove(Long.valueOf(((Number) it.next()).longValue()));
            if (ti9Var != null) {
                e52 e52Var = (e52) ti9Var.getValue();
                ti9Var.setValue(null);
                if (e52Var != null) {
                    k92 k92Var = e52Var.b;
                    if (k92Var.a == 0 && !k92Var.f(((wxc) ((je7) this.o).getValue()).a())) {
                        return;
                    }
                    ti9 ti9Var2 = (ti9) ((ConcurrentHashMap) this.Z).remove(Long.valueOf(k92Var.a));
                    if (ti9Var2 != null) {
                        ti9Var2.setValue(null);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // defpackage.o82
    public void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final e52 e52Var = (e52) it.next();
            final int i = 1;
            ((ti9) ((ConcurrentHashMap) this.Y).computeIfAbsent(Long.valueOf(e52Var.a), new di(2, new m56() { // from class: ky2
                @Override // defpackage.m56
                public final Object invoke(Object obj) {
                    switch (i) {
                    }
                    return r0e.a(e52Var);
                }
            }))).setValue(e52Var);
            k92 k92Var = e52Var.b;
            if (k92Var.a == 0 && !k92Var.f(((wxc) ((je7) this.o).getValue()).a())) {
                return;
            }
            final int i2 = 0;
            ((ti9) ((ConcurrentHashMap) this.Z).computeIfAbsent(Long.valueOf(k92Var.a), new di(3, new m56() { // from class: ky2
                @Override // defpackage.m56
                public final Object invoke(Object obj) {
                    switch (i2) {
                    }
                    return r0e.a(e52Var);
                }
            }))).setValue(e52Var);
        }
    }

    public Object j(int i) {
        SparseArray sparseArray = (SparseArray) this.o;
        if (sparseArray.indexOfKey(i) >= 0) {
            return sparseArray.get(i);
        }
        Object objA = ((i8e) this.c).a(i);
        sparseArray.put(i, objA);
        return objA;
    }

    public c8e k(int i) {
        SparseArray sparseArray = (SparseArray) this.X;
        c8e c8eVarB = (c8e) sparseArray.get(i);
        if (c8eVarB == null) {
            SparseArray sparseArray2 = (SparseArray) this.Y;
            i8e i8eVar = (i8e) this.c;
            i8eVar.getClass();
            List list = (List) sparseArray2.get(0);
            RecyclerView recyclerView = (RecyclerView) this.a;
            c8eVarB = (list == null || list.isEmpty()) ? i8eVar.b(recyclerView) : (c8e) list.remove(0);
            sparseArray.put(i, c8eVarB);
            i8eVar.c(c8eVarB, i);
            View view = c8eVarB.a;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(marginLayoutParams.width == -1 ? View.MeasureSpec.makeMeasureSpec((recyclerView.getMeasuredWidth() - marginLayoutParams.rightMargin) - recyclerView.getScrollBarSize(), 1073741824) : ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredWidth(), 0, view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredHeight(), 0, view.getLayoutParams().height));
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (c54.K(view)) {
                view.layout(recyclerView.getMeasuredWidth() - measuredWidth, 0, recyclerView.getMeasuredWidth(), measuredHeight);
            } else {
                view.layout(0, 0, measuredWidth, measuredHeight);
            }
            c8eVarB.b = marginLayoutParams.getMarginStart();
            c8eVarB.c = marginLayoutParams.topMargin;
        }
        return c8eVarB;
    }

    @Override // defpackage.obe
    public void reset() {
        yt4 yt4Var = (yt4) this.Y;
        yt4Var.c.clear();
        yt4Var.d.clear();
        yt4Var.e.clear();
        yt4Var.f.clear();
        yt4Var.g.clear();
        yt4Var.h = null;
        yt4Var.i = null;
    }
}
