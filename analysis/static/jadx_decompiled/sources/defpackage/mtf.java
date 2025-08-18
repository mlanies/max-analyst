package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class mtf {
    public final ilc a;
    public final sh b;
    public final ha4 c;
    public final zkc d;
    public final zkc e;

    public mtf(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 29);
        this.c = new ha4(oneMeRoomDatabase, 6);
        this.d = new zkc(oneMeRoomDatabase, 27);
        this.e = new zkc(oneMeRoomDatabase, 28);
        new zkc(oneMeRoomDatabase, 29);
        new ktf(oneMeRoomDatabase, 0);
    }

    public final Object a(long j, long j2, Continuation continuation) {
        xlc xlcVarA = xlc.a(2, "SELECT * FROM webapp_biometry WHERE user_id = ? AND bot_id = ?");
        xlcVarA.j(1, j);
        xlcVarA.j(2, j2);
        return ote.i(this.a, new CancellationSignal(), new jtf(this, xlcVarA, 1), continuation);
    }
}
