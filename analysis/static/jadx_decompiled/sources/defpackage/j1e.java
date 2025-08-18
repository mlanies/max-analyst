package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* loaded from: classes.dex */
public abstract class j1e implements SdpObserver {
    public static boolean a;
    public static final rq9 b = new rq9();
    public static final r6d[] c = new r6d[0];

    public static void B(ByteBuffer byteBuffer, j60 j60Var, ByteBuffer byteBuffer2, j60 j60Var2, f42 f42Var, int i, boolean z, boolean z2) {
        j60 j60Var3;
        boolean z3;
        if (j60Var.c == 2) {
            j60Var3 = j60Var2;
            z3 = true;
        } else {
            j60Var3 = j60Var2;
            z3 = false;
        }
        boolean z4 = j60Var3.c == 2;
        int i2 = f42Var.a;
        float[] fArr = new float[i2];
        int i3 = f42Var.b;
        float[] fArr2 = new float[i3];
        for (int i4 = 0; i4 < i; i4++) {
            if (z) {
                int iPosition = byteBuffer2.position();
                for (int i5 = 0; i5 < i3; i5++) {
                    fArr2[i5] = t(byteBuffer2, z4, z4);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i6 = 0; i6 < i2; i6++) {
                fArr[i6] = t(byteBuffer, z3, z4);
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i2; i8++) {
                    fArr2[i7] = (f42Var.c[(i8 * i3) + i7] * fArr[i8]) + fArr2[i7];
                }
                if (z4) {
                    byteBuffer2.putShort((short) oaf.i(fArr2[i7], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(z2 ? oaf.i(fArr2[i7], -1.0f, 1.0f) : fArr2[i7]);
                }
                fArr2[i7] = 0.0f;
            }
        }
    }

    public static dx8 C(gy8 gy8Var) {
        int iN;
        String strP;
        String strP2;
        try {
            iN = lz7.N(gy8Var);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int iS = au1.s(k7d.a);
            if (iS != 0) {
                if (iS != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            iN = 0;
        }
        bx8 bx8Var = null;
        long jLongValue = 0;
        for (int i = 0; i < iN; i++) {
            try {
                strP = lz7.P(gy8Var);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int iS2 = au1.s(k7d.a);
                if (iS2 != 0) {
                    if (iS2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strP = null;
            }
            if (tpa.f(strP, "userId")) {
                Long lValueOf = 0L;
                try {
                    lValueOf = Long.valueOf(lz7.M(gy8Var, 0L));
                } catch (Throwable th3) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it3 = u7d.a.iterator();
                    while (it3.hasNext()) {
                        ((r4a) it3.next()).getClass();
                        r4a.a(th3);
                    }
                    int iS3 = au1.s(k7d.a);
                    if (iS3 != 0) {
                        if (iS3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th3;
                    }
                }
                jLongValue = lValueOf.longValue();
            } else if (tpa.f(strP, "reaction")) {
                gx8 gx8Var = gx8.c;
                try {
                    strP2 = lz7.P(gy8Var);
                } catch (Throwable th4) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it4 = u7d.a.iterator();
                    while (it4.hasNext()) {
                        ((r4a) it4.next()).getClass();
                        r4a.a(th4);
                    }
                    int iS4 = au1.s(k7d.a);
                    if (iS4 != 0) {
                        if (iS4 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
                if (strP2 == null) {
                    strP2 = "";
                }
                bx8Var = new bx8(gx8Var, strP2);
            } else {
                try {
                    gy8Var.z();
                } catch (Throwable th5) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                    Iterator it5 = u7d.a.iterator();
                    while (it5.hasNext()) {
                        ((r4a) it5.next()).getClass();
                        r4a.a(th5);
                    }
                    int iS5 = au1.s(k7d.a);
                    if (iS5 != 0) {
                        if (iS5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th5;
                    }
                }
            }
        }
        if (bx8Var != null) {
            return new dx8(jLongValue, bx8Var);
        }
        throw new IllegalArgumentException("reaction is null");
    }

    public static void D(kb7 kb7Var, Object obj) {
        if (obj == null || (obj instanceof String)) {
            String str = (String) obj;
            t1 t1Var = (t1) kb7Var;
            if (str != null) {
                t1Var.i(str);
                return;
            } else {
                t1Var.c0();
                return;
            }
        }
        if (obj == JSONObject.NULL) {
            kb7Var.c0();
            return;
        }
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            t1 t1Var2 = (t1) kb7Var;
            t1Var2.getClass();
            t1Var2.a(String.valueOf(zBooleanValue));
            return;
        }
        if ((obj instanceof Double) || (obj instanceof Float)) {
            ((t1) kb7Var).d(((Number) obj).doubleValue());
            return;
        }
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte)) {
            long jLongValue = ((Number) obj).longValue();
            t1 t1Var3 = (t1) kb7Var;
            t1Var3.getClass();
            t1Var3.a(Long.toString(jLongValue));
            return;
        }
        if (obj instanceof JSONObject) {
            E(kb7Var, (JSONObject) obj);
            return;
        }
        if (!(obj instanceof JSONArray)) {
            throw new IllegalArgumentException("Don't know how to write " + obj);
        }
        JSONArray jSONArray = (JSONArray) obj;
        kb7Var.u();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            D(kb7Var, jSONArray.opt(i));
        }
        kb7Var.t();
    }

    public static void E(kb7 kb7Var, JSONObject jSONObject) {
        kb7Var.s();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            kb7Var.g0(next);
            D(kb7Var, jSONObject.opt(next));
        }
        kb7Var.q();
    }

    public static final ContextScope F(sx3 sx3Var, lx3 lx3Var) {
        return new ContextScope(sx3Var.getCoroutineContext().plus(lx3Var));
    }

    public static v3f G(v3f v3fVar, String[] strArr, Map map) {
        int i = 0;
        if (v3fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (v3f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                v3f v3fVar2 = new v3f();
                int length = strArr.length;
                while (i < length) {
                    v3fVar2.a((v3f) map.get(strArr[i]));
                    i++;
                }
                return v3fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                v3fVar.a((v3f) map.get(strArr[0]));
                return v3fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    v3fVar.a((v3f) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return v3fVar;
    }

    public static mqb H(int i, int i2) {
        if (i2 > i) {
            i2 = i;
            i = i2;
        }
        for (mqb mqbVar : mqb.values()) {
            if (mqbVar.c == i && mqbVar.o == i2) {
                return mqbVar;
            }
        }
        for (mqb mqbVar2 : mqb.values()) {
            if (mqbVar2.o == i2) {
                return mqbVar2;
            }
        }
        for (mqb mqbVar3 : mqb.values()) {
            if (mqbVar3.o == i) {
                return mqbVar3;
            }
        }
        float f = i;
        float f2 = f / i2;
        if (f2 > 1.7777778f) {
            for (mqb mqbVar4 : mqb.values()) {
                if (mqbVar4.c == i) {
                    return mqbVar4;
                }
            }
            int i3 = (int) (f / 1.7777778f);
            mqb mqbVar5 = null;
            try {
                mqb mqbVar6 = null;
                int i4 = -1;
                for (mqb mqbVar7 : mqb.values()) {
                    int iAbs = Math.abs(mqbVar7.o - i3);
                    if (i4 == -1 || iAbs < i4) {
                        mqbVar6 = mqbVar7;
                        i4 = iAbs;
                    }
                }
                mqbVar5 = mqbVar6;
            } catch (NumberFormatException e) {
                hm9.p("j1e", "Can't parse quality", e);
            }
            if (mqbVar5 != null) {
                return mqbVar5;
            }
        } else {
            for (mqb mqbVar8 : mqb.values()) {
                if (mqbVar8.o == i2) {
                    return mqbVar8;
                }
            }
        }
        if (f2 < 1.0f) {
            int i5 = i2;
            i2 = i;
            i = i5;
        }
        mqb mqbVar9 = mqb.P_144;
        for (mqb mqbVar10 : mqb.values()) {
            if (mqbVar10.c <= i && mqbVar10.o <= i2) {
                return mqbVar10;
            }
        }
        return mqbVar9;
    }

    public static m5d I(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size() / 2);
        ArrayList arrayList4 = new ArrayList(list.size() / 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jxd jxdVar = (jxd) it.next();
            int i = jxdVar.a;
            int i2 = jxdVar.b;
            if (i == 1) {
                if (i2 == 1) {
                    arrayList.add((dxd) jxdVar);
                } else {
                    if (i2 != 2) {
                        throw new AssertionError("unreachable: " + jxdVar);
                    }
                    arrayList2.add((exd) jxdVar);
                }
            } else {
                if (i != 2) {
                    throw new AssertionError("unreachable: " + jxdVar);
                }
                if (i2 == 1) {
                    arrayList3.add((hxd) jxdVar);
                } else {
                    if (i2 != 2) {
                        throw new AssertionError("unreachable: " + jxdVar);
                    }
                    arrayList4.add((ixd) jxdVar);
                }
            }
        }
        return new m5d(14, arrayList, arrayList3, arrayList2, arrayList4, false);
    }

    public static ArrayList J(List list, cz1 cz1Var) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jxd jxdVar = (jxd) it.next();
            if (cz1Var.j.equals(jxdVar.d)) {
                arrayList.add(jxdVar);
            }
        }
        return arrayList;
    }

    public static Object K(Task task) throws ExecutionException {
        if (task.h()) {
            return task.f();
        }
        if (((ukg) task).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.e());
    }

    public static final ContextScope a(lx3 lx3Var) {
        if (lx3Var.get(c32.X) == null) {
            lx3Var = lx3Var.plus(pag.a());
        }
        return new ContextScope(lx3Var);
    }

    public static Object b(Task task) throws InterruptedException {
        fp3.m("Must not be called on the main application thread");
        fp3.l();
        fp3.o(task, "Task must not be null");
        if (task.g()) {
            return K(task);
        }
        hgf hgfVar = new hgf();
        Executor executor = xne.b;
        task.d(executor, hgfVar);
        task.c(executor, hgfVar);
        task.a(executor, hgfVar);
        ((CountDownLatch) hgfVar.a).await();
        return K(task);
    }

    public static Object c(Task task, long j, TimeUnit timeUnit) throws TimeoutException {
        fp3.m("Must not be called on the main application thread");
        fp3.l();
        fp3.o(task, "Task must not be null");
        fp3.o(timeUnit, "TimeUnit must not be null");
        if (task.g()) {
            return K(task);
        }
        hgf hgfVar = new hgf();
        Executor executor = xne.b;
        task.d(executor, hgfVar);
        task.c(executor, hgfVar);
        task.a(executor, hgfVar);
        if (((CountDownLatch) hgfVar.a).await(j, timeUnit)) {
            return K(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static kl7 d(List list) {
        kl7 kl7Var = (kl7) list;
        kl7Var.e();
        kl7Var.c = true;
        return kl7Var.b > 0 ? kl7Var : kl7.o;
    }

    public static final Set e(r6d r6dVar) {
        if (r6dVar instanceof px0) {
            return ((px0) r6dVar).b();
        }
        HashSet hashSet = new HashSet(r6dVar.f());
        int iF = r6dVar.f();
        for (int i = 0; i < iF; i++) {
            hashSet.add(r6dVar.g(i));
        }
        return hashSet;
    }

    public static final int f(RecyclerView recyclerView, int i, int i2) {
        int width = (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        if (width <= 0) {
            width = (recyclerView.getContext().getResources().getDisplayMetrics().widthPixels - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        }
        int i3 = width - (i * i2);
        int i4 = i2 - 1;
        return i3 / (i4 >= 1 ? i4 : 1);
    }

    public static ukg g(Callable callable, Executor executor) {
        fp3.o(executor, "Executor must not be null");
        ukg ukgVar = new ukg();
        executor.execute(new ihg(ukgVar, 4, callable));
        return ukgVar;
    }

    public static boolean h(j60 j60Var) {
        if (j60Var.a == -1 || j60Var.b == -1) {
            return false;
        }
        int i = j60Var.c;
        return i == 2 || i == 4;
    }

    public static final void i(sx3 sx3Var, CancellationException cancellationException) {
        x77 x77Var = (x77) sx3Var.getCoroutineContext().get(c32.X);
        if (x77Var != null) {
            x77Var.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + sx3Var).toString());
        }
    }

    public static final r6d[] j(List list) {
        r6d[] r6dVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (r6dVarArr = (r6d[]) list.toArray(new r6d[0])) == null) ? c : r6dVarArr;
    }

    public static final Object k(a66 a66Var, Continuation continuation) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation.getContext(), continuation);
        return oag.C(scopeCoroutine, scopeCoroutine, a66Var);
    }

    public static kl7 l() {
        return new kl7(10);
    }

    public static void m(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static synchronized void n() {
        if (!a) {
            hm9.M("static-webp");
            a = true;
        }
    }

    public static final void o(sx3 sx3Var) {
        pag.j(sx3Var.getCoroutineContext());
    }

    public static void p(Bitmap bitmap, int i) {
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[12544];
        int i3 = 25;
        int i4 = 1;
        for (int i5 = 1; i5 < 256; i5++) {
            for (int i6 = 0; i6 < 49; i6++) {
                iArr2[i3] = i5;
                i3++;
            }
        }
        int[] iArr3 = new int[Math.max(width, height)];
        int i7 = 0;
        while (i7 < i) {
            int i8 = 0;
            while (true) {
                i2 = 24;
                if (i8 >= height) {
                    break;
                }
                int i9 = width * i8;
                i8++;
                int i10 = (i8 * width) - i4;
                int i11 = width + 24;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                for (int i16 = -24; i16 < i11; i16++) {
                    int i17 = i9 + i16;
                    if (i17 < i9) {
                        i17 = i9;
                    } else if (i17 > i10) {
                        i17 = i10;
                    }
                    int i18 = iArr[i17];
                    i12 += (i18 >> 16) & 255;
                    i13 += (i18 >> 8) & 255;
                    i14 += i18 & 255;
                    i15 += i18 >>> 24;
                    if (i16 >= 24) {
                        iArr3[i16 - 24] = (iArr2[i15] << 24) | (iArr2[i12] << 16) | (iArr2[i13] << 8) | iArr2[i14];
                        int i19 = (i16 - 48) + i9;
                        if (i19 < i9) {
                            i19 = i9;
                        } else if (i19 > i10) {
                            i19 = i10;
                        }
                        int i20 = iArr[i19];
                        i12 -= (i20 >> 16) & 255;
                        i13 -= (i20 >> 8) & 255;
                        i14 -= i20 & 255;
                        i15 -= i20 >>> 24;
                    }
                }
                System.arraycopy(iArr3, 0, iArr, i9, width);
                i4 = 1;
            }
            int i21 = 0;
            int i22 = 0;
            while (i22 < width) {
                int i23 = ((height - 1) * width) + i22;
                int i24 = i2 * width;
                int i25 = 48 * width;
                int i26 = i22 - i24;
                int i27 = i21;
                int i28 = i27;
                int i29 = i28;
                int i30 = i29;
                int i31 = i30;
                while (i26 <= i23 + i24) {
                    int i32 = iArr[i26 < i22 ? i22 : i26 > i23 ? i23 : i26];
                    i27 += (i32 >> 16) & 255;
                    i28 += (i32 >> 8) & 255;
                    i29 += i32 & 255;
                    i2 = 24;
                    i30 += i32 >>> 24;
                    if (i26 - i24 >= i22) {
                        iArr3[i31] = (iArr2[i30] << 24) | (iArr2[i27] << 16) | (iArr2[i28] << 8) | iArr2[i29];
                        i31++;
                        int i33 = i26 - i25;
                        if (i33 < i22) {
                            i33 = i22;
                        } else if (i33 > i23) {
                            i33 = i23;
                        }
                        int i34 = iArr[i33];
                        i27 -= (i34 >> 16) & 255;
                        i28 -= (i34 >> 8) & 255;
                        i29 -= i34 & 255;
                        i2 = 24;
                        i30 -= i34 >>> 24;
                    }
                    i26 += width;
                }
                int i35 = i22;
                for (int i36 = 0; i36 < height; i36++) {
                    iArr[i35] = iArr3[i36];
                    i35 += width;
                }
                i22++;
                i21 = 0;
            }
            i7++;
            i4 = 1;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    public static ukg q(Exception exc) {
        ukg ukgVar = new ukg();
        ukgVar.m(exc);
        return ukgVar;
    }

    public static ukg r(Object obj) {
        ukg ukgVar = new ukg();
        ukgVar.n(obj);
        return ukgVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(6:152|3|4|153|5|(1:7)(1:13))|(13:17|(1:19)(1:20)|(1:22)(1:23)|24|(1:26)(1:28)|27|29|(1:(2:31|(2:158|33)(1:34))(2:159|35))|(1:37)(1:38)|39|144|40|(1:164)(14:155|69|(1:71)(1:78)|79|(1:81)|85|(1:88)|89|(1:91)(1:92)|93|(4:95|(1:121)(5:102|(1:(1:106)(1:107))|(1:109)(1:110)|111|(1:(1:123)(1:124))(0))|(2:126|161)(1:162)|127)|160|128|129))|150|44|49|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x003a: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:9:0x0039 */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0229 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList s(android.net.Uri r30, android.content.Context r31, defpackage.cj0 r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1e.s(android.net.Uri, android.content.Context, cj0):java.util.ArrayList");
    }

    public static float t(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            return oaf.i(f * (f < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
        }
        if (!z) {
            return byteBuffer.getFloat();
        }
        short s = byteBuffer.getShort();
        return s / (s < 0 ? 32768 : 32767);
    }

    public static String u(String str) {
        return "TRuntime.".concat(str);
    }

    public static ArrayList v(List list) {
        ArrayList arrayList = new ArrayList(list.size() / 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jxd jxdVar = (jxd) it.next();
            if (jxdVar.b == 1 && jxdVar.a == 2) {
                arrayList.add((hxd) jxdVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1e.w(java.lang.String):int");
    }

    public static int x(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kp4 y(defpackage.gy8 r17) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1e.y(gy8):kp4");
    }

    public static final boolean z(sx3 sx3Var) {
        x77 x77Var = (x77) sx3Var.getCoroutineContext().get(c32.X);
        if (x77Var != null) {
            return x77Var.isActive();
        }
        return true;
    }

    public boolean A() {
        return false;
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateFailure(String str) {
        throw new RuntimeException(str);
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateSuccess(SessionDescription sessionDescription) {
    }

    @Override // org.webrtc.SdpObserver
    public void onSetFailure(String str) {
        throw new RuntimeException(str);
    }

    @Override // org.webrtc.SdpObserver
    public void onSetSuccess() {
    }
}
