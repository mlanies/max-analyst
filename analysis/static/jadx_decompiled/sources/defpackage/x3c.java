package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x3c implements Provider, bbe {
    public Object X;
    public Object Y;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ x3c(int i) {
        this.a = i;
    }

    public long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            ((a4c) this.b).logException("RTCDeprecatedStat", "stat.parse", e);
            return -1L;
        }
    }

    public void b(hg7 hg7Var, uof uofVar, List list, List list2, l0f l0fVar) {
        synchronized (this.b) {
            try {
                c54.k(!list2.isEmpty());
                this.Y = l0fVar;
                eh7 eh7VarC = hg7Var.c();
                jg7 jg7VarE = e(eh7VarC);
                if (jg7VarE == null) {
                    return;
                }
                Set set = (Set) ((HashMap) this.o).get(jg7VarE);
                l0f l0fVar2 = (l0f) this.Y;
                if (l0fVar2 == null || l0fVar2.b != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        hg7 hg7Var2 = (hg7) ((HashMap) this.c).get((wa0) it.next());
                        hg7Var2.getClass();
                        if (!hg7Var2.equals(hg7Var) && !hg7Var2.e().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    xx1 xx1Var = hg7Var.c;
                    synchronized (xx1Var.w0) {
                        xx1Var.t0 = uofVar;
                    }
                    xx1 xx1Var2 = hg7Var.c;
                    synchronized (xx1Var2.w0) {
                        xx1Var2.u0 = list;
                    }
                    synchronized (hg7Var.a) {
                        hg7Var.c.c(list2);
                    }
                    if (eh7VarC.Q().d.a(fg7.o)) {
                        k(eh7VarC);
                    }
                } catch (CameraUseCaseAdapter$CameraException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public vb0 c() {
        String strG = ((Size) this.b) == null ? " resolution" : "";
        if (((eu4) this.c) == null) {
            strG = strG.concat(" dynamicRange");
        }
        if (((Range) this.o) == null) {
            strG = au1.g(strG, " expectedFrameRateRange");
        }
        if (((Boolean) this.Y) == null) {
            strG = au1.g(strG, " zslDisabled");
        }
        if (strG.isEmpty()) {
            return new vb0((Size) this.b, (eu4) this.c, (Range) this.o, (ce3) this.X, ((Boolean) this.Y).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strG));
    }

    public hg7 d(eh7 eh7Var, xx1 xx1Var) {
        synchronized (this.b) {
            try {
                c54.j("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", ((HashMap) this.c).get(new wa0(eh7Var, xx1Var.X)) == null);
                hg7 hg7Var = new hg7(eh7Var, xx1Var);
                if (((ArrayList) xx1Var.w()).isEmpty()) {
                    hg7Var.i();
                }
                if (eh7Var.Q().d == fg7.a) {
                    return hg7Var;
                }
                j(hg7Var);
                return hg7Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public jg7 e(eh7 eh7Var) {
        synchronized (this.b) {
            try {
                for (jg7 jg7Var : ((HashMap) this.o).keySet()) {
                    if (eh7Var.equals(jg7Var.b)) {
                        return jg7Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object f(Continuation continuation) {
        return j47.t0(((w9a) ((kke) ((je7) this.X).getValue())).b(), new a5d(this, null), continuation);
    }

    @Override // defpackage.bbe
    public int g(long j) {
        long[] jArr = (long[]) this.c;
        int iB = oaf.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new kd4((Executor) ((Provider) this.b).get(), (g99) ((Provider) this.c).get(), (z77) ((Provider) this.o).get(), (h45) ((Provider) this.X).get(), (fhe) ((Provider) this.Y).get());
    }

    public boolean h(eh7 eh7Var) {
        synchronized (this.b) {
            try {
                jg7 jg7VarE = e(eh7Var);
                if (jg7VarE == null) {
                    return false;
                }
                Iterator it = ((Set) ((HashMap) this.o).get(jg7VarE)).iterator();
                while (it.hasNext()) {
                    hg7 hg7Var = (hg7) ((HashMap) this.c).get((wa0) it.next());
                    hg7Var.getClass();
                    if (!hg7Var.e().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bbe
    public long i(int i) {
        return ((long[]) this.c)[i];
    }

    public void j(hg7 hg7Var) {
        synchronized (this.b) {
            try {
                eh7 eh7VarC = hg7Var.c();
                xx1 xx1Var = hg7Var.c;
                wa0 wa0Var = new wa0(eh7VarC, xx1.t(xx1Var.C0, xx1Var.D0));
                jg7 jg7VarE = e(eh7VarC);
                Set hashSet = jg7VarE != null ? (Set) ((HashMap) this.o).get(jg7VarE) : new HashSet();
                hashSet.add(wa0Var);
                ((HashMap) this.c).put(wa0Var, hg7Var);
                if (jg7VarE == null) {
                    jg7 jg7Var = new jg7(eh7VarC, this);
                    ((HashMap) this.o).put(jg7Var, hashSet);
                    eh7VarC.Q().a(jg7Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(eh7 eh7Var) {
        synchronized (this.b) {
            try {
                if (h(eh7Var)) {
                    if (((ArrayDeque) this.X).isEmpty()) {
                        ((ArrayDeque) this.X).push(eh7Var);
                    } else {
                        l0f l0fVar = (l0f) this.Y;
                        if (l0fVar == null || l0fVar.b != 2) {
                            eh7 eh7Var2 = (eh7) ((ArrayDeque) this.X).peek();
                            if (!eh7Var.equals(eh7Var2)) {
                                m(eh7Var2);
                                ((ArrayDeque) this.X).remove(eh7Var);
                                ((ArrayDeque) this.X).push(eh7Var);
                            }
                        }
                    }
                    q(eh7Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(eh7 eh7Var) {
        synchronized (this.b) {
            try {
                ((ArrayDeque) this.X).remove(eh7Var);
                m(eh7Var);
                if (!((ArrayDeque) this.X).isEmpty()) {
                    q((eh7) ((ArrayDeque) this.X).peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(eh7 eh7Var) {
        synchronized (this.b) {
            try {
                jg7 jg7VarE = e(eh7Var);
                if (jg7VarE == null) {
                    return;
                }
                Iterator it = ((Set) ((HashMap) this.o).get(jg7VarE)).iterator();
                while (it.hasNext()) {
                    hg7 hg7Var = (hg7) ((HashMap) this.c).get((wa0) it.next());
                    hg7Var.getClass();
                    hg7Var.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(List list) {
        synchronized (this.b) {
            Iterator it = ((HashMap) this.c).keySet().iterator();
            while (it.hasNext()) {
                hg7 hg7Var = (hg7) ((HashMap) this.c).get((wa0) it.next());
                boolean z = !hg7Var.e().isEmpty();
                synchronized (hg7Var.a) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.retainAll(hg7Var.c.w());
                    hg7Var.c.z(arrayList);
                }
                if (z && hg7Var.e().isEmpty()) {
                    l(hg7Var.c());
                }
            }
        }
    }

    public void o() {
        synchronized (this.b) {
            Iterator it = ((HashMap) this.c).keySet().iterator();
            while (it.hasNext()) {
                hg7 hg7Var = (hg7) ((HashMap) this.c).get((wa0) it.next());
                synchronized (hg7Var.a) {
                    xx1 xx1Var = hg7Var.c;
                    xx1Var.z((ArrayList) xx1Var.w());
                }
                l(hg7Var.c());
            }
        }
    }

    @Override // defpackage.bbe
    public List p(long j) {
        q3f q3fVar = (q3f) this.b;
        q3fVar.getClass();
        ArrayList arrayList = new ArrayList();
        q3fVar.g(j, q3fVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        q3fVar.i(j, false, q3fVar.h, treeMap);
        Map map = (Map) this.o;
        Map map2 = (Map) this.X;
        q3fVar.h(j, map, map2, q3fVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((Map) this.Y).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                t3f t3fVar = (t3f) map2.get(pair.first);
                t3fVar.getClass();
                arrayList2.add(new yz3(null, null, null, bitmapDecodeByteArray, t3fVar.c, 0, t3fVar.e, t3fVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, t3fVar.f, t3fVar.g, false, -16777216, t3fVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            t3f t3fVar2 = (t3f) map2.get(entry.getKey());
            t3fVar2.getClass();
            wz3 wz3Var = (wz3) entry.getValue();
            CharSequence charSequence = wz3Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ih4 ih4Var : (ih4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ih4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ih4Var), spannableStringBuilder.getSpanEnd(ih4Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            wz3Var.e = t3fVar2.c;
            wz3Var.f = t3fVar2.d;
            wz3Var.g = t3fVar2.e;
            wz3Var.h = t3fVar2.b;
            wz3Var.l = t3fVar2.f;
            wz3Var.k = t3fVar2.i;
            wz3Var.j = t3fVar2.h;
            wz3Var.p = t3fVar2.j;
            arrayList2.add(wz3Var.a());
        }
        return arrayList2;
    }

    public void q(eh7 eh7Var) {
        synchronized (this.b) {
            try {
                Iterator it = ((Set) ((HashMap) this.o).get(e(eh7Var))).iterator();
                while (it.hasNext()) {
                    hg7 hg7Var = (hg7) ((HashMap) this.c).get((wa0) it.next());
                    hg7Var.getClass();
                    if (!hg7Var.e().isEmpty()) {
                        hg7Var.q();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(super.toString());
                sb.append('\n');
                for (Field field : x3c.class.getDeclaredFields()) {
                    try {
                        sb.append(field.getName());
                        sb.append('=');
                        sb.append(field.get(this));
                        sb.append('\n');
                    } catch (IllegalAccessException e) {
                        sb.append("\nCaught ");
                        sb.append(e.getMessage());
                        sb.append('\n');
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.bbe
    public int u() {
        return ((long[]) this.c).length;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[Catch: NumberFormatException -> 0x0053, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0053, blocks: (B:9:0x002d, B:40:0x007f, B:41:0x0089, B:42:0x0093, B:43:0x009d, B:18:0x0049, B:23:0x0055, B:26:0x005f, B:29:0x0069), top: B:88:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x3c(defpackage.a4c r17, org.webrtc.StatsReport[] r18) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x3c.<init>(a4c, org.webrtc.StatsReport[]):void");
    }

    public x3c(je7 je7Var, je7 je7Var2, je7 je7Var3, Set set) {
        this.a = 5;
        this.b = je7Var3;
        this.c = set;
        this.o = je7Var;
        this.X = je7Var2;
        AtomicReference atomicReference = new AtomicReference(wz4.a);
        this.Y = atomicReference;
        if (!set.isEmpty()) {
            atomicReference.updateAndGet(new oz0(this, 3, new LinkedHashSet()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3c(je7 je7Var, je7 je7Var2, je7 je7Var3, int i) {
        this(je7Var, je7Var2, (i & 4) != 0 ? null : je7Var3, wz4.a);
        this.a = 5;
    }

    public x3c(Provider provider, Provider provider2, c8d c8dVar, Provider provider3, Provider provider4) {
        this.a = 2;
        this.b = provider;
        this.c = provider2;
        this.o = c8dVar;
        this.X = provider3;
        this.Y = provider4;
    }

    public x3c(q3f q3fVar, HashMap map, HashMap map2, HashMap map3) {
        this.a = 6;
        this.b = q3fVar;
        this.X = map2;
        this.Y = map3;
        this.o = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        q3fVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public x3c() {
        this.a = 3;
        this.b = new Object();
        this.c = new HashMap();
        this.o = new HashMap();
        this.X = new ArrayDeque();
    }
}
