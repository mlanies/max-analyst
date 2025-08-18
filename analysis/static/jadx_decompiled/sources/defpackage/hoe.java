package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class hoe {
    public final ilc a;
    public final ct2 b;
    public final b46 c = new b46();
    public final zkc d;
    public final zkc e;
    public final zkc f;
    public final zkc g;
    public final zkc h;
    public final zkc i;

    public hoe(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ct2(this, oneMeRoomDatabase, 2);
        new s19(this, oneMeRoomDatabase, 4);
        this.d = new zkc(oneMeRoomDatabase, 14);
        new zkc(oneMeRoomDatabase, 15);
        this.e = new zkc(oneMeRoomDatabase, 16);
        this.f = new zkc(oneMeRoomDatabase, 17);
        this.g = new zkc(oneMeRoomDatabase, 18);
        this.h = new zkc(oneMeRoomDatabase, 19);
        this.i = new zkc(oneMeRoomDatabase, 20);
    }

    public static void a(hoe hoeVar, long j) {
        hoeVar.c(j, goe.X);
        ilc ilcVar = hoeVar.a;
        ilcVar.b();
        zkc zkcVar = hoeVar.f;
        q36 q36VarF = zkcVar.f();
        q36VarF.j(1, j);
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
            } finally {
                ilcVar.l();
            }
        } finally {
            zkcVar.t(q36VarF);
        }
    }

    public final ArrayList b(int i, List list) {
        StringBuilder sbL = au1.l("SELECT id FROM tasks WHERE status in (");
        int size = list.size();
        a14.c(sbL, size);
        sbL.append(") LIMIT ");
        sbL.append("?");
        int i2 = size + 1;
        xlc xlcVarA = xlc.a(i2, sbL.toString());
        Iterator it = list.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            goe goeVar = (goe) it.next();
            this.c.getClass();
            xlcVarA.j(i3, goeVar.a);
            i3++;
        }
        xlcVarA.j(i2, i);
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

    public final void c(long j, goe goeVar) {
        ilc ilcVar = this.a;
        ilcVar.b();
        zkc zkcVar = this.d;
        q36 q36VarF = zkcVar.f();
        this.c.getClass();
        q36VarF.j(1, goeVar.a);
        q36VarF.j(2, j);
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
            } finally {
                ilcVar.l();
            }
        } finally {
            zkcVar.t(q36VarF);
        }
    }
}
