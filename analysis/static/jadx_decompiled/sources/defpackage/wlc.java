package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class wlc {
    public final jlc a;
    public final khe b = new khe(new lwa(17, this));

    public wlc(jlc jlcVar) {
        this.a = jlcVar;
    }

    public static xua b(wlc wlcVar, wua wuaVar) {
        wlcVar.getClass();
        return new xua(wuaVar.b, wuaVar.c, wuaVar.o, wuaVar.X, wuaVar.Y, wuaVar.Z, wuaVar.s0, wuaVar.t0, wuaVar.u0, wuaVar.v0);
    }

    public static wua d(xua xuaVar) {
        long j = xuaVar.a;
        int iS = au1.s(xuaVar.j);
        return new wua(j, xuaVar.b, xuaVar.c, xuaVar.d, xuaVar.e, xuaVar.f, xuaVar.g, xuaVar.h, xuaVar.i, iS);
    }

    public final void a() {
        rva rvaVarC = c();
        ilc ilcVar = rvaVarC.a;
        ilcVar.b();
        p19 p19Var = rvaVarC.e;
        q36 q36VarF = p19Var.f();
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
            } finally {
                ilcVar.l();
            }
        } finally {
            p19Var.t(q36VarF);
        }
    }

    public final rva c() {
        return (rva) this.b.getValue();
    }

    public final ArrayList e() {
        rva rvaVarC = c();
        rvaVarC.getClass();
        xlc xlcVarA = xlc.a(0, "SELECT * FROM phones");
        ilc ilcVar = rvaVarC.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "phonebook_id");
            int iN3 = tfg.n(cursorO, "contact_id");
            int iN4 = tfg.n(cursorO, "phone");
            int iN5 = tfg.n(cursorO, "server_phone");
            int iN6 = tfg.n(cursorO, "email");
            int iN7 = tfg.n(cursorO, "first_name");
            int iN8 = tfg.n(cursorO, "last_name");
            int iN9 = tfg.n(cursorO, "avatar_path");
            int iN10 = tfg.n(cursorO, "type");
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                arrayList.add(new xua(cursorO.getLong(iN), cursorO.getLong(iN2), cursorO.getInt(iN3), cursorO.isNull(iN4) ? null : cursorO.getString(iN4), cursorO.getLong(iN5), cursorO.isNull(iN6) ? null : cursorO.getString(iN6), cursorO.isNull(iN7) ? null : cursorO.getString(iN7), cursorO.isNull(iN8) ? null : cursorO.getString(iN8), cursorO.isNull(iN9) ? null : cursorO.getString(iN9), ey8.b(cursorO.getInt(iN10))));
            }
            cursorO.close();
            xlcVarA.n();
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(d((xua) it.next()));
            }
            return arrayList2;
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }

    public final ArrayList f(List list) {
        rva rvaVarC = c();
        rvaVarC.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM phones WHERE server_phone in (");
        int size = list.size();
        a14.c(sb, size);
        sb.append(")");
        xlc xlcVarA = xlc.a(size, sb.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l == null) {
                xlcVarA.W(i);
            } else {
                xlcVarA.j(i, l.longValue());
            }
            i++;
        }
        ilc ilcVar = rvaVarC.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "phonebook_id");
            int iN3 = tfg.n(cursorO, "contact_id");
            int iN4 = tfg.n(cursorO, "phone");
            int iN5 = tfg.n(cursorO, "server_phone");
            int iN6 = tfg.n(cursorO, "email");
            int iN7 = tfg.n(cursorO, "first_name");
            int iN8 = tfg.n(cursorO, "last_name");
            int iN9 = tfg.n(cursorO, "avatar_path");
            int iN10 = tfg.n(cursorO, "type");
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                arrayList.add(new xua(cursorO.getLong(iN), cursorO.getLong(iN2), cursorO.getInt(iN3), cursorO.isNull(iN4) ? null : cursorO.getString(iN4), cursorO.getLong(iN5), cursorO.isNull(iN6) ? null : cursorO.getString(iN6), cursorO.isNull(iN7) ? null : cursorO.getString(iN7), cursorO.isNull(iN8) ? null : cursorO.getString(iN8), cursorO.isNull(iN9) ? null : cursorO.getString(iN9), ey8.b(cursorO.getInt(iN10))));
            }
            cursorO.close();
            xlcVarA.n();
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((xua) it2.next()));
            }
            return arrayList2;
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }
}
