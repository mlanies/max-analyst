package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final /* synthetic */ class vg4 implements bh4, mq1, b7b, ehe {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ vg4(oq1 oq1Var, ScheduledExecutorService scheduledExecutorService, long j) {
        this.a = 2;
        this.b = oq1Var;
        this.X = scheduledExecutorService;
        this.o = null;
        this.c = j;
    }

    @Override // defpackage.ehe
    public Object a() {
        t8f t8fVar = (t8f) this.b;
        gqc gqcVar = (gqc) t8fVar.c;
        gqcVar.getClass();
        Iterable iterable = (Iterable) this.X;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + gqc.m0(iterable);
            SQLiteDatabase sQLiteDatabaseM = gqcVar.m();
            sQLiteDatabaseM.beginTransaction();
            try {
                sQLiteDatabaseM.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseM.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        gqcVar.U(cursorRawQuery.getInt(0), rs7.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseM.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseM.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseM.endTransaction();
            }
        }
        gqcVar.o(new lt1(t8fVar.g.a() + this.c, (hc0) this.o, 9));
        return null;
    }

    @Override // defpackage.bh4
    public ScheduledFuture b(bkg bkgVar) {
        switch (this.a) {
            case 0:
                ah4 ah4Var = (ah4) this.b;
                ah4Var.getClass();
                return ah4Var.b.schedule(new yg4(ah4Var, (Runnable) this.X, bkgVar, 1), this.c, (TimeUnit) this.o);
            default:
                ah4 ah4Var2 = (ah4) this.b;
                ah4Var2.getClass();
                return ah4Var2.b.schedule(new cu0(ah4Var2, (Callable) this.X, bkgVar, 1), this.c, (TimeUnit) this.o);
        }
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        bm7 bm7Var = (bm7) this.b;
        kq0.y(bm7Var, lq1Var);
        if (!bm7Var.isDone()) {
            bm7Var.d(new e76(((ScheduledExecutorService) this.X).schedule(new ii5(lq1Var, (oq1) bm7Var), this.c, TimeUnit.MILLISECONDS), 1), ju0.k());
        }
        return "TimeoutFuture[" + bm7Var + "]";
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        b7b b7bVar;
        AtomicLong atomicLong = (AtomicLong) this.b;
        long j = atomicLong.get();
        long jNanoTime = System.nanoTime();
        if (j != 0 && Math.abs(jNanoTime - j) <= ((TimeUnit) this.o).toNanos(this.c) && ((b7bVar = (b7b) this.X) == null || !b7bVar.test(obj))) {
            return false;
        }
        atomicLong.set(jNanoTime);
        return true;
    }

    public /* synthetic */ vg4(ah4 ah4Var, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = ah4Var;
        this.X = obj;
        this.c = j;
        this.o = timeUnit;
    }

    public /* synthetic */ vg4(t8f t8fVar, Iterable iterable, hc0 hc0Var, long j) {
        this.a = 4;
        this.b = t8fVar;
        this.X = iterable;
        this.o = hc0Var;
        this.c = j;
    }

    public /* synthetic */ vg4(AtomicLong atomicLong, TimeUnit timeUnit, long j, b7b b7bVar) {
        this.a = 3;
        this.b = atomicLong;
        this.o = timeUnit;
        this.c = j;
        this.X = b7bVar;
    }
}
