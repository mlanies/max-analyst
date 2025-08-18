package defpackage;

import android.accounts.Account;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class kad implements e15 {
    public final Object X;
    public final Object Y;
    public Object Z;
    public final Object a;
    public final Object b;
    public Object c;
    public Object o;

    public kad(int i) {
        switch (i) {
            case 3:
                this.a = new lh4(0);
                this.b = new lh4(0);
                this.c = new lh4(0);
                this.o = new lh4(0);
                this.X = new lh4(0);
                this.Y = new lh4(0);
                this.Z = new sy4(29);
                break;
            default:
                this.a = new AtomicInteger(0);
                this.b = new AtomicInteger(0);
                this.c = new AtomicInteger(0);
                this.o = new AtomicInteger(0);
                this.X = new AtomicInteger(0);
                this.Y = new AtomicInteger(0);
                this.Z = new AtomicInteger(0);
                new ConcurrentHashMap();
                break;
        }
    }

    public static boolean a(lze lzeVar, oy5 oy5Var) {
        return oag.d(oy5Var.a, lzeVar.a) && oag.d(oy5Var.b, lzeVar.b) && oag.d(oy5Var.c, lzeVar.c) && oy5Var.B0 == lzeVar.o && oy5Var.C0 == lzeVar.X && oy5Var.s0 == lzeVar.Y;
    }

    public mze b() {
        bf4 bf4Var = (bf4) this.a;
        ez7 ez7Var = bf4Var.c;
        if (ez7Var == null) {
            return mze.c;
        }
        int iIntValue = ((Integer) d(ez7Var).first).intValue();
        qe4 qe4VarA = ((ne4) bf4Var.e.get()).a(iIntValue, ez7Var.c[iIntValue]);
        if (qe4VarA == null) {
            return mze.c;
        }
        for (mze mzeVar : (List) this.o) {
            lze lzeVar = mzeVar.a;
            if (lzeVar.Z == iIntValue && lzeVar.s0 == qe4VarA.a) {
                if (lzeVar.t0 == qe4VarA.b[0]) {
                    return mzeVar;
                }
            }
        }
        return mze.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.f15 c(int r17) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kad.c(int):f15");
    }

    public Pair d(ez7 ez7Var) {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < ez7Var.a; i3++) {
            if (ez7Var.c[i3].a != 0) {
                zpd zpdVar = (zpd) this.b;
                zpdVar.Z1();
                t75 t75Var = zpdVar.c;
                t75Var.s2();
                int i4 = t75Var.s0[i3].a;
                if (i4 == 1) {
                    i2 = i3;
                } else if (i4 == 2) {
                    i = i3;
                }
            }
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public boolean e() {
        int i;
        int i2;
        ez7 ez7Var;
        int iIntValue;
        List listEmptyList;
        if (((fef) this.c) == null) {
            return false;
        }
        bf4 bf4Var = (bf4) this.a;
        ez7 ez7Var2 = bf4Var.c;
        ArrayList arrayList = null;
        if (ez7Var2 != null) {
            Pair pairD = d(ez7Var2);
            int iIntValue2 = ((Integer) pairD.first).intValue();
            int iIntValue3 = ((Integer) pairD.second).intValue();
            if (iIntValue2 >= 0) {
                sze[] szeVarArr = ez7Var2.c;
                ArrayList arrayListF = f(iIntValue2, szeVarArr[iIntValue2]);
                ArrayList<lze> arrayListF2 = iIntValue3 > 0 ? f(iIntValue3, szeVarArr[iIntValue3]) : null;
                ArrayList arrayList2 = new ArrayList(arrayListF.size());
                for (int i3 = 0; i3 < arrayListF.size(); i3++) {
                    lze lzeVar = (lze) arrayListF.get(i3);
                    int i4 = lzeVar.t0;
                    if (arrayListF2 == null) {
                        listEmptyList = Collections.emptyList();
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (lze lzeVar2 : arrayListF2) {
                            if (lzeVar2.t0 == i4) {
                                arrayList3.add(lzeVar2);
                            }
                        }
                        listEmptyList = arrayList3;
                    }
                    arrayList2.add(new mze(lzeVar, listEmptyList));
                    if ((((fef) this.c) instanceof yn6) && lzeVar.X == 0) {
                        ef7 ef7Var = (ef7) this.Y;
                        if (ef7Var.get() != null) {
                            ((ad) ef7Var.get()).f("HLS_WITHOUT_HEIGHT");
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
        }
        if (arrayList == null) {
            this.o = Collections.emptyList();
            return false;
        }
        this.o = arrayList;
        int i5 = ((t33) this.X).g.getInt("app.video.play.quality", -1);
        if (i5 > 0) {
            h(i5);
        }
        fef fefVar = (fef) this.c;
        if (fefVar == null) {
            return true;
        }
        ok0 ok0Var = (ok0) fefVar;
        if (ok0Var.b <= 0 || (i = ok0Var.h) == -1 || (i2 = ok0Var.i) == -1 || (ez7Var = bf4Var.c) == null || (iIntValue = ((Integer) d(ez7Var).second).intValue()) < 0) {
            return true;
        }
        qe4 qe4Var = new qe4(i2, 0, new int[]{i});
        sze szeVar = ez7Var.c[iIntValue];
        pe4 pe4VarB = bf4Var.b();
        pe4VarB.e(iIntValue, szeVar, qe4Var);
        bf4Var.h(pe4VarB);
        return true;
    }

    public ArrayList f(int i, sze szeVar) {
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < szeVar.a; i3++) {
            qze qzeVarA = szeVar.a(i3);
            int i4 = 0;
            while (i4 < qzeVarA.a) {
                oy5 oy5Var = qzeVarA.c[i4];
                cle cleVar = (cle) this.Z;
                cleVar.getClass();
                if (ha9.g(oy5Var.w0) == 1) {
                    List list = cleVar.c;
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof u78) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    if (ha9.g(oy5Var.w0) == 2) {
                        List list2 = cleVar.d;
                        arrayList = new ArrayList();
                        for (Object obj2 : list2) {
                            if (obj2 instanceof s88) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    i2 = i4;
                    arrayList2.add(new lze(oy5Var.a, oy5Var.b, oy5Var.c, oy5Var.B0, oy5Var.C0, oy5Var.s0, i, i3, i4));
                    break;
                    i4 = i2 + 1;
                }
                if (arrayList.isEmpty()) {
                    i2 = i4;
                    arrayList2.add(new lze(oy5Var.a, oy5Var.b, oy5Var.c, oy5Var.B0, oy5Var.C0, oy5Var.s0, i, i3, i4));
                    break;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if ((((f88) it.next()).A(oy5Var) & 7) == 4) {
                        i2 = i4;
                        arrayList2.add(new lze(oy5Var.a, oy5Var.b, oy5Var.c, oy5Var.B0, oy5Var.C0, oy5Var.s0, i, i3, i4));
                        break;
                        break;
                    }
                }
                hm9.m("kad", "mapTracks: Skip format %s", oy5Var);
                i2 = i4;
                i4 = i2 + 1;
            }
        }
        Collections.sort(arrayList2, new ye4(25));
        return arrayList2;
    }

    public void g() {
        ((lh4) this.a).a = -1L;
        ((lh4) this.b).a = -1L;
        ((lh4) this.c).a = -1L;
        ((lh4) this.o).a = -1L;
        ((lh4) this.X).a = -1L;
        ((lh4) this.Y).a = -1L;
    }

    public void h(int i) {
        bf4 bf4Var = (bf4) this.a;
        ez7 ez7Var = bf4Var.c;
        if (ez7Var == null) {
            return;
        }
        mze mzeVar = null;
        for (mze mzeVar2 : (List) this.o) {
            if (mzeVar == null || Math.abs(mzeVar2.a.X - i) < Math.abs(mzeVar.a.X - i)) {
                mzeVar = mzeVar2;
            }
        }
        if (mzeVar == null) {
            return;
        }
        hm9.m("kad", "selectTrackWithHeight %s", mzeVar);
        lze lzeVar = mzeVar.a;
        int i2 = lzeVar.s0;
        int i3 = lzeVar.t0;
        qe4 qe4Var = new qe4(i2, 0, new int[]{i3});
        sze[] szeVarArr = ez7Var.c;
        int i4 = lzeVar.Z;
        sze szeVar = szeVarArr[i4];
        pe4 pe4VarB = bf4Var.b();
        pe4VarB.e(i4, szeVar, qe4Var);
        bf4Var.h(pe4VarB);
        List<lze> list = mzeVar.b;
        if (!list.isEmpty()) {
            for (lze lzeVar2 : list) {
                int i5 = lzeVar2.t0;
                if (i5 == i3) {
                    int i6 = lzeVar.s0;
                    int i7 = lzeVar2.s0;
                    if (i7 == i6) {
                        qe4 qe4Var2 = new qe4(i7, 0, new int[]{i5});
                        int i8 = lzeVar2.Z;
                        sze szeVar2 = szeVarArr[i8];
                        pe4 pe4VarB2 = bf4Var.b();
                        pe4VarB2.e(i8, szeVar2, qe4Var2);
                        bf4Var.h(pe4VarB2);
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.e15
    public boolean m(int i) {
        return c(i) != null;
    }

    @Override // defpackage.e15
    public f15 n(int i) {
        return c(i);
    }

    public kad(Account account, Set set, String str, String str2) {
        jod jodVar = jod.a;
        this.a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = setEmptySet;
        Map mapEmptyMap = Collections.emptyMap();
        this.o = str;
        this.X = str2;
        this.Y = jodVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        if (!it.hasNext()) {
            this.c = Collections.unmodifiableSet(hashSet);
        } else {
            au1.r(it.next());
            throw null;
        }
    }

    public kad(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, khe kheVar) {
        this.a = new jad(je7Var);
        this.b = je7Var2;
        this.c = je7Var3;
        this.o = kheVar;
        this.X = je7Var5;
        this.Y = je7Var6;
        this.Z = new khe(new z30(27, je7Var4));
    }

    public kad(zpd zpdVar, bf4 bf4Var, t33 t33Var, ef7 ef7Var, cle cleVar) {
        this.o = Collections.emptyList();
        this.b = zpdVar;
        this.a = bf4Var;
        this.X = t33Var;
        this.Y = ef7Var;
        this.Z = cleVar;
    }

    public kad(djb djbVar, ArrayList arrayList, Set set, List list) {
        mu1 mu1Var = eff.o;
        this.Y = new HashMap();
        this.Z = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            eu4 eu4Var = (eu4) it.next();
            if (!eu4Var.b()) {
                throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + eu4Var);
            }
        }
        this.a = djbVar;
        this.b = new HashSet(arrayList);
        this.o = new HashSet(set);
        this.c = new HashSet(list);
        this.X = mu1Var;
    }
}
