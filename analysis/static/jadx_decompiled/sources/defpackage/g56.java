package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class g56 {
    public static final qec a = new qec("[^\\p{L}\\p{N}\\p{P}\\p{Z}]");

    public static e56 a(String str) {
        if (w9e.C0(str)) {
            return null;
        }
        String strK = b0d.k(str);
        String upperCase = str.toUpperCase(Locale.getDefault());
        qec qecVar = a;
        String strB = qecVar.b("", strK);
        e56 e56Var = strB.length() > 0 ? new e56(strB, qecVar.b("", upperCase), null) : null;
        return new e56(strK, upperCase, (tpa.f(e56Var != null ? e56Var.b : null, upperCase) && tpa.f(e56Var.a, strK)) ? null : e56Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e56 b(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jl3 jl3Var = (jl3) it.next();
            if (!jl3Var.equals(jl3.e)) {
                String strA = jl3Var.a();
                if (strA.length() != 0) {
                    e56Var = strA;
                }
            }
            if (e56Var != null) {
                arrayList.add(e56Var);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            e56 e56VarA = a((String) it2.next());
            if (e56VarA != null) {
                arrayList2.add(e56VarA);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        Iterator it3 = arrayList2.iterator();
        int i = 0;
        while (it3.hasNext()) {
            int i2 = i + 1;
            e56 e56Var = (e56) it3.next();
            sb.append(e56Var.a);
            sb2.append(e56Var.b);
            e56 e56Var2 = e56Var.c;
            String str = e56Var2 != null ? e56Var2.b : null;
            if (str != null && str.length() != 0) {
                sb4.append(e56Var2 != null ? e56Var2.b : null);
            }
            String str2 = e56Var2 != null ? e56Var2.a : null;
            if (str2 != null && str2.length() != 0) {
                sb3.append(e56Var2 != null ? e56Var2.a : null);
            }
            if (i != y53.L(arrayList2)) {
                sb.append(',');
                sb2.append(',');
                if (sb4.length() > 0) {
                    sb4.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.append(',');
                }
            }
            i = i2;
        }
        return new e56(sb.toString(), sb2.toString(), (sb3.length() > 0 || sb4.length() > 0) ? new e56(sb3.toString(), sb4.toString(), null) : null);
    }

    public static String c(String str) {
        return zr6.i("*", str, "*");
    }

    public static String d(String str) {
        return zr6.i("%", str, "%");
    }

    public static f56 e(String str) {
        e56 e56VarA = a(str);
        if (e56VarA == null) {
            return null;
        }
        String str2 = e56VarA.b;
        String strC = c(str2);
        String str3 = e56VarA.a;
        String strC2 = c(str3);
        e56 e56Var = e56VarA.c;
        return new f56(new e56(strC2, strC, e56Var != null ? e56.a(e56Var, c(e56Var.b)) : null), new e56(d(str3), d(str2), e56Var != null ? e56.a(e56Var, d(e56Var.b)) : null));
    }
}
