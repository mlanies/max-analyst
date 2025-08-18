package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class w8f {
    public final ilc a;
    public final sh b;
    public final zkc c;
    public final zkc d;
    public final zkc e;
    public final zkc f;

    public w8f(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 27);
        this.c = new zkc(oneMeRoomDatabase, 21);
        this.d = new zkc(oneMeRoomDatabase, 22);
        this.e = new zkc(oneMeRoomDatabase, 23);
        this.f = new zkc(oneMeRoomDatabase, 24);
    }
}
