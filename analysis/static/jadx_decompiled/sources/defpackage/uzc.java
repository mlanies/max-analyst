package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class uzc implements xzc {
    public final p82 a;
    public final el3 b;
    public final b0d c;
    public final boolean d;
    public final xzc e;
    public final xzc f;

    public uzc(p82 p82Var, el3 el3Var, b0d b0dVar, boolean z, vzc vzcVar, wzc wzcVar) {
        this.a = p82Var;
        this.b = el3Var;
        this.c = b0dVar;
        this.d = z;
        this.e = vzcVar;
        this.f = wzcVar;
    }

    @Override // defpackage.xzc
    public final List a(String str) {
        ArrayList arrayList = new ArrayList();
        xzc xzcVar = this.f;
        if (xzcVar != null) {
            arrayList.addAll(xzcVar.a(str));
        }
        try {
            gi9 gi9Var = new gi9((Object) null);
            gi9 gi9Var2 = new gi9((Object) null);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            c(str, gi9Var, gi9Var2, arrayList2, arrayList3);
            ArrayList arrayListB = b(str, this.d, gi9Var, gi9Var2);
            arrayList.addAll(arrayList2);
            arrayList.addAll(arrayListB);
            long jT = ((p7b) this.b.h).a.t();
            if (arrayList.size() > 1) {
                c63.U(arrayList, new c08(jT, 1));
            }
            arrayList.addAll(arrayList3);
        } catch (Throwable th) {
            hm9.p("Fts", "failure to search", th);
        }
        if (arrayList.isEmpty()) {
            try {
                arrayList.addAll(this.e.a(str));
            } catch (Throwable th2) {
                hm9.p("Fts", "failure to search by fallback strategy", th2);
            }
        }
        return arrayList;
    }

    public final ArrayList b(String str, boolean z, gi9 gi9Var, gi9 gi9Var2) {
        f56 f56VarE;
        xlc xlcVarA;
        Cursor cursorO;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        p82 p82Var = this.a;
        elc elcVar = ((k24) ((c34) p82Var.l.get())).b;
        elcVar.getClass();
        boolean zC0 = w9e.C0(str);
        List listD0 = nz4.a;
        if (!zC0 && (f56VarE = g56.e(str)) != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            e56 e56Var = f56VarE.a;
            e56 e56Var2 = e56Var.c;
            String str2 = e56Var.a;
            String str3 = e56Var.b;
            if (e56Var2 != null) {
                dt2 dt2VarC = elcVar.c();
                e56 e56Var3 = e56Var.c;
                String str4 = e56Var3.a;
                dt2VarC.getClass();
                xlcVarA = xlc.a(4, "SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? OR normalizedTitleWithoutEmoji MATCH ? OR originalTitleWithoutEmoji MATCH ? || '*' ORDER BY sortTime DESC ");
                if (str3 == null) {
                    xlcVarA.W(1);
                } else {
                    xlcVarA.f(1, str3);
                }
                if (str2 == null) {
                    xlcVarA.W(2);
                } else {
                    xlcVarA.f(2, str2);
                }
                if (str4 == null) {
                    xlcVarA.W(3);
                } else {
                    xlcVarA.f(3, str4);
                }
                String str5 = e56Var3.b;
                if (str5 == null) {
                    xlcVarA.W(4);
                } else {
                    xlcVarA.f(4, str5);
                }
                ilc ilcVar = dt2VarC.a;
                ilcVar.b();
                cursorO = ilcVar.o(xlcVarA, null);
                try {
                    arrayList = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
                    }
                    cursorO.close();
                    xlcVarA.n();
                } finally {
                }
            } else {
                dt2 dt2VarC2 = elcVar.c();
                dt2VarC2.getClass();
                xlcVarA = xlc.a(2, "SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? || '*' ORDER BY sortTime DESC ");
                if (str3 == null) {
                    xlcVarA.W(1);
                } else {
                    xlcVarA.f(1, str3);
                }
                if (str2 == null) {
                    xlcVarA.W(2);
                } else {
                    xlcVarA.f(2, str2);
                }
                ilc ilcVar2 = dt2VarC2.a;
                ilcVar2.b();
                cursorO = ilcVar2.o(xlcVarA, null);
                try {
                    ArrayList arrayList4 = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList4.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
                    }
                    cursorO.close();
                    xlcVarA.n();
                    arrayList = arrayList4;
                } finally {
                }
            }
            linkedHashSet.addAll(arrayList);
            e56 e56Var4 = f56VarE.b;
            e56 e56Var5 = e56Var4.c;
            String str6 = e56Var4.a;
            String str7 = e56Var4.b;
            if (e56Var5 != null) {
                dt2 dt2VarC3 = elcVar.c();
                e56 e56Var6 = e56Var4.c;
                String str8 = e56Var6.a;
                dt2VarC3.getClass();
                xlcVarA = xlc.a(4, "SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? OR normalizedTitleWithoutEmoji LIKE ? OR originalTitleWithoutEmoji LIKE ? ORDER BY sortTime DESC ");
                if (str7 == null) {
                    xlcVarA.W(1);
                } else {
                    xlcVarA.f(1, str7);
                }
                if (str6 == null) {
                    xlcVarA.W(2);
                } else {
                    xlcVarA.f(2, str6);
                }
                if (str8 == null) {
                    xlcVarA.W(3);
                } else {
                    xlcVarA.f(3, str8);
                }
                String str9 = e56Var6.b;
                if (str9 == null) {
                    xlcVarA.W(4);
                } else {
                    xlcVarA.f(4, str9);
                }
                ilc ilcVar3 = dt2VarC3.a;
                ilcVar3.b();
                cursorO = ilcVar3.o(xlcVarA, null);
                try {
                    arrayList2 = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList2.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
                    }
                } finally {
                }
            } else {
                dt2 dt2VarC4 = elcVar.c();
                dt2VarC4.getClass();
                xlcVarA = xlc.a(2, "SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? ORDER BY sortTime DESC ");
                if (str7 == null) {
                    xlcVarA.W(1);
                } else {
                    xlcVarA.f(1, str7);
                }
                if (str6 == null) {
                    xlcVarA.W(2);
                } else {
                    xlcVarA.f(2, str6);
                }
                ilc ilcVar4 = dt2VarC4.a;
                ilcVar4.b();
                cursorO = ilcVar4.o(xlcVarA, null);
                try {
                    arrayList2 = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList2.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
                    }
                } finally {
                }
            }
            linkedHashSet.addAll(arrayList2);
            listD0 = x53.D0(linkedHashSet);
        }
        if (!nd7.D(listD0)) {
            EnumSet enumSet = z ? p82.M : p82.L;
            Iterator it = listD0.iterator();
            while (it.hasNext()) {
                e52 e52VarC = p82Var.C(((Long) it.next()).longValue());
                if (e52VarC != null && p82.m(e52VarC, enumSet, z, ((p7b) p82Var.n).e)) {
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (e52VarC.C()) {
                        try {
                            if (!gi9Var2.d(e52VarC.a)) {
                                uj3 uj3VarL = e52VarC.l();
                                b0d b0dVar = this.c;
                                if (uj3VarL != null) {
                                    try {
                                        if (!gi9Var.d(uj3VarL.n())) {
                                            arrayList3.add(b0dVar.a(e52VarC, str));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        hm9.p("p82", "iterateChatsByQuery fail", th);
                                    }
                                }
                                arrayList3.add(b0dVar.a(e52VarC, str));
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            }
        }
        if (arrayList3.size() > 1) {
            c63.U(arrayList3, new ky6(11));
        }
        return arrayList3;
    }

    public final void c(String str, gi9 gi9Var, gi9 gi9Var2, ArrayList arrayList, ArrayList arrayList2) {
        e52 e52VarF;
        b0d b0dVar;
        f56 f56VarE;
        xlc xlcVarA;
        Cursor cursorO;
        ArrayList arrayList3;
        ArrayList arrayList4;
        el3 el3Var = this.b;
        glc glcVar = ((k24) ((c34) el3Var.f.get())).d;
        glcVar.getClass();
        boolean zC0 = w9e.C0(str);
        List listD0 = nz4.a;
        if (!zC0 && (f56VarE = g56.e(str)) != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            e56 e56Var = f56VarE.a;
            e56 e56Var2 = e56Var.c;
            String str2 = e56Var.a;
            String str3 = e56Var.b;
            if (e56Var2 != null) {
                ir3 ir3VarH = glcVar.h();
                e56 e56Var3 = e56Var.c;
                String str4 = e56Var3.a;
                ir3VarH.getClass();
                xlcVarA = xlc.a(5, "SELECT docid FROM contact_title WHERE (allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ? OR allNormalizedTitlesWithoutEmoji MATCH ? OR allOriginalTitlesWithoutEmoji MATCH ? || '*')");
                if (str3 == null) {
                    xlcVarA.W(1);
                } else {
                    xlcVarA.f(1, str3);
                }
                if (str2 == null) {
                    xlcVarA.W(2);
                } else {
                    xlcVarA.f(2, str2);
                }
                if (str2 == null) {
                    xlcVarA.W(3);
                } else {
                    xlcVarA.f(3, str2);
                }
                if (str4 == null) {
                    xlcVarA.W(4);
                } else {
                    xlcVarA.f(4, str4);
                }
                String str5 = e56Var3.b;
                if (str5 == null) {
                    xlcVarA.W(5);
                } else {
                    xlcVarA.f(5, str5);
                }
                ilc ilcVar = ir3VarH.a;
                ilcVar.b();
                cursorO = ilcVar.o(xlcVarA, null);
                try {
                    arrayList3 = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList3.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
                    }
                    cursorO.close();
                    xlcVarA.n();
                } finally {
                }
            } else {
                ir3 ir3VarH2 = glcVar.h();
                ir3VarH2.getClass();
                xlcVarA = xlc.a(3, "SELECT docid FROM contact_title WHERE allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ?");
                if (str3 == null) {
                    xlcVarA.W(1);
                } else {
                    xlcVarA.f(1, str3);
                }
                if (str2 == null) {
                    xlcVarA.W(2);
                } else {
                    xlcVarA.f(2, str2);
                }
                if (str2 == null) {
                    xlcVarA.W(3);
                } else {
                    xlcVarA.f(3, str2);
                }
                ilc ilcVar2 = ir3VarH2.a;
                ilcVar2.b();
                cursorO = ilcVar2.o(xlcVarA, null);
                try {
                    arrayList3 = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList3.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
                    }
                    cursorO.close();
                    xlcVarA.n();
                } finally {
                }
            }
            linkedHashSet.addAll(arrayList3);
            e56 e56Var4 = f56VarE.b;
            e56 e56Var5 = e56Var4.c;
            String str6 = e56Var4.a;
            String str7 = e56Var4.b;
            if (e56Var5 != null) {
                ir3 ir3VarH3 = glcVar.h();
                e56 e56Var6 = e56Var4.c;
                String str8 = e56Var6.a;
                ir3VarH3.getClass();
                xlcVarA = xlc.a(5, "SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ? OR allNormalizedTitlesWithoutEmoji LIKE ? OR allOriginalTitlesWithoutEmoji LIKE ?)");
                if (str7 == null) {
                    xlcVarA.W(1);
                } else {
                    xlcVarA.f(1, str7);
                }
                if (str6 == null) {
                    xlcVarA.W(2);
                } else {
                    xlcVarA.f(2, str6);
                }
                if (str6 == null) {
                    xlcVarA.W(3);
                } else {
                    xlcVarA.f(3, str6);
                }
                if (str8 == null) {
                    xlcVarA.W(4);
                } else {
                    xlcVarA.f(4, str8);
                }
                String str9 = e56Var6.b;
                if (str9 == null) {
                    xlcVarA.W(5);
                } else {
                    xlcVarA.f(5, str9);
                }
                ilc ilcVar3 = ir3VarH3.a;
                ilcVar3.b();
                cursorO = ilcVar3.o(xlcVarA, null);
                try {
                    arrayList4 = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList4.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
                    }
                } finally {
                }
            } else {
                ir3 ir3VarH4 = glcVar.h();
                ir3VarH4.getClass();
                xlcVarA = xlc.a(3, "SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ?)");
                if (str7 == null) {
                    xlcVarA.W(1);
                } else {
                    xlcVarA.f(1, str7);
                }
                if (str6 == null) {
                    xlcVarA.W(2);
                } else {
                    xlcVarA.f(2, str6);
                }
                if (str6 == null) {
                    xlcVarA.W(3);
                } else {
                    xlcVarA.f(3, str6);
                }
                ilc ilcVar4 = ir3VarH4.a;
                ilcVar4.b();
                cursorO = ilcVar4.o(xlcVarA, null);
                try {
                    arrayList4 = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList4.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
                    }
                } finally {
                }
            }
            linkedHashSet.addAll(arrayList4);
            listD0 = x53.D0(linkedHashSet);
        }
        if (nd7.D(listD0)) {
            return;
        }
        uj3 uj3VarI = el3Var.i(((p7b) el3Var.h).a.t(), false);
        Iterator it = listD0.iterator();
        while (it.hasNext()) {
            uj3 uj3Var = (uj3) el3Var.a.get((Long) it.next());
            if (uj3Var != null && uj3VarI != null && uj3Var != uj3VarI) {
                if (el3.s.contains(uj3Var.a.c.k)) {
                    try {
                        e52VarF = this.a.F(uj3Var.n());
                        b0dVar = this.c;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (e52VarF == null || !e52VarF.C()) {
                        try {
                            arrayList2.add(b0dVar.b(uj3Var, str));
                        } catch (Throwable th2) {
                            th = th2;
                            hm9.p("ContactController", "iterateContactsByQuery fail", th);
                        }
                    } else {
                        try {
                            arrayList.add(b0dVar.a(e52VarF, str));
                            try {
                                gi9Var2.a(e52VarF.a);
                                try {
                                    gi9Var.a(uj3Var.n());
                                } catch (Throwable th3) {
                                    th = th3;
                                    hm9.p("ContactController", "iterateContactsByQuery fail", th);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
            }
        }
    }
}
