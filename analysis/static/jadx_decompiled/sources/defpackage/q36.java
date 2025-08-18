package defpackage;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class q36 extends p36 implements yde {
    public final SQLiteStatement b;

    public q36(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public final long m() {
        return this.b.executeInsert();
    }

    public final int n() {
        return this.b.executeUpdateDelete();
    }
}
