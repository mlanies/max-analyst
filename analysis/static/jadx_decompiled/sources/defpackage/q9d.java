package defpackage;

import android.database.Cursor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class q9d extends d8d implements hua {
    public static WeakReference Z = new WeakReference(null);
    public final mg4 X;
    public final String Y;
    public final long b;
    public final long c;
    public int o;

    public q9d(long j, long j2, int i, mg4 mg4Var) {
        this.b = j;
        this.c = j2;
        this.o = i;
        this.X = mg4Var;
        String strName = mg4Var.name();
        StringBuilder sbK = au1.k(j, "TaskSyncChatHistory(#", ",");
        ms2.j(j2, ",", strName, sbK);
        sbK.append(")");
        this.Y = sbK.toString();
    }

    @Override // defpackage.hua
    public final int c() {
        b46 b46Var;
        hm9.n(this.Y, "onPreExecute");
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        if (!((ch3) e8dVar.E.getValue()).e()) {
            return 2;
        }
        eoe eoeVarR = r();
        iua iuaVar = iua.y0;
        goe goeVar = goe.o;
        hoe hoeVarB = ((k24) ((c34) eoeVarR.a.get())).f.b();
        List listSingletonList = Collections.singletonList(iuaVar);
        List<goe> listSingletonList2 = Collections.singletonList(goeVar);
        hoeVarB.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id FROM tasks WHERE type in (");
        int size = listSingletonList.size();
        a14.c(sb, size);
        sb.append(") AND status in (");
        int size2 = listSingletonList2.size();
        a14.c(sb, size2);
        sb.append(")");
        xlc xlcVarA = xlc.a(size2 + size, sb.toString());
        Iterator it = listSingletonList.iterator();
        int i = 1;
        while (true) {
            boolean zHasNext = it.hasNext();
            b46Var = hoeVarB.c;
            if (!zHasNext) {
                break;
            }
            iua iuaVar2 = (iua) it.next();
            b46Var.getClass();
            xlcVarA.j(i, iuaVar2.a);
            i++;
        }
        int i2 = size + 1;
        for (goe goeVar2 : listSingletonList2) {
            b46Var.getClass();
            xlcVarA.j(i2, goeVar2.a);
            i2++;
        }
        ilc ilcVar = hoeVarB.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                arrayList.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
            }
            cursorO.close();
            xlcVarA.n();
            return arrayList.isEmpty() ^ true ? 2 : 1;
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }

    @Override // defpackage.hua
    public final void d() {
        hm9.n(this.Y, "removeTask");
        r().d(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q9d.class.equals(obj.getClass())) {
            return false;
        }
        q9d q9dVar = (q9d) obj;
        return this.c == q9dVar.c && this.X == q9dVar.X;
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.SyncChatHistory syncChatHistory = new Tasks.SyncChatHistory();
        syncChatHistory.taskId = this.b;
        syncChatHistory.chatId = this.c;
        syncChatHistory.count = this.o;
        syncChatHistory.itemTypeId = this.X.a;
        hm9.n(this.Y, "toByteArray");
        return qw8.toByteArray(syncChatHistory);
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.y0;
    }

    public final int hashCode() {
        int iHashCode = q9d.class.getName().hashCode() * 31;
        long j = this.c;
        return this.X.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    @Override // defpackage.d8d
    public final ExecutorService k(iba ibaVar, vi4 vi4Var) {
        ExecutorService executorServiceF;
        int iMax;
        ExecutorService executorService = (ExecutorService) Z.get();
        if (executorService != null) {
            return executorService;
        }
        synchronized (q9d.class) {
            try {
                executorServiceF = (ExecutorService) Z.get();
                if (executorServiceF == null) {
                    int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                    int iOrdinal = vi4Var.ordinal();
                    if (iOrdinal == 0) {
                        iMax = Math.max(4, iAvailableProcessors - 1);
                    } else if (iOrdinal == 1) {
                        iMax = Math.max(8, iAvailableProcessors);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iMax = Math.max(12, iAvailableProcessors);
                    }
                    bc7[] bc7VarArr = iba.p;
                    executorServiceF = ibaVar.f(0, "sync-chat-history", iMax, 5);
                    Z = new WeakReference(executorServiceF);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceF;
    }

    public final String toString() {
        return this.Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0385  */
    @Override // defpackage.d8d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q9d.x():void");
    }

    public final void y() {
        String str = this.Y;
        hm9.n(str, "finishTask");
        hm9.n(str, "removeTask");
        r().d(this.b);
        r9d.y(u());
    }
}
