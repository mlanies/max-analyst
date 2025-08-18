package defpackage;

import android.database.Cursor;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.exception.UserNotFoundException;

/* loaded from: classes2.dex */
public final /* synthetic */ class s72 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p82 b;

    public /* synthetic */ s72(p82 p82Var, int i) {
        this.a = i;
        this.b = p82Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ArrayList arrayList;
        byte[] blob;
        int i;
        switch (this.a) {
            case 0:
                p82 p82Var = this.b;
                if (p82Var.i) {
                    return;
                }
                hm9.n("p82", "load 1: start");
                if (p82Var.i) {
                    return;
                }
                ((iye) p82Var.A.get()).getClass();
                iye.a("ChatController.load()");
                long jNanoTime = System.nanoTime();
                xs xsVar = new xs(0);
                ArrayList arrayList2 = new ArrayList();
                rm4 rm4Var = p82Var.A;
                ((iye) rm4Var.get()).getClass();
                iye.a("ChatController.selectChats()");
                elc elcVar = ((k24) ((c34) p82Var.l.get())).b;
                dt2 dt2VarC = elcVar.c();
                dt2VarC.getClass();
                xlc xlcVarA = xlc.a(0, "SELECT * FROM chats");
                ilc ilcVar = dt2VarC.a;
                ilcVar.b();
                Cursor cursorO = ilcVar.o(xlcVarA, null);
                try {
                    int iN = tfg.n(cursorO, "id");
                    int iN2 = tfg.n(cursorO, "server_id");
                    int iN3 = tfg.n(cursorO, "data");
                    int iN4 = tfg.n(cursorO, "favourite_index");
                    int iN5 = tfg.n(cursorO, "sort_time");
                    int iN6 = tfg.n(cursorO, "cid");
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        long j = cursorO.getLong(iN);
                        long j2 = cursorO.getLong(iN2);
                        if (cursorO.isNull(iN3)) {
                            i = iN;
                            blob = null;
                        } else {
                            blob = cursorO.getBlob(iN3);
                            i = iN;
                        }
                        arrayList4.add(new la2(j, j2, dt2VarC.a().a(blob), cursorO.getLong(iN4), cursorO.getLong(iN5), cursorO.getLong(iN6)));
                        iN = i;
                    }
                    cursorO.close();
                    xlcVarA.n();
                    TreeSet treeSet = new TreeSet(elc.g);
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        treeSet.add(elcVar.a((la2) it.next()));
                    }
                    List<l92> listD0 = x53.D0(treeSet);
                    ((iye) rm4Var.get()).getClass();
                    Trace.endSection();
                    ArrayList arrayList5 = new ArrayList();
                    hm9.n("p82", "load 2");
                    for (l92 l92Var : listD0) {
                        k92 k92Var = l92Var.c;
                        if (k92Var.b != j92.b || (!(k92Var.r0 == 1 || k92Var.i0) || k92Var.e.containsKey(Long.valueOf(p82Var.K())))) {
                            p82Var.U(l92Var.b, l92Var);
                            xsVar.add(Long.valueOf(l92Var.b));
                            long j3 = l92Var.c.j;
                            if (j3 > 0) {
                                arrayList = arrayList3;
                                arrayList.add(Long.valueOf(j3));
                            } else {
                                arrayList = arrayList3;
                            }
                            arrayList3 = arrayList;
                        } else {
                            arrayList5.add(l92Var);
                        }
                    }
                    ArrayList arrayList6 = arrayList3;
                    hm9.n("p82", "load 3");
                    if (!arrayList5.isEmpty()) {
                        p82Var.y.b(new wt1(p82Var, 6, arrayList5));
                    }
                    hm9.n("p82", "load 4");
                    ((iye) p82Var.A.get()).getClass();
                    iye.a("ChatController.load().processedChats");
                    us usVarL = ((au8) p82Var.s.get()).l(arrayList6);
                    hm9.n("p82", "load 5");
                    qs qsVar = new qs(xsVar);
                    while (qsVar.hasNext()) {
                        l92 l92Var2 = (l92) p82Var.d.get((Long) qsVar.next());
                        if (l92Var2 != null) {
                            e52 e52VarG = p82Var.g(l92Var2, (cu8) usVarL.get(Long.valueOf(l92Var2.c.j)));
                            if (e52VarG.b.f(((p7b) p82Var.n).a.t())) {
                                p82Var.a = e52VarG;
                            }
                        }
                    }
                    hm9.n("p82", "load 6");
                    ((iye) p82Var.A.get()).getClass();
                    Trace.endSection();
                    p82Var.i = true;
                    hm9.n("p82", "load 7");
                    p82Var.j.b();
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        us7 us7Var = us7.X;
                        Locale locale = Locale.ROOT;
                        ir6Var.d(us7Var, "p82", "chats loaded to memory cache size: " + xsVar.size() + " by time " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime) + "ms", null);
                    }
                    p82Var.m.c(new vz2(xsVar, true, true, null, null, 120));
                    ((iye) p82Var.A.get()).getClass();
                    Trace.endSection();
                    if (p82Var.a == null) {
                        try {
                            List listSingletonList = Collections.singletonList(p82Var.a);
                            o82 o82Var = p82Var.G;
                            if (o82Var != null) {
                                o82Var.c(listSingletonList);
                            }
                        } catch (UserNotFoundException unused) {
                        }
                    }
                    hm9.n("p82", "load 8: finish");
                    return;
                } catch (Throwable th) {
                    cursorO.close();
                    xlcVarA.n();
                    throw th;
                }
            default:
                p82 p82Var2 = this.b;
                p82Var2.f.clear();
                p82Var2.c.clear();
                p82Var2.g.clear();
                p82Var2.d.clear();
                p82Var2.b.clear();
                p82Var2.e.clear();
                p82Var2.h.clear();
                p82Var2.a = null;
                return;
        }
    }
}
