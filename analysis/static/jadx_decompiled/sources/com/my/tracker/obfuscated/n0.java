package com.my.tracker.obfuscated;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
final class n0 {
    private final SQLiteDatabase a;
    private final SQLiteStatement b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;

    public static class a implements b {
        private final Cursor a;

        public a(Cursor cursor) {
            this.a = cursor;
        }

        @Override // com.my.tracker.obfuscated.b
        public boolean a() {
            return this.a.moveToNext();
        }

        @Override // com.my.tracker.obfuscated.b
        public long c() {
            return this.a.getLong(0);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.obfuscated.b
        public byte[] h() {
            return this.a.getBlob(1);
        }
    }

    public n0(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id not in   (SELECT id    FROM table_partial_proto_packet    ORDER BY TS DESC    LIMIT ?  )");
        this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_partial_proto_packet(data, ts) VALUES (?, ?)");
        this.d = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id = ?");
    }

    public static void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_partial_proto_packet(id INTEGER PRIMARY KEY AUTOINCREMENT, data BLOB NOT NULL, ts INTEGER(8))");
    }

    public void b(long j) {
        this.b.bindLong(1, j);
        this.b.executeUpdateDelete();
    }

    public void a(byte[] bArr) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.c.bindBlob(1, bArr);
            this.c.bindLong(2, jCurrentTimeMillis);
            this.c.executeInsert();
        } finally {
            this.c.clearBindings();
        }
    }

    public b a() {
        return new a(this.a.rawQuery("SELECT id, data FROM table_partial_proto_packet ORDER BY ts", null));
    }

    public void a(long j) {
        this.d.bindLong(1, j);
        this.d.executeUpdateDelete();
    }
}
