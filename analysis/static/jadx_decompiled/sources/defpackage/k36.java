package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class k36 implements Closeable {
    public static final String[] c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] o = new String[0];
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ k36(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void S() {
        ((SQLiteDatabase) this.b).endTransaction();
    }

    public void U(String str) {
        ((SQLiteDatabase) this.b).execSQL(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((SQLiteDatabase) this.b).close();
                break;
            case 1:
                ((Cursor) this.b).close();
                break;
            default:
                ((HttpURLConnection) this.b).disconnect();
                break;
        }
    }

    public void e0(String str, Object[] objArr) throws SQLException {
        ((SQLiteDatabase) this.b).execSQL(str, objArr);
    }

    public boolean isOpen() {
        return ((SQLiteDatabase) this.b).isOpen();
    }

    public void m() {
        ((SQLiteDatabase) this.b).beginTransaction();
    }

    public boolean m0() {
        return ((SQLiteDatabase) this.b).inTransaction();
    }

    public void n() {
        ((SQLiteDatabase) this.b).beginTransactionNonExclusive();
    }

    public boolean n0() {
        return ((SQLiteDatabase) this.b).isWriteAheadLoggingEnabled();
    }

    public q36 o(String str) {
        return new q36(((SQLiteDatabase) this.b).compileStatement(str));
    }

    public Cursor o0(zde zdeVar) {
        return ((SQLiteDatabase) this.b).rawQueryWithFactory(new i36(1, new j36(zdeVar)), zdeVar.m(), o, null);
    }

    public Cursor p0(zde zdeVar, CancellationSignal cancellationSignal) {
        String strM = zdeVar.m();
        String[] strArr = o;
        return ((SQLiteDatabase) this.b).rawQueryWithFactory(new i36(0, zdeVar), strM, strArr, null, cancellationSignal);
    }

    public Cursor q0(String str) {
        return o0(new sy4(28, str));
    }

    public void r0() {
        ((SQLiteDatabase) this.b).setTransactionSuccessful();
    }

    public int s0(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(c[3]);
        sb.append("WorkSpec SET ");
        int i = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < length; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        q36 q36VarO = o(sb.toString());
        br7.g(q36VarO, objArr2);
        return q36VarO.b.executeUpdateDelete();
    }
}
