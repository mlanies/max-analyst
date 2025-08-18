package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class fd5 {
    public final ilc a;
    public final sh b;
    public final th c;

    public fd5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 7);
        this.c = new th(oneMeRoomDatabase, 18);
    }

    public static ArrayList b(long j, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Long l = (Long) list.get(i);
            tc5 tc5Var = new tc5();
            tc5Var.a = l.longValue();
            tc5Var.b = i + j;
            arrayList.add(tc5Var);
        }
        return arrayList;
    }

    public final void a(List list) {
        ilc ilcVar = this.a;
        ilcVar.c();
        try {
            new qa3(new sa3(2, new ia4(2, this)), 0, new sa3(2, new ed5(this, b(0L, list), 0))).a();
            ilcVar.r();
        } finally {
            ilcVar.l();
        }
    }

    public final ArrayList c() {
        xlc xlcVarA = xlc.a(0, "SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC");
        ilc ilcVar = this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                arrayList.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
            }
            return arrayList;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }
}
