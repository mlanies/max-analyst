package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* loaded from: classes.dex */
public final class f04 extends ContentObserver {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f04(jva jvaVar, Handler handler) {
        super(handler);
        this.b = jvaVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
            default:
                return super.deliverSelfNotifications();
            case 2:
                return false;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        Object value;
        switch (this.a) {
            case 0:
                h04 h04Var = (h04) this.b;
                if (h04Var.b && (cursor = h04Var.c) != null && !cursor.isClosed()) {
                    h04Var.a = h04Var.c.requery();
                    break;
                }
                break;
            case 1:
                hm9.n(fz6.E0, "ContentObserver: on content changed");
                ((fz6) this.b).e();
                break;
            default:
                hm9.n("Phonebook", "contact observer onChange");
                jva jvaVar = (jva) this.b;
                q0e q0eVar = jvaVar.t0;
                do {
                    value = q0eVar.getValue();
                    ((Number) value).intValue();
                } while (!q0eVar.c(value, Integer.valueOf(jvaVar.s0.incrementAndGet())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f04(h04 h04Var) {
        super(new Handler());
        this.b = h04Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f04(fz6 fz6Var) {
        super(null);
        this.b = fz6Var;
    }
}
