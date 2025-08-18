package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class n4e {
    public final ilc a;
    public final sh b;
    public final zkc c;

    public n4e(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 25);
        this.c = new zkc(oneMeRoomDatabase, 11);
    }
}
