package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* loaded from: classes.dex */
public final class j36 extends rd7 implements e66 {
    public final /* synthetic */ zde a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j36(zde zdeVar) {
        super(4);
        this.a = zdeVar;
    }

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        this.a.S(new p36(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
