package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class j0 {
    static long u = -1;
    private final String[] a = new String[1];
    private final f b = new f();
    private final SQLiteStatement c;
    private final SQLiteStatement d;
    private final SQLiteStatement e;
    private final SQLiteStatement f;
    private final SQLiteStatement g;
    private final SQLiteStatement h;
    private final SQLiteStatement i;
    private final SQLiteStatement j;
    private final SQLiteStatement k;
    private final SQLiteStatement l;
    private final SQLiteStatement m;
    private final SQLiteStatement n;
    private final SQLiteStatement o;
    private final SQLiteStatement p;
    private final SQLiteStatement q;
    private final SQLiteStatement r;
    private final n0 s;
    protected final SQLiteDatabase t;

    public static abstract class a implements Closeable {
        final Cursor a;

        public a(Cursor cursor) {
            this.a = cursor;
        }

        public final boolean a() {
            return this.a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.a.close();
            } catch (Throwable th) {
                y0.b("AbstractReader error: error while closing cursor", th);
            }
        }

        public void finalize() throws Throwable {
            super.finalize();
            close();
        }
    }

    public static final class b extends a {
        public b(Cursor cursor) {
            super(cursor);
        }

        public long b() {
            return this.a.getLong(4);
        }

        public long c() {
            return this.a.getLong(0);
        }

        public long f() {
            return this.a.getLong(1);
        }

        public byte[] l() {
            return this.a.getBlob(3);
        }
    }

    public static final class c extends a {
        public c(Cursor cursor) {
            super(cursor);
        }

        public long k() {
            return this.a.getLong(1);
        }
    }

    public static final class d extends a {
        public d(Cursor cursor) {
            super(cursor);
        }

        public long b() {
            return this.a.getLong(3);
        }

        public long c() {
            return this.a.getLong(0);
        }

        public String j() {
            return this.a.getString(1);
        }

        public long m() {
            return this.a.isNull(2) ? j0.u : this.a.getLong(2);
        }
    }

    public static final class e extends a {
        public e(Cursor cursor) {
            super(cursor);
        }

        public long m() {
            return this.a.getLong(2);
        }

        public long n() {
            return this.a.getLong(1);
        }

        public boolean o() {
            return this.a.isNull(2);
        }
    }

    public static final class f implements SQLiteDatabase.CursorFactory {
        long a;
        byte[] b;

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.a);
            sQLiteQuery.bindBlob(2, this.b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private j0(SQLiteDatabase sQLiteDatabase) {
        this.t = sQLiteDatabase;
        this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.h = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.i = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.j = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.k = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.l = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.p = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.m = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.n = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.o = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.r = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.s = new n0(sQLiteDatabase);
    }

    public static j0 a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                y0.b("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 10) {
                sQLiteDatabaseOpenOrCreateDatabase.close();
                context.deleteDatabase(str2);
                sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
                sQLiteDatabaseOpenOrCreateDatabase.setVersion(10);
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
                n0.a(sQLiteDatabaseOpenOrCreateDatabase);
            }
            return new j0(sQLiteDatabaseOpenOrCreateDatabase);
        } catch (Throwable th) {
            y0.b("MyTrackerDatabase error: exception occurred while initialization database", th);
            return null;
        }
    }

    public Long b(String str) {
        String[] strArr = this.a;
        strArr[0] = str;
        Cursor cursorRawQuery = this.t.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return null;
            }
            Long lValueOf = Long.valueOf(cursorRawQuery.getLong(0));
            cursorRawQuery.close();
            return lValueOf;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public c c(long j) {
        this.a[0] = String.valueOf(j);
        return new c(this.t.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.a));
    }

    public long d(long j) {
        this.a[0] = String.valueOf(j);
        Cursor cursorRawQuery = this.t.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j2 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public e e(long j) {
        this.a[0] = String.valueOf(j);
        return new e(this.t.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.a));
    }

    public void f(long j) {
        this.s.b(j);
    }

    public b g() {
        return new b(this.t.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", null));
    }

    public long h() {
        Cursor cursorRawQuery = this.t.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public com.my.tracker.obfuscated.b f() {
        return this.s.a();
    }

    public void c(long j, long j2) {
        this.d.bindLong(1, j);
        this.d.bindLong(2, j2);
        this.d.execute();
    }

    public void e() {
        this.o.execute();
    }

    public void c() {
        this.m.execute();
    }

    public long b(long j) {
        this.a[0] = String.valueOf(j);
        Cursor cursorRawQuery = this.t.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j2 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void d(long j, long j2) {
        this.h.bindLong(1, j2);
        this.h.bindLong(2, j);
        this.h.execute();
    }

    public void d() {
        this.n.execute();
    }

    public void b() {
        this.l.execute();
    }

    public long b(long j, long j2) {
        this.q.bindLong(1, j);
        this.q.bindLong(2, j2);
        return this.q.executeUpdateDelete();
    }

    public b a(long j, byte[] bArr) {
        f fVar = this.b;
        fVar.a = j;
        fVar.b = bArr;
        return new b(this.t.rawQueryWithFactory(fVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", null, null));
    }

    public d a(String str) {
        String[] strArr = this.a;
        strArr[0] = str;
        return new d(this.t.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    public long a(int i, byte[] bArr, boolean z) {
        this.c.bindLong(1, i);
        this.c.bindLong(2, z ? 1L : 0L);
        this.c.bindBlob(3, bArr);
        return this.c.executeInsert();
    }

    public long a(String str, long j) {
        this.e.bindString(1, str);
        this.e.bindLong(2, j);
        return this.e.executeInsert();
    }

    public void a(long j, long j2, boolean z, long j3) {
        this.f.bindLong(1, j);
        this.f.bindLong(2, j2);
        if (z) {
            this.f.bindNull(3);
        } else {
            this.f.bindLong(3, j3);
        }
        this.f.execute();
    }

    public void a(long j, long j2, long j3) {
        if (j2 != u) {
            this.i.bindLong(1, j2);
        } else {
            this.i.bindNull(1);
        }
        this.i.bindLong(2, j3);
        this.i.bindLong(3, j);
        this.i.execute();
    }

    public void a() {
        this.k.execute();
    }

    public void a(String str, Long l) {
        if (l == null) {
            this.r.bindString(1, str);
            this.r.execute();
            return;
        }
        long jLongValue = l.longValue();
        this.g.bindString(1, str);
        this.g.bindLong(2, jLongValue);
        if (this.g.executeInsert() != u) {
            return;
        }
        this.j.bindLong(1, jLongValue);
        this.j.bindString(2, str);
        this.j.execute();
    }

    public long a(long j, long j2) {
        this.p.bindLong(1, j);
        this.p.bindLong(2, j2);
        return this.p.executeUpdateDelete();
    }

    public void a(byte[] bArr) {
        this.s.a(bArr);
    }

    public void a(long j) {
        this.s.a(j);
    }
}
