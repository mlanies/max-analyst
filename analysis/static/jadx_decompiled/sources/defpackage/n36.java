package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class n36 extends SQLiteOpenHelper {
    public static final /* synthetic */ int s0 = 0;
    public boolean X;
    public final r9b Y;
    public boolean Z;
    public final Context a;
    public final y8 b;
    public final l0f c;
    public final boolean o;

    public n36(Context context, String str, final y8 y8Var, final l0f l0fVar, boolean z) {
        super(context, str, null, l0fVar.b, new DatabaseErrorHandler() { // from class: l36
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = n36.s0;
                y8 y8Var2 = y8Var;
                k36 k36Var = (k36) y8Var2.a;
                if (k36Var == null || !tpa.f((SQLiteDatabase) k36Var.b, sQLiteDatabase)) {
                    k36Var = new k36(0, sQLiteDatabase);
                    y8Var2.a = k36Var;
                }
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) k36Var.b;
                boolean zIsOpen = sQLiteDatabase2.isOpen();
                l0f l0fVar2 = l0fVar;
                if (!zIsOpen) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        l0fVar2.getClass();
                        l0f.q(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        k36Var.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) ((Pair) it.next()).second;
                            l0fVar2.getClass();
                            l0f.q(str2);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            l0fVar2.getClass();
                            l0f.q(path2);
                        }
                    }
                }
            }
        });
        this.a = context;
        this.b = y8Var;
        this.c = l0fVar;
        this.o = z;
        this.Y = new r9b(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    public final k36 a(boolean z) throws IOException {
        r9b r9bVar = this.Y;
        try {
            r9bVar.a((this.Z || getDatabaseName() == null) ? false : true);
            this.X = false;
            SQLiteDatabase sQLiteDatabaseG = g(z);
            if (!this.X) {
                k36 k36VarD = d(sQLiteDatabaseG);
                r9bVar.b();
                return k36VarD;
            }
            close();
            k36 k36VarA = a(z);
            r9bVar.b();
            return k36VarA;
        } catch (Throwable th) {
            r9bVar.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        r9b r9bVar = this.Y;
        try {
            r9bVar.a(r9bVar.a);
            super.close();
            this.b.a = null;
            this.Z = false;
        } finally {
            r9bVar.b();
        }
    }

    public final k36 d(SQLiteDatabase sQLiteDatabase) {
        y8 y8Var = this.b;
        k36 k36Var = (k36) y8Var.a;
        if (k36Var != null && tpa.f((SQLiteDatabase) k36Var.b, sQLiteDatabase)) {
            return k36Var;
        }
        k36 k36Var2 = new k36(0, sQLiteDatabase);
        y8Var.a = k36Var2;
        return k36Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.sqlite.SQLiteOpenHelper] */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.sqlite.SQLiteDatabase] */
    public final SQLiteDatabase g(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.Z;
        Context context = this.a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            this = z ? getWritableDatabase() : getReadableDatabase();
            return this;
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                this = z ? this.getWritableDatabase() : this.getReadableDatabase();
                return this;
            } catch (Throwable th) {
                super.close();
                if (th instanceof m36) {
                    m36 m36Var = th;
                    int iS = au1.s(m36Var.a);
                    Throwable th2 = m36Var.b;
                    if (iS == 0 || iS == 1 || iS == 2 || iS == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.o) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return z ? this.getWritableDatabase() : this.getReadableDatabase();
                } catch (m36 e) {
                    throw e.b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.X;
        l0f l0fVar = this.c;
        if (!z && l0fVar.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            d(sQLiteDatabase);
            l0fVar.getClass();
        } catch (Throwable th) {
            throw new m36(th, 1);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.J(d(sQLiteDatabase));
        } catch (Throwable th) {
            throw new m36(th, 2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.X = true;
        try {
            this.c.K(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new m36(th, 4);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.X) {
            try {
                this.c.L(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new m36(th, 5);
            }
        }
        this.Z = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.X = true;
        try {
            this.c.M(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new m36(th, 3);
        }
    }
}
