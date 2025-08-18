package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ku8 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static lu8 a(gy8 gy8Var) {
        int iN;
        String strP;
        int i;
        long jLongValue;
        String strP2;
        Object njcVar;
        LinkedHashMap linkedHashMap;
        int i2 = 1;
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
        String str = null;
        if (iN == 0) {
            return null;
        }
        pu8 pu8Var = pu8.a;
        String strP3 = null;
        LinkedHashMap linkedHashMap2 = null;
        pu8 pu8Var2 = pu8Var;
        int i3 = 0;
        long j = 0;
        short sShortValue = 0;
        short sShortValue2 = 0;
        while (i3 < iN) {
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
                    if (iS2 != i2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strP = str;
            }
            if (strP != null) {
                switch (strP.hashCode()) {
                    case -2102099874:
                        if (strP.equals("entityId")) {
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
                            i = 1;
                            jLongValue = lValueOf.longValue();
                            break;
                        }
                        try {
                            gy8Var.z();
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
                        jLongValue = j;
                        i = 1;
                        break;
                    case -1483200242:
                        if (strP.equals("entityName")) {
                            try {
                                strP3 = lz7.P(gy8Var);
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
                                strP3 = null;
                            }
                        } else {
                            gy8Var.z();
                        }
                        jLongValue = j;
                        i = 1;
                        break;
                    case -1106363674:
                        if (strP.equals("length")) {
                            Short shValueOf = (short) 0;
                            try {
                                shValueOf = Short.valueOf(lz7.O(gy8Var));
                            } catch (Throwable th6) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                Iterator it6 = u7d.a.iterator();
                                while (it6.hasNext()) {
                                    ((r4a) it6.next()).getClass();
                                    r4a.a(th6);
                                }
                                int iS6 = au1.s(k7d.a);
                                if (iS6 != 0) {
                                    if (iS6 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th6;
                                }
                            }
                            sShortValue2 = shValueOf.shortValue();
                            jLongValue = j;
                            i = 1;
                            break;
                        }
                        gy8Var.z();
                        jLongValue = j;
                        i = 1;
                    case 3151786:
                        if (strP.equals("from")) {
                            Short shValueOf2 = (short) 0;
                            try {
                                shValueOf2 = Short.valueOf(lz7.O(gy8Var));
                            } catch (Throwable th7) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                Iterator it7 = u7d.a.iterator();
                                while (it7.hasNext()) {
                                    ((r4a) it7.next()).getClass();
                                    r4a.a(th7);
                                }
                                int iS7 = au1.s(k7d.a);
                                if (iS7 != 0) {
                                    if (iS7 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th7;
                                }
                            }
                            sShortValue = shValueOf2.shortValue();
                            jLongValue = j;
                            i = 1;
                            break;
                        }
                        gy8Var.z();
                        jLongValue = j;
                        i = 1;
                    case 3575610:
                        if (strP.equals("type")) {
                            try {
                                strP2 = lz7.P(gy8Var);
                            } catch (Throwable th8) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                                Iterator it8 = u7d.a.iterator();
                                while (it8.hasNext()) {
                                    ((r4a) it8.next()).getClass();
                                    r4a.a(th8);
                                }
                                int iS8 = au1.s(k7d.a);
                                if (iS8 != 0) {
                                    if (iS8 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th8;
                                }
                                strP2 = null;
                            }
                            if (strP2 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            try {
                                njcVar = pu8.valueOf(strP2);
                            } catch (Throwable th9) {
                                njcVar = new njc(th9);
                            }
                            if (njcVar instanceof njc) {
                                njcVar = pu8Var;
                            }
                            try {
                                pu8Var2 = (pu8) njcVar;
                            } catch (Throwable th10) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                Iterator it9 = u7d.a.iterator();
                                while (it9.hasNext()) {
                                    ((r4a) it9.next()).getClass();
                                    r4a.a(th10);
                                }
                                int iS9 = au1.s(k7d.a);
                                if (iS9 != 0) {
                                    if (iS9 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th10;
                                }
                                pu8Var2 = pu8Var;
                            }
                            jLongValue = j;
                            i = 1;
                            break;
                        }
                        gy8Var.z();
                        jLongValue = j;
                        i = 1;
                    case 405645655:
                        if (strP.equals("attributes")) {
                            try {
                                if (gy8Var.n().a() == 8) {
                                    linkedHashMap = new LinkedHashMap();
                                    int iX0 = gy8Var.x0();
                                    for (int i4 = 0; i4 < iX0; i4++) {
                                        String strZ0 = gy8Var.z0();
                                        n1 n1VarA0 = gy8Var.A0();
                                        if (!(n1VarA0.e() == 5)) {
                                            throw new IllegalArgumentException("type = " + h4f.s(n1VarA0.e()) + " not supported");
                                            break;
                                        } else {
                                            linkedHashMap.put(strZ0, ((m1) n1VarA0.m()).y());
                                        }
                                    }
                                } else {
                                    gy8Var.z();
                                    linkedHashMap = null;
                                }
                                linkedHashMap2 = linkedHashMap;
                            } catch (Throwable th11) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                                Iterator it10 = u7d.a.iterator();
                                while (it10.hasNext()) {
                                    ((r4a) it10.next()).getClass();
                                    r4a.a(th11);
                                }
                                int iS10 = au1.s(k7d.a);
                                if (iS10 != 0) {
                                    if (iS10 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th11;
                                }
                                linkedHashMap2 = null;
                            }
                            jLongValue = j;
                            i = 1;
                            break;
                        }
                        gy8Var.z();
                        jLongValue = j;
                        i = 1;
                    default:
                        gy8Var.z();
                        jLongValue = j;
                        i = 1;
                        break;
                }
            } else {
                jLongValue = j;
                i = i2;
            }
            i3++;
            i2 = i;
            j = jLongValue;
            str = null;
        }
        return new lu8(j, strP3, pu8Var2, sShortValue, sShortValue2, linkedHashMap2);
    }
}
