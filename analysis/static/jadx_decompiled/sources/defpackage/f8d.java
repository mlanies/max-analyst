package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class f8d extends d8d {
    public final /* synthetic */ int b;
    public final Object c;

    public f8d() {
        this.b = 0;
        this.c = f8d.class.getName();
    }

    @Override // defpackage.d8d
    public final void x() {
        Object obj = this.c;
        switch (this.b) {
            case 0:
                jmc jmcVar = ((k24) ((c34) s().a.get())).f;
                crd crdVar = goe.b;
                hoe hoeVarB = jmcVar.b();
                hoeVarB.getClass();
                xlc xlcVarA = xlc.a(1, "SELECT * FROM tasks WHERE status = ?");
                hoeVarB.c.getClass();
                xlcVarA.j(1, 10);
                ilc ilcVar = hoeVarB.a;
                ilcVar.b();
                Cursor cursorO = ilcVar.o(xlcVarA, null);
                try {
                    int iN = tfg.n(cursorO, "id");
                    int iN2 = tfg.n(cursorO, "type");
                    int iN3 = tfg.n(cursorO, "status");
                    int iN4 = tfg.n(cursorO, "fails_count");
                    int iN5 = tfg.n(cursorO, "depends_request_id");
                    int iN6 = tfg.n(cursorO, "dependency_type");
                    int iN7 = tfg.n(cursorO, "data");
                    int iN8 = tfg.n(cursorO, "created_time");
                    ArrayList arrayList = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList.add(new vne(cursorO.getLong(iN), b46.t(cursorO.getInt(iN2)), b46.r(cursorO.getInt(iN3)), cursorO.getInt(iN4), cursorO.getLong(iN5), cursorO.getInt(iN6), cursorO.isNull(iN7) ? null : cursorO.getBlob(iN7), cursorO.getLong(iN8)));
                    }
                    cursorO.close();
                    xlcVarA.n();
                    for (une uneVar : jmcVar.c(arrayList)) {
                        hm9.n((String) obj, "mark processing task: " + uneVar + " as failed");
                        s().c(uneVar.a);
                    }
                    return;
                } catch (Throwable th) {
                    cursorO.close();
                    xlcVarA.n();
                    throw th;
                }
            default:
                HashSet hashSet = new HashSet();
                Collection collection = (Collection) obj;
                if (collection == null || collection.contains(gx0.c)) {
                    hashSet.add(2);
                }
                if (collection == null || collection.contains(gx0.b)) {
                    hashSet.add(1);
                    hashSet.add(4);
                }
                if (true ^ hashSet.isEmpty()) {
                    vlc vlcVar = ((k24) o().a).c;
                    hj8 hj8Var = new hj8(11);
                    vlcVar.getClass();
                    try {
                        ((OneMeRoomDatabase) vlcVar.a.m()).q(new v05(vlcVar, hashSet, hj8Var, 29));
                        return;
                    } catch (Throwable th2) {
                        hm9.p("RoomMessagesDatabase", "Can't update attach by type", th2);
                        return;
                    }
                }
                return;
        }
    }

    public f8d(HashSet hashSet) {
        this.b = 1;
        this.c = hashSet;
    }
}
