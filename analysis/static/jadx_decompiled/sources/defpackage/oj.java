package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class oj {
    public final ilc a;
    public final sh b;
    public final th c;

    public oj(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 1);
        this.c = new th(oneMeRoomDatabase, 1);
    }
}
