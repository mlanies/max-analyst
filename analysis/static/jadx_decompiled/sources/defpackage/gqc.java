package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class gqc implements h45, fhe, l33 {
    public static final i15 Y = new i15("proto");
    public final Provider X;
    public final puc a;
    public final d9f b;
    public final d9f c;
    public final ka0 o;

    public gqc(d9f d9fVar, d9f d9fVar2, ka0 ka0Var, puc pucVar, Provider provider) {
        this.a = pucVar;
        this.b = d9fVar;
        this.c = d9fVar2;
        this.o = ka0Var;
        this.X = provider;
    }

    public static String m0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((fb0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Long n(SQLiteDatabase sQLiteDatabase, hc0 hc0Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(hc0Var.a, String.valueOf(d9b.a(hc0Var.c))));
        byte[] bArr = hc0Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static Object n0(Cursor cursor, eqc eqcVar) {
        try {
            return eqcVar.mo131apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final ArrayList S(SQLiteDatabase sQLiteDatabase, hc0 hc0Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lN = n(sQLiteDatabase, hc0Var);
        if (lN == null) {
            return arrayList;
        }
        n0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", ApiProtocol.PARAM_PAYLOAD, "code", "inline"}, "context_id = ?", new String[]{lN.toString()}, null, null, null, String.valueOf(i)), new u00(this, arrayList, hc0Var, 25));
        return arrayList;
    }

    public final void U(long j, rs7 rs7Var, String str) {
        o(new x72(str, rs7Var, j, 10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final Object e0(ehe eheVar) {
        SQLiteDatabase sQLiteDatabaseM = m();
        d9f d9fVar = this.c;
        long jA = d9fVar.a();
        while (true) {
            try {
                sQLiteDatabaseM.beginTransaction();
                try {
                    Object objA = eheVar.a();
                    sQLiteDatabaseM.setTransactionSuccessful();
                    return objA;
                } finally {
                    sQLiteDatabaseM.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (d9fVar.a() >= this.o.c + jA) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase m() {
        puc pucVar = this.a;
        Objects.requireNonNull(pucVar);
        d9f d9fVar = this.c;
        long jA = d9fVar.a();
        while (true) {
            try {
                return pucVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (d9fVar.a() >= this.o.c + jA) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object o(eqc eqcVar) {
        SQLiteDatabase sQLiteDatabaseM = m();
        sQLiteDatabaseM.beginTransaction();
        try {
            Object objMo131apply = eqcVar.mo131apply(sQLiteDatabaseM);
            sQLiteDatabaseM.setTransactionSuccessful();
            return objMo131apply;
        } finally {
            sQLiteDatabaseM.endTransaction();
        }
    }
}
