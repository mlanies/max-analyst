package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yg2 implements uu, pfc {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public yg2(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, eg2 eg2Var, long j, Set set, ad8 ad8Var) {
        this.b = eg2Var;
        this.a = j;
        this.c = set;
        this.d = ad8Var;
        this.e = yg2.class.getName();
        this.f = je7Var;
        this.g = je7Var2;
        this.h = je7Var3;
        this.i = je7Var4;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.pfc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r28, int r30, int r31, long r32, long r34, kotlin.coroutines.Continuation r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg2.a(long, int, int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // defpackage.uu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int r17, long r18, long r20, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            r16 = this;
            r10 = r16
            r0 = r22
            boolean r1 = r0 instanceof defpackage.xg2
            if (r1 == 0) goto L18
            r1 = r0
            xg2 r1 = (defpackage.xg2) r1
            int r2 = r1.u0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.u0 = r2
        L16:
            r11 = r1
            goto L1e
        L18:
            xg2 r1 = new xg2
            r1.<init>(r10, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r11.s0
            tx3 r12 = defpackage.tx3.a
            int r1 = r11.u0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L46
            if (r1 == r2) goto L38
            if (r1 != r13) goto L30
            defpackage.od2.a0(r0)
            goto L88
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            yg2 r6 = r11.o
            defpackage.od2.a0(r0)
            r14 = r4
            r10 = r6
            goto L6e
        L46:
            defpackage.od2.a0(r0)
            r11.o = r10
            r14 = r18
            r11.X = r14
            r9 = r17
            r11.Z = r9
            r7 = r20
            r11.Y = r7
            r11.u0 = r2
            r3 = 0
            r5 = 0
            r0 = r16
            r1 = r18
            r4 = r17
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L6a
            return r12
        L6a:
            r3 = r17
            r1 = r20
        L6e:
            java.lang.Object r0 = r10.b
            uu r0 = (defpackage.uu) r0
            r4 = 0
            r11.o = r4
            r11.u0 = r13
            r16 = r0
            r17 = r3
            r18 = r14
            r20 = r1
            r22 = r11
            java.lang.Object r0 = r16.b(r17, r18, r20, r22)
            if (r0 != r12) goto L88
            return r12
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg2.b(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // defpackage.uu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(int r19, long r20, long r22, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            r18 = this;
            r10 = r18
            r0 = r24
            boolean r1 = r0 instanceof defpackage.wg2
            if (r1 == 0) goto L18
            r1 = r0
            wg2 r1 = (defpackage.wg2) r1
            int r2 = r1.u0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.u0 = r2
        L16:
            r11 = r1
            goto L1e
        L18:
            wg2 r1 = new wg2
            r1.<init>(r10, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r11.s0
            tx3 r12 = defpackage.tx3.a
            int r1 = r11.u0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L46
            if (r1 == r2) goto L38
            if (r1 != r13) goto L30
            defpackage.od2.a0(r0)
            goto L8f
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            yg2 r6 = r11.o
            defpackage.od2.a0(r0)
            r14 = r4
            r10 = r6
            goto L75
        L46:
            defpackage.od2.a0(r0)
            r11.o = r10
            r14 = r20
            r11.X = r14
            r9 = r19
            r11.Z = r9
            r7 = r22
            r11.Y = r7
            r11.u0 = r2
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r0 = r18
            r1 = r20
            r3 = r19
            r5 = r22
            r7 = r16
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L71
            return r12
        L71:
            r3 = r19
            r1 = r22
        L75:
            java.lang.Object r0 = r10.b
            uu r0 = (defpackage.uu) r0
            r4 = 0
            r11.o = r4
            r11.u0 = r13
            r18 = r0
            r19 = r3
            r20 = r14
            r22 = r1
            r24 = r11
            java.lang.Object r0 = r18.d(r19, r20, r22, r24)
            if (r0 != r12) goto L8f
            return r12
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg2.d(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public fu1 e(String str) throws CameraUnavailableException {
        if (!((ArrayList) this.g).contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        iu1 iu1VarF = f(str);
        w90 w90Var = (w90) this.d;
        Executor executor = w90Var.a;
        return new fu1((Context) this.b, (dx1) this.f, str, iu1VarF, (l0f) this.c, (ux1) this.e, executor, w90Var.b, (ul4) this.h, this.a);
    }

    public iu1 f(String str) throws CameraUnavailableException {
        HashMap map = (HashMap) this.i;
        try {
            iu1 iu1Var = (iu1) map.get(str);
            if (iu1Var != null) {
                return iu1Var;
            }
            iu1 iu1Var2 = new iu1((dx1) this.f, str);
            map.put(str, iu1Var2);
            return iu1Var2;
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public yg2(Context context, w90 w90Var, px1 px1Var, long j) throws InitializationException, CameraAccessExceptionCompat {
        ex1 ex1Var;
        this.i = new HashMap();
        this.b = context;
        this.d = w90Var;
        String strI = null;
        if (Build.VERSION.SDK_INT >= 30) {
            ex1Var = new fx1(context, null);
        } else {
            ex1Var = new ex1(context, null);
        }
        dx1 dx1Var = new dx1(ex1Var);
        this.f = dx1Var;
        this.h = ul4.b(context);
        try {
            ArrayList arrayList = new ArrayList();
            dle dleVar = dx1Var.a;
            dleVar.getClass();
            try {
                List<String> listAsList = Arrays.asList(((CameraManager) dleVar.b).getCameraIdList());
                if (px1Var == null) {
                    Iterator it = listAsList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    try {
                        strI = kq0.i(dx1Var, px1Var.b(), listAsList);
                    } catch (IllegalStateException unused) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : listAsList) {
                        if (!str.equals(strI)) {
                            arrayList2.add(f(str));
                        }
                    }
                    Iterator it2 = px1Var.a(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((yw1) it2.next()).d());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str2 = (String) it3.next();
                    if (!str2.equals("0") && !str2.equals("1")) {
                        if (ngg.z((dx1) this.f, str2)) {
                            arrayList3.add(str2);
                        }
                    } else {
                        arrayList3.add(str2);
                    }
                }
                this.g = arrayList3;
                l0f l0fVar = new l0f((dx1) this.f);
                this.c = l0fVar;
                ux1 ux1Var = new ux1(l0fVar);
                this.e = ux1Var;
                ((ArrayList) l0fVar.o).add(ux1Var);
                this.a = j;
            } catch (CameraAccessException e) {
                throw new CameraAccessExceptionCompat(e);
            }
        } catch (CameraAccessExceptionCompat e2) {
            throw new InitializationException(new CameraUnavailableException(e2));
        } catch (CameraUnavailableException e3) {
            throw new InitializationException(e3);
        }
    }
}
