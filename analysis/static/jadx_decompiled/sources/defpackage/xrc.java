package defpackage;

import android.database.Cursor;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class xrc {
    public final ilc a;
    public final zkc b;
    public final zkc c;
    public final zkc d;

    public xrc(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new zkc(oneMeRoomDatabase, 6);
        this.c = new zkc(oneMeRoomDatabase, 7);
        this.d = new zkc(oneMeRoomDatabase, 8);
    }

    public final yrc a(long j) {
        xlc xlcVarA = xlc.a(1, "SELECT * FROM saved_msg_chat WHERE user_id = ?");
        xlcVarA.j(1, j);
        ilc ilcVar = this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            return cursorO.moveToFirst() ? new yrc(cursorO.getLong(tfg.n(cursorO, "user_id")), cursorO.getLong(tfg.n(cursorO, "chat_id"))) : null;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public final void b(long j, long j2) {
        ilc ilcVar = this.a;
        ilcVar.b();
        zkc zkcVar = this.b;
        q36 q36VarF = zkcVar.f();
        q36VarF.j(1, j);
        q36VarF.j(2, j2);
        try {
            ilcVar.c();
            try {
                q36VarF.m();
                ilcVar.r();
            } finally {
                ilcVar.l();
            }
        } finally {
            zkcVar.t(q36VarF);
        }
    }
}
