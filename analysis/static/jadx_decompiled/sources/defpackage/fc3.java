package defpackage;

import android.util.Range;
import android.util.Size;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class fc3 implements zb3, mde {
    public static final dc3 s0 = new dc3(0);
    public static final byte[] t0 = {0, 7, 8, 15};
    public static final byte[] u0 = {0, 119, -120, -1};
    public static final byte[] v0 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public fc3(int i) {
        switch (i) {
            case 5:
                this.a = tu0.r(3, new hbc(21));
                this.b = tu0.r(3, new hbc(22));
                this.c = tu0.r(3, new hbc(23));
                this.o = tu0.r(3, new hbc(24));
                this.X = tu0.r(3, new hbc(25));
                this.Y = tu0.r(3, new hbc(26));
                this.Z = tu0.r(3, new hbc(27));
                break;
            default:
                this.b = new jj9(20);
                this.c = new jj9(21);
                this.o = hl.a;
                break;
        }
    }

    public static byte[] h(int i, int i2, s02 s02Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) s02Var.i(i2);
        }
        return bArr;
    }

    public static int[] j() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = l(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = l(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] k() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = l(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = l(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = l(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = l(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = l(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int l(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0226 A[LOOP:3: B:89:0x0174->B:118:0x0226, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc3.m(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static mt4 n(s02 s02Var, int i) {
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
        int[] iArrJ = j();
        int[] iArrK = k();
        while (i10 > 0) {
            int i12 = s02Var.i(i7);
            int i13 = s02Var.i(i7);
            int[] iArr2 = (i13 & 128) != 0 ? iArr : (i13 & 64) != 0 ? iArrJ : iArrK;
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
            iArr2[i12] = l((byte) (255 - (i4 & 255)), maf.j((int) ((1.402d * d2) + d), 0, 255), maf.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), maf.j((int) ((d3 * 1.772d) + d), 0, 255));
            i10 = i3;
            i11 = 0;
            i8 = i8;
            iArrK = iArrK;
            i7 = 8;
            i9 = 2;
        }
        return new mt4(i8, iArr, iArrJ, iArrK);
    }

    public static pt4 o(s02 s02Var) {
        byte[] bArr;
        int i = s02Var.i(16);
        s02Var.t(4);
        int i2 = s02Var.i(2);
        boolean zH = s02Var.h();
        s02Var.t(1);
        byte[] bArr2 = maf.f;
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
            return new pt4(i, zH, bArr2, bArr);
        }
        s02Var.t(s02Var.i(8) * 16);
        bArr = bArr2;
        return new pt4(i, zH, bArr2, bArr);
    }

    @Override // defpackage.zb3
    public synchronized gpb d(lqb lqbVar) {
        pe7 pe7Var = (pe7) ((HashMap) this.c).get(lqbVar);
        if (pe7Var != null) {
            return pe7Var;
        }
        return s0;
    }

    @Override // defpackage.zb3
    public synchronized gpb e(lqb lqbVar) {
        a14.h(lqbVar, "Null interface requested.");
        return (gpb) ((HashMap) this.b).get(lqbVar);
    }

    public q2a g() {
        se3 se3Var = (se3) this.a;
        dwe dweVar = (dwe) this.b;
        nl nlVar = (nl) this.Z;
        rl rlVar = (rl) this.Y;
        p31 p31Var = (p31) this.X;
        if (nlVar != null && rlVar != null && p31Var != null) {
            return new wc4(this, nlVar, rlVar, p31Var);
        }
        if (se3Var == null || dweVar == null) {
            throw new IllegalArgumentException("You must either provide configurationStore and tokenProvider, either sessionStore, tokenInfoProvider and appKeyProvider");
        }
        return new wc4(this, se3Var, dweVar);
    }

    @Override // defpackage.mde
    public Object get() {
        ha0 ha0Var = (ha0) this.X;
        int i = ha0Var.d;
        Range range = see.p;
        Range range2 = (Range) this.Z;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) range2.clamp(Integer.valueOf(i))).intValue() : i;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(i);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", numValueOf, numValueOf2, obj);
        Range range3 = ((mc0) this.c).c;
        int i2 = ((eu4) this.Y).b;
        Size size = (Size) this.o;
        int i3 = iIntValue;
        int iC = eef.c(ha0Var.c, i2, ha0Var.h, i3, ha0Var.d, size.getWidth(), ha0Var.e, size.getHeight(), ha0Var.f, range3);
        String str = (String) this.a;
        int i4 = ha0Var.g;
        jc0 jc0VarA = eef.a(i4, str);
        qp4 qp4VarD = ic0.d();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        qp4VarD.a = str;
        bue bueVar = (bue) this.b;
        if (bueVar == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        qp4VarD.c = bueVar;
        qp4VarD.o = size;
        qp4VarD.t0 = Integer.valueOf(iC);
        qp4VarD.Z = Integer.valueOf(iIntValue);
        qp4VarD.b = Integer.valueOf(i4);
        qp4VarD.Y = jc0VarA;
        return qp4VarD.b();
    }

    public void i(Map map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            nb3 nb3Var = (nb3) entry.getKey();
            gpb gpbVar = (gpb) entry.getValue();
            int i = nb3Var.d;
            if (i == 1 || (i == 2 && z)) {
                gpbVar.get();
            }
        }
        r35 r35Var = (r35) this.X;
        synchronized (r35Var) {
            arrayDeque = r35Var.b;
            if (arrayDeque != null) {
                r35Var.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                au1.r(it.next());
                throw null;
            }
        }
    }

    public void p() {
        for (nb3 nb3Var : ((HashMap) this.a).keySet()) {
            for (nh4 nh4Var : nb3Var.c) {
                if (nh4Var.b == 2 && !((HashMap) this.c).containsKey(nh4Var.a)) {
                    HashMap map = (HashMap) this.c;
                    lqb lqbVar = nh4Var.a;
                    Set setEmptySet = Collections.emptySet();
                    pe7 pe7Var = new pe7();
                    pe7Var.b = null;
                    pe7Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    pe7Var.a.addAll(setEmptySet);
                    map.put(lqbVar, pe7Var);
                } else if (((HashMap) this.b).containsKey(nh4Var.a)) {
                    continue;
                } else {
                    int i = nh4Var.b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + nb3Var + ": " + nh4Var.a);
                    }
                    if (i != 2) {
                        HashMap map2 = (HashMap) this.b;
                        lqb lqbVar2 = nh4Var.a;
                        av1 av1Var = uma.c;
                        dc3 dc3Var = uma.d;
                        uma umaVar = new uma();
                        umaVar.a = av1Var;
                        umaVar.b = dc3Var;
                        map2.put(lqbVar2, umaVar);
                    }
                }
            }
        }
    }

    public ArrayList q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nb3 nb3Var = (nb3) it.next();
            if (nb3Var.e == 0) {
                gpb gpbVar = (gpb) ((HashMap) this.a).get(nb3Var);
                for (lqb lqbVar : nb3Var.b) {
                    HashMap map = (HashMap) this.b;
                    if (map.containsKey(lqbVar)) {
                        arrayList2.add(new wt1((uma) ((gpb) map.get(lqbVar)), 9, gpbVar));
                    } else {
                        map.put(lqbVar, gpbVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList r() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            nb3 nb3Var = (nb3) entry.getKey();
            if (nb3Var.e != 0) {
                gpb gpbVar = (gpb) entry.getValue();
                for (lqb lqbVar : nb3Var.b) {
                    if (!map.containsKey(lqbVar)) {
                        map.put(lqbVar, new HashSet());
                    }
                    ((Set) map.get(lqbVar)).add(gpbVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = (HashMap) this.c;
            if (map2.containsKey(key)) {
                pe7 pe7Var = (pe7) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new wt1(pe7Var, 10, (gpb) it.next()));
                }
            } else {
                lqb lqbVar2 = (lqb) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                pe7 pe7Var2 = new pe7();
                pe7Var2.b = null;
                pe7Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                pe7Var2.a.addAll(set);
                map2.put(lqbVar2, pe7Var2);
            }
        }
        return arrayList;
    }

    public fc3(String str, bue bueVar, mc0 mc0Var, Size size, ha0 ha0Var, eu4 eu4Var, Range range) {
        this.a = str;
        this.b = bueVar;
        this.c = mc0Var;
        this.o = size;
        this.X = ha0Var;
        this.Y = eu4Var;
        this.Z = range;
    }
}
