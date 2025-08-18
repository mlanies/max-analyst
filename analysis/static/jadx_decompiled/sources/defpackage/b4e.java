package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class b4e {
    public final ilc a;
    public final sh b;
    public final zkc c;

    public b4e(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 24);
        this.c = new zkc(oneMeRoomDatabase, 10);
    }
}
