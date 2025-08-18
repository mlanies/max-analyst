package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class ew9 implements qu7 {
    public final ilc a;
    public final sh b;
    public final p19 c;
    public final p19 o;

    public ew9(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 12);
        new p19(oneMeRoomDatabase, 12);
        new p19(oneMeRoomDatabase, 13);
        this.c = new p19(oneMeRoomDatabase, 14);
        this.o = new p19(oneMeRoomDatabase, 15);
    }

    @Override // defpackage.qu7
    public final void a() throws Throwable {
        j47.f0(hz4.a, new dw9(this, null));
    }

    public final Object b(long j, Continuation continuation) {
        xlc xlcVarA = xlc.a(1, "SELECT * FROM fcm_notifications where time > ? ORDER BY time ASC");
        xlcVarA.j(1, j);
        return ote.i(this.a, new CancellationSignal(), new uh(this, 14, xlcVarA), continuation);
    }
}
