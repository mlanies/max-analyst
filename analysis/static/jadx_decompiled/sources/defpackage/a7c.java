package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class a7c {
    public final ilc a;
    public final sh b;
    public final p19 c;

    public a7c(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 18);
        this.c = new p19(oneMeRoomDatabase, 23);
    }

    public final Object a(Continuation continuation) {
        xlc xlcVarA = xlc.a(1, "SELECT * FROM reactions_section WHERE id = ?");
        xlcVarA.f(1, "POPULAR");
        return ote.i(this.a, new CancellationSignal(), new uh(this, 21, xlcVarA), continuation);
    }
}
