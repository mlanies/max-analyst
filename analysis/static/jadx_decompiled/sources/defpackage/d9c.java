package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class d9c {
    public final ilc a;
    public final sh b;
    public final ha4 c;
    public final p19 d;

    public d9c(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 19);
        this.c = new ha4(oneMeRoomDatabase, 4);
        this.d = new p19(oneMeRoomDatabase, 24);
    }
}
