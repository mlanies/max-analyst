package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class od5 {
    public final ilc a;
    public final sh b;
    public final th c;

    public od5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 8);
        this.c = new th(oneMeRoomDatabase, 19);
    }

    public static ArrayList b(int i, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Long l = (Long) list.get(i2);
            ac5 ac5Var = new ac5();
            ac5Var.a = l.longValue();
            ac5Var.b = i + i2;
            arrayList.add(ac5Var);
        }
        return arrayList;
    }

    public final void a(List list) {
        ilc ilcVar = this.a;
        ilcVar.c();
        try {
            new qa3(new sa3(2, new ia4(3, this)), 0, new sa3(2, new nd5(this, b(0, list), 0))).a();
            ilcVar.r();
        } finally {
            ilcVar.l();
        }
    }

    public final ArrayList c() {
        xlc xlcVarA = xlc.a(0, "SELECT id FROM favorite_stickers ORDER BY `index` ASC");
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
