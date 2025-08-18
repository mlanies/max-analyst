package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class m23 {
    public static final m23 b = new m23(0);
    public final /* synthetic */ int a;

    public /* synthetic */ m23(int i) {
        this.a = i;
    }

    public final void a(k36 k36Var) {
        switch (this.a) {
            case 0:
                k36Var.m();
                try {
                    k36Var.U("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - h7g.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    k36Var.r0();
                    return;
                } finally {
                    k36Var.S();
                }
            default:
                if (((SQLiteDatabase) k36Var.b).isWriteAheadLoggingEnabled()) {
                    k36Var.U("PRAGMA synchronous = NORMAL");
                    return;
                }
                return;
        }
    }
}
