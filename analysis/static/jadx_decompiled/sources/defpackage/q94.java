package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.database.DatabaseIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q94 implements d9g {
    public static final String d = g(3, 4);
    public static final String[] e = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    public final e34 a;
    public final Object b = new Object();
    public boolean c;

    public q94(e34 e34Var) {
        this.a = e34Var;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i = oaf.a;
        for (String str2 : str.split(",", -1)) {
            String[] strArrSplit = str2.split("\\.", -1);
            fm9.k(strArrSplit.length == 3);
            arrayList.add(new x8e(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
        }
        return arrayList;
    }

    public static dn4 e(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String strL = ia9.l(cursor.getString(1));
        ArrayList arrayListA = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        vo4 vo4Var = new vo4(string, uri, strL, arrayListA, blob, cursor.getString(4), cursor.getBlob(5));
        uo4 uo4Var = new uo4();
        uo4Var.a = cursor.getLong(13);
        uo4Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new dn4(vo4Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, uo4Var);
    }

    public static dn4 f(Cursor cursor) {
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        vo4 vo4Var = new vo4(string, uri, ia9.l("dash".equals(string3) ? "application/dash+xml" : "hls".equals(string3) ? "application/x-mpegURL" : "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown"), a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5));
        uo4 uo4Var = new uo4();
        uo4Var.a = cursor.getLong(13);
        uo4Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new dn4(vo4Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, uo4Var);
    }

    public static String g(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    public static ArrayList h(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!oaf.f0(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(f(cursorQuery));
            } finally {
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void b() {
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            try {
                int iA = hcf.a(this.a.getReadableDatabase(), 0, "");
                if (iA != 3) {
                    SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        hcf.b(writableDatabase, 0, "", 3);
                        ArrayList arrayListH = iA == 2 ? h(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayListH.iterator();
                        while (it.hasNext()) {
                            j((dn4) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.c = true;
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }
    }

    public final Cursor c(String str, String[] strArr) {
        try {
            return this.a.getReadableDatabase().query("ExoPlayerDownloads", e, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final dn4 d(String str) throws DatabaseIOException {
        b();
        try {
            Cursor cursorC = c("id = ?", new String[]{str});
            try {
                if (cursorC.getCount() == 0) {
                    cursorC.close();
                    return null;
                }
                cursorC.moveToNext();
                dn4 dn4VarE = e(cursorC);
                cursorC.close();
                return dn4VarE;
            } finally {
            }
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void i(dn4 dn4Var) {
        b();
        try {
            j(dn4Var, this.a.getWritableDatabase());
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void j(dn4 dn4Var, SQLiteDatabase sQLiteDatabase) throws SQLException {
        byte[] bArr = dn4Var.a.X;
        if (bArr == null) {
            bArr = oaf.f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", dn4Var.a.a);
        contentValues.put("mime_type", dn4Var.a.c);
        contentValues.put("uri", dn4Var.a.b.toString());
        List list = dn4Var.a.o;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            x8e x8eVar = (x8e) list.get(i);
            sb.append(x8eVar.a);
            sb.append('.');
            sb.append(x8eVar.b);
            sb.append('.');
            sb.append(x8eVar.c);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", dn4Var.a.Y);
        contentValues.put("data", dn4Var.a.Z);
        contentValues.put("state", Integer.valueOf(dn4Var.b));
        contentValues.put("start_time_ms", Long.valueOf(dn4Var.c));
        contentValues.put("update_time_ms", Long.valueOf(dn4Var.d));
        contentValues.put("content_length", Long.valueOf(dn4Var.e));
        contentValues.put("stop_reason", Integer.valueOf(dn4Var.f));
        contentValues.put("failure_reason", Integer.valueOf(dn4Var.g));
        contentValues.put("percent_downloaded", Float.valueOf(dn4Var.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(dn4Var.h.a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow("ExoPlayerDownloads", null, contentValues);
    }

    public final void k() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void l() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void m(int i, String str) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, d + " AND id = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }
}
